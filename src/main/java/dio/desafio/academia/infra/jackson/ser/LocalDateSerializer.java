package dio.desafio.academia.infra.jackson.ser;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import dio.desafio.academia.util.JavaTimeUtils;

public class LocalDateSerializer extends StdSerializer<LocalDate> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5133198587205393891L;

	public LocalDateSerializer() {
		super(LocalDate.class);
	}

	@Override
	public void serialize(LocalDate value, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));

	}

}
