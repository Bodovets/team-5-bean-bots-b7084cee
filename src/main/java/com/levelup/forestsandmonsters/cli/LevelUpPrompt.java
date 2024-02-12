package com.levelup.forestsandmonsters.cli;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class LevelUpPrompt implements PromptProvider {
    @Override
    public AttributedString getPrompt() {
        return new AttributedString(
                "Enter command" + "==> ",
                AttributedStyle.DEFAULT.background(AttributedStyle.GREEN));
    }
}