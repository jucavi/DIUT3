/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digitalclock;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Clase que permite definir la fecha y la hora de una alarma así como su estado
 * de actividad
 *
 * @author Juan Carlos Vilarrubia
 */
public class Alarm implements Serializable {

    /**
     * Fecha y hora de la alarma
     */
    private LocalDateTime dateTime;
    /**
     * Estado de la alarmtra, true si está activa
     */
    private boolean active;
    private String message;

    public Alarm(LocalDateTime dateTime, boolean isActive, String message) {
        this.dateTime = dateTime;
        this.active = isActive;
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
