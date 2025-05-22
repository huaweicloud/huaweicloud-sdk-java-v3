package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class RealTimeLogResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more_data")

    private Boolean hasMoreData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_offset")

    private Integer currentOffset;

    public RealTimeLogResponseBodyResult withHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
        return this;
    }

    /**
     * 是否还有剩余日志标识
     * @return hasMoreData
     */
    public Boolean getHasMoreData() {
        return hasMoreData;
    }

    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    public RealTimeLogResponseBodyResult withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，可用于下一次请求
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public RealTimeLogResponseBodyResult withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 返回日志内容，可能会空，请再次请求
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RealTimeLogResponseBodyResult withCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
        return this;
    }

    /**
     * 当前请求偏移量
     * @return currentOffset
     */
    public Integer getCurrentOffset() {
        return currentOffset;
    }

    public void setCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealTimeLogResponseBodyResult that = (RealTimeLogResponseBodyResult) obj;
        return Objects.equals(this.hasMoreData, that.hasMoreData) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.content, that.content) && Objects.equals(this.currentOffset, that.currentOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMoreData, offset, content, currentOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeLogResponseBodyResult {\n");
        sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    currentOffset: ").append(toIndentedString(currentOffset)).append("\n");
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
