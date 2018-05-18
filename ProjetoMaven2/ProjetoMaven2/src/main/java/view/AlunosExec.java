package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {
	public static void main(String args[]) {
		Alunos alunos = new Alunos();
		try {
			
			alunos.setNome("Jeferson Roberto de Lima");
			alunos.setEndereco("Av Águia de Haia, 2600");
			alunos.setBairro("Jd São Nicolau");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.listar();
			//alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.excluir(1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


