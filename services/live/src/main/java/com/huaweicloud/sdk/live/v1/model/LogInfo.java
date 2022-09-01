package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * LogInfo
 */
public class LogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public LogInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 日志文件名，打包文件名格式：{Domain}_{logStartTimeStamp}.log.gz
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 日志下载链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LogInfo withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 日志文件大小
     * minimum: 0
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public LogInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 日志文件中日志开始时间，北京时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public LogInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 日志文件中日志结束时间，北京时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogInfo logInfo = (LogInfo) o;
        return Objects.equals(this.name, logInfo.name) && Objects.equals(this.url, logInfo.url)
            && Objects.equals(this.size, logInfo.size) && Objects.equals(this.startTime, logInfo.startTime)
            && Objects.equals(this.endTime, logInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, size, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
