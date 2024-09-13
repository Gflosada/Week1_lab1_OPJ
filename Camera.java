public class Camera {
    private String make;
    private String model;
    private String os;
    private double screenSize;
    private int memory;
    private int frontCamera;
    private int rearCamera;
    private double price;

    // Constructor
    public Camera(String make, String model, String os, double screenSize, int memory, int frontCamera, int rearCamera, double price) {
        setMake(make);
        setModel(model);
        setOs(os);
        setScreenSize(screenSize);
        setMemory(memory);
        setFrontCamera(frontCamera);
        setRearCamera(rearCamera);
        setPrice(price);
    }

    // Setters with validation
    public void setMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }
        this.make = make;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public void setOs(String os) {
        if (os == null || os.isEmpty()) {
            throw new IllegalArgumentException("OS cannot be null or empty");
        }
        this.os = os;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize <= 0) {
            throw new IllegalArgumentException("Screen size must be positive");
        }
        this.screenSize = screenSize;
    }

    public void setMemory(int memory) {
        if (memory <= 0) {
            throw new IllegalArgumentException("Memory must be positive");
        }
        this.memory = memory;
    }

    public void setFrontCamera(int frontCamera) {
        if (frontCamera < 0) {
            throw new IllegalArgumentException("Front camera resolution cannot be negative");
        }
        this.frontCamera = frontCamera;
    }

    public void setRearCamera(int rearCamera) {
        if (rearCamera < 0) {
            throw new IllegalArgumentException("Rear camera resolution cannot be negative");
        }
        this.rearCamera = rearCamera;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
}
