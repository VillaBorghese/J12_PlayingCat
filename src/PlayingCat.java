public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if ( summer && temperature >= 25 && temperature <= 45 || !(summer) && temperature >= 25 && temperature <= 35){
//            return true;
//        } else return false;
        return (summer && temperature >= 25 && temperature <= 45 || !(summer) && temperature >= 25 && temperature <= 35);
    }
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 40));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
