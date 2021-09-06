public class BouncyBall {
    public static void main(String[] args){
        double BallX;
        double BallY = 100;
        double Ballpos;
        double Ballspeed = 0;
        double Ballacc = -9.82;
        double Time = 0;
        double v0 = 0;

        for(int i = 0; i < 1000; i++){
            /*Ballspeed -= Ballacc;
            BallY += Ballspeed;

            //System.out.println(Ballspeed);
            if(BallY <= 0) {
                Ballspeed *= -1;
                BallY *= -1;
            }
            System.out.println(BallY);
            */
            Ballspeed = v0 + Ballacc;
            BallY = BallY + Ballspeed;
            if (BallY < 0) {
                Ballspeed *= -1;
                BallY *= -1;
                v0 = BallY;
            }
            Time++;
            System.out.println(BallY);
        }
    }
}
