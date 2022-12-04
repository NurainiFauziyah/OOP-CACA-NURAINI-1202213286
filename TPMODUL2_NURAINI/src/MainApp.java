public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Transcend", 32, 1.8);
        perangkat1.Informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Toshiba", 8, 5.5, true);
        laptop1.Informasi();
        laptop1.BukaGame("Prince of Persia");
        laptop1.KirimEmail("aerotic5pace@gmail.com");
        laptop1.KirimEmail("aurorae@gmail.com", "missisippi01@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Samsung", 64, 2.4, false);
        handphone1.Informasi();
        handphone1.Telfon(628157239);
        handphone1.KrimSMS(628271502);
        handphone1.KirimSMS(628267710, 628614130);

    }
}
