package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerKvResult
 */
public class SmartDocumentRecognizerKvResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_block_count")

    private Integer kvBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_block_list")

    private List<SmartDocumentRecognizerKVBlock> kvBlockList = null;

    public SmartDocumentRecognizerKvResult withKvBlockCount(Integer kvBlockCount) {
        this.kvBlockCount = kvBlockCount;
        return this;
    }

    /**
     * 模型识别到的键值对数量。 
     * @return kvBlockCount
     */
    public Integer getKvBlockCount() {
        return kvBlockCount;
    }

    public void setKvBlockCount(Integer kvBlockCount) {
        this.kvBlockCount = kvBlockCount;
    }

    public SmartDocumentRecognizerKvResult withKvBlockList(List<SmartDocumentRecognizerKVBlock> kvBlockList) {
        this.kvBlockList = kvBlockList;
        return this;
    }

    public SmartDocumentRecognizerKvResult addKvBlockListItem(SmartDocumentRecognizerKVBlock kvBlockListItem) {
        if (this.kvBlockList == null) {
            this.kvBlockList = new ArrayList<>();
        }
        this.kvBlockList.add(kvBlockListItem);
        return this;
    }

    public SmartDocumentRecognizerKvResult withKvBlockList(
        Consumer<List<SmartDocumentRecognizerKVBlock>> kvBlockListSetter) {
        if (this.kvBlockList == null) {
            this.kvBlockList = new ArrayList<>();
        }
        kvBlockListSetter.accept(this.kvBlockList);
        return this;
    }

    /**
     * 键值对识别结果列表。 
     * @return kvBlockList
     */
    public List<SmartDocumentRecognizerKVBlock> getKvBlockList() {
        return kvBlockList;
    }

    public void setKvBlockList(List<SmartDocumentRecognizerKVBlock> kvBlockList) {
        this.kvBlockList = kvBlockList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerKvResult that = (SmartDocumentRecognizerKvResult) obj;
        return Objects.equals(this.kvBlockCount, that.kvBlockCount)
            && Objects.equals(this.kvBlockList, that.kvBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvBlockCount, kvBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerKvResult {\n");
        sb.append("    kvBlockCount: ").append(toIndentedString(kvBlockCount)).append("\n");
        sb.append("    kvBlockList: ").append(toIndentedString(kvBlockList)).append("\n");
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

}
