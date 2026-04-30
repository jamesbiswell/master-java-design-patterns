package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced;

/**
 * Role: Abstract Expression
 *
 * Declares the interpret() method that all expressions must implement.
 */
public interface Expression {

    boolean interpret(ChatContext chatContext);
}
