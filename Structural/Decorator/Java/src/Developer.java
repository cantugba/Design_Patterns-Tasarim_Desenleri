// component
public interface Developer {
    public String makeJob();
}

// concrete developer -> Concrete Component
class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java Code";
    }
}

// developer decorator
class DeveloperDecorator implements Developer {
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

// concrete decorator
class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.";
    }

    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}

// another concrete decorator
class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customers.";
    }

    public String makeJob() {
        return super.makeJob() + " " + sendWeekReport();
    }
}

class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                                new SeniorJavaDeveloper(
                                        new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}