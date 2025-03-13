package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 高权限管理诊断结果。
 */
public class HighPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_admin")

    private String workspaceAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_administrator")

    private String securityAdministrator;

    public HighPermission withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public HighPermission withWorkspaceAdmin(String workspaceAdmin) {
        this.workspaceAdmin = workspaceAdmin;
        return this;
    }

    /**
     * 空间管理员用户列表。
     * @return workspaceAdmin
     */
    public String getWorkspaceAdmin() {
        return workspaceAdmin;
    }

    public void setWorkspaceAdmin(String workspaceAdmin) {
        this.workspaceAdmin = workspaceAdmin;
    }

    public HighPermission withSecurityAdministrator(String securityAdministrator) {
        this.securityAdministrator = securityAdministrator;
        return this;
    }

    /**
     * 安全管理员用户列表。
     * @return securityAdministrator
     */
    public String getSecurityAdministrator() {
        return securityAdministrator;
    }

    public void setSecurityAdministrator(String securityAdministrator) {
        this.securityAdministrator = securityAdministrator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HighPermission that = (HighPermission) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.workspaceAdmin, that.workspaceAdmin)
            && Objects.equals(this.securityAdministrator, that.securityAdministrator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, workspaceAdmin, securityAdministrator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HighPermission {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    workspaceAdmin: ").append(toIndentedString(workspaceAdmin)).append("\n");
        sb.append("    securityAdministrator: ").append(toIndentedString(securityAdministrator)).append("\n");
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
