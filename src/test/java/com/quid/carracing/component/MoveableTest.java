package com.quid.carracing.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoveableTest {

    @Test
    @DisplayName("이동 가능한지 여부")
    public void isMoveTest() {
        Assertions.assertDoesNotThrow(Moveable::isMove);
    }

}
