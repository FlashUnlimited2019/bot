package edu.northeastern.cs5500.starterbot.command;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class CommandModule {

    @Provides
    @IntoSet
    public Command provideSayCommand(SayCommand sayCommand) {
        return sayCommand;
    }

    @Provides
    @IntoSet
    public Command provideHelpCommand(HelpCommand helpCommand) {
        return helpCommand;
    }

    @Provides
    @IntoSet
    public Command providePreferredNameCommand(PreferredNameCommand preferredNameCommand) {
        return preferredNameCommand;
    }

    @Provides
    @IntoSet
    public Command provideSetNameCommand(SetNameCommand setNameCommand) {
        return setNameCommand;
    }
}
