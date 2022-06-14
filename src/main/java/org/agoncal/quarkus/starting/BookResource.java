package org.agoncal.quarkus.starting;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {


    @Inject
    Logger logger;

    @GET
    public List<Book> getAllBooks() {
        logger.info("Return all books");
        return Book.listAll();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks(){
        logger.info("Return the count of all books");
        return Book.listAll().size();
    }

    @GET
    @Path("{id}")
    public Book getBook(@PathParam("id") Long id){
        logger.info("Return book of the given id " + id);
        return Book.findById(id);
    }
}