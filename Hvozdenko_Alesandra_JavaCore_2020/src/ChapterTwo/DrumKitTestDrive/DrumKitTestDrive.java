package ChapterTwo.DrumKitTestDrive;



class DrumKit {
    boolean topHat = true;
    boolean share = true;

    void playShare( ) {
        System.out.println("бах бах ба-бах");
    }
    void playTopHat () {
        System.out.println("динь динь ди-динь");
    }
}



public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playShare();
        d.share = false;
        d.playTopHat();

        if (d.share == true) {
            d.playShare();
        }



    }
}
