package org.example.heranca;

public class Motoboy extends Funcionario{
    private String placamoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);

    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", sexo=" + sexo +
                ", placamoto='" + placamoto + '\'' +
                '}';
    }


    public String getPlacamoto() {
        return placamoto;
    }

    public void setPlacamoto(String placamoto) {
        this.placamoto = placamoto;
    }
}
