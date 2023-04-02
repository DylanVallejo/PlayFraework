package controllers;

import models.Book;
import play.mvc.Controller;
import play.mvc.*;

import java.util.Set;


import views.html.books.*;


public class BooksController extends Controller{


    //for all books
    public Result indexBooks(){
        Set<Book> books  = Book.allBooks();
        return ok(indexbook.render(books));

    }

//    create a book
    public Result create(){
        return ok( "TODO");
    }

    // to save a book
    public Result save(){
        return ok( "TODO");
    }

    //edit
    public Result edit(Integer id){
        return ok( "TODO");
    }

    public Result update(){
        return ok( "TODO");
    }


    public Result destroy(Integer id){
        return ok( "TODO");
    }

    //book detail
    public Result show(Integer id){
        return ok( "TODO");
    }

}
