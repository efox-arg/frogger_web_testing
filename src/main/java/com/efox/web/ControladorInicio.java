package com.efox.web;

import com.efox.dao.UsuarioDao;
import com.efox.domain.Usuario;
import com.efox.service.UsuarioServiceImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //A diferencia de Controller con este me evito tener que utilizar ResponseBody
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;
    
    /*@Autowired
    private UsuarioDao UsuarioDao;   */ 
    
    @RequestMapping("/usuarios")
    public List<Usuario> listar(){
        return usuarioServiceImpl.listarUsuarios();
    }
    
    
    //adssasd//
    
    @GetMapping("/prueba")
    public List<Usuario> listar2(){
        return usuarioServiceImpl.listar();
    }
    
    /*public ResponseEntity <List<Usuario>> listar(){        
        List<Usuario> lista= UsuarioDao.findAll();
        return ResponseEntity.ok(lista);
    }*/
    
}
