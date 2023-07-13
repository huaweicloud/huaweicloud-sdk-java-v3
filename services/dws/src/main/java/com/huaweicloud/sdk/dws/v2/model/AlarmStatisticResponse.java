package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警统计
 */
public class AlarmStatisticResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urgent")

    private String urgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "important")

    private String important;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minor")

    private String minor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    public AlarmStatisticResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AlarmStatisticResponse withUrgent(String urgent) {
        this.urgent = urgent;
        return this;
    }

    /**
     * 紧急
     * @return urgent
     */
    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public AlarmStatisticResponse withImportant(String important) {
        this.important = important;
        return this;
    }

    /**
     * 重要
     * @return important
     */
    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public AlarmStatisticResponse withMinor(String minor) {
        this.minor = minor;
        return this;
    }

    /**
     * 次要
     * @return minor
     */
    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public AlarmStatisticResponse withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 提示
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmStatisticResponse that = (AlarmStatisticResponse) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.urgent, that.urgent)
            && Objects.equals(this.important, that.important) && Objects.equals(this.minor, that.minor)
            && Objects.equals(this.prompt, that.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, urgent, important, minor, prompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmStatisticResponse {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
        sb.append("    important: ").append(toIndentedString(important)).append("\n");
        sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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
