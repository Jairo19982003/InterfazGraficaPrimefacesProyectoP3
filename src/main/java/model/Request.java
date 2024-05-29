package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Request {

    private String comentario;
    private Date fecha;
    private Usuario usuario;
    private String nameUser;
    private String emailUser;
    private Project project;
    private String nameProject;
    private String urlRepo;
    private String admin;

}
