package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEvaluationStateByAssignmentIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_assignment_id")
    
    private String policyAssignmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_message")
    
    private String errorMessage;

    public ShowEvaluationStateByAssignmentIdResponse withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    


    /**
     * 规则ID
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    

    public ShowEvaluationStateByAssignmentIdResponse withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 评估任务执行状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public ShowEvaluationStateByAssignmentIdResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 评估任务开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowEvaluationStateByAssignmentIdResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 评估任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ShowEvaluationStateByAssignmentIdResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 评估任务失败信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEvaluationStateByAssignmentIdResponse showEvaluationStateByAssignmentIdResponse = (ShowEvaluationStateByAssignmentIdResponse) o;
        return Objects.equals(this.policyAssignmentId, showEvaluationStateByAssignmentIdResponse.policyAssignmentId) &&
            Objects.equals(this.state, showEvaluationStateByAssignmentIdResponse.state) &&
            Objects.equals(this.startTime, showEvaluationStateByAssignmentIdResponse.startTime) &&
            Objects.equals(this.endTime, showEvaluationStateByAssignmentIdResponse.endTime) &&
            Objects.equals(this.errorMessage, showEvaluationStateByAssignmentIdResponse.errorMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, state, startTime, endTime, errorMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEvaluationStateByAssignmentIdResponse {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

