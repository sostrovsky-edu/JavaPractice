package design_pattern.behavioral.chain_of_responsibility.example3.logger.type;

import design_pattern.behavioral.chain_of_responsibility.example3.logger.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
