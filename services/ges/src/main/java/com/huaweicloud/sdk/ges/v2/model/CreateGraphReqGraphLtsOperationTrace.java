package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 图实例是否开启审计日志，默认不开启。
 */
public class CreateGraphReqGraphLtsOperationTrace  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_audit")
    
    
    private Boolean enableAudit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit_log_group_name")
    
    
    private String auditLogGroupName;

    public CreateGraphReqGraphLtsOperationTrace withEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }

    


    /**
     * 是否开启图审计，默认“false”。
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return enableAudit;
    }

    public void setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
    }

    

    public CreateGraphReqGraphLtsOperationTrace withAuditLogGroupName(String auditLogGroupName) {
        this.auditLogGroupName = auditLogGroupName;
        return this;
    }

    


    /**
     * LTS日志组名称。
     * @return auditLogGroupName
     */
    public String getAuditLogGroupName() {
        return auditLogGroupName;
    }

    public void setAuditLogGroupName(String auditLogGroupName) {
        this.auditLogGroupName = auditLogGroupName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGraphReqGraphLtsOperationTrace createGraphReqGraphLtsOperationTrace = (CreateGraphReqGraphLtsOperationTrace) o;
        return Objects.equals(this.enableAudit, createGraphReqGraphLtsOperationTrace.enableAudit) &&
            Objects.equals(this.auditLogGroupName, createGraphReqGraphLtsOperationTrace.auditLogGroupName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableAudit, auditLogGroupName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReqGraphLtsOperationTrace {\n");
        sb.append("    enableAudit: ").append(toIndentedString(enableAudit)).append("\n");
        sb.append("    auditLogGroupName: ").append(toIndentedString(auditLogGroupName)).append("\n");
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

