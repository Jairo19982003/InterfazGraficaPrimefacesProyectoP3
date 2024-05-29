package org.example.interfazgrafica;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import model.Projecto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CommentaryBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Projecto> projectos;
    private Projecto selectedProjecto;

    @PostConstruct
    public void init() {
        projectos = new ArrayList<>();
        // Agrega proyectos de ejemplo
        projectos.add(new Projecto("Proyecto Java", "Java", "2024-05-01", "Jairo el chupa pijas tres mil", "Este es un proyecto de ejemplo en Java.", "public class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello, World!\"); } }", "http://github.com/usuario/proyecto-java"));
        projectos.add(new Projecto("Proyecto Typescript", "Typescript", "2024-05-10", "Autor 2", "Este es un proyecto de ejemplo en Typescript.", "const message: string = 'Hello, World!'; console.log(message);", "http://github.com/usuario/proyecto-typescript"));
        projectos.add(new Projecto("Lista Circular", "Java", "2024-05-10", "Mynor Ruano", "Este proyecto fue de listas enlazadas.......",
                "Public class ListaCircular {\n" +
                        "\n" +
                        "    // Método para determinar si una lista enlazada tiene un ciclo\n" +
                        "    public boolean tieneCiclo(Nodo head) {\n" +
                        "        if (head == null) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        Nodo lento = head;\n" +
                        "        Nodo rapido = head.next;\n" +
                        "\n" +
                        "        while (rapido != null && rapido.next != null && lento != rapido) {\n" +
                        "            lento = lento.next; // avanza un nodo\n" +
                        "            rapido = rapido.next.next; // avanza dos nodos\n" +
                        "        }\n" +
                        "\n" +
                        "        // Si lento y rapido se encuentran, hay un ciclo\n" +
                        "        return lento == rapido;\n" +
                        "}}\n","https://bitbucket.org/5to-semestre/listacircular/src/main/" ));
    }

    public String selectProject(Projecto projecto) {
        this.selectedProjecto = projecto;
        return "detalleProyecto?faces-redirect=true";
    }

    public List<Projecto> getProjects() {
        return projectos;
    }

    public void setProjects(List<Projecto> projectos) {
        this.projectos = projectos;
    }

    public Projecto getSelectedProject() {
        return selectedProjecto;
    }

    public void setSelectedProject(Projecto selectedProjecto) {
        this.selectedProjecto = selectedProjecto;
    }

}
