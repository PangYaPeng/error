package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    userMapper um;

    @GetMapping("/selectUser/{id}")
    public userMapper selectone(@PathVariable("id") String id){
        return (userMapper) um.getUser("id");
    }
}
//idea运行没问题，http://localhost:8080/selectUser/1这样输入有问题
//### Error querying database.  Cause: org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "USER" not found; SQL statement:
//        select * from USER where id=? [42102-199]
//        ### The error may exist in com/example/demo/userMapper.java (best guess)
//        ### The error may involve com.example.demo.userMapper.getUser
//        ### The error occurred while executing a query
//        ### SQL: select * from USER where id=?
//        ### Cause: org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "USER" not found; SQL statement:
//        select * from USER where id=? [42102-199]
//        ; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "USER" not found; SQL statement:
//        select * from USER where id=? [42102-199]] with root cause