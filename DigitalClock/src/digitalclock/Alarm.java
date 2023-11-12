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
class Alarm implements Serializable {

    /**
     * Fecha y hora de la alarma
     */
    private LocalDateTime dateTime;
    /**
     * Estado de la alarmtra, true si está activa
     */
    private boolean active;

    public Alarm(LocalDateTime dateTime, boolean isActive) {
        this.dateTime = dateTime;
        this.active = isActive;
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

    public boolean equals(Alarm other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (getClass() != other.getClass()) {
            return false;
        }

        boolean sameYear = this.getDateTime().getYear() == other.getDateTime().getYear();
        boolean sameMonth = this.getDateTime().getMonth() == other.getDateTime().getMonth();
        boolean sameDay = this.getDateTime().getDayOfMonth() == other.getDateTime().getDayOfMonth();
        boolean sameHour = this.getDateTime().getHour() == other.getDateTime().getHour();
        boolean sameMinute = this.getDateTime().getMinute() == other.getDateTime().getMinute();
        boolean sameSecond = this.getDateTime().getSecond() == other.getDateTime().getSecond();

        return sameYear && sameMonth && sameDay && sameHour && sameMinute && sameSecond;
    }

}
