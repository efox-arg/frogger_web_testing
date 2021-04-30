package com.efox.service;

import com.efox.dao.UsuarioDao;
import com.efox.domain.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UsuarioServiceImpl implements UsuarioService{

    @Autowired // Inyecta la instancia de la clase el objeto
    private UsuarioDao UsuarioDao;
    
    private List<Usuario> usuarios = new ArrayList<>(Arrays.asList(
        new Usuario("nahuel","barbosa"))
    );
    
    @Transactional(readOnly=true)//Solamente va a consultar la base de datos
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) UsuarioDao.findAll();
    }
   
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        UsuarioDao.findAll().forEach(usuarios::add);
        return usuarios;
    }
}
