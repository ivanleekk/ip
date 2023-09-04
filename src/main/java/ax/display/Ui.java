package ax.display;

import ax.task.TaskList;

/**
 * The UI Class for basic display elements
 */
public class Ui {
    /**
     * Displays a horizontal line.
     */
    public static void hoLine() {
        System.out.println();
        System.out.println(
                "=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=    =^..^=   "
                        + "=^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=    "
        );
    }

    /**
     * Displays a greeting message.
     */
    public static void greet() {
        String newLogo =
                "                \n"
                        + "                \n"
                        + "                \n"
                        + "    ##          \n"
                        + "   ###          \n"
                        + "  ## ##  ##  ## \n"
                        + "  ## ##   ####  \n"
                        + " ##  ##    ##   \n"
                        + " ######   ###   \n"
                        + "##   ##  ## ##  \n"
                        + "##   ## ##  ##  \n"
                        + "                \n"
                        + "                \n";

        System.out.println("Hello from\n" + newLogo);
        System.out.println(
                "\uD83D\uDC4B Greetings!\n"
                        + "\n"
                        + "Ax at your service! I'm not just any chatbot; "
                        + "I'm Ax – your knowledgeable and engaging virtual companion. "
                        + "Whether you're seeking answers, a friendly chat, or a bit of fun, "
                        + "I'm here to make your experience enjoyable and insightful. "
                        + "Don't hesitate to share your thoughts or questions with me. "
                        + "Let's dive in and start our conversation! "
                        + "How can I assist you today, my friend?"
        );
        hoLine();
    }

    /**
     * Displays a farewell message.
     */
    public static void bye() {
        System.out.println(
                "Thank you for your time and I hope you found what you needed!! 🥰"
        );
        hoLine();
    }

    /**
     * Displays the current to-do list.
     */
    public static void listTheList() {
        for (int i = 1; i < TaskList.getListItems().size() + 1; i++) {
            System.out.printf("%d. %s%n", i, TaskList.getListItems().get(i - 1));
        }
        hoLine();
    }

    /**
     * Displays the current to-do list, but FILTERED based on the search string entered
     * @param str the string that you want to search by
     */
    public static void listTheList(String str) {
        for (int i = 1; i < TaskList.getListItems().size() + 1; i++) {
            if (TaskList.getListItems().get(i - 1).toString().contains(str)) {
                System.out.printf("%d. %s%n", i, TaskList.getListItems().get(i - 1));
            }
        }
        hoLine();
    }
}
