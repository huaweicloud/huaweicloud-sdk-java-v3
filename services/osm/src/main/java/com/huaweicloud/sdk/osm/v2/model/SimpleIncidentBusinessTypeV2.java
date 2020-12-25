package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SimpleIncidentBusinessTypeV2
 */
public class SimpleIncidentBusinessTypeV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_id")
    
    private String businessTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_name")
    
    private String businessTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_type")
    
    private String caseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="can_use_support_plan")
    
    private Boolean canUseSupportPlan;

    public SimpleIncidentBusinessTypeV2 withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    


    /**
     * 问题类型id
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public SimpleIncidentBusinessTypeV2 withBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }

    


    /**
     * 问题类型名称
     * @return businessTypeName
     */
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public SimpleIncidentBusinessTypeV2 withCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }

    


    /**
     * 对应的工单类型0咨询 5报障
     * @return caseType
     */
    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public SimpleIncidentBusinessTypeV2 withCanUseSupportPlan(Boolean canUseSupportPlan) {
        this.canUseSupportPlan = canUseSupportPlan;
        return this;
    }

    


    /**
     * 是否可以使用支持计划
     * @return canUseSupportPlan
     */
    public Boolean getCanUseSupportPlan() {
        return canUseSupportPlan;
    }

    public void setCanUseSupportPlan(Boolean canUseSupportPlan) {
        this.canUseSupportPlan = canUseSupportPlan;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleIncidentBusinessTypeV2 simpleIncidentBusinessTypeV2 = (SimpleIncidentBusinessTypeV2) o;
        return Objects.equals(this.businessTypeId, simpleIncidentBusinessTypeV2.businessTypeId) &&
            Objects.equals(this.businessTypeName, simpleIncidentBusinessTypeV2.businessTypeName) &&
            Objects.equals(this.caseType, simpleIncidentBusinessTypeV2.caseType) &&
            Objects.equals(this.canUseSupportPlan, simpleIncidentBusinessTypeV2.canUseSupportPlan);
    }
    @Override
    public int hashCode() {
        return Objects.hash(businessTypeId, businessTypeName, caseType, canUseSupportPlan);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleIncidentBusinessTypeV2 {\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    businessTypeName: ").append(toIndentedString(businessTypeName)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    canUseSupportPlan: ").append(toIndentedString(canUseSupportPlan)).append("\n");
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

