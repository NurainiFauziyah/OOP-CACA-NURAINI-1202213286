public class Laptop extends Perangkat {
    protected boolean webcam;
    protected String teks;
   
    public Laptop (String drive, int ram, double processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    public void Informasi(){
        if (webcam==false){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. LAPTOP INI TIDAK MEMILIKI WEBCAM");
        }
        else {
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. LAPTOP INI MEMILIKI WEBCAM");
        }
    }
    public void BukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void KirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);

    }
    public void KirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }
}