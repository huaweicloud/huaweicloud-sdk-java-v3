package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAiOpsRequestBody
 */
public class CreateAiOpsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private CreateAiOpsRequestBodyAlarm alarm;

    public CreateAiOpsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检测任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAiOpsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 检测任务描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAiOpsRequestBody withAlarm(CreateAiOpsRequestBodyAlarm alarm) {
        this.alarm = alarm;
        return this;
    }

    public CreateAiOpsRequestBody withAlarm(Consumer<CreateAiOpsRequestBodyAlarm> alarmSetter) {
        if (this.alarm == null) {
            this.alarm = new CreateAiOpsRequestBodyAlarm();
            alarmSetter.accept(this.alarm);
        }

        return this;
    }

    /**
     * Get alarm
     * @return alarm
     */
    public CreateAiOpsRequestBodyAlarm getAlarm() {
        return alarm;
    }

    public void setAlarm(CreateAiOpsRequestBodyAlarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiOpsRequestBody that = (CreateAiOpsRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.alarm, that.alarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, alarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiOpsRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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
