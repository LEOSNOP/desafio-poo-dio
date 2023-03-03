package Desafio;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso2.setTitulo("curso ruby");
        curso2.setDescricao("descrição curso ruby");
        curso2.setCargaHoraria(8);

        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Leo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("conteudos Concluidos" + dev1.getConteudosConcluidos());
        System.out.println("-----------------------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("conteudos Concluidos" + dev2.getConteudosConcluidos());

    }
}
