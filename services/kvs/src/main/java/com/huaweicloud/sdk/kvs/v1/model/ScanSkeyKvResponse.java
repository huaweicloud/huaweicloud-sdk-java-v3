package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.Document;
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
public class ScanSkeyKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_count")
    @BsonProperty(value = "returned_count")

    private Long returnedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtered_count")
    @BsonProperty(value = "filtered_count")

    private Integer filteredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor_sort_key")
    @BsonProperty(value = "cursor_sort_key")

    private Document cursorSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_kv_items")
    @BsonProperty(value = "returned_kv_items")

    private List<ReturnedKvItem> returnedKvItems = null;

    private static Codec<ScanSkeyKvResponse> codec;

    public ScanSkeyKvResponse withReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }

    /**
     * 返回的文档数量，为0不表示结束。 - 如果filtered_count超过500仍无匹配，则返回0。 -  长度：4
     * @return returnedCount
     */
    public Long getReturnedCount() {
        return returnedCount;
    }

    public void setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
    }

    public ScanSkeyKvResponse withFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
        return this;
    }

    /**
     * 被过滤掉的文档数量。 - 长度：4
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
     * 下次请求时的start_key。 > 该值为空时，表示指定范围或者指定filter条件所有kv已经返回。
     * @return cursorSortKey
     */
    public Document getCursorSortKey() {
        return cursorSortKey;
    }

    public void setCursorSortKey(Document cursorSortKey) {
        this.cursorSortKey = cursorSortKey;
    }

    public ScanSkeyKvResponse withReturnedKvItems(List<ReturnedKvItem> returnedKvItems) {
        this.returnedKvItems = returnedKvItems;
        return this;
    }

    public ScanSkeyKvResponse addReturnedKvItemsItem(ReturnedKvItem returnedKvItemsItem) {
        if (this.returnedKvItems == null) {
            this.returnedKvItems = new ArrayList<>();
        }
        this.returnedKvItems.add(returnedKvItemsItem);
        return this;
    }

    public ScanSkeyKvResponse withReturnedKvItems(Consumer<List<ReturnedKvItem>> returnedKvItemsSetter) {
        if (this.returnedKvItems == null) {
            this.returnedKvItems = new ArrayList<>();
        }
        returnedKvItemsSetter.accept(this.returnedKvItems);
        return this;
    }

    /**
     * 返回的kv列表，与scan_kv的kv_array相同。
     * @return returnedKvItems
     */
    public List<ReturnedKvItem> getReturnedKvItems() {
        return returnedKvItems;
    }

    public void setReturnedKvItems(List<ReturnedKvItem> returnedKvItems) {
        this.returnedKvItems = returnedKvItems;
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
            && Objects.equals(this.cursorSortKey, that.cursorSortKey)
            && Objects.equals(this.returnedKvItems, that.returnedKvItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnedCount, filteredCount, cursorSortKey, returnedKvItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanSkeyKvResponse {\n");
        sb.append("    returnedCount: ").append(toIndentedString(returnedCount)).append("\n");
        sb.append("    filteredCount: ").append(toIndentedString(filteredCount)).append("\n");
        sb.append("    cursorSortKey: ").append(toIndentedString(cursorSortKey)).append("\n");
        sb.append("    returnedKvItems: ").append(toIndentedString(returnedKvItems)).append("\n");
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
            codec = codecRegistry.get(ScanSkeyKvResponse.class);
        }
        return codec.decode(reader, DecoderContext.builder().build());
    }
}
