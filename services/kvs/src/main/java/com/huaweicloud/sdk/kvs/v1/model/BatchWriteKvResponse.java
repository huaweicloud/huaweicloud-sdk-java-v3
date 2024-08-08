package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchWriteKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprocessed_opers")
    @BsonProperty(value = "unprocessed_opers")

    private List<TableOperIds> unprocessedOpers = null;

    private static Codec<BatchWriteKvResponse> codec;

    public BatchWriteKvResponse withUnprocessedOpers(List<TableOperIds> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
        return this;
    }

    public BatchWriteKvResponse addUnprocessedOpersItem(TableOperIds unprocessedOpersItem) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        this.unprocessedOpers.add(unprocessedOpersItem);
        return this;
    }

    public BatchWriteKvResponse withUnprocessedOpers(Consumer<List<TableOperIds>> unprocessedOpersSetter) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        unprocessedOpersSetter.accept(this.unprocessedOpers);
        return this;
    }

    /**
     * 未处理的操作列表。
     * @return unprocessedOpers
     */
    public List<TableOperIds> getUnprocessedOpers() {
        return unprocessedOpers;
    }

    public void setUnprocessedOpers(List<TableOperIds> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchWriteKvResponse that = (BatchWriteKvResponse) obj;
        return Objects.equals(this.unprocessedOpers, that.unprocessedOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unprocessedOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchWriteKvResponse {\n");
        sb.append("    unprocessedOpers: ").append(toIndentedString(unprocessedOpers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        if (codec == null) {
            codec = codecRegistry.get(BatchWriteKvResponse.class);
        }
        return codec.decode(reader, DecoderContext.builder().build());
    }
}
