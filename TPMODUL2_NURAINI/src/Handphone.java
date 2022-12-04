public class Handphone extends Perangkat {
    protected boolean fingerprint;
    protected String teks;

    public Handphone (String drive, int ram, double processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void Informasi(){
        if (fingerprint==false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. HANDPHONE INI TIDAK MEMILIKI FINGERPRINT");    
        }
        else {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. HANDPHONE INI MEMILIKI FINGERPRINT");
        }
    }
    public void Telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }
    public void KrimSMS(int no_hp){
        System.out.println("Handphone ini berhasil mengirim SMS ke No " + no_hp);

    }
    public void KirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
}