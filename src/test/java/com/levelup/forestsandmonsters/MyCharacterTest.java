package com.levelup.forestsandmonsters;

import org.junit.Test;
import com.levelup.model.MyCharacter;
import com.levelup.model.Position;

public class MyCharacterTest {

    @Test
    public void checkCharacterName() {
        MyCharacter charObj = new MyCharacter("test");
        assert ("test".equals(charObj.getName()));
    }

    @Test
    public void checkDefaultName() {
        MyCharacter charObj = new MyCharacter();
        assert ("BeanBot".equals(charObj.DEFAULT_NAME));
    }

    @Test
    public void checkDefaultPosition() {
        MyCharacter charObj = new MyCharacter();
        Position pos = charObj.getPosition();
        assert (pos.getX() == 0);
        assert (pos.getY() == 0);
        
    }
}
