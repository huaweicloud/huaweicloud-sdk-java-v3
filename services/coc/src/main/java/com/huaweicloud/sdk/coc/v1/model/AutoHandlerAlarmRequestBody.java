package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建任务请求体
 */
public class AutoHandlerAlarmRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_id")

    private String associatedTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private String associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_enterprise_project_id")

    private String associatedTaskEnterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runbook_instance_mode")

    private String runbookInstanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_param")

    private Map<String, String> inputParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private List<AlarmScheduleInstance> targetInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_info")

    private SubTaskInfoDTO subTaskInfo;

    public AutoHandlerAlarmRequestBody withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public AutoHandlerAlarmRequestBody withAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
        return this;
    }

    /**
     * 关联任务ID（脚本ID/作业ID）
     * @return associatedTaskId
     */
    public String getAssociatedTaskId() {
        return associatedTaskId;
    }

    public void setAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
    }

    public AutoHandlerAlarmRequestBody withAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 关联任务的类型
     * @return associatedTaskType
     */
    public String getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public AutoHandlerAlarmRequestBody withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 关联任务名称（脚本名称/作业名称）
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    public AutoHandlerAlarmRequestBody withAssociatedTaskEnterpriseProjectId(String associatedTaskEnterpriseProjectId) {
        this.associatedTaskEnterpriseProjectId = associatedTaskEnterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return associatedTaskEnterpriseProjectId
     */
    public String getAssociatedTaskEnterpriseProjectId() {
        return associatedTaskEnterpriseProjectId;
    }

    public void setAssociatedTaskEnterpriseProjectId(String associatedTaskEnterpriseProjectId) {
        this.associatedTaskEnterpriseProjectId = associatedTaskEnterpriseProjectId;
    }

    public AutoHandlerAlarmRequestBody withRunbookInstanceMode(String runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
        return this;
    }

    /**
     * 作业实例模式
     * @return runbookInstanceMode
     */
    public String getRunbookInstanceMode() {
        return runbookInstanceMode;
    }

    public void setRunbookInstanceMode(String runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
    }

    public AutoHandlerAlarmRequestBody withInputParam(Map<String, String> inputParam) {
        this.inputParam = inputParam;
        return this;
    }

    public AutoHandlerAlarmRequestBody putInputParamItem(String key, String inputParamItem) {
        if (this.inputParam == null) {
            this.inputParam = new HashMap<>();
        }
        this.inputParam.put(key, inputParamItem);
        return this;
    }

    public AutoHandlerAlarmRequestBody withInputParam(Consumer<Map<String, String>> inputParamSetter) {
        if (this.inputParam == null) {
            this.inputParam = new HashMap<>();
        }
        inputParamSetter.accept(this.inputParam);
        return this;
    }

    /**
     * 执行参数，值为json串
     * @return inputParam
     */
    public Map<String, String> getInputParam() {
        return inputParam;
    }

    public void setInputParam(Map<String, String> inputParam) {
        this.inputParam = inputParam;
    }

    public AutoHandlerAlarmRequestBody withTargetInstances(List<AlarmScheduleInstance> targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    public AutoHandlerAlarmRequestBody addTargetInstancesItem(AlarmScheduleInstance targetInstancesItem) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        this.targetInstances.add(targetInstancesItem);
        return this;
    }

    public AutoHandlerAlarmRequestBody withTargetInstances(
        Consumer<List<AlarmScheduleInstance>> targetInstancesSetter) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        targetInstancesSetter.accept(this.targetInstances);
        return this;
    }

    /**
     * 目标实例信息
     * @return targetInstances
     */
    public List<AlarmScheduleInstance> getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(List<AlarmScheduleInstance> targetInstances) {
        this.targetInstances = targetInstances;
    }

    public AutoHandlerAlarmRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AutoHandlerAlarmRequestBody withSubTaskInfo(SubTaskInfoDTO subTaskInfo) {
        this.subTaskInfo = subTaskInfo;
        return this;
    }

    public AutoHandlerAlarmRequestBody withSubTaskInfo(Consumer<SubTaskInfoDTO> subTaskInfoSetter) {
        if (this.subTaskInfo == null) {
            this.subTaskInfo = new SubTaskInfoDTO();
            subTaskInfoSetter.accept(this.subTaskInfo);
        }

        return this;
    }

    /**
     * Get subTaskInfo
     * @return subTaskInfo
     */
    public SubTaskInfoDTO getSubTaskInfo() {
        return subTaskInfo;
    }

    public void setSubTaskInfo(SubTaskInfoDTO subTaskInfo) {
        this.subTaskInfo = subTaskInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoHandlerAlarmRequestBody that = (AutoHandlerAlarmRequestBody) obj;
        return Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskId, that.associatedTaskId)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName)
            && Objects.equals(this.associatedTaskEnterpriseProjectId, that.associatedTaskEnterpriseProjectId)
            && Objects.equals(this.runbookInstanceMode, that.runbookInstanceMode)
            && Objects.equals(this.inputParam, that.inputParam)
            && Objects.equals(this.targetInstances, that.targetInstances)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.subTaskInfo, that.subTaskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType,
            associatedTaskId,
            associatedTaskType,
            associatedTaskName,
            associatedTaskEnterpriseProjectId,
            runbookInstanceMode,
            inputParam,
            targetInstances,
            regionId,
            subTaskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoHandlerAlarmRequestBody {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskId: ").append(toIndentedString(associatedTaskId)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
        sb.append("    associatedTaskEnterpriseProjectId: ")
            .append(toIndentedString(associatedTaskEnterpriseProjectId))
            .append("\n");
        sb.append("    runbookInstanceMode: ").append(toIndentedString(runbookInstanceMode)).append("\n");
        sb.append("    inputParam: ").append(toIndentedString(inputParam)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    subTaskInfo: ").append(toIndentedString(subTaskInfo)).append("\n");
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
