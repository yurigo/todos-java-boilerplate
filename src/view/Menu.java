package view;

public interface Menu {
    void showMenu();
    String readOption();
    String readText(String message);
    String readId(String message);

    void show();
    void show(String message);
    void show(String message, Color color);
    void showInfo(String message);
    void showSuccess(String message);
    void showWarning(String message);
    void showError(String message);
}