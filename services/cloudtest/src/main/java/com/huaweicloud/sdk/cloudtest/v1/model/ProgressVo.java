package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProgressVo
 */
public class ProgressVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    private Boolean completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancelled")

    private Boolean cancelled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "informations")

    private List<String> informations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_time")

    private String submittedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private Long lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_count")

    private Integer finishedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_value")

    private Object returnValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_message")

    private String exceptionMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_up_num")

    private Integer lineUpNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asyn_operation_key")

    private String asynOperationKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ended")

    private Boolean isEnded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_percent")

    private Integer finishedPercent;

    public ProgressVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 进度uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProgressVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 异步进度名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgressVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 资源总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ProgressVo withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * 异步操作是否完成
     * @return completed
     */
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public ProgressVo withCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
        return this;
    }

    /**
     * 异步操作是否取消
     * @return cancelled
     */
    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public ProgressVo withInformations(List<String> informations) {
        this.informations = informations;
        return this;
    }

    public ProgressVo addInformationsItem(String informationsItem) {
        if (this.informations == null) {
            this.informations = new ArrayList<>();
        }
        this.informations.add(informationsItem);
        return this;
    }

    public ProgressVo withInformations(Consumer<List<String>> informationsSetter) {
        if (this.informations == null) {
            this.informations = new ArrayList<>();
        }
        informationsSetter.accept(this.informations);
        return this;
    }

    /**
     * 提示信息列表
     * @return informations
     */
    public List<String> getInformations() {
        return informations;
    }

    public void setInformations(List<String> informations) {
        this.informations = informations;
    }

    public ProgressVo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProgressVo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 错误信息
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ProgressVo withSubmittedTime(String submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    /**
     * 提交时间
     * @return submittedTime
     */
    public String getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(String submittedTime) {
        this.submittedTime = submittedTime;
    }

    public ProgressVo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ProgressVo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ProgressVo withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 服务ip
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public ProgressVo withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ProgressVo withFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }

    /**
     * 执行完成总数
     * @return finishedCount
     */
    public Integer getFinishedCount() {
        return finishedCount;
    }

    public void setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
    }

    public ProgressVo withReturnValue(Object returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    /**
     * 异步操作返回值
     * @return returnValue
     */
    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
    }

    public ProgressVo withExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
        return this;
    }

    /**
     * 异常信息
     * @return exceptionMessage
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public ProgressVo withLineUpNum(Integer lineUpNum) {
        this.lineUpNum = lineUpNum;
        return this;
    }

    /**
     * 行编号
     * @return lineUpNum
     */
    public Integer getLineUpNum() {
        return lineUpNum;
    }

    public void setLineUpNum(Integer lineUpNum) {
        this.lineUpNum = lineUpNum;
    }

    public ProgressVo withAsynOperationKey(String asynOperationKey) {
        this.asynOperationKey = asynOperationKey;
        return this;
    }

    /**
     * 异步操作的key
     * @return asynOperationKey
     */
    public String getAsynOperationKey() {
        return asynOperationKey;
    }

    public void setAsynOperationKey(String asynOperationKey) {
        this.asynOperationKey = asynOperationKey;
    }

    public ProgressVo withIsEnded(Boolean isEnded) {
        this.isEnded = isEnded;
        return this;
    }

    /**
     * 是否结束
     * @return isEnded
     */
    public Boolean getIsEnded() {
        return isEnded;
    }

    public void setIsEnded(Boolean isEnded) {
        this.isEnded = isEnded;
    }

    public ProgressVo withFinishedPercent(Integer finishedPercent) {
        this.finishedPercent = finishedPercent;
        return this;
    }

    /**
     * 异步操作完成进度
     * @return finishedPercent
     */
    public Integer getFinishedPercent() {
        return finishedPercent;
    }

    public void setFinishedPercent(Integer finishedPercent) {
        this.finishedPercent = finishedPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProgressVo that = (ProgressVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.total, that.total) && Objects.equals(this.completed, that.completed)
            && Objects.equals(this.cancelled, that.cancelled) && Objects.equals(this.informations, that.informations)
            && Objects.equals(this.code, that.code) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.submittedTime, that.submittedTime) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.serverIp, that.serverIp)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime)
            && Objects.equals(this.finishedCount, that.finishedCount)
            && Objects.equals(this.returnValue, that.returnValue)
            && Objects.equals(this.exceptionMessage, that.exceptionMessage)
            && Objects.equals(this.lineUpNum, that.lineUpNum)
            && Objects.equals(this.asynOperationKey, that.asynOperationKey)
            && Objects.equals(this.isEnded, that.isEnded) && Objects.equals(this.finishedPercent, that.finishedPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            total,
            completed,
            cancelled,
            informations,
            code,
            reason,
            submittedTime,
            beginTime,
            endTime,
            serverIp,
            lastModifiedTime,
            finishedCount,
            returnValue,
            exceptionMessage,
            lineUpNum,
            asynOperationKey,
            isEnded,
            finishedPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgressVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
        sb.append("    informations: ").append(toIndentedString(informations)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    submittedTime: ").append(toIndentedString(submittedTime)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    finishedCount: ").append(toIndentedString(finishedCount)).append("\n");
        sb.append("    returnValue: ").append(toIndentedString(returnValue)).append("\n");
        sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
        sb.append("    lineUpNum: ").append(toIndentedString(lineUpNum)).append("\n");
        sb.append("    asynOperationKey: ").append(toIndentedString(asynOperationKey)).append("\n");
        sb.append("    isEnded: ").append(toIndentedString(isEnded)).append("\n");
        sb.append("    finishedPercent: ").append(toIndentedString(finishedPercent)).append("\n");
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
