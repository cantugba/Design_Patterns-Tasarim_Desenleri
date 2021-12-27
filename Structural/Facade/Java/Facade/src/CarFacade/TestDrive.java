package CarFacade;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Engine engine = new Engine();
        StereoSystem stereoSystem = new StereoSystem();
        HeatedSeats heatedSeats = new HeatedSeats();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1500);
            System.out.println("Driving to work... " + i + "km");
            switch (i) {
                case 1:
                    Thread.sleep(500);
                    carFacade.playTrack("Alok - Love Again");
                    break;
                case 2:
                    Thread.sleep(500);
                    carFacade.playTrack("Alok - Rapture");
                    break;
                case 3:
                    Thread.sleep(500);
                    carFacade.playTrack("Alok - Tell Me Why");
                    break;
                case 4:
                    Thread.sleep(500);
                    carFacade.playTrack("Alok - Enjoy the silence");
                    break;
            }
        }

        System.out.println("\nWe have arrived");
        Thread.sleep(1000);
        carFacade.turnOffCar();
    }
}
