public class App {
    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();
        Player player1 = new Player("Quoc");
        Player player2 = new Player("Huy");
        Player player3 = new Player("Tai");
        gameController.addPlayer(player1);
        gameController.addPlayer(player2);
        gameController.addPlayer(player3);
        gameController.play();
    }
}
