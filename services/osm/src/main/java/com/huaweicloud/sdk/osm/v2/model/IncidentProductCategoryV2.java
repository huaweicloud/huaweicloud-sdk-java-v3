package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IncidentProductCategoryV2
 */
public class IncidentProductCategoryV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_id")

    private String incidentProductCategoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_name")

    private String incidentProductCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_desc")

    private String incidentProductCategoryDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_acronym")

    private String incidentProductCategoryAcronym;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_use_support_plan")

    private Boolean canUseSupportPlan;

    public IncidentProductCategoryV2 withIncidentProductCategoryId(String incidentProductCategoryId) {
        this.incidentProductCategoryId = incidentProductCategoryId;
        return this;
    }

    /**
     * 产品类型id
     * @return incidentProductCategoryId
     */
    public String getIncidentProductCategoryId() {
        return incidentProductCategoryId;
    }

    public void setIncidentProductCategoryId(String incidentProductCategoryId) {
        this.incidentProductCategoryId = incidentProductCategoryId;
    }

    public IncidentProductCategoryV2 withIncidentProductCategoryName(String incidentProductCategoryName) {
        this.incidentProductCategoryName = incidentProductCategoryName;
        return this;
    }

    /**
     * 产品类型名称
     * @return incidentProductCategoryName
     */
    public String getIncidentProductCategoryName() {
        return incidentProductCategoryName;
    }

    public void setIncidentProductCategoryName(String incidentProductCategoryName) {
        this.incidentProductCategoryName = incidentProductCategoryName;
    }

    public IncidentProductCategoryV2 withIncidentProductCategoryDesc(String incidentProductCategoryDesc) {
        this.incidentProductCategoryDesc = incidentProductCategoryDesc;
        return this;
    }

    /**
     * 产品类型描述
     * @return incidentProductCategoryDesc
     */
    public String getIncidentProductCategoryDesc() {
        return incidentProductCategoryDesc;
    }

    public void setIncidentProductCategoryDesc(String incidentProductCategoryDesc) {
        this.incidentProductCategoryDesc = incidentProductCategoryDesc;
    }

    public IncidentProductCategoryV2 withIncidentProductCategoryAcronym(String incidentProductCategoryAcronym) {
        this.incidentProductCategoryAcronym = incidentProductCategoryAcronym;
        return this;
    }

    /**
     * 产品类型简称
     * @return incidentProductCategoryAcronym
     */
    public String getIncidentProductCategoryAcronym() {
        return incidentProductCategoryAcronym;
    }

    public void setIncidentProductCategoryAcronym(String incidentProductCategoryAcronym) {
        this.incidentProductCategoryAcronym = incidentProductCategoryAcronym;
    }

    public IncidentProductCategoryV2 withCanUseSupportPlan(Boolean canUseSupportPlan) {
        this.canUseSupportPlan = canUseSupportPlan;
        return this;
    }

    /**
     * 是否可以使用支持计划权益
     * @return canUseSupportPlan
     */
    public Boolean getCanUseSupportPlan() {
        return canUseSupportPlan;
    }

    public void setCanUseSupportPlan(Boolean canUseSupportPlan) {
        this.canUseSupportPlan = canUseSupportPlan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentProductCategoryV2 that = (IncidentProductCategoryV2) obj;
        return Objects.equals(this.incidentProductCategoryId, that.incidentProductCategoryId)
            && Objects.equals(this.incidentProductCategoryName, that.incidentProductCategoryName)
            && Objects.equals(this.incidentProductCategoryDesc, that.incidentProductCategoryDesc)
            && Objects.equals(this.incidentProductCategoryAcronym, that.incidentProductCategoryAcronym)
            && Objects.equals(this.canUseSupportPlan, that.canUseSupportPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentProductCategoryId,
            incidentProductCategoryName,
            incidentProductCategoryDesc,
            incidentProductCategoryAcronym,
            canUseSupportPlan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentProductCategoryV2 {\n");
        sb.append("    incidentProductCategoryId: ").append(toIndentedString(incidentProductCategoryId)).append("\n");
        sb.append("    incidentProductCategoryName: ")
            .append(toIndentedString(incidentProductCategoryName))
            .append("\n");
        sb.append("    incidentProductCategoryDesc: ")
            .append(toIndentedString(incidentProductCategoryDesc))
            .append("\n");
        sb.append("    incidentProductCategoryAcronym: ")
            .append(toIndentedString(incidentProductCategoryAcronym))
            .append("\n");
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
