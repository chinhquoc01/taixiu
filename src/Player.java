import java.util.Random;

public class Player {
    private String name;
    private int point;

    public Player(String name) {
        this.point = 0;
        this.name = name;
    }
    public Player() {
        this.point = 0;
    }
    public int getPoint() {
        return point;
    }
    public String getName() {
        return name;
    }
    private int addPoint(int plus) {
        this.point += plus;
        return this.point;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean rollDice(Dice dice) {
        int rollPoint = dice.roll();
        System.out.println(String.format("Xúc sắc ra %s điểm", Integer.toString(rollPoint)));
        System.out.println(String.format("Số điểm ban đầu là %s", Integer.toString(point)));
        this.addPoint(rollPoint);

        return this.checkPoint();
    }

    private boolean checkPoint(){
        
        if (point == 21) {
            System.out.println(String.format("Số điểm hiện tại là 21. Người chơi <%s> là người chiến thắng", name));
            System.out.println("--------------------------------------------------------------");
            return true;
        } else if (point > 21) {
            System.out.println(String.format("Số điểm hiện tại của <%s> là: %s > 21, người chơi %s còn 0 điểm", name, Integer.toString(point), name));
            this.point = 0;
        } else if (point < 21) {
            System.out.println(String.format("Số điểm hiện tại của <%s> là: %s", name, Integer.toString(point)));
        }
        System.out.println("--------------------------------------------------------------");

        return false;
    }
}

