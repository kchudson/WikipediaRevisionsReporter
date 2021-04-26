package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.InterfaceFormatter;
import edu.bsu.cs.view.UserRevisionFormatter;

import java.time.Duration;

public class FormatterModule extends AbstractModule {

        @Override
        protected void configure(){
            bind(InterfaceFormatter.class).to(UserRevisionFormatter.class);
            bind(Duration.class).toInstance(Duration.ofSeconds(2));
        }
    }
