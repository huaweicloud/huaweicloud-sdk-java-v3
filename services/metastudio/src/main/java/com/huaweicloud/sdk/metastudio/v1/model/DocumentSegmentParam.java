package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改文档分段参数。
 */
public class DocumentSegmentParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "split_type")

    private Integer splitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_size")

    private Integer chunkSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_type")

    private String chunkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "separators")

    private List<String> separators = null;

    public DocumentSegmentParam withSplitType(Integer splitType) {
        this.splitType = splitType;
        return this;
    }

    /**
     * 分段类型 * 1: 自动分段 * 2: 手动分段
     * minimum: 1
     * maximum: 64
     * @return splitType
     */
    public Integer getSplitType() {
        return splitType;
    }

    public void setSplitType(Integer splitType) {
        this.splitType = splitType;
    }

    public DocumentSegmentParam withChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * 分段长度。
     * minimum: 20
     * maximum: 512
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public DocumentSegmentParam withChunkType(String chunkType) {
        this.chunkType = chunkType;
        return this;
    }

    /**
     * 分段策略，如果添加多个策略用逗号隔开。 取值示例： - title：用标题把一段话分割为多个段落。 - separator：用分隔符把一段话分割为多个段落。
     * @return chunkType
     */
    public String getChunkType() {
        return chunkType;
    }

    public void setChunkType(String chunkType) {
        this.chunkType = chunkType;
    }

    public DocumentSegmentParam withSeparators(List<String> separators) {
        this.separators = separators;
        return this;
    }

    public DocumentSegmentParam addSeparatorsItem(String separatorsItem) {
        if (this.separators == null) {
            this.separators = new ArrayList<>();
        }
        this.separators.add(separatorsItem);
        return this;
    }

    public DocumentSegmentParam withSeparators(Consumer<List<String>> separatorsSetter) {
        if (this.separators == null) {
            this.separators = new ArrayList<>();
        }
        separatorsSetter.accept(this.separators);
        return this;
    }

    /**
     * 分隔符
     * @return separators
     */
    public List<String> getSeparators() {
        return separators;
    }

    public void setSeparators(List<String> separators) {
        this.separators = separators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentSegmentParam that = (DocumentSegmentParam) obj;
        return Objects.equals(this.splitType, that.splitType) && Objects.equals(this.chunkSize, that.chunkSize)
            && Objects.equals(this.chunkType, that.chunkType) && Objects.equals(this.separators, that.separators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(splitType, chunkSize, chunkType, separators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentSegmentParam {\n");
        sb.append("    splitType: ").append(toIndentedString(splitType)).append("\n");
        sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
        sb.append("    chunkType: ").append(toIndentedString(chunkType)).append("\n");
        sb.append("    separators: ").append(toIndentedString(separators)).append("\n");
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
