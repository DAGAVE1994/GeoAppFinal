package com.danielgarcia.android.model;

/**
 * Created by Pro on 08/06/16.
 */
public class Pregunta {
    private Integer mldResTexto;
    private Boolean mRespuestaVerdadera;

    public Pregunta(Integer mldResTexto, Boolean mRespuestaVerdadera) {
        this.mldResTexto = mldResTexto;
        this.mRespuestaVerdadera=mRespuestaVerdadera;
    }

    public void setMldResTexto(Integer mldResTexto) {
        this.mldResTexto = mldResTexto;
    }

    public Integer getMldResTexto() {
        return mldResTexto;
    }

    public void setmRespuestaVerdadera(Boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public Boolean getmRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

}
