package com.frank;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

import static java.util.Map.entry;

@Slf4j
public class Main {
    public static void main(String[] args) {
        var mp = Map.of(1, 2);
        var mp2 = Map.of(1, 2, "3", "4");
        var mp3 = Map.of(1, 2, "3", "4", 5, 7);
        var mp4 = Collections.emptyMap();
        var mp5 = Map.ofEntries(
                entry('a',	1),
                entry('b',	2),
                entry('c',	3),
                entry('d',	4),
                entry('e',	5),
                entry('f',	6),
                entry('g',	7),
                entry('h',	8),
                entry('i',	9),
                entry('j',	10),
                entry('k',	11),
                entry('l',	12),
                entry('m',	13),
                entry('n',	14),
                entry('o',	15)
        );
        var lmp1 = LinkedHashMapUtil.of(
                Math.exp(50), mp
        );
        var lmp2 = LinkedHashMapUtil.of(
                LocalDate.of(2020,1,1), Math.PI,
                LocalDate.of(2021,1,1), Math.E
        );
        var lmp3 = LinkedHashMapUtil.ofEntries(
                entry('a',	1),
                entry('b',	2),
                entry('c',	3),
                entry('d',	4),
                entry('e',	5),
                entry('f',	6),
                entry('g',	7),
                entry('h',	8),
                entry('i',	9),
                entry('j',	10),
                entry('k',	11),
                entry('l',	12),
                entry('m',	13),
                entry('n',	14),
                entry('o',	15)
        );
        var l1 = List.of("a", "B", 3, mp, false, LocalDate.of(2023, 7, 20));
        var l2 = List.of(3,4,5);
        var l3 = List.of(false);
        var l4 = Collections.emptyList();
        var l5 = List.of(
                1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
        );
        var a1 = new char[] {
                'a','b','c','d','z'
        };
        var s1 = Set.of(1,3,5);
        var s2 = Set.of(true);
        var s3 = Collections.emptySet();
        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        log.info("{}", mp5);

        log.info(
                "Outputting:\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n" +
                        "{}\n",
                mp, mp2, mp3, mp4, mp5, lmp1, lmp2, lmp3,
                l1, l2, l3, l4, l5, a1,
                s1, s2, s3);
    }
}