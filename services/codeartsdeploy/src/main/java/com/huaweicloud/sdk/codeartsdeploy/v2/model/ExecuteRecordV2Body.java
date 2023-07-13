package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用部署记录Body
 */
public class ExecuteRecordV2Body {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickname")

    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_id")

    private Long releaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ExecuteRecordV2Body withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 部署用时
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ExecuteRecordV2Body withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 应用状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ExecuteRecordV2Body withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人用户名
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ExecuteRecordV2Body withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 部署记录ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ExecuteRecordV2Body withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 部署应用的开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExecuteRecordV2Body withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 操作人昵称
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ExecuteRecordV2Body withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 部署应用的结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ExecuteRecordV2Body withReleaseId(Long releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * 部署记录序列号
     * @return releaseId
     */
    public Long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Long releaseId) {
        this.releaseId = releaseId;
    }

    public ExecuteRecordV2Body withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteRecordV2Body that = (ExecuteRecordV2Body) obj;
        return Objects.equals(this.duration, that.duration) && Objects.equals(this.state, that.state)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.nickname, that.nickname)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.releaseId, that.releaseId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, state, operator, executionId, startTime, nickname, endTime, releaseId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteRecordV2Body {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
