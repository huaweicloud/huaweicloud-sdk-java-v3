package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseTriggerDto
 */
public class DatabaseTriggerDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judge_mode")

    private TriggerJudgeMode judgeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DatabaseTriggerDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 触发器的列名，取值范围：[1,63]
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseTriggerDto withJudgeMode(TriggerJudgeMode judgeMode) {
        this.judgeMode = judgeMode;
        return this;
    }

    /**
     * Get judgeMode
     * @return judgeMode
     */
    public TriggerJudgeMode getJudgeMode() {
        return judgeMode;
    }

    public void setJudgeMode(TriggerJudgeMode judgeMode) {
        this.judgeMode = judgeMode;
    }

    public DatabaseTriggerDto withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 触发器的取值，取值范围：[1,128]
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseTriggerDto that = (DatabaseTriggerDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.judgeMode, that.judgeMode)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, judgeMode, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseTriggerDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    judgeMode: ").append(toIndentedString(judgeMode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
