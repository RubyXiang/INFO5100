import java.util.*;

public class Mreview implements Comparable<Mreview> {
    // instance variables
    private String title;   // title of the movie
    List<Integer> ratings = new ArrayList<>(); // list of ratings stored in a Store object

    // methods
    public Mreview(){
        title = "";
    }

    public Mreview(java.lang.String ttl){
        title = ttl;
    }

    public Mreview(java.lang.String ttl, int firstRating){
        title = ttl;
        ratings.add(firstRating);
    }

    public void addRating(int r) {
        //Inserts the parameter rating in the ratings list.
        ratings.add(r);
    }

    public double aveRating() {
        //Returns the average of the ratings stored in the rating list.
        double sum = 0.0;
        for(int i = 0; i<ratings.size(); i++){
            sum = sum + (double)ratings.get(i);
        }
        return sum/(ratings.size());
    }

    public int compareTo(Mreview obj) {
        return (obj.getTitle()).compareTo(title);
    }

    public boolean equals(java.lang.Object obj) {
        if(title.equals(((Mreview)obj).getTitle())){
            return true;
        }else{
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    public int numRatings() {
        return ratings.size();
    }

    @Override
    public String toString() {
        return title + ", average " + aveRating() +
                " out of " + numRatings() + " ratings";
    }

}



