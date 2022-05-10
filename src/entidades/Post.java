package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
	
	private Date momento;
	private String legenda;
	private String conteudo;
	private Integer curtidas;
	
	private List <Comentarios> comentarios = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date momento, String legenda, String conteudo, Integer curtidas) {
		this.momento = momento;
		this.legenda = legenda;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentarios comentario) {
		comentarios.add (comentario);
	}
	
	public void removeComentario(Comentarios comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(conteudo + "\n");
		sb.append(legenda + "\n");
		sb.append(sdf.format(momento) + "\n");
		sb.append(curtidas + "\n");
		for (Comentarios c: comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	

}