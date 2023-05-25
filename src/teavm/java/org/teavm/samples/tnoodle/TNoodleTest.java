package org.teavm.samples.tnoodle;

import org.worldcubeassociation.tnoodle.puzzle.ThreeByThreeCubePuzzle;

public class TNoodleTest {
    public static void main(String[] args) {
        var puzzle = new ThreeByThreeCubePuzzle();
        var scramble = puzzle.generateScramble();
        System.out.println(scramble);
    }
}
