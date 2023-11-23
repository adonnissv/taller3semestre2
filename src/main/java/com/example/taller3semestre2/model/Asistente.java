package com.example.taller3semestre2.model;

public class Asistente {
    private String numEntradas;
    private String numContacto;
    private String preferenciaMusical;

    public Asistente(String numEntradas, String numContacto, String preferenciaMusical) {
        this.numEntradas = numEntradas;
        this.numContacto = numContacto;
        this.preferenciaMusical = preferenciaMusical;
    }

    public String getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(String numEntradas) {
        this.numEntradas = numEntradas;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public String getPreferenciaMusical() {
        return preferenciaMusical;
    }

    public void setPreferenciaMusical(String preferenciaMusical) {
        this.preferenciaMusical = preferenciaMusical;
    }

    public boolean agregarAsistente(){
        return true;
    }
}
