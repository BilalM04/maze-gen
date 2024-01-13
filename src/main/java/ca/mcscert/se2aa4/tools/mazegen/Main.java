package ca.mcscert.se2aa4.tools.mazegen;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("Here goes the business code");
        Configuration config = readConfiguration(args);
        Random random = buildReproducibleGenerator(config);
        Maze theMaze = new Maze(config, random);
        theMaze.export(config);
    }
    private static Random buildReproducibleGenerator(Configuration config) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildReproducibleGenerator'");
    }
    private static Configuration readConfiguration(String[] args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readConfiguration'");
    }
}
