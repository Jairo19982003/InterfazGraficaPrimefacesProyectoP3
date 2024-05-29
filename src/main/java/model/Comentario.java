package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {

    private Integer comentario_id;
    private String comentario;
    private Date fecha;
    private Usuario usuario;
    private Project project;


}

