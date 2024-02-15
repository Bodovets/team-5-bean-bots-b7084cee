package com.levelup.forestsandmonsters;

import org.junit.Test;
import com.levelup.model.MyCharacter;

public class MyCharacterTest {

    @Test
    public void checkCharacterName() {
        MyCharacter charObj = new MyCharacter("test");
        assert("test".equals(charObj.getName()));
    }
}
