package com.quid.carracing.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveableTest {

    @Test
    public void isMoveTest() {
        Assertions.assertDoesNotThrow(Moveable::isMove);
    }

}
