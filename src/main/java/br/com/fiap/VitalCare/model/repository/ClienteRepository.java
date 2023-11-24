package br.com.fiap.VitalCare.model.repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.VitalCare.model.entity.Cliente;

public class ClienteRepository extends Repository {
	
	public static ArrayList<Cliente> findAll() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "select * from cad_cliente";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setId(rs.getLong("id"));
					cliente.setNome(rs.getString("nome"));
					cliente.setTelefone(rs.getString("telefone"));
					cliente.setDataNascimento(rs.getDate("dat_nasc").toLocalDate());
					cliente.setGenero(rs.getString("genero"));
					cliente.setEmail(rs.getString("email"));
					cliente.setSenha(rs.getString("senha"));
					cliente.setRua(rs.getString("rua"));
					cliente.setNumero(rs.getString("numero"));
					cliente.setComplemento(rs.getString("complemento"));
					cliente.setBairro(rs.getString("bairro"));
					cliente.setMunicipio(rs.getString("municipio"));
					cliente.setUf(rs.getString("uf"));
					cliente.setCep(rs.getString("cep"));
					clientes.add(cliente);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return clientes;
	}
	
	public static Cliente save(Cliente cliente) {
		String sql = "insert into cad_cliente" + "(id, nome, telefone, dat_nasc, genero, email, senha, rua, numero, complemento"
				+ "bairro, municipio, uf, cep)"
				+ " values(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.setDate(3, Date.valueOf (cliente.getDataNascimento()));
			ps.setString(4, cliente.getGenero());
			ps.setString(5, cliente.getEmail());
			ps.setString(6, cliente.getSenha());
			ps.setString(7, cliente.getRua());
			ps.setString(8, cliente.getNumero());
			ps.setString(9, cliente.getComplemento());
			ps.setString(10, cliente.getBairro());
			ps.setString(11, cliente.getMunicipio());
			ps.setString(12, cliente.getUf());
			ps.setString(13, cliente.getCep());
			if (ps.executeUpdate() > 0) {
				return cliente;
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
		String sql = "delete from cad_cliente where id=?";
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
	
	public static Cliente update(Cliente cliente) {
		String sql = "UPDATE cad_cliente " + "SET nome=?, telefone=?, dat_nasc=?, genero=?, email=?, senha=? rua=?, numero=?"
				+ "complemento=?, bairro=?, municipio=?, uf=?, cep=?"
				+ "WHERE id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.setDate(3, Date.valueOf (cliente.getDataNascimento()));
			ps.setString(4, cliente.getGenero());
			ps.setString(5, cliente.getEmail());
			ps.setString(6, cliente.getSenha());
			ps.setString(7, cliente.getRua());
			ps.setString(8, cliente.getNumero());
			ps.setString(9, cliente.getComplemento());
			ps.setString(10, cliente.getBairro());
			ps.setString(11, cliente.getMunicipio());
			ps.setString(12, cliente.getUf());
			ps.setString(13, cliente.getCep());
			if (ps.executeUpdate() > 0) {
				return cliente;
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
	
	public static Cliente findById(Long id) {
		String sql = "select * from cad_cliente where id=?";
		Cliente cliente = new Cliente();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setDataNascimento(rs.getDate("dat_nasc").toLocalDate());
				cliente.setGenero(rs.getString("genero"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setRua(rs.getString("rua"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setComplemento(rs.getString("complemento"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setMunicipio(rs.getString("municipio"));
				cliente.setUf(rs.getString("uf"));
				cliente.setCep(rs.getString("cep"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return cliente;
	}

}
