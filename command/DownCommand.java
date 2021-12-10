package command;

public class DownCommand implements Command{

    private Screen screen;

    public DownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        screen.down();
    }
    
}
