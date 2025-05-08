package eCommerce.backend.DTO;

public class CartRequest {
    private int userId;
    private int categoryId;
    private int productId;
    private double amount;
    private String address;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Constructors
    public CartRequest() {
    }

    public CartRequest(int userId, int categoryId, int productId, double amount,String address,int quantity) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.productId = productId;
        this.amount = amount;
        this.address = address;
        this.quantity = quantity;
    }

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
