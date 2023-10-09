/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.BooksModel;

/*
    Data Access Object
*/

public interface DAOBooks {
    public void addBooks(BooksModel libro) throws Exception;
    public void updateBooks(BooksModel libro) throws Exception;
    public void deleteBooks(BooksModel libro) throws Exception;
    public List<BooksModel> getBooks() throws Exception;
}
