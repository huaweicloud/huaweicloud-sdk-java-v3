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
public class ScanKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnedCount")
    @BsonProperty(value = "ReturnedCount")

    private Integer returnedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FilteredCount")
    @BsonProperty(value = "FilteredCount")

    private Integer filteredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CursorKey")
    @BsonProperty(value = "CursorKey")

    private Document cursorKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvArray")
    @BsonProperty(value = "KvArray")

    private List<KvItem> kvArray = null;

    public ScanKvResponse withReturnedCount(Integer returnedCount) {
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

    public ScanKvResponse withFilteredCount(Integer filteredCount) {
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

    public ScanKvResponse withCursorKey(Document cursorKey) {
        this.cursorKey = cursorKey;
        return this;
    }

    /**
     * Get cursorKey
     * @return cursorKey
     */
    public Document getCursorKey() {
        return cursorKey;
    }

    public void setCursorKey(Document cursorKey) {
        this.cursorKey = cursorKey;
    }

    public ScanKvResponse withKvArray(List<KvItem> kvArray) {
        this.kvArray = kvArray;
        return this;
    }

    public ScanKvResponse addKvArrayItem(KvItem kvArrayItem) {
        if (this.kvArray == null) {
            this.kvArray = new ArrayList<>();
        }
        this.kvArray.add(kvArrayItem);
        return this;
    }

    public ScanKvResponse withKvArray(Consumer<List<KvItem>> kvArraySetter) {
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
        ScanKvResponse that = (ScanKvResponse) obj;
        return Objects.equals(this.returnedCount, that.returnedCount)
            && Objects.equals(this.filteredCount, that.filteredCount) && Objects.equals(this.cursorKey, that.cursorKey)
            && Objects.equals(this.kvArray, that.kvArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnedCount, filteredCount, cursorKey, kvArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanKvResponse {\n");
        sb.append("    returnedCount: ").append(toIndentedString(returnedCount)).append("\n");
        sb.append("    filteredCount: ").append(toIndentedString(filteredCount)).append("\n");
        sb.append("    cursorKey: ").append(toIndentedString(cursorKey)).append("\n");
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
        return codecRegistry.get(ScanKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
