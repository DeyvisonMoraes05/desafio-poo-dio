import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // CRIAÇÃO DE CURSOS
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Programação Orientada a Objetos em Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Teste de Software");
        curso2.setDescricao("Aprendendo as Técnicas mais avançadas para Testar Software");
        curso2.setCargaHoraria(10);

        Curso curso3 = new Curso();
        curso3.setTitulo("Introdução ao Git e GitHub");
        curso3.setDescricao("Aprendendo o versionamento de código, local e remoto");
        curso3.setCargaHoraria(7);

        Curso curso4 = new Curso();
        curso4.setTitulo("Dominando IDE's Java");
        curso4.setDescricao("Aprendendo a usar as principais IDE's para se programar em Java");
        curso4.setCargaHoraria(5);

        Curso curso5 = new Curso();
        curso5.setTitulo("Projetos ágeis com SCRUM");
        curso5.setDescricao("Aprendendo as ténicas ágeis com o framework SCRUM");
        curso5.setCargaHoraria(10);

        Curso curso6 = new Curso();
        curso6.setTitulo("Introdução ao Mercado de Qualidade de Software");
        curso6.setDescricao("Conhecendo como funciona o mercado de Qualidade de Software");
        curso6.setCargaHoraria(10);



        // CRIAÇÃO DE MENTORIAS
        Mentoria GFTJavaDev = new Mentoria();
        GFTJavaDev.setTitulo("Mentoria de java");
        GFTJavaDev.setDescricao("Mentoria de POO em java");
        GFTJavaDev.setData(LocalDate.now());

        Mentoria GFTQualityAssurence = new Mentoria();
        GFTQualityAssurence.setTitulo("Mentoria de Q.A");
        GFTQualityAssurence.setDescricao("Mentoria em Quality Assurence");
        GFTQualityAssurence.setData(LocalDate.now());

        // CRIAÇÃO DE BOOTCAMPS
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("GFT Start #4 Java");
        bootcamp1.setDescricao("Bootcamp Start Java Developer para Trabalhar na GFT");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(curso4);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("GFT Quality Assurence #1");
        bootcamp2.setDescricao("Bootcamp Quality Assurence para Trabalhar na GFT");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso5);
        bootcamp2.getConteudos().add(curso6);

        Dev devDeyvisonMoraes = new Dev();
        devDeyvisonMoraes.setNome("Deyvison");
        devDeyvisonMoraes.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Deyvison:" + devDeyvisonMoraes.getConteudosInscritos());
        devDeyvisonMoraes.progredir();
        devDeyvisonMoraes.progredir();
        System.out.println("===========");
        System.out.println("Conteúdos Inscritos Deyvison:" + devDeyvisonMoraes.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Deyvison:" + devDeyvisonMoraes.getConteudosConcluidos());
        System.out.println("XP:" + devDeyvisonMoraes.calcularTotalXp());

        System.out.println("================================================================" +
                           "================================================================");

        Dev devJaire = new Dev();
        devJaire.setNome("Jaire");
        devJaire.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Jaire:" + devJaire.getConteudosInscritos());
        devJaire.progredir();
        devJaire.progredir();
        System.out.println("===========");
        System.out.println("Conteúdos Inscritos Jaire:" + devJaire.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jaire:" + devJaire.getConteudosConcluidos());
        System.out.println("XP:" + devJaire.calcularTotalXp());

    }
}
