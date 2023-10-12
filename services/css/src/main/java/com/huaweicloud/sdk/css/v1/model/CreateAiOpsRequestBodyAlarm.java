package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检测任务完成后发送SMN告警消息。
 */
public class CreateAiOpsRequestBodyAlarm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic")

    private String smnTopic;

    public CreateAiOpsRequestBodyAlarm withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * SMN告警消息敏感度。 - high：高风险。 - medium：中风险。 - suggestion：建议。 - norisk：无风险。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CreateAiOpsRequestBodyAlarm withSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
        return this;
    }

    /**
     * SMN主题名称。
     * @return smnTopic
     */
    public String getSmnTopic() {
        return smnTopic;
    }

    public void setSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiOpsRequestBodyAlarm that = (CreateAiOpsRequestBodyAlarm) obj;
        return Objects.equals(this.level, that.level) && Objects.equals(this.smnTopic, that.smnTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, smnTopic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiOpsRequestBodyAlarm {\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
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
