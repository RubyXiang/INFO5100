public class Test {
    public static void main(String args[]){
        Mreview mreview = new Mreview("Kill Bill");
        mreview.addRating(3);
        mreview.addRating(4);
        mreview.addRating(3);
        System.out.println(mreview);
        mreview.aveRating();

    }
}
