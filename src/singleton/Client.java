package singleton;
public class Client {
    public static void main(String[] args){
        Terre premiere_terre = Terre.create();
        premiere_terre.show();
        Terre deuxieme_terre = Terre.create();
        deuxieme_terre.show();
        premiere_terre.add(1000000);
        deuxieme_terre.show();
    }
}
