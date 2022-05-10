package Aplicaçao;

import entidades.Comentarios;
import entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		
		Post p1 = new Post (sdf.parse("07/03/2022 18:46:03"), "Ferias chegou", "Estou indo para SP", 12);
		
		Comentarios c1 = new Comentarios("Boa viagem");
		Comentarios c2 = new Comentarios ("Vá em paz");
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);

	}

}
