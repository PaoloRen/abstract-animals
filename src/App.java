public class App {
    public static void main(String[] args) throws Exception {
        Cane cane = new Cane();
        cane.verso();
        cane.dormi();
        Passerotto passerotto = new Passerotto();
        passerotto.mangia();
        passerotto.dormi();
        Delfino delfino = new Delfino();
        delfino.dormi();
        delfino.mangia();
        faiNuotare(delfino);
        faiVolare(passerotto);;
    }
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }

    public static void faiVolare(Volante animale){
        animale.vola();
    }
}
