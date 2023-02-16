package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAuditQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit_quota")
    
    
    private Long auditQuota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu")
    
    
    private Long cpu;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    
    private Long quota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    
    private Long ram;

    public ShowAuditQuotaResponse withAuditQuota(Long auditQuota) {
        this.auditQuota = auditQuota;
        return this;
    }

    


    /**
     * 实例当前剩余配额。
     * @return auditQuota
     */
    public Long getAuditQuota() {
        return auditQuota;
    }

    public void setAuditQuota(Long auditQuota) {
        this.auditQuota = auditQuota;
    }

    

    public ShowAuditQuotaResponse withCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }

    


    /**
     * Cpu当前剩余配额。
     * @return cpu
     */
    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    

    public ShowAuditQuotaResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目Id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ShowAuditQuotaResponse withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 配额。
     * @return quota
     */
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    

    public ShowAuditQuotaResponse withRam(Long ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 内存当前剩余配额
     * @return ram
     */
    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAuditQuotaResponse showAuditQuotaResponse = (ShowAuditQuotaResponse) o;
        return Objects.equals(this.auditQuota, showAuditQuotaResponse.auditQuota) &&
            Objects.equals(this.cpu, showAuditQuotaResponse.cpu) &&
            Objects.equals(this.projectId, showAuditQuotaResponse.projectId) &&
            Objects.equals(this.quota, showAuditQuotaResponse.quota) &&
            Objects.equals(this.ram, showAuditQuotaResponse.ram);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auditQuota, cpu, projectId, quota, ram);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditQuotaResponse {\n");
        sb.append("    auditQuota: ").append(toIndentedString(auditQuota)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

