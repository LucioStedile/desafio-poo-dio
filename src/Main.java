import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição do curso Js");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição BootCamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria1);

       Dev devLucio = new Dev();
       devLucio.setNome("Lúcio");
       devLucio.inscreverBootCamp(bootcamp);
       System.out.println("Conteúdos Inscritos Aluno 1:" + devLucio.getConteudosInscritos());
       devLucio.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Aluno 1:" + devLucio.getConteudosInscritos());
       System.out.println("Conteúdos comcluidos Aluno 1:" + devLucio.getConteudosConcluidos());
       System.out.println("XP:" + devLucio.calcularTotalXp());

        System.out.println("--------------------");

       Dev devStedile = new Dev();
       devStedile.setNome("Stedile");
       devStedile.inscreverBootCamp(bootcamp);
       System.out.println("Conteúdos Inscritos Aluno 2" + devStedile.getConteudosInscritos());
       devStedile.progredir();
       devStedile.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Aluno 2" + devStedile.getConteudosInscritos());
       System.out.println("Conteúdos comcluidos Aluno 2" + devStedile.getConteudosConcluidos());
       System.out.println("XP:" + devStedile.calcularTotalXp());
    }
}
