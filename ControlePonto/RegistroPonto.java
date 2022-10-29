import java.time.LocalDateTime;
import java.time.LocalDate;


public class RegistroPonto  {
    private LocalDateTime horaSaida;
    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
    private LocalDateTime horaEntrada;
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    private LocalDate dataRegistro;
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    private Long idRegPonto;
    public Long getIdRegPonto() {
        return idRegPonto;
    }
    public void setIdRegPonto(Long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }
    private Funcionario func;
    public Funcionario getFunc() {
        return func;
    }
    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public void apresentarRegistroPonto (Funcionario func){

        System.out.println("Nome: " + func.getNome());
        System.out.println("Data de registro do ponto: " + dataRegistro);
        System.out.println("Entrada: " + horaEntrada);
        System.out.println("Saida: " +  horaSaida);
    }
}

