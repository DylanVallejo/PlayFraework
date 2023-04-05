package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.*;

import java.util.Set;


import views.html.books.*;

import javax.inject.Inject;


public class BooksController extends Controller{
//CREATIng a form
    @Inject
    FormFactory formFactory;

    //for all books
    public Result indexBooks(){
        Set<Book> books  = Book.allBooks();
        return ok(indexbook.render(books));

    }

//    create a book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    // to save a book
    public Result save(){
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        Book book = bookForm.get();
        Book.add(book);
        return redirect(routes.BooksController.index());
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
