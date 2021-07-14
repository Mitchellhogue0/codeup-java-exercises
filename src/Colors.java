
 class Red {
    public void showMyFavoriteColorOfAllTimeInTheRainbow () {
        System.out.println("I am Red!");
    }
}

 class Orange extends Red {
     @Override
     public void showMyFavoriteColorOfAllTimeInTheRainbow() {
         super.showMyFavoriteColorOfAllTimeInTheRainbow();
     }

     public void showMyFavoriteColorOfAllTimeinTheRainbow () {
        System.out.println("I am Orange!");
    }
}

public class Colors {

    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.showMyFavoriteColorOfAllTimeInTheRainbow();
        orangeobj.showMyFavoriteColorOfAllTimeinTheRainbow();

    }
}
