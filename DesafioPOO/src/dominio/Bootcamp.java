package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bootcamp {
    
	private int xpRecompensa;
    private String TituloBootcamp;
    private List<String> Inscritos;
    private List<Conteudo> conteudos;

    public Bootcamp() {
        this.Inscritos = new ArrayList<>();
        this.conteudos = new ArrayList<>();
    }
    
    public void addConteudo(Conteudo conteudo) {
    	conteudos.add(conteudo);
    }

    public List<String> getConteudos() {
        return conteudos.stream()
                .map(Conteudo::getTitulo)
                .collect(Collectors.toList());
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public String getTituloBootcamp() {
        return TituloBootcamp;
    }

    public void setTituloBootcamp(String tituloBootcamp) {
        this.TituloBootcamp = tituloBootcamp;
    }

    public List<String> getInscritos() {
        return Inscritos;
    }

    public void addInscritos(String inscrito) {
        if (!Inscritos.contains(inscrito)) {
            Inscritos.add(inscrito);
        }
    }

	public int getXpRecompensa() {
		return xpRecompensa;
	}

	public void setXpRecompensa(int xpRecompensa) {
		this.xpRecompensa = xpRecompensa;
	}
}