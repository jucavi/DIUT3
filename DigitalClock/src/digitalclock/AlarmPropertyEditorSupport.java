/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalclock;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.time.LocalDateTime;

/**
 *
 * @author Juan Carlos Vilarrubia
 */
public class AlarmPropertyEditorSupport extends PropertyEditorSupport {

    private final AlarmPanel alarmPanel = new AlarmPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return alarmPanel;
    }

    @Override
    public String getJavaInitializationString() {

        LocalDateTime datetime = alarmPanel.getSelectedValue().getDateTime();
        boolean active = alarmPanel.getSelectedValue().isActive();
        String message = alarmPanel.getSelectedValue().getMessage();

        return "new digitalclock.Alarm("
                + "java.time.LocalDateTime.of("
                + datetime.getYear() + ", "
                + datetime.getMonthValue() + ", "
                + datetime.getDayOfMonth() + ", "
                + datetime.getHour() + ", "
                + datetime.getMinute() + ", "
                + datetime.getSecond() 
                + "), "
                + active + ", \"" 
                + message + "\")";
    }

    @Override
    public Object getValue() {
        return alarmPanel.getSelectedValue();
    }
}
