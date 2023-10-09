/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import DB.Database;
import interfaces.DAOBooks;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.BooksModel;

/**
 *
 * @author hecto
 */
public class DAOBooksImplements extends Database implements DAOBooks{

    @Override
    public void addBooks(BooksModel libro) throws Exception {
        try {
            this.conexion();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO libros (titulo, autor, editorial, edicion, descripcion, categoria, cantidad) VALUES (?,?,?,?,?,?,?)");
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getAutor());
            st.setString(3, libro.getEditorial());
            st.setString(4, libro.getEdicion());
            st.setString(5, libro.getDescripcion());
            st.setString(6, libro.getCategoria());
            st.setInt(7, libro.getCantidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public void updateBooks(BooksModel libro) throws Exception {
        try {
            this.conexion();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE libros (titulo, autor, editorial, edicion, descripcion, categoria, cantidad) VALUES (?,?,?,?,?,?,?)");
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getAutor());
            st.setString(3, libro.getEditorial());
            st.setString(4, libro.getEdicion());
            st.setString(5, libro.getDescripcion());
            st.setString(6, libro.getCategoria());
            st.setInt(7, libro.getCantidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public void deleteBooks(BooksModel libro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<BooksModel> getBooks() throws Exception {
        
        List<BooksModel> libros = null;
                
        try {
            this.conexion();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM libros;");
            libros = new ArrayList();

            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                //(titulo, autor, editorial, edicion, descripcion, categoria, cantidad)
                BooksModel libro = new BooksModel();                
                libro.setId(rs.getInt("idlibros"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEdicion(rs.getString("edicion"));
                libro.setDescripcion(rs.getString("descripcion"));
                libro.setCategoria(rs.getString("categoria"));
                libro.setCantidad( rs.getInt("cantidad"));
                libros.add(libro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
        return libros;
    }
    
}
