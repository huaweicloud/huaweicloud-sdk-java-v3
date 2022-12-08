package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAuditRuleRisksRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_levels")
    
    
    private String riskLevels;

    public ListAuditRuleRisksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListAuditRuleRisksRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 风险名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListAuditRuleRisksRequest withRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    


    /**
     * 风险级别[LOW,MEDIUM,HIGH,NO_RISK]
     * @return riskLevels
     */
    public String getRiskLevels() {
        return riskLevels;
    }

    public void setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuditRuleRisksRequest listAuditRuleRisksRequest = (ListAuditRuleRisksRequest) o;
        return Objects.equals(this.instanceId, listAuditRuleRisksRequest.instanceId) &&
            Objects.equals(this.name, listAuditRuleRisksRequest.name) &&
            Objects.equals(this.riskLevels, listAuditRuleRisksRequest.riskLevels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, riskLevels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditRuleRisksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    riskLevels: ").append(toIndentedString(riskLevels)).append("\n");
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

