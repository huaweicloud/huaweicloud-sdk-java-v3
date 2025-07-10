package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowScriptDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_task_id")

    private String scriptTaskId;

    public ShowScriptDetailRequest withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 脚本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ShowScriptDetailRequest withScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
        return this;
    }

    /**
     * 执行脚本的任务ID。
     * @return scriptTaskId
     */
    public String getScriptTaskId() {
        return scriptTaskId;
    }

    public void setScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScriptDetailRequest that = (ShowScriptDetailRequest) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.scriptTaskId, that.scriptTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId, scriptTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScriptDetailRequest {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptTaskId: ").append(toIndentedString(scriptTaskId)).append("\n");
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
