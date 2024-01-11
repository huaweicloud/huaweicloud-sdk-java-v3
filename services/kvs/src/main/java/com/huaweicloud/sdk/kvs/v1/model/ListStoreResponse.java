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
public class ListStoreResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor_name")
    @BsonProperty(value = "cursor_name")

    private String cursorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stores")
    @BsonProperty(value = "stores")

    private List<String> stores = null;

    public ListStoreResponse withCursorName(String cursorName) {
        this.cursorName = cursorName;
        return this;
    }

    /**
     * 本次响应后的游标位置，下次请求时携带。 - 长度：[3,255] - 取值字符限制：[a-zA-Z0-9_.-]+ > 如果为空，表示后面无更多。
     * @return cursorName
     */
    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public ListStoreResponse withStores(List<String> stores) {
        this.stores = stores;
        return this;
    }

    public ListStoreResponse addStoresItem(String storesItem) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(storesItem);
        return this;
    }

    public ListStoreResponse withStores(Consumer<List<String>> storesSetter) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        storesSetter.accept(this.stores);
        return this;
    }

    /**
     * 返回的仓名列表。
     * @return stores
     */
    public List<String> getStores() {
        return stores;
    }

    public void setStores(List<String> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStoreResponse that = (ListStoreResponse) obj;
        return Objects.equals(this.cursorName, that.cursorName) && Objects.equals(this.stores, that.stores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorName, stores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoreResponse {\n");
        sb.append("    cursorName: ").append(toIndentedString(cursorName)).append("\n");
        sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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
        return codecRegistry.get(ListStoreResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
