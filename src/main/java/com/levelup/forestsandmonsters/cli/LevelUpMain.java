package com.levelup.forestsandmonsters.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class LevelUpMain {
    public static void main(String[] args) {
        String[] disabledCommandsWeDoNotNeed = {};
        String[] fullArgs = StringUtils.concatenateStringArrays(args, disabledCommandsWeDoNotNeed);
        SpringApplication.run(LevelUpMain.class, fullArgs);
    }
}
