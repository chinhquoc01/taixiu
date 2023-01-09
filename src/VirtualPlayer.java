public class VirtualPlayer extends Player {
    private int virtualPlayerId;
    public VirtualPlayer(int id) {
        super();
        this.virtualPlayerId = id;
        this.setName("Người chơi ảo " + Integer.toString(id));
    }
    public void loseGame() {
        System.out.println("Người chơi ảo " + Integer.toString(virtualPlayerId) + " đã thua");
    }
}
