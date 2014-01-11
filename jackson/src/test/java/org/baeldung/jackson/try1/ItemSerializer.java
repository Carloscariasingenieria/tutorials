package org.baeldung.jackson.try1;

import java.io.IOException;

import org.baeldung.jackson.dtos.Item;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ItemSerializer extends JsonSerializer<Item> {

    @Override
    public final void serialize(final Item value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeNumberField("id", value.id);
        jgen.writeStringField("itemNr", value.itemNr);
        jgen.writeNumberField("createdBy", value.createdBy.id);
        jgen.writeEndObject();
    }

}