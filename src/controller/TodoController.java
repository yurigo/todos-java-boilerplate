package controller;

import dao.TodoDAO;
import view.Color;
import view.Menu;

public class TodoController {

    private final TodoDAO dao;
    private final Menu menu;

    public TodoController(TodoDAO dao, Menu menu) {
        this.dao = dao;
        this.menu = menu;
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            try {
                menu.showMenu();
                String option = menu.readOption();

                switch (option) {
                    case "1" -> showAll();
                    case "2" -> addTodo();
                    case "3" -> toggleTodo();
                    case "4" -> deleteTodo();
                    case "Q" -> exit = true;
                    default -> menu.showError("Opción no valida");
                }

            } catch (Exception e) {
                menu.showWarning("Error: " + e.getMessage());
            }

            menu.show();
        }

        menu.show("👋 Saliendo..." , Color.PURPLE);
    }

    private void showAll() throws Exception {

    }

    private void addTodo() throws Exception {

    }

    private void toggleTodo() throws Exception {

    }

    private void deleteTodo() throws Exception {

    }
}
