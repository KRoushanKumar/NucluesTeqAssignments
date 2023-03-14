public class SmartPhone extends Phone implements Camera,MusicPlayer {

    @Override
    public void play() {
        System.out.println("Music playing");
    }

    @Override
    public void stop() {
       System.out.println("Stop playing Music");
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public void record() {
        System.out.println("Recoding has been started");
    }
    
    public static void main(String[] args) {
        SmartPhone Nokia = new SmartPhone();
        Nokia.call();
        Nokia.sms();
        Nokia.play();
        Nokia.record();
        Nokia.stop();
        Nokia.click();
    }
}
