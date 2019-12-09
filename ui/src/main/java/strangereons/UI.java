package strangereons;

public class UI {
    private ApplicationInterface application;
    private String leeted;

    public UI(ApplicationInterface app) {
        this.application = app;
    }

    public String leetMessage(String unLeeted) {
        application.leet(unLeeted, this);
        return "Leeted: " + leeted;
    }

    public void setLeeted(String leeted) {
        this.leeted = leeted;
    }
}