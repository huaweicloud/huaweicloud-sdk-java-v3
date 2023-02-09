package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class UpdateFlowLogReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private Boolean adminState;

    public UpdateFlowLogReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：流日志名称 取值范围：0-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateFlowLogReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：流日志描述 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateFlowLogReq withAdminState(Boolean adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * 功能说明：流日志管理 取值范围：若为true，表明开启流日志。若为false，则关闭流日志。
     * @return adminState
     */
    public Boolean getAdminState() {
        return adminState;
    }

    public void setAdminState(Boolean adminState) {
        this.adminState = adminState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlowLogReq updateFlowLogReq = (UpdateFlowLogReq) o;
        return Objects.equals(this.name, updateFlowLogReq.name)
            && Objects.equals(this.description, updateFlowLogReq.description)
            && Objects.equals(this.adminState, updateFlowLogReq.adminState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, adminState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlowLogReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
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
