package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dev {
    private String nome;
    private int idade;
    private int XP;
    private List<Bootcamp> conteudosInscritos;
    private List<Bootcamp> conteudosConcluidos;

    public Dev() {
        this.conteudosInscritos = new ArrayList<>();
        this.conteudosConcluidos = new ArrayList<>();
    }

    public void inscreverConteudo(Bootcamp conteudo) {
        if (!conteudosInscritos.contains(conteudo)) {
            conteudosInscritos.add(conteudo);
            conteudo.addInscritos(nome);
        }
    }

    public void concluirConteudo(Bootcamp conteudo) {
        if (conteudosInscritos.contains(conteudo) && !conteudosConcluidos.contains(conteudo)) {
            conteudosConcluidos.add(conteudo);
            removerConteudoInscrito(conteudo);
            XP += conteudo.getXpRecompensa();
        }
    }

    public void removerConteudoInscrito(Bootcamp conteudo) {
        conteudosInscritos.remove(conteudo);
    }

    public List<String> getConteudosInscritos() {
        return conteudosInscritos.stream()
                                 .map(Bootcamp::getTituloBootcamp)
                                 .collect(Collectors.toList());
    }

    public List<String> getConteudosConcluidos() {
        return conteudosConcluidos.stream()
                                  .map(Bootcamp::getTituloBootcamp)
                                  .collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

	public int getXP() {
		return XP;
	}

}