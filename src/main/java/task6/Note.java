package task6;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Note class which contain title and message.
 * @autor Pavel Korchagin
 * @version 1.0
 */


@Data
@AllArgsConstructor
public class Note {

    private String title;
    private String message;

}
