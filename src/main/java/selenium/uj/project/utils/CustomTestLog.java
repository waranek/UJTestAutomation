package selenium.uj.project.utils;

import org.openqa.selenium.WebElement;

public class CustomTestLog {

    public static int CLEAR_ACTION = 1;
    public static int FILL_ACTION = 2;
    public static int CLICK_ACTION = 3;
    public static int IS_DISPLAYED_ACTION = 4;

    public static String getElementMessage(WebElement element, int action) {
        return getElementMessage(element, null, action);
    }

    public static String getElementMessage(WebElement element, String value, int action) {

        String elementTag = "ACTION - Element " +
                (element.getTagName() != null && element.getTagName().length() > 0 ? element.getTagName() : " without TAG");

        String elementId = element.getAttribute("id") != null && element.getAttribute("id").length() > 0 ?
                " with id = '" + element.getAttribute("id") + "'" :
                "";

        String info;
        if (action == CLEAR_ACTION) {
            info = " was cleared";
        } else if (action == FILL_ACTION) {
            info = " was filled" + (value != null ? " using value = '" + value + "'" : " using UNKNOWN value");
        } else if (action == CLICK_ACTION) {
            info = " was clicked";
        } else if (action == IS_DISPLAYED_ACTION) {
            info = " was checked is displayed";
        } else {
            info = " was used with UNKNOWN action";
        }

        return elementTag + elementId + info;
    }
}