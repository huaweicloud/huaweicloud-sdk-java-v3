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
public class BatchGetKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_opers")
    @BsonProperty(value = "exception_opers")

    private List<ExceptionOpersOfTable> exceptionOpers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_kv_items_of_all")
    @BsonProperty(value = "returned_kv_items_of_all")

    private List<ReturnedKvItemsOfTable> returnedKvItemsOfAll = null;

    private static Codec<BatchGetKvResponse> codec;

    public BatchGetKvResponse withExceptionOpers(List<ExceptionOpersOfTable> exceptionOpers) {
        this.exceptionOpers = exceptionOpers;
        return this;
    }

    public BatchGetKvResponse addExceptionOpersItem(ExceptionOpersOfTable exceptionOpersItem) {
        if (this.exceptionOpers == null) {
            this.exceptionOpers = new ArrayList<>();
        }
        this.exceptionOpers.add(exceptionOpersItem);
        return this;
    }

    public BatchGetKvResponse withExceptionOpers(Consumer<List<ExceptionOpersOfTable>> exceptionOpersSetter) {
        if (this.exceptionOpers == null) {
            this.exceptionOpers = new ArrayList<>();
        }
        exceptionOpersSetter.accept(this.exceptionOpers);
        return this;
    }

    /**
     * 异常处理的操作，按照table分类组织。
     * @return exceptionOpers
     */
    public List<ExceptionOpersOfTable> getExceptionOpers() {
        return exceptionOpers;
    }

    public void setExceptionOpers(List<ExceptionOpersOfTable> exceptionOpers) {
        this.exceptionOpers = exceptionOpers;
    }

    public BatchGetKvResponse withReturnedKvItemsOfAll(List<ReturnedKvItemsOfTable> returnedKvItemsOfAll) {
        this.returnedKvItemsOfAll = returnedKvItemsOfAll;
        return this;
    }

    public BatchGetKvResponse addReturnedKvItemsOfAllItem(ReturnedKvItemsOfTable returnedKvItemsOfAllItem) {
        if (this.returnedKvItemsOfAll == null) {
            this.returnedKvItemsOfAll = new ArrayList<>();
        }
        this.returnedKvItemsOfAll.add(returnedKvItemsOfAllItem);
        return this;
    }

    public BatchGetKvResponse withReturnedKvItemsOfAll(
        Consumer<List<ReturnedKvItemsOfTable>> returnedKvItemsOfAllSetter) {
        if (this.returnedKvItemsOfAll == null) {
            this.returnedKvItemsOfAll = new ArrayList<>();
        }
        returnedKvItemsOfAllSetter.accept(this.returnedKvItemsOfAll);
        return this;
    }

    /**
     * 返回的kvdoc列表，按照table分类组织。
     * @return returnedKvItemsOfAll
     */
    public List<ReturnedKvItemsOfTable> getReturnedKvItemsOfAll() {
        return returnedKvItemsOfAll;
    }

    public void setReturnedKvItemsOfAll(List<ReturnedKvItemsOfTable> returnedKvItemsOfAll) {
        this.returnedKvItemsOfAll = returnedKvItemsOfAll;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetKvResponse that = (BatchGetKvResponse) obj;
        return Objects.equals(this.exceptionOpers, that.exceptionOpers)
            && Objects.equals(this.returnedKvItemsOfAll, that.returnedKvItemsOfAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exceptionOpers, returnedKvItemsOfAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetKvResponse {\n");
        sb.append("    exceptionOpers: ").append(toIndentedString(exceptionOpers)).append("\n");
        sb.append("    returnedKvItemsOfAll: ").append(toIndentedString(returnedKvItemsOfAll)).append("\n");
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
            codec = codecRegistry.get(BatchGetKvResponse.class);
        }
        return codec.decode(reader, DecoderContext.builder().build());
    }
}
