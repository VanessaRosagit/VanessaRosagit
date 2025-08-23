import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso();
        java.setTitulo("curso java");
        java.setDescricao("descricao curso java");
        java.setCargaHoraria(8);

        Curso js = new Curso();
        js.setTitulo("curso js");
        js.setDescricao("descricao curso js");
        js.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(js);
        bootcamp.getConteudos().add(mentoria);

        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vanessa:" + devVanessa.getConteudosInscritos());
        devVanessa.progredir();
        devVanessa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vanessa:" + devVanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vanessa:" + devVanessa.getConteudosConcluidos());
        System.out.println("XP:" + devVanessa.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
