package ca.mcscert.se2aa4.tools.mazegen;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("Here goes the business code");
        Configuration config = readConfiguration(args);
        Random random = buildReproducibleGenerator(config.seed());
        Maze theMaze = new Maze(config, random);
        theMaze.export(config);
    }
    private static Random buildReproducibleGenerator(long seed) {
        Random generator = new Random();
        generator.setSeed(seed);
        return generator;
    }
    private static Configuration readConfiguration(String[] args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readConfiguration'");
    }
}
