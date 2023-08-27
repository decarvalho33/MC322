package biblioteca.sistema;

import java.util.ArrayList;

import obras.*;
import obras.fisico.Artigo;
import obras.fisico.Dissertacao;
import obras.fisico.Livro;
import obras.fisico.Periodico;
import obras.fisico.TCC;
import obras.fisico.Tese;
import pessoas.Funcionario;
import pessoas.Membros.Aluno;
import pessoas.Membros.Membros;
import pessoas.Membros.Professor;

public class Relatorio {
	//variaveis de controle para gerar o tombo automaticamente:
	private int numArtigos, numDissertacoes, numLivros, numPeriodicos, numTCCs, numTeses;
	
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Funcionario> funcionarios;
	private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Reserva> reservas;

	//Construtor
	public Relatorio(){
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.funcionarios = new ArrayList<Funcionario>();
        emprestimos = new ArrayList<Emprestimo>();
        reservas = new ArrayList<Reserva>();
	}
	

    // Getters & Setters
    public int getNumArtigos() {
        return this.numArtigos;
    }

    public void setNumArtigos(int numArtigos) {
        this.numArtigos = numArtigos;
    }

    public int getNumDissertacoes() {
        return this.numDissertacoes;
    }

    public void setNumDissertacoes(int numDissertacoes) {
        this.numDissertacoes = numDissertacoes;
    }

    public int getNumLivros() {
        return this.numLivros;
    }

    public void setNumLivros(int numLivros) {
        this.numLivros = numLivros;
    }

    public int getNumPeriodicos() {
        return this.numPeriodicos;
    }

    public void setNumPeriodicos(int numPeriodicos) {
        this.numPeriodicos = numPeriodicos;
    }

    public int getNumTCCs() {
        return this.numTCCs;
    }

    public void setNumTCCs(int numTCCs) {
        this.numTCCs = numTCCs;
    }

    public int getNumTeses() {
        return this.numTeses;
    }

    public void setNumTeses(int numTeses) {
        this.numTeses = numTeses;
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    
    //Outros métodos 
    public void obraAdicionada(Obra obra) {
        if (obra instanceof Artigo) {
            numArtigos++;
        } else if (obra instanceof Dissertacao) {
            numDissertacoes++;
        } else if (obra instanceof Livro) {
            numLivros++;
        } else if (obra instanceof Periodico) {
            numPeriodicos++;
        } else if (obra instanceof TCC) {
            numTCCs++;
        } else if (obra instanceof Tese) {
            numTeses++;
        }
    }
    
    // Realiza um emprestimo
    public Emprestimo realizarEmprestimo(Obra obra, Membros membros) {
        Emprestimo emprestimo = new Emprestimo(obra, membros);
        emprestimos.add(emprestimo); // Adicionar à lista de empréstimos
        return emprestimo; // Retorna o empréstimo criado
    }

    public void registrarDevolucao(Emprestimo emprestimo) {
        if (emprestimos.contains(emprestimo)) {
            emprestimo.registrarDevolucao();
            emprestimos.remove(emprestimo);
        } else {
            System.out.println("Empréstimo não encontrado");
        }
    }

    // Realiza reserva
    public Reserva realizReserva(Obra obra, Membros membros) {
        Reserva reserva = new Reserva(obra, membros);
        reservas.add(reserva);
        return reserva;
    }

}