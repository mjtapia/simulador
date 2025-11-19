package cl.uda.simulador.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="vacantes")
@Data
public class Vacante {

    @Id
    @Column(name = "codigo_carrera")
    private Integer codigoCarrera;

    @Column(name = "nombre_carrera")
    private String nombreCarrera;

    private String sede;
    private String estado;

    @Column(name = "ptje_nem")
    private Integer ptjeNem;

    @Column(name = "ptje_ranking")
    private Integer ptjeRanking;

    @Column(name = "comp_o_leng")
    private Integer compOLeng;

    private Integer matematica;

    @Column(name = "hist_cs_soc")
    private Integer histCsSoc;

    private Integer ciencias;

    @Column(name = "hist_y_ciencias")
    private Integer histYCiencias;

    @Column(name = "matematica_2")
    private Integer matematica2;

    @Column(name = "min_puntaje_lym")
    private Integer minPuntajeLym;

    @Column(name = "puntaje_ponderado_min")
    private Integer puntajePonderadoMin;

    @Column(name = "vac_regulares")
    private Integer vacRegulares;

    private Integer sobrecupos;

    @Column(name = "vac_bea")
    private Integer vacBea;

    @Column(name = "vac_pace")
    private Integer vacPace;

    @Column(name = "vacantes_mas_mc")
    private Integer vacantesMasMc;

    @Column(name = "prueba_especial")
    private String pruebaEspecial;

    private String tipo;
    private String ponderacion;

    private Integer ano;
}
