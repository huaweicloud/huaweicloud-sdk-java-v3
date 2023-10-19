package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.Document;
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
public class ScanSkeyKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnedCount")
    @BsonProperty(value = "ReturnedCount")

    private Integer returnedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FilteredCount")
    @BsonProperty(value = "FilteredCount")

    private Integer filteredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CursorSortKey")
    @BsonProperty(value = "CursorSortKey")

    private Document cursorSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvArray")
    @BsonProperty(value = "KvArray")

    private List<KvItem> kvArray = null;

    public ScanSkeyKvResponse withReturnedCount(Integer returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }

    /**
     * Get returnedCount
     * @return returnedCount
     */
    public Integer getReturnedCount() {
        return returnedCount;
    }

    public void setReturnedCount(Integer returnedCount) {
        this.returnedCount = returnedCount;
    }

    public ScanSkeyKvResponse withFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
        return this;
    }

    /**
     * Get filteredCount
     * @return filteredCount
     */
    public Integer getFilteredCount() {
        return filteredCount;
    }

    public void setFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
    }

    public ScanSkeyKvResponse withCursorSortKey(Document cursorSortKey) {
        this.cursorSortKey = cursorSortKey;
        return this;
    }

    /**
     * Get cursorSortKey
     * @return cursorSortKey
     */
    public Document getCursorSortKey() {
        return cursorSortKey;
    }

    public void setCursorSortKey(Document cursorSortKey) {
        this.cursorSortKey = cursorSortKey;
    }

    public ScanSkeyKvResponse withKvArray(List<KvItem> kvArray) {
        this.kvArray = kvArray;
        return this;
    }

    public ScanSkeyKvResponse addKvArrayItem(KvItem kvArrayItem) {
        if (this.kvArray == null) {
            this.kvArray = new ArrayList<>();
        }
        this.kvArray.add(kvArrayItem);
        return this;
    }

    public ScanSkeyKvResponse withKvArray(Consumer<List<KvItem>> kvArraySetter) {
        if (this.kvArray == null) {
            this.kvArray = new ArrayList<>();
        }
        kvArraySetter.accept(this.kvArray);
        return this;
    }

    /**
     * Get kvArray
     * @return kvArray
     */
    public List<KvItem> getKvArray() {
        return kvArray;
    }

    public void setKvArray(List<KvItem> kvArray) {
        this.kvArray = kvArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanSkeyKvResponse that = (ScanSkeyKvResponse) obj;
        return Objects.equals(this.returnedCount, that.returnedCount)
            && Objects.equals(this.filteredCount, that.filteredCount)
            && Objects.equals(this.cursorSortKey, that.cursorSortKey) && Objects.equals(this.kvArray, that.kvArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnedCount, filteredCount, cursorSortKey, kvArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanSkeyKvResponse {\n");
        sb.append("    returnedCount: ").append(toIndentedString(returnedCount)).append("\n");
        sb.append("    filteredCount: ").append(toIndentedString(filteredCount)).append("\n");
        sb.append("    cursorSortKey: ").append(toIndentedString(cursorSortKey)).append("\n");
        sb.append("    kvArray: ").append(toIndentedString(kvArray)).append("\n");
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
        return codecRegistry.get(ScanSkeyKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
