package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 下载文件请求体
 */
public class DownloadDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private DownloadDataTypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_start")

    private Long rangeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_end")

    private Long rangeEnd;

    public DownloadDataReq withType(DownloadDataTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public DownloadDataTypeEnum getType() {
        return type;
    }

    public void setType(DownloadDataTypeEnum type) {
        this.type = type;
    }

    public DownloadDataReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 资源地址(支持https、obs地址)
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DownloadDataReq withRangeStart(Long rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }

    /**
     * 指定下载对象的开始位置
     * minimum: 0
     * maximum: 9223372036854775807
     * @return rangeStart
     */
    public Long getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(Long rangeStart) {
        this.rangeStart = rangeStart;
    }

    public DownloadDataReq withRangeEnd(Long rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }

    /**
     * 指定下载对象的结束位置
     * minimum: 0
     * maximum: 9223372036854775807
     * @return rangeEnd
     */
    public Long getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(Long rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadDataReq that = (DownloadDataReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.url, that.url)
            && Objects.equals(this.rangeStart, that.rangeStart) && Objects.equals(this.rangeEnd, that.rangeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url, rangeStart, rangeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadDataReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
        sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
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
