package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * schedule update struct
 */
public class WorkflowScheduleUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Map<String, Object> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public WorkflowScheduleUpdate withContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public WorkflowScheduleUpdate putContentItem(String key, Object contentItem) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        this.content.put(key, contentItem);
        return this;
    }

    public WorkflowScheduleUpdate withContent(Consumer<Map<String, Object>> contentSetter) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 内容。
     * @return content
     */
    public Map<String, Object> getContent() {
        return content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public WorkflowScheduleUpdate withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 使能标志。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowScheduleUpdate that = (WorkflowScheduleUpdate) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowScheduleUpdate {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
