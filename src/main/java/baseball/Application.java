package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        GameManager gameManager = new GameManager();
        do {
            try {
                gameManager.game();
            } catch (IllegalArgumentException e) {
                break;
            }
        } while (gameManager.gameContinue());
    }
}
