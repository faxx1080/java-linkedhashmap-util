package com.frank;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class LinkedHashMapUtilTest {

    @Test
    void of() {
        var lhm = LinkedHashMapUtil.of(5, 3);
        assertLinesMatch(
                List.of(lhm.toString()),
                List.of("{5=3}")
        );
    }

    @Test
    void testOf() {
        var lhm = LinkedHashMapUtil.of(Math.PI, LocalDate.of(2020,1,1),
                "T", 5, 'x', 56L,
                String.class, false);
        assertLinesMatch(
                List.of(lhm.toString()),
                List.of("{3.141592653589793=2020-01-01, T=5, x=56, class java.lang.String=false}")
        );
    }

    @Test
    void ofEntries() {
        var lhm = LinkedHashMapUtil.ofEntries(
                Map.entry(1,2),
                Map.entry(3,4)
        );
        assertLinesMatch(
                List.of(lhm.toString()),
                List.of("{1=2, 3=4}")
        );
    }
}