import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Programação Orientada a Objetos em Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Teste de Software");
        curso2.setDescricao("Aprendendo as Técnicas mais avançadas para Testar Software");
        curso2.setCargaHoraria(10);

        Mentoria GFTJavaDev = new Mentoria();
        GFTJavaDev.setTitulo("Mentoria de java");
        GFTJavaDev.setDescricao("Mentoria de POO em java");
        GFTJavaDev.setData(LocalDate.now());

        Mentoria GFTQualityAssurence = new Mentoria();
        GFTQualityAssurence.setTitulo("Mentoria de Q.A");
        GFTQualityAssurence.setDescricao("Mentoria em Quality Assurence");
        GFTQualityAssurence.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("GFT Start #4 Java");
        bootcamp1.setDescricao("Bootcamp Start Java Developer para Trabalhar na GFT");
        bootcamp1.getConteudos().add(curso1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("GFT Quality Assurence #1");
        bootcamp2.setDescricao("Bootcamp Quality Assurence para Trabalhar na GFT");
        bootcamp2.getConteudos().add(curso2);

        Dev devDeyvisonMoraes = new Dev();
        devDeyvisonMoraes.setNome("Deyvison");
        devDeyvisonMoraes.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Deyvison:" + devDeyvisonMoraes.getConteudosInscritos());
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
        System.out.println("===========");
        System.out.println("Conteúdos Inscritos Jaire:" + devJaire.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jaire:" + devJaire.getConteudosConcluidos());
        System.out.println("XP:" + devJaire.calcularTotalXp());

    }
}
