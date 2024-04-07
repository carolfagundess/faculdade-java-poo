/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author carol
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment commment2 = new Comment("Wow this nice!");

        Post post1 = new Post(sdf.parse("21/12/2018 13:05:44"),
                "My new favorite trip",
                "I love this place so much!",
                25);
        
        post1.addComment(comment1);
        post1.addComment(commment2);
        
        System.out.println(post1);
    }
}
