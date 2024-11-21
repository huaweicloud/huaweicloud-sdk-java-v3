package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateHotQuestionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_question_id")

    private String hotQuestionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_question")

    private String hotQuestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateHotQuestionResponse withHotQuestionId(String hotQuestionId) {
        this.hotQuestionId = hotQuestionId;
        return this;
    }

    /**
     * 热点问题ID。
     * @return hotQuestionId
     */
    public String getHotQuestionId() {
        return hotQuestionId;
    }

    public void setHotQuestionId(String hotQuestionId) {
        this.hotQuestionId = hotQuestionId;
    }

    public CreateHotQuestionResponse withHotQuestion(String hotQuestion) {
        this.hotQuestion = hotQuestion;
        return this;
    }

    /**
     * 热点问题。
     * @return hotQuestion
     */
    public String getHotQuestion() {
        return hotQuestion;
    }

    public void setHotQuestion(String hotQuestion) {
        this.hotQuestion = hotQuestion;
    }

    public CreateHotQuestionResponse withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public CreateHotQuestionResponse withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 机器人ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public CreateHotQuestionResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateHotQuestionResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateHotQuestionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHotQuestionResponse that = (CreateHotQuestionResponse) obj;
        return Objects.equals(this.hotQuestionId, that.hotQuestionId)
            && Objects.equals(this.hotQuestion, that.hotQuestion) && Objects.equals(this.language, that.language)
            && Objects.equals(this.robotId, that.robotId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotQuestionId, hotQuestion, language, robotId, createTime, updateTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHotQuestionResponse {\n");
        sb.append("    hotQuestionId: ").append(toIndentedString(hotQuestionId)).append("\n");
        sb.append("    hotQuestion: ").append(toIndentedString(hotQuestion)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
