import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {
    private int index = 0;
    private List<Dice> dices = new ArrayList<Dice>();
    private List<Player> players = new ArrayList<Player>();

    public GameController() {
        for (int i = 1; i <= 4 ; i++) {
            dices.add(new Dice(i));
        }
    }
    public void addPlayer(Player player) {
        if (players.size() >= 4) {
            System.out.println("Đã đủ số lượng người chơi, không thể thêm người chơi");
        } else {
            players.add(player);
        }
    }

    private Player getNextPlayer() {
        if (index > 3) index = 0;
        Player nextPlayer = players.get(index);
        index++;
        System.out.println("Người chơi tiếp theo: " + nextPlayer.getName());
        return nextPlayer;
    }

    private Dice getRandomDice() {
        Dice randomDice = dices.get(new Random().nextInt(dices.size()));
        return randomDice;
    }

    public void play() {
        addVirtualPlayer();
        System.out.print("Danh sách người chơi: ");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getName() + ", ");
        }
        System.out.println();
        Player currentPlayer = getNextPlayer();
        Dice currentDice = getRandomDice();
        while (!currentPlayer.rollDice(currentDice)) {
            currentPlayer = getNextPlayer();
            currentDice = getRandomDice();
        }
    }

    private void addVirtualPlayer() {
        int i = 0;
        while (players.size() < 4) {
            players.add(new VirtualPlayer(i));
            i++;
        }
    }
}
