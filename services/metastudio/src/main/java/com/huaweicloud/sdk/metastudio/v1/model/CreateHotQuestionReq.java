package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建热点问题请求。
 */
public class CreateHotQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_question")

    private String hotQuestion;

    public CreateHotQuestionReq withRobotId(String robotId) {
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

    public CreateHotQuestionReq withHotQuestion(String hotQuestion) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHotQuestionReq that = (CreateHotQuestionReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.hotQuestion, that.hotQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, hotQuestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHotQuestionReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    hotQuestion: ").append(toIndentedString(hotQuestion)).append("\n");
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
