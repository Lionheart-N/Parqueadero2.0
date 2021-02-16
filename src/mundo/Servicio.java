/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author WIN10
 */
public class Servicio {
    
    private String idServicio;
    private Calendar horaEntrada;
    private Calendar horaSalida;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Pago miPago;

    public Servicio(String idServicio, Calendar horaEntrada, Calendar horaSalida, Date fechaEntrada, Date fechaSalida, Pago miPago) {
        this.idServicio = idServicio;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.miPago = miPago;
    }

    public Servicio() {
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public Calendar getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Calendar horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Calendar getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

   

    public Pago getMiPago() {
        return miPago;
    }

    public void setMiPago(Pago miPago) {
        this.miPago = miPago;
    }

    
    

}
