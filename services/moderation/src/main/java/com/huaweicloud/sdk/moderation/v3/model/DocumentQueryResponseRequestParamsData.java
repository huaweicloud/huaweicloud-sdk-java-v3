package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建作业时传的data参数
 */
public class DocumentQueryResponseRequestParamsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_interval")

    private Integer frameInterval;

    public DocumentQueryResponseRequestParamsData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 创建作业时传的url参数。目前支持：公网HTTP/HTTPS URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DocumentQueryResponseRequestParamsData withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 创建作业时传的format参数
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public DocumentQueryResponseRequestParamsData withFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
        return this;
    }

    /**
     * 创建作业时传的frame_interval参数
     * @return frameInterval
     */
    public Integer getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentQueryResponseRequestParamsData that = (DocumentQueryResponseRequestParamsData) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.format, that.format)
            && Objects.equals(this.frameInterval, that.frameInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, format, frameInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentQueryResponseRequestParamsData {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    frameInterval: ").append(toIndentedString(frameInterval)).append("\n");
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
