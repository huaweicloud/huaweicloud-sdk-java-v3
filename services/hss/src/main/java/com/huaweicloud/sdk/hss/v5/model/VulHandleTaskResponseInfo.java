package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞处置任务信息
 */
public class VulHandleTaskResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_type")

    private String handleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_types")

    private List<String> vulTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_num")

    private Integer readyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_num")

    private Integer runningNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Float estimatedTime;

    public VulHandleTaskResponseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 任务ID **取值范围**: 字符长度1-64位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VulHandleTaskResponseInfo withHandleType(String handleType) {
        this.handleType = handleType;
        return this;
    }

    /**
     * **参数解释**: 处置任务类型 **取值范围**: - immediate_repair：立即修复。 - verify：验证。 
     * @return handleType
     */
    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }

    public VulHandleTaskResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 任务状态 **取值范围**: - running：执行中。 - finished：已完成。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulHandleTaskResponseInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 任务开始时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public VulHandleTaskResponseInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 任务结束时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public VulHandleTaskResponseInfo withVulTypes(List<String> vulTypes) {
        this.vulTypes = vulTypes;
        return this;
    }

    public VulHandleTaskResponseInfo addVulTypesItem(String vulTypesItem) {
        if (this.vulTypes == null) {
            this.vulTypes = new ArrayList<>();
        }
        this.vulTypes.add(vulTypesItem);
        return this;
    }

    public VulHandleTaskResponseInfo withVulTypes(Consumer<List<String>> vulTypesSetter) {
        if (this.vulTypes == null) {
            this.vulTypes = new ArrayList<>();
        }
        vulTypesSetter.accept(this.vulTypes);
        return this;
    }

    /**
     * **参数解释**: 任务涉及的漏洞类型列表 **取值范围**: 最小值0，最大值100 
     * @return vulTypes
     */
    public List<String> getVulTypes() {
        return vulTypes;
    }

    public void setVulTypes(List<String> vulTypes) {
        this.vulTypes = vulTypes;
    }

    public VulHandleTaskResponseInfo withReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
        return this;
    }

    /**
     * **参数解释**: 等待执行的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return readyNum
     */
    public Integer getReadyNum() {
        return readyNum;
    }

    public void setReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
    }

    public VulHandleTaskResponseInfo withRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    /**
     * **参数解释**: 执行中的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return runningNum
     */
    public Integer getRunningNum() {
        return runningNum;
    }

    public void setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
    }

    public VulHandleTaskResponseInfo withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**: 执行成功的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public VulHandleTaskResponseInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释**: 执行失败的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public VulHandleTaskResponseInfo withEstimatedTime(Float estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * **参数解释**: 预计还需要多长时间 **取值范围**: 最小值0，最大值604800 
     * minimum: 0
     * @return estimatedTime
     */
    public Float getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Float estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHandleTaskResponseInfo that = (VulHandleTaskResponseInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.handleType, that.handleType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.vulTypes, that.vulTypes)
            && Objects.equals(this.readyNum, that.readyNum) && Objects.equals(this.runningNum, that.runningNum)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.estimatedTime, that.estimatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            handleType,
            status,
            startTime,
            endTime,
            vulTypes,
            readyNum,
            runningNum,
            successNum,
            failedNum,
            estimatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHandleTaskResponseInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    handleType: ").append(toIndentedString(handleType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    vulTypes: ").append(toIndentedString(vulTypes)).append("\n");
        sb.append("    readyNum: ").append(toIndentedString(readyNum)).append("\n");
        sb.append("    runningNum: ").append(toIndentedString(runningNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
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
