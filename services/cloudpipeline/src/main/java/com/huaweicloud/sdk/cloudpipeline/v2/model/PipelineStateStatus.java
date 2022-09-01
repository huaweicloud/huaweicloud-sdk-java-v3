package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineStateStatus
 */
public class PipelineStateStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapsed_time")

    @JacksonXmlProperty(localName = "elapsed_time")

    private String elapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outcome")

    @JacksonXmlProperty(localName = "outcome")

    private String outcome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    @JacksonXmlProperty(localName = "children")

    private List<PipelineStateStatus> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    @JacksonXmlProperty(localName = "detail_url")

    private String detailUrl;

    public PipelineStateStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 阶段或任务标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PipelineStateStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段或任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineStateStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类别(阶段/任务)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PipelineStateStatus withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 执行开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PipelineStateStatus withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 执行结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PipelineStateStatus withElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * 运行耗时
     * @return elapsedTime
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public PipelineStateStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PipelineStateStatus withOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     * 运行结果
     * @return outcome
     */
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public PipelineStateStatus withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public PipelineStateStatus withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public PipelineStateStatus withChildren(List<PipelineStateStatus> children) {
        this.children = children;
        return this;
    }

    public PipelineStateStatus addChildrenItem(PipelineStateStatus childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public PipelineStateStatus withChildren(Consumer<List<PipelineStateStatus>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子任务运行信息(对任务来说是空的)
     * @return children
     */
    public List<PipelineStateStatus> getChildren() {
        return children;
    }

    public void setChildren(List<PipelineStateStatus> children) {
        this.children = children;
    }

    public PipelineStateStatus withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * 任务运行记录跳转链接
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineStateStatus pipelineStateStatus = (PipelineStateStatus) o;
        return Objects.equals(this.id, pipelineStateStatus.id) && Objects.equals(this.name, pipelineStateStatus.name)
            && Objects.equals(this.type, pipelineStateStatus.type)
            && Objects.equals(this.startTime, pipelineStateStatus.startTime)
            && Objects.equals(this.endTime, pipelineStateStatus.endTime)
            && Objects.equals(this.elapsedTime, pipelineStateStatus.elapsedTime)
            && Objects.equals(this.status, pipelineStateStatus.status)
            && Objects.equals(this.outcome, pipelineStateStatus.outcome)
            && Objects.equals(this.errorCode, pipelineStateStatus.errorCode)
            && Objects.equals(this.errorMsg, pipelineStateStatus.errorMsg)
            && Objects.equals(this.children, pipelineStateStatus.children)
            && Objects.equals(this.detailUrl, pipelineStateStatus.detailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            startTime,
            endTime,
            elapsedTime,
            status,
            outcome,
            errorCode,
            errorMsg,
            children,
            detailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineStateStatus {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
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
