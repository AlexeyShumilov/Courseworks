package course2.command;

import course2.GameList;
import course2.GameObject;

public class StartGame implements Menu {
    private GameObject gameObject;

    public StartGame(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void execute() {
        GameList gameList = new GameList();
        GameList.game(gameObject);
    }
}