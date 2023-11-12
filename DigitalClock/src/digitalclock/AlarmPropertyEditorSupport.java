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

        LocalDateTime datetime = ((Alarm) getValue()).getDateTime();
        boolean active = ((Alarm) getValue()).isActive();

        return "new digitalclock.Alarm(" + datetime + ", " + active + ")";
    }

    @Override
    public Object getValue() {
        return alarmPanel.getSelectedValue();
    }
}
