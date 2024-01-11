package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import org.bson.BsonBinaryReader;
import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.nio.ByteBuffer;
import java.util.Objects;

import static com.mongodb.MongoClient.getDefaultCodecRegistry;

public class KvsExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), parseErrorMessage(httpResponse.getBodyAsBytes(), httpResponse));
        }
    }

    private SdkErrorMessage parseErrorMessage(byte[] buf, HttpResponse httpResponse) {
        if (buf == null) {
            return null;
        }
        BsonReader reader = new BsonBinaryReader(ByteBuffer.wrap(buf, 0, buf.length));
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
        );
        SdkErrorMessage sdkErrorMessage = (SdkErrorMessage) decodeBody(codecRegistry, reader);

        if (Objects.isNull(sdkErrorMessage.getRequestId()) && Objects.nonNull(httpResponse.getHeader("X-Request-Id"))) {
            sdkErrorMessage.setRequestId(httpResponse.getHeader("X-Request-Id"));
        }

        return sdkErrorMessage;
    }

    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(SdkErrorMessage.class).decode(reader, DecoderContext.builder().build());
    }
}