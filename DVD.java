package Toko;

public class DVD {
      private int length;
      private String studio;
      private String rating;

      public DVD() {
      this.length = 0;
      this.rating = "";
      this.studio = "";
}

      public DVD(int number, String name, int quantity, double price, int length, String rating, String studio) {
        // super(number, name, quantity, price, artist, numSong, label);
      this.length = length;
      this.rating = rating;
      this.studio = studio;
}

      public int getLength() {
      return this.length;
}

      public void setLength(int length) {
      this.length = length;
}

      public String getRating() {
      return this.rating;
}

      public void setRating(String rating) {
      this.rating = rating;
}

      public String getStudio() {
      return this.studio;
}

      public void setStudio(String studio) {
      this.studio = studio;
}

      public void print() {
      System.out.println("Length: \t" + length);
      System.out.println("Rating: \t" + rating);
      System.out.println("Studio: \t" + studio);
}
}
