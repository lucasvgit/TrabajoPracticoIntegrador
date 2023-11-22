/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Entities;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Problema {

    private String descripcionDelProblema;
    private String tipoDeProblema;
    private double tiempoDeResolucion;
    private List<Incidente> incidentes = new ArrayList<>();
    private Cliente cliente;
    private Tecnico tecnico;
    private String consideraciones;
}