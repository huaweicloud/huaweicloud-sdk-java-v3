package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 任务元数据
 */
public class TaskExecutorBrief {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public TaskExecutorBrief withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 子任务持续时长
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public TaskExecutorBrief withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 子任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskExecutorBrief taskExecutorBrief = (TaskExecutorBrief) o;
        return Objects.equals(this.duration, taskExecutorBrief.duration)
            && Objects.equals(this.description, taskExecutorBrief.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskExecutorBrief {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
