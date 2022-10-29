import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();

        gerente.setLogin("13");
        gerente.setSenha("13");
        gerente.setDocumento("66");
        gerente.setNome("Cesar");
        gerente.setId(123);

        Secretaria sec = new Secretaria();

        sec.setDocumento("11");
        sec.setNome("Machoke");
        sec.setRamal("M");
        sec.setTelefone("7070");
        sec.setId(12);

        Operador op = new Operador();

        op.setDocumento("87");
        op.setNome("MeireCleidy");
        op.setId(99);
        op.setValorHora(Double.valueOf("8"));

        RegistroPonto recGerente = new RegistroPonto();
        RegistroPonto recSec = new RegistroPonto();
        RegistroPonto recOp = new RegistroPonto();

        recGerente.setDataRegistro(LocalDate.now());
        recGerente.setHoraEntrada(LocalDateTime.now());
        recGerente.apresentarRegistroPonto(gerente);
        Thread.sleep(3000);
        recSec.setDataRegistro(LocalDate.now());
        recSec.setHoraEntrada(LocalDateTime.now());
        recSec.apresentarRegistroPonto(sec);
        Thread.sleep(3000);
        recOp.setDataRegistro(LocalDate.now());
        recOp.setHoraEntrada(LocalDateTime.now());
        recOp.apresentarRegistroPonto(op);
        Thread.sleep(3000);


        recGerente.setHoraSaida(LocalDateTime.now());
        recSec.setHoraSaida(LocalDateTime.now());
        recOp.setHoraSaida(LocalDateTime.now());

        recGerente.apresentarRegistroPonto(gerente);
        Thread.sleep(3000);
        recSec.apresentarRegistroPonto(sec);
        Thread.sleep(3000);
        recOp.apresentarRegistroPonto(op);
        Thread.sleep(3000);

    }
       }
