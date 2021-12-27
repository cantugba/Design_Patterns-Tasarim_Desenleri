class ComputerFacadeTestDrive {
    public static void main(String[] args) throws InterruptedException {
        Processor amd = new Processor();
        Monitor lg34 = new Monitor();
        Keyboard logitech = new Keyboard();

        ComputerFacade computerFacade = new ComputerFacade(amd, lg34, logitech);
        computerFacade.turnOnComputer();
        Thread.sleep(1500);
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    private Processor processor;
    private Monitor monitor;
    private Keyboard keyboard;

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
        keyboard.turnOnBacklight();
    }

    public void turnOffComputer() {
        keyboard.off();
        keyboard.turnOffBacklight();
        monitor.off();
        processor.off();
    }
}

class Processor {
    private String description;

    public Processor() {
        this.description = "Processor";
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}

class Monitor {
    private String description;

    public Monitor() {
        this.description = "Monitor";
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}

class Keyboard {
    private String description;

    public Keyboard() {
        this.description = "Keyboard";
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    protected void turnOnBacklight() {
        System.out.println("Backlight is turned on");
    }

    protected void turnOffBacklight() {
        System.out.println("Backlight is turned off");
    }
}