
public class Main {

    public static void main(String[] args) {
//        RegisterTest registerTest = new RegisterTest();
//        registerTest.validRegisterTest();
      LoginTest loginTest = new LoginTest();
      loginTest.validLoginTest();
      Main.wait(5);
      WishListTest wishListTest = new WishListTest();
      wishListTest.validAddToWishListTest();

    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
