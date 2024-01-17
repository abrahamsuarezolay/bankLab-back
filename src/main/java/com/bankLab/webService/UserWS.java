package com.bankLab.webService;

import com.bankLab.models.UserVO;
import com.bankLab.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserWS {

    @Autowired
    UserService userService;

    @GetMapping("/user/{userName}")
    public ResponseEntity<?> busquedaUsuarioPorUserName(@PathVariable String userName){
        try{
            UserVO user = userService.findByUserName(userName).get();
            return new ResponseEntity<String>("Hello! Welcome " + user.getUserName(), HttpStatus.OK);
        }catch(Exception e){
            if(userService.findByUserName(userName).isEmpty()){
                return new ResponseEntity("El usuario no existe", HttpStatus.NOT_FOUND);
            }else{
                return new ResponseEntity("Error", HttpStatus.BAD_REQUEST);
            }
        }
    }
}
