package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
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
public class TransactGetKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_kv_items_of_all")
    @BsonProperty(value = "returned_kv_items_of_all")

    private List<ReturnedKvItemsOfTable> returnedKvItemsOfAll = null;

    public TransactGetKvResponse withReturnedKvItemsOfAll(List<ReturnedKvItemsOfTable> returnedKvItemsOfAll) {
        this.returnedKvItemsOfAll = returnedKvItemsOfAll;
        return this;
    }

    public TransactGetKvResponse addReturnedKvItemsOfAllItem(ReturnedKvItemsOfTable returnedKvItemsOfAllItem) {
        if (this.returnedKvItemsOfAll == null) {
            this.returnedKvItemsOfAll = new ArrayList<>();
        }
        this.returnedKvItemsOfAll.add(returnedKvItemsOfAllItem);
        return this;
    }

    public TransactGetKvResponse withReturnedKvItemsOfAll(
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
        TransactGetKvResponse that = (TransactGetKvResponse) obj;
        return Objects.equals(this.returnedKvItemsOfAll, that.returnedKvItemsOfAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnedKvItemsOfAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactGetKvResponse {\n");
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
        return codecRegistry.get(TransactGetKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
