package br.com.fiap.VitalCare.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.com.fiap.VitalCare.model.entity.DadosDeSaude;

public class DadosDeSaudeRepository extends Repository {
	
	
	public static DadosDeSaude save(DadosDeSaude dados) {
		String sql = "insert into cad_info_saude" + "(id, alergias, medicamentos, cirurgia_previa, cond_medi)"
				+ " values(null, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, dados.getAlergias());
			ps.setString(2, dados.getMedicamentosEmUso());
			ps.setString(3, dados.getCirurgiaAnterior());
			ps.setString(3, dados.getCondicaoMedica());
			if (ps.executeUpdate() > 0) {
				return dados;
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
		String sql = "delete from cad_info_saude where id=?";
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
	
	public static DadosDeSaude update(DadosDeSaude dados) {
		String sql = "UPDATE cad_info_saude " + "SET alergias=?, medicamentos=?, cirurgia_previa=?, cond_medi=?"
				+ "WHERE id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, dados.getAlergias());
			ps.setString(2, dados.getMedicamentosEmUso());
			ps.setString(3, dados.getCirurgiaAnterior());
			ps.setString(4, dados.getCondicaoMedica());

			if (ps.executeUpdate() > 0) {
				return dados;
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
	
	public static DadosDeSaude findById(Long id) {
		String sql = "select * from cad_info_saude where id=?";
		DadosDeSaude dados = new DadosDeSaude();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				dados.setId(rs.getLong("id"));
				dados.setAlergias(rs.getString("alergias"));
				dados.setMedicamentosEmUso(rs.getString("medicamentos"));
				dados.setCirurgiaAnterior(rs.getString("cirurgia_previa"));
				dados.setCondicaoMedica(rs.getString("cond_medi"));

			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return dados;
	}

}
