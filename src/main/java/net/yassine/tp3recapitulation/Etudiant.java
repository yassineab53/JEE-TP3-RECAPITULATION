package net.yassine.tp3recapitulation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    private String cin,nom;
    private double moyenne;
    private String image;
}
