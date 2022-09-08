package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IterationHistory
 */
public class IterationHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private String iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private VersionHistoryOperator operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private String operate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private String operateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<IterationHistoryDetails> details = null;

    public IterationHistory withIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 迭代ID
     * @return iterationId
     */
    public String getIterationId() {
        return iterationId;
    }

    public void setIterationId(String iterationId) {
        this.iterationId = iterationId;
    }

    public IterationHistory withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IterationHistory withOperator(VersionHistoryOperator operator) {
        this.operator = operator;
        return this;
    }

    public IterationHistory withOperator(Consumer<VersionHistoryOperator> operatorSetter) {
        if (this.operator == null) {
            this.operator = new VersionHistoryOperator();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public VersionHistoryOperator getOperator() {
        return operator;
    }

    public void setOperator(VersionHistoryOperator operator) {
        this.operator = operator;
    }

    public IterationHistory withOperate(String operate) {
        this.operate = operate;
        return this;
    }

    /**
     * 操作类型
     * @return operate
     */
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public IterationHistory withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public IterationHistory withDetails(List<IterationHistoryDetails> details) {
        this.details = details;
        return this;
    }

    public IterationHistory addDetailsItem(IterationHistoryDetails detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public IterationHistory withDetails(Consumer<List<IterationHistoryDetails>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 操作详情
     * @return details
     */
    public List<IterationHistoryDetails> getDetails() {
        return details;
    }

    public void setDetails(List<IterationHistoryDetails> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IterationHistory iterationHistory = (IterationHistory) o;
        return Objects.equals(this.iterationId, iterationHistory.iterationId)
            && Objects.equals(this.projectId, iterationHistory.projectId)
            && Objects.equals(this.operator, iterationHistory.operator)
            && Objects.equals(this.operate, iterationHistory.operate)
            && Objects.equals(this.operateTime, iterationHistory.operateTime)
            && Objects.equals(this.details, iterationHistory.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iterationId, projectId, operator, operate, operateTime, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IterationHistory {\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
