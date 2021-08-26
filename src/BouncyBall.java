public class BouncyBall {
    public static void main(String[] args){
        double Ballx;
        double Bally = 100;
        double Ballpos;
        double Ballspeed = 0;
        double Ballacc = 1;
        double Time = 0;

        for(int i = 0; i >= 120; ++i);{
            --Ballspeed;
            Ballpos = Bally - Ballspeed;
            System.out.println(Ballpos);
        }
    }
}
