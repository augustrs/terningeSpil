public class Terningespil {
    Terning terning1 = new Terning();
    Terning terning2 = new Terning();

    public void spil() {
        int samletFaceValue = 0;
        boolean gameOver = false;
        do {
            terning1.roll();
            terning2.roll();
            samletFaceValue = terning1.getFaceValue() + terning2.getFaceValue();
            System.out.println(samletFaceValue);

            if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) {
                System.out.println("dice 1: " + terning1.getFaceValue() + " dice 2: " + terning2.getFaceValue());
                System.out.println("SNAKE EYES");
                gameOver = true;
            }


        } while (gameOver==false);
    }
}
