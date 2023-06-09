public class Main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("carlinhos@gmail.com");
        Usuario user2 = new Usuario("pauloplinio@gmail.com");
        Usuario user3 = new Usuario("red_beiramar@gmail.com");

        Blog blogPaulo = new Blog("beco do paulo", user2);
        Blog blogRed = new Blog("grota", user3);

        blogPaulo.criarNota(user3, "eh o paulo ou nao eh");
        blogPaulo.criarNota(user2, "fala se n é o paulo na situacao");
        blogRed.criarNota(user1, "arroz");
        blogRed.criarNota(user3, "arroz feijao e batatinha");

        blogPaulo.lerNotas();
        blogRed.lerNotas();      

    }
    
}
