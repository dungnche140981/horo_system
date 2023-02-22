package vn.edu.fpt.fpt.horo.config.datatime;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;

import static vn.edu.fpt.fpt.horo.utils.CustomDateTimeFormatter.DATE_TIME_FORMATTER;

/**
 * vn.edu.fpt.fpt.horo.config.datatime
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class CustomDateTimeDeserializer extends StdDeserializer<LocalDateTime> {
    public CustomDateTimeDeserializer(){
        this(null);
    }

    protected CustomDateTimeDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDateTime.parse(jsonParser.getText(), DATE_TIME_FORMATTER);
    }
}
