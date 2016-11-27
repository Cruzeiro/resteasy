package com.cruze.server;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JsonService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public Book getProductInJSON() {

        Book book = new Book();
        book.setId(999);
        book.setAuthor("Hello");
        book.setTitle("World");

        return book;
    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(Book book) {

        String result = "Book created : " + book.getTitle();
        return Response.status(201).entity(result).build();

    }

}