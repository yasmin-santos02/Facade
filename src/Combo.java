public class Combo {
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();

    public int criarCombo(int tipo) {
    if (tipo == 1)
    {
        System.out.println("COMBO MASTER:");

        burguer.setGramas(240);
        burguer.setPreco(35.50);
        burguer.setDescricao("Big Tasty, " + burguer.getGramas() + "gr, R$" + burguer.getPreco());

        bebida.setMl(500);
        bebida.setPreco(14.50);
        bebida.setDescricao("Free refri, " + bebida.getMl() + "mL, R$" + bebida.getPreco());

        sobremesa.setTamanho("Grande");
        sobremesa.setPreco(12.00);
        sobremesa.setDescricao("Torta de banana, tamanho " +sobremesa.getTamanho()+", R$"+sobremesa.getPreco());
    }
    else if (tipo==2){
        System.out.println("SUPER COMBO:");

        burguer.setGramas(180);
        burguer.setPreco(20.50);
        burguer.setDescricao("Big Mac, " + burguer.getGramas() + "gr, R$" + burguer.getPreco());

        bebida.setMl(350);
        bebida.setPreco(10.00);
        bebida.setDescricao("Lata, " + bebida.getMl() + "mL, R$" + bebida.getPreco());

        sobremesa.setTamanho("Médio");
        sobremesa.setPreco(10.00);
        sobremesa.setDescricao("Sorvete de casquinha, tamanho " +sobremesa.getTamanho()+", R$"+sobremesa.getPreco());

        }
    return tipo;
    }

    @Override
    public String toString(){
        return burguer.getDescricao() +"\n" + bebida.getDescricao() +"\n" + sobremesa.getDescricao();
    }

}
