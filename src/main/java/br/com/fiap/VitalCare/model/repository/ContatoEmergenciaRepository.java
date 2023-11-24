package br.com.fiap.VitalCare.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.com.fiap.VitalCare.model.entity.ContatoEmergencia;

public class ContatoEmergenciaRepository extends Repository {
	
	
	public static ContatoEmergencia save(ContatoEmergencia contato) {
		String sql = "insert into cad_contato_eme" + "(id, nome_contato, nume_contato, relacao_contato)"
				+ " values(null, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, contato.getNomeContato());
			ps.setString(2, contato.getTelefoneContato());
			ps.setString(3, contato.getParentesco());
			if (ps.executeUpdate() > 0) {
				return contato;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}
	
	public static boolean delete(Long id) {
		String sql = "delete from cad_contato_eme where id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			if (ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return false;
	}
	
	public static ContatoEmergencia update(ContatoEmergencia contato) {
		String sql = "UPDATE cad_contato_eme " + "SET nome_contato=?, nume_contato=?, relacao_contato=?"
				+ "WHERE id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, contato.getNomeContato());
			ps.setString(2, contato.getTelefoneContato());
			ps.setString(4, contato.getParentesco());

			if (ps.executeUpdate() > 0) {
				return contato;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}
	
	public static ContatoEmergencia findById(Long id) {
		String sql = "select * from cad_contato_eme where id=?";
		ContatoEmergencia contato = new ContatoEmergencia();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				contato.setId(rs.getLong("id"));
				contato.setNomeContato(rs.getString("nome_contato"));
				contato.setTelefoneContato(rs.getString("nume_contato"));
				contato.setParentesco(rs.getString("relacao_contato"));

			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return contato;
	}

}
