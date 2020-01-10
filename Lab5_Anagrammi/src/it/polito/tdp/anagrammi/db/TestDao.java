package it.polito.tdp.anagrammi.db;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class TestDao {

	public static void main(String[] args) {
		AnagrammaDAO dao = new AnagrammaDAO();
		System.out.print(dao.isCorrect("gatto"));

	}

}
