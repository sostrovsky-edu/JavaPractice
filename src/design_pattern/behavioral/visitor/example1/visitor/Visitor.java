package design_pattern.behavioral.visitor.example1.visitor;

import design_pattern.behavioral.visitor.example1.auto_part.type.BodyAutoPart;
import design_pattern.behavioral.visitor.example1.auto_part.type.Car;
import design_pattern.behavioral.visitor.example1.auto_part.type.EngineAutoPart;
import design_pattern.behavioral.visitor.example1.auto_part.type.WheelAutoPart;

// Visitor
public interface Visitor {
    void visit(EngineAutoPart engine);
    void visit(BodyAutoPart body);
    void visit(Car car);
    void visit(WheelAutoPart wheel);
}
