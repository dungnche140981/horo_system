package vn.edu.fpt.fpt.horo.config.datatime;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

import static vn.edu.fpt.fpt.horo.utils.CustomDateTimeFormatter.DATE_FORMATTER;


/**
 * vn.edu.fpt.fpt.horo.config.datatime
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class CustomDateDeserializer extends StdDeserializer<LocalDate> {
    public CustomDateDeserializer(){
        this(null);
    }

    protected CustomDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDate.parse(jsonParser.getText(), DATE_FORMATTER);
    }
}
