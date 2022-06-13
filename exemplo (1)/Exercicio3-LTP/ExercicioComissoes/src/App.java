public class App {
    public static void main(String[] args) throws Exception {
        //Criando um Membro
        Membro m1 = new Membro("Stefanye Januário ", "BP",3013556);
        Membro m2 = new Membro("Agatha", "BP",3011399);
        Membro m3= new Membro("Talita ", "BP",3043524);
        
        Comissao comissaoCEIC = new Comissao("Portaria nº 8081 de Maio de 2022");
        //Adicionar membros na comissão
        comissaoCEIC.adicionarMembro(m1);
        comissaoCEIC.adicionarMembro(m2);
        comissaoCEIC.adicionarMembro(m3);
        //Busca um menbro pelo nome
        System.out.println(comissaoCEIC.buscarMembroPeloNome("Talita"));
        //Listar todos os membros da CEIC
        comissaoCEIC.listarTodosMembros();
    }
}

