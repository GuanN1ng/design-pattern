package com.guann1n9.design.pattern.behavioral.command;

/**
 * 命令接口
 */
public interface Command {


    /**
     * 命令执行
     */
    void execute();

    /**
     * 命令撤销
     */
    void undo();
}
