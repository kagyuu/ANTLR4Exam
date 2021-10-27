package com.example.antlr4exam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseListener {
    private int level = 0;

    protected void dumpEnter(String node) {
        level += 1;
        dump("▽▽---" + node + "---▽▽");
    }

    protected void dumpExit(String node) {
        dump("△△---" + node + "---△△");
        level -= 1;
    }

    protected void dump(String message) {
        StringBuilder sb = new StringBuilder();
        for (int cnt = 0; cnt < level; cnt++) {
            sb.append("_ ");
        }
        sb.append(message);
        log.debug(sb.toString());
    }
}
