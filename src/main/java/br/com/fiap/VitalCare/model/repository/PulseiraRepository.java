package br.com.fiap.VitalCare.model.repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.VitalCare.model.entity.Pulseira;

public class PulseiraRepository extends Repository {
	
	public static ArrayList<Pulseira> findAll() {
		ArrayList<Pulseira> pulseiras = new ArrayList<Pulseira>();
		String sql = "select * from cad_pulseira";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Pulseira pulseira = new Pulseira();
					pulseira.setId(rs.getLong("id"));
					pulseira.setBatimentos(rs.getBoolean("ativar_batimentos"));
					pulseira.setPressao(rs.getBoolean("ativar_pressao"));
					pulseira.setOxigenio(rs.getBoolean("ativar_oxi_sangue"));
					pulseira.setLocalizacao(rs.getBoolean("ativar_locali"));
					pulseiras.add(pulseira);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return pulseiras;
	}
	
}