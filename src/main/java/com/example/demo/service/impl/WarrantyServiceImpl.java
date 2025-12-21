@Service
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository warrantyRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public WarrantyServiceImpl(WarrantyRepository warrantyRepository,
                               UserRepository userRepository,
                               ProductRepository productRepository) {
        this.warrantyRepository = warrantyRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Warranty registerWarranty(Long userId, Long productId, WarrantyRequest request) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        LocalDate purchase = request.getPurchaseDate();
        LocalDate expiry = request.getExpiryDate();

        if (purchase != null && expiry != null && !expiry.isAfter(purchase)) {
            throw new IllegalArgumentException("Expiry date must be after purchase date");
        }

        if (warrantyRepository.existsBySerialNumber(request.getSerialNumber())) {
            throw new IllegalArgumentException("Serial number must be unique");
        }

        Warranty warranty = new Warranty();
        warranty.setUser(user);
        warranty.setProduct(product);
        warranty.setPurchaseDate(request.getPurchaseDate());
        warranty.setExpiryDate(request.getExpiryDate());
        warranty.setSerialNumber(request.getSerialNumber());

        return warrantyRepository.save(warranty);
    }

    @Override
    public Warranty getWarranty(Long warrantyId) {
        return warrantyRepository.findById(warrantyId)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));
    }

    @Override
    public List<Warranty> getUserWarranties(Long userId) {
        return warrantyRepository.findByUserId(userId);
    }
}
