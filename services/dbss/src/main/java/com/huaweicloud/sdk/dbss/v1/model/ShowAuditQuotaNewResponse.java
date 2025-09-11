package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAuditQuotaNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_quota")

    private Long auditQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Long cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Long ram;

    public ShowAuditQuotaNewResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowAuditQuotaNewResponse withAuditQuota(Long auditQuota) {
        this.auditQuota = auditQuota;
        return this;
    }

    /**
     * 审计实例剩余配额。
     * @return auditQuota
     */
    public Long getAuditQuota() {
        return auditQuota;
    }

    public void setAuditQuota(Long auditQuota) {
        this.auditQuota = auditQuota;
    }

    public ShowAuditQuotaNewResponse withCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU剩余配额。
     * @return cpu
     */
    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public ShowAuditQuotaNewResponse withRam(Long ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存剩余配额。
     * @return ram
     */
    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditQuotaNewResponse that = (ShowAuditQuotaNewResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.auditQuota, that.auditQuota)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.ram, that.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, auditQuota, cpu, ram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditQuotaNewResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    auditQuota: ").append(toIndentedString(auditQuota)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
