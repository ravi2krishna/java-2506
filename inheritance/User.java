package inheritance;

public class User {
    public static void main(String[] args) {
        Guest g1 = new Guest();
        System.out.println("Guest User");
        g1.watchVideos();

        VideoAdmin va = new VideoAdmin();
        System.out.println("Video Admin User");
        va.watchVideos();
        va.addVideos();

        Admin ad = new Admin();
        System.out.println("Super Admin User");
        ad.watchVideos();
        //ad.addVideos();
        ad.deleteVideos();
    }
}
