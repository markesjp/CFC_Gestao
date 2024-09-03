/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Pedrinho
 */
public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time(String horario) {
        String aux [] = horario.split(":");
        this.hours = Integer.parseInt(aux[0]);
        this.minutes = Integer.parseInt(aux[1]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    public void subMinutes(int minutes) {
        this.minutes -= minutes;
        while (this.minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public void subHours(int hours) {
        this.hours -= hours;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
