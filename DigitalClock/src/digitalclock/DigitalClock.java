/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalclock;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos Vilarrubia
 */
public class DigitalClock extends JLabel implements Serializable {

    private enum TimeStringFormat {
        H12("HH:mm:ss"),
        H24("HH:mm:ss a");

        public final String label;

        private TimeStringFormat(String label) {
            this.label = label;
        }
    }

    private Alarm alarm;
    private boolean format24 = false;

    public DigitalClock() {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime currentDate = LocalDateTime.now();
                setText(currentDate);

                if (alarm != null && alarm.isActive() && checkTime(currentDate)) {
                    if (checkTime(currentDate)) {
                        JOptionPane.showMessageDialog(DigitalClock.this, alarm.getMessage());
                    }
                }
            }
        }, 0, 1000);

    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    /**
     * Aplica la hora pasada como parámetro en el texto del componente, teniendo
     * en cuenta si le muestra en formato 12H o 24H
     *
     * @param curentDate fecha y hora actuales
     */
    private void setText(LocalDateTime curentDate) {

        DateTimeFormatter dtf;

        if (format24) {
            dtf = DateTimeFormatter.ofPattern(TimeStringFormat.H24.label);
        } else {
            dtf = DateTimeFormatter.ofPattern(TimeStringFormat.H12.label);
        }

        setText(dtf.format(curentDate).toUpperCase());
    }

    /**
     * Comprueba si la fecha y la hora pasadas como parámetro coinciden con la
     * almacenada en la alarma
     *
     * @param currentDate fecha y hora
     * @return {@code true} si la {@code currentDate == Alarm#getDateTime}
     */
    private boolean checkTime(LocalDateTime currentDate) {

        boolean sameYear = currentDate.getYear() == alarm.getDateTime().getYear();
        boolean sameMonth = currentDate.getMonth() == alarm.getDateTime().getMonth();
        boolean sameDay = currentDate.getDayOfMonth() == alarm.getDateTime().getDayOfMonth();
        boolean sameHour = currentDate.getHour() == alarm.getDateTime().getHour();
        boolean sameMinute = currentDate.getMinute() == alarm.getDateTime().getMinute();
        boolean sameSecond = currentDate.getSecond() == alarm.getDateTime().getSecond();

        return sameYear && sameMonth && sameDay && sameHour && sameMinute && sameSecond;
    }

    public boolean isFormat24() {
        return format24;
    }

    public void setFormat24(boolean format24) {
        this.format24 = format24;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

}
