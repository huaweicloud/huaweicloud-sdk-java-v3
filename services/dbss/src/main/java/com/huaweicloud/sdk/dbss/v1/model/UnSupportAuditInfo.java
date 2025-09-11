package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UnSupportAuditInfo
 */
public class UnSupportAuditInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_version")

    private String auditVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    public UnSupportAuditInfo withAuditVersion(String auditVersion) {
        this.auditVersion = auditVersion;
        return this;
    }

    /**
     * 实例版本
     * @return auditVersion
     */
    public String getAuditVersion() {
        return auditVersion;
    }

    public void setAuditVersion(String auditVersion) {
        this.auditVersion = auditVersion;
    }

    public UnSupportAuditInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 实例名称
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnSupportAuditInfo that = (UnSupportAuditInfo) obj;
        return Objects.equals(this.auditVersion, that.auditVersion) && Objects.equals(this.serverName, that.serverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditVersion, serverName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnSupportAuditInfo {\n");
        sb.append("    auditVersion: ").append(toIndentedString(auditVersion)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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
