package com.bankLab.webService;

import com.bankLab.DTO.UserDTO;
import com.bankLab.models.UserVO;
import com.bankLab.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserWS {

    @Autowired
    UserService userService;

    @GetMapping("/user/username/{userName}")
    public ResponseEntity<?> busquedaUsuarioPorUserName(@PathVariable String userName) {
        try {
            UserVO user = userService.findByUserName(userName).get();
            return new ResponseEntity<UserVO>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity("El usuario no existe", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity("Error", HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/user/email/{userEmail}")
    public ResponseEntity<UserVO> getUserByEmail(@PathVariable String userEmail) {
        try {
            UserVO user = userService.findByEmail(userEmail).get();
            return new ResponseEntity<UserVO>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity("Usuario con ese email no existe", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity("Error en la peticion: " + e.hashCode(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/user/savenewuser")
    public ResponseEntity<?> saveNewUser(@RequestBody UserDTO userDTO){

        UserVO user = new UserVO(userDTO.getUserName(), userDTO.getEmail(), userDTO.getPassword());

        try{
            userService.save(user);
            return new ResponseEntity("Usuario guardado", HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity("Error al guardar el usuario", HttpStatus.BAD_REQUEST);
        }
    }
}

