package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.PessoaFisica;

public class PessoaFisicaJdbcDAO {
	private Connection conn;
	public PessoaFisicaJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(PessoaFisica c) throws SQLException{
		String sql = "insert into pessoafisica (nome, endereco, bairro, cep, cidade, estado, telefone, celular, rg, cpf, sexo) values ('"+c.getNome()+"','"+c.getEndereco()+"','"+c.getBairro()+"','"+c.getCep()+"','"+c.getCidade()+"','"+c.getEstado()+"','"+c.getTelefone()+"','"+c.getCelular()+"','"+c.getNome()+"','"+c.getCelular()+"','"+c.getRg()+"','"+c.getCpf()+"','"+c.getSexo()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	public void imprimir() throws SQLException{
		String sql = "select * from pessoafisica";
		System.out.println(sql);
	}
}
