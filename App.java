public class App {
    public static void main (String[] args) throws {
        System.out.println("Hello, World! This is an exercise about Encapsulamento");
        Time t1 = new Time();
        t1.setCorDaCamisa("vermelho e verde");
        t1.setCidade("Cajuzinho do Sul");
        t1.setTamanho("cabe em uma Kombi");
        t1.setPopularidade("intergalactical");

        System.out.println("O novo time do momento eh o Banguelas do Sertao. Tem origem em "
        +t1.getTamanhoTorcida()+". As cores da sua camisa sao "+t1.getCorDaCamisa()+" e sua popularidade eh "
        +t1.getPopularidade());

        Time t2 = new Time();
        t2.setCorDaCamisa("azul e branco");
        t2.setCidade("Platina de Assis");
        t2.setTamanhoTorcida("meia turma de astrofisica noturno");
        t2.setPopularidade("das grandes");

        System.out.println("Tambem ha ainda o time Poetas Pernetas, da cidade "+t2.getCidade()+
        " , as cores da sua camisa sao "+t2.getCorDaCamisa()+" e de acordo com o noticiariop local sua torcida equivale a "
        +t2.getTamanhoTorcida()+". Como pode-se imaginar, sua popularidade eh "+getPopularidade());
    }
}

