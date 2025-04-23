package Controllers;
import Models.Book;

public class LibroControllers {
    public void año(Book[] libros){
        for (int i=0;i<libros-1;i++);
        for (int j=0; j<libros-1; j++);

        int j=0;
        if (libros[j].getAño()>libros[j+1].getAño());
            Book  temp=libros[j];
            libros [j]= libros[j+1];
            libros [j+1]= temp;

    }

    @Override
    public String toString() {
        return "LibroControllers []";
    }

}
