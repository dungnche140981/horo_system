package vn.edu.fpt.fpt.horo.config.datatime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

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

public class CustomDateTimeSerializer extends StdSerializer<LocalDateTime> {
    public CustomDateTimeSerializer(){
        this(null);
    }

    public CustomDateTimeSerializer(Class<LocalDateTime> t) {
        super(t);
    }

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeString(localDateTime.format(DATE_TIME_FORMATTER));
    }
}
