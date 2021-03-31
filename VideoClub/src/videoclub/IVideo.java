/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author fernando
 */
import java.io.InputStream;

public interface IVideo {

    int getNumber();

    String getTitle();

    InputStream getDataAsStream();
}
