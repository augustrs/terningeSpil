import java.util.Random;

public class Terning {
    private int MAX = 6;
    private int faceValue;
    Random random;

    public Terning() {
        this.random = new Random();
        this.faceValue = random.nextInt(MAX)+1;

    }
    public void roll() {
        this.faceValue=random.nextInt(MAX)+1;
    }

    @Override
    public String toString() {
        return " " + faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }


}
