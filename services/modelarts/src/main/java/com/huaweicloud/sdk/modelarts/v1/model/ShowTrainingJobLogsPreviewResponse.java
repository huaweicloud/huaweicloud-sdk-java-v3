package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrainingJobLogsPreviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_size")

    private Integer currentSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_size")

    private Integer fullSize;

    public ShowTrainingJobLogsPreviewResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 日志内容。如果日志大小没有超过上限（n兆）则返回全部内容，如果日志超过了上限（n兆）则返回最新的n兆的日志。2022/03/01 00:00:00 (GMT+08:00)后，此参数名称由“context”改为“content”。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowTrainingJobLogsPreviewResponse withCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
        return this;
    }

    /**
     * 当前返回的日志大小（单位：字节）。最大为5兆。
     * @return currentSize
     */
    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public ShowTrainingJobLogsPreviewResponse withFullSize(Integer fullSize) {
        this.fullSize = fullSize;
        return this;
    }

    /**
     * 完整的日志大小（单位：字节）。
     * @return fullSize
     */
    public Integer getFullSize() {
        return fullSize;
    }

    public void setFullSize(Integer fullSize) {
        this.fullSize = fullSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingJobLogsPreviewResponse that = (ShowTrainingJobLogsPreviewResponse) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.currentSize, that.currentSize)
            && Objects.equals(this.fullSize, that.fullSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, currentSize, fullSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingJobLogsPreviewResponse {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    fullSize: ").append(toIndentedString(fullSize)).append("\n");
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
