package game.state;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.player.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * хранит состояние игры
 */
public class State {

    // Player -> (id -> Chessman)
    //private Map<Player, Map<String, Chessman>> store = new HashMap<>();


    //cell -> chessman
    //      тип переменной      имя переменной      ее реализация
    private Map<Cell, Chessman> store           = new HashMap<>();


    /*public void addChessman(Chessman c1) {
        Map<String, Chessman> innerMap = store.get(c1.getOwner());
        if (innerMap == null) {
            innerMap = new HashMap<>();
            Player key = c1.getOwner();
            store.put(key, innerMap);
        }

        String id = c1.getId();
        innerMap.put(id,c1);
    }*/

    //      тип     имя     арг
    public void addChessman(Chessman ch) {
        store.put(ch.getCell(), ch);
    }

    public Chessman getChessman(Cell c) {
        return store.get(c);
    }

    @Override
    public String toString() {
        return store.toString();
    }
}
