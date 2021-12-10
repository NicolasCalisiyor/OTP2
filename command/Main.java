package command;

public class Main {
    
    public static void main(String[] args) {
        
        Screen screen = new Screen();

        Command scrollUp = new UpCommand(screen);
        Command scrollDown = new DownCommand(screen);

        WallButton button1 = new WallButton(scrollUp);
        WallButton button2 = new WallButton(scrollDown);

        button1.push();
        button2.push();
    }
}
