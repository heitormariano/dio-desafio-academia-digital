package dio.desafio.academia.infra.jackson.deser;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import dio.desafio.academia.util.JavaTimeUtils;

public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1739880648079589910L;

	public LocalDateTimeDeserializer() {
		super(LocalDateTime.class);
	}

	@Override
	public LocalDateTime deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JacksonException {
		return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
	}

}
