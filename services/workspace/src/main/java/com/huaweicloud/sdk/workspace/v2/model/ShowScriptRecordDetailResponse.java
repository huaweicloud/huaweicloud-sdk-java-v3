package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowScriptRecordDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_task_id")

    private String scriptTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_order")

    private Integer executeOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    public ShowScriptRecordDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 脚本执行记录ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowScriptRecordDetailResponse withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 脚本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ShowScriptRecordDetailResponse withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名称。
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public ShowScriptRecordDetailResponse withScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
        return this;
    }

    /**
     * 脚本执行的任务ID。
     * @return scriptTaskId
     */
    public String getScriptTaskId() {
        return scriptTaskId;
    }

    public void setScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
    }

    public ShowScriptRecordDetailResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 执行脚本的资源ID，如桌面ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowScriptRecordDetailResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 执行脚本的资源名称，如桌面名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ShowScriptRecordDetailResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，如桌面(DESKTOP)。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowScriptRecordDetailResponse withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 脚本执行开始时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ShowScriptRecordDetailResponse withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 脚本执行结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ShowScriptRecordDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 脚本执行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowScriptRecordDetailResponse withExecuteOrder(Integer executeOrder) {
        this.executeOrder = executeOrder;
        return this;
    }

    /**
     * 执行批次（默认：0，灰度：1，非灰度：2）。
     * @return executeOrder
     */
    public Integer getExecuteOrder() {
        return executeOrder;
    }

    public void setExecuteOrder(Integer executeOrder) {
        this.executeOrder = executeOrder;
    }

    public ShowScriptRecordDetailResponse withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 错误码。
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public ShowScriptRecordDetailResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ShowScriptRecordDetailResponse withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 脚本执行的输出。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScriptRecordDetailResponse that = (ShowScriptRecordDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.scriptName, that.scriptName) && Objects.equals(this.scriptTaskId, that.scriptTaskId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.executeOrder, that.executeOrder) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            scriptId,
            scriptName,
            scriptTaskId,
            resourceId,
            resourceName,
            resourceType,
            startTime,
            endTime,
            status,
            executeOrder,
            resultCode,
            reason,
            output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScriptRecordDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptTaskId: ").append(toIndentedString(scriptTaskId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    executeOrder: ").append(toIndentedString(executeOrder)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
