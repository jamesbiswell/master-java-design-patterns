package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced;

/**
 * Role: Concrete / Terminal Expression
 *
 * Handles the /mute command by silencing a target user.
 */
public class MuteExpression implements Expression {

    private String targetUser;

    public MuteExpression(String targetUser) {
        this.targetUser = targetUser;
    }

    @Override
    public boolean interpret(ChatContext chatContext) {
        System.out.println("[Mute] " + chatContext.getCurrentUser()
                + " muted user: " + targetUser);

        return true;
    }
}
