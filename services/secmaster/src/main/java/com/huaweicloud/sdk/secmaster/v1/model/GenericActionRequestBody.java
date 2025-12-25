package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通用Agent行为请求体，通过&#39;action&#39;字段标识具体行为类型和对应的&#39;parameter&#39;内容。
 */
public class GenericActionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private Object parameter;

    public GenericActionRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表示具体行为的类型。命名为“t_行为名称”。例如 \"t_dialog_feedback\" 。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GenericActionRequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public GenericActionRequestBody withParameter(Object parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * 具体行为的数据内容，其结构由'action'字段决定。 - 回答质量人工反馈action: t_dialog_feedback, 参考DialogFeedbackData结构
     * @return parameter
     */
    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenericActionRequestBody that = (GenericActionRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.parameter, that.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, workspaceId, parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericActionRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
