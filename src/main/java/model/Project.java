package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private Integer proyecto_id;
    private String urlRepo;
    private String urlImage;
    private String description;
    private String nameProject;
    private Date fecha;
    private Admin Admin;

}
