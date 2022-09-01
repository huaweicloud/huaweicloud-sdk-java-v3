package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子操作详情
 */
public class SubDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "substep_name")

    @JacksonXmlProperty(localName = "substep_name")

    private String substepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    @JacksonXmlProperty(localName = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private List<String> message = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_num")

    @JacksonXmlProperty(localName = "serial_num")

    private Long serialNum;

    public SubDetail withSubstepName(String substepName) {
        this.substepName = substepName;
        return this;
    }

    /**
     * 子操作名
     * @return substepName
     */
    public String getSubstepName() {
        return substepName;
    }

    public void setSubstepName(String substepName) {
        this.substepName = substepName;
    }

    public SubDetail withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 子操作详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public SubDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 子操作状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubDetail withMessage(List<String> message) {
        this.message = message;
        return this;
    }

    public SubDetail addMessageItem(String messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public SubDetail withMessage(Consumer<List<String>> messageSetter) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * 子操作过程信息记录
     * @return message
     */
    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public SubDetail withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SubDetail withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SubDetail withSerialNum(Long serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    /**
     * 序列号
     * @return serialNum
     */
    public Long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Long serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubDetail subDetail = (SubDetail) o;
        return Objects.equals(this.substepName, subDetail.substepName) && Objects.equals(this.detail, subDetail.detail)
            && Objects.equals(this.status, subDetail.status) && Objects.equals(this.message, subDetail.message)
            && Objects.equals(this.startTime, subDetail.startTime) && Objects.equals(this.endTime, subDetail.endTime)
            && Objects.equals(this.serialNum, subDetail.serialNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substepName, detail, status, message, startTime, endTime, serialNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubDetail {\n");
        sb.append("    substepName: ").append(toIndentedString(substepName)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
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
