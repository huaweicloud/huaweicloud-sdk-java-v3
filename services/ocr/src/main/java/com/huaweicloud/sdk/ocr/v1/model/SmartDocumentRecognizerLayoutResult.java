package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerLayoutResult
 */
public class SmartDocumentRecognizerLayoutResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_block_count")

    private Integer layoutBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_block_list")

    private List<SmartDocumentRecognizerLayoutBlock> layoutBlockList = null;

    public SmartDocumentRecognizerLayoutResult withLayoutBlockCount(Integer layoutBlockCount) {
        this.layoutBlockCount = layoutBlockCount;
        return this;
    }

    /**
     * 模型识别到的文档版面区域数量。        
     * @return layoutBlockCount
     */
    public Integer getLayoutBlockCount() {
        return layoutBlockCount;
    }

    public void setLayoutBlockCount(Integer layoutBlockCount) {
        this.layoutBlockCount = layoutBlockCount;
    }

    public SmartDocumentRecognizerLayoutResult withLayoutBlockList(
        List<SmartDocumentRecognizerLayoutBlock> layoutBlockList) {
        this.layoutBlockList = layoutBlockList;
        return this;
    }

    public SmartDocumentRecognizerLayoutResult addLayoutBlockListItem(
        SmartDocumentRecognizerLayoutBlock layoutBlockListItem) {
        if (this.layoutBlockList == null) {
            this.layoutBlockList = new ArrayList<>();
        }
        this.layoutBlockList.add(layoutBlockListItem);
        return this;
    }

    public SmartDocumentRecognizerLayoutResult withLayoutBlockList(
        Consumer<List<SmartDocumentRecognizerLayoutBlock>> layoutBlockListSetter) {
        if (this.layoutBlockList == null) {
            this.layoutBlockList = new ArrayList<>();
        }
        layoutBlockListSetter.accept(this.layoutBlockList);
        return this;
    }

    /**
     * 文档版面区域识别结果列表。 
     * @return layoutBlockList
     */
    public List<SmartDocumentRecognizerLayoutBlock> getLayoutBlockList() {
        return layoutBlockList;
    }

    public void setLayoutBlockList(List<SmartDocumentRecognizerLayoutBlock> layoutBlockList) {
        this.layoutBlockList = layoutBlockList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerLayoutResult that = (SmartDocumentRecognizerLayoutResult) obj;
        return Objects.equals(this.layoutBlockCount, that.layoutBlockCount)
            && Objects.equals(this.layoutBlockList, that.layoutBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutBlockCount, layoutBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerLayoutResult {\n");
        sb.append("    layoutBlockCount: ").append(toIndentedString(layoutBlockCount)).append("\n");
        sb.append("    layoutBlockList: ").append(toIndentedString(layoutBlockList)).append("\n");
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
