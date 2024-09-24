package Practice;

interface IODevice {
    void turnOn();
    void turnOff();
}

class Projector implements IODevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the projector");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the projector");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }
}

class SoundSystem implements IODevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the sound system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the sound system");
    }

    public void setVolume(int level) {
        System.out.println("Sound system volume set to: " + level);
    }
}

class BluRayPlayer implements IODevice {

    @Override
    public void turnOn() {
        System.out.println("BluRay player is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("BluRay player is turned off.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

class HomeTheaterFacade {
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final BluRayPlayer bluRayPlayer;

    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, BluRayPlayer bluRayPlayer) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.turnOn();
        projector.setInput("BluRay");
        soundSystem.turnOn();
        soundSystem.setVolume(5);
        bluRayPlayer.turnOn();
        bluRayPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        bluRayPlayer.turnOff();
        soundSystem.turnOff();
        projector.turnOff();
    }
}

public class Facade {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, soundSystem, bluRayPlayer);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
