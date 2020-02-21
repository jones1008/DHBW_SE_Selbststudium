package s55_9752762;

public class Sluice implements ISluice {
    private FaceReader faceReader;
    private SluiceSensor sensor;

    public Sluice() {
        faceReader = new FaceReader();
        sensor = new SluiceSensor();
    }

    public FaceReader getFaceReader() {
        return faceReader;
    }

    public SluiceSensor getSensor() {
        return sensor;
    }
}
