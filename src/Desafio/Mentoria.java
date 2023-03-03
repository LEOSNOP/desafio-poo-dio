package Desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    public Mentoria(){
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public String toString() {
        return "Conteudo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }



}
