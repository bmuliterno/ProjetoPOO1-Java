package projetopoo1;
public class ProjetoPoo1 {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Britney Spears - The Circus Tour");
        v[1] = new Video("Miley Cyrus - Lollapalooza Brazil");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Demi", 30, "F", "dramaqueen");
        g[1] = new Gafanhoto("Matheus", 26, "M", "maaaa");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35.0f);
        System.out.println(vis[1].toString());

    }
}