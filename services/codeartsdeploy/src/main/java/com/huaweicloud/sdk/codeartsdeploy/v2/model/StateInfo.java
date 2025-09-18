package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务基本信息
 */
public class StateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private String step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_state")

    private List<StepInfo> stepState = null;

    public StateInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StateInfo withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public StateInfo withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 执行记录id
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public StateInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public StateInfo withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * 步骤状态
     * @return step
     */
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public StateInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public StateInfo withEndTime(String endTime) {
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

    public StateInfo withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行人
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public StateInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public StateInfo withStepState(List<StepInfo> stepState) {
        this.stepState = stepState;
        return this;
    }

    public StateInfo addStepStateItem(StepInfo stepStateItem) {
        if (this.stepState == null) {
            this.stepState = new ArrayList<>();
        }
        this.stepState.add(stepStateItem);
        return this;
    }

    public StateInfo withStepState(Consumer<List<StepInfo>> stepStateSetter) {
        if (this.stepState == null) {
            this.stepState = new ArrayList<>();
        }
        stepStateSetter.accept(this.stepState);
        return this;
    }

    /**
     * 子步骤信息
     * @return stepState
     */
    public List<StepInfo> getStepState() {
        return stepState;
    }

    public void setStepState(List<StepInfo> stepState) {
        this.stepState = stepState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StateInfo that = (StateInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.recordId, that.recordId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.step, that.step) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.executor, that.executor)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.stepState, that.stepState);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(status, nickName, recordId, taskId, step, startTime, endTime, executor, taskName, stepState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StateInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    stepState: ").append(toIndentedString(stepState)).append("\n");
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
