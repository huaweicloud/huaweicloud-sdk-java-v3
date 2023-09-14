package com.huaweicloud.sdk.utils;

import org.bson.BsonBinaryReader;
import org.bson.BsonBinaryWriter;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.io.BasicOutputBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;

public class BsonUtils {
    /**
     * to object t
     *
     * @param buf
     * @param clazz
     * @return
     * @param <T>
     */
    public static <T> T toObject(byte[] buf, Class<T> clazz) {
        BsonReader reader = new BsonBinaryReader(ByteBuffer.wrap(buf, 0, buf.length));
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
        );
        return codecRegistry.get(clazz).decode(reader, DecoderContext.builder().build());
    }

    /**
     *  to bson base64 string
     *
     * @param sdkResponse
     * @return
     * @param <T>
     */
    public static <T> String toBSON(T sdkResponse) {
        BasicOutputBuffer output = new BasicOutputBuffer();
        BsonWriter writer = new BsonBinaryWriter(output);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
        );
        Codec<T> codec = (Codec<T>) codecRegistry.get(sdkResponse.getClass());
        codec.encode(writer, sdkResponse, EncoderContext.builder().build());
        byte[] buf = Arrays.copyOfRange(output.getInternalBuffer(), 0, output.size());
        String encodedString = Base64.getMimeEncoder().encodeToString(buf);
        return encodedString;
    }
}
