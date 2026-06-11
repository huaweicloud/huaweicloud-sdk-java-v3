package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业事件
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 事件信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Event withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 事件级别。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Event withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 事件发生的时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Event withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**：事件来源。 **取值范围**：不涉及。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.level, that.level)
            && Objects.equals(this.time, that.time) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, level, time, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
