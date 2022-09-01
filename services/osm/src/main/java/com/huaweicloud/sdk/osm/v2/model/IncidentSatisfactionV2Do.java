package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * IncidentSatisfactionV2Do
 */
public class IncidentSatisfactionV2Do {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private Integer value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_id")

    @JacksonXmlProperty(localName = "satisfaction_id")

    private Integer satisfactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_value")

    @JacksonXmlProperty(localName = "satisfaction_value")

    private Integer satisfactionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_name")

    @JacksonXmlProperty(localName = "satisfaction_name")

    private String satisfactionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_value")

    @JacksonXmlProperty(localName = "per_value")

    private Integer perValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sat_category_id")

    @JacksonXmlProperty(localName = "sat_category_id")

    private String satCategoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sat_category_name")

    @JacksonXmlProperty(localName = "sat_category_name")

    private String satCategoryName;

    public IncidentSatisfactionV2Do withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 满意度总分数
     * minimum: 0
     * maximum: 65535
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IncidentSatisfactionV2Do withSatisfactionId(Integer satisfactionId) {
        this.satisfactionId = satisfactionId;
        return this;
    }

    /**
     * 满意度分类id
     * minimum: 0
     * maximum: 9999
     * @return satisfactionId
     */
    public Integer getSatisfactionId() {
        return satisfactionId;
    }

    public void setSatisfactionId(Integer satisfactionId) {
        this.satisfactionId = satisfactionId;
    }

    public IncidentSatisfactionV2Do withSatisfactionValue(Integer satisfactionValue) {
        this.satisfactionValue = satisfactionValue;
        return this;
    }

    /**
     * 满意度的值
     * minimum: 0
     * maximum: 65535
     * @return satisfactionValue
     */
    public Integer getSatisfactionValue() {
        return satisfactionValue;
    }

    public void setSatisfactionValue(Integer satisfactionValue) {
        this.satisfactionValue = satisfactionValue;
    }

    public IncidentSatisfactionV2Do withSatisfactionName(String satisfactionName) {
        this.satisfactionName = satisfactionName;
        return this;
    }

    /**
     * 满意度分类名称
     * @return satisfactionName
     */
    public String getSatisfactionName() {
        return satisfactionName;
    }

    public void setSatisfactionName(String satisfactionName) {
        this.satisfactionName = satisfactionName;
    }

    public IncidentSatisfactionV2Do withPerValue(Integer perValue) {
        this.perValue = perValue;
        return this;
    }

    /**
     * 每格的分数
     * minimum: 0
     * maximum: 65535
     * @return perValue
     */
    public Integer getPerValue() {
        return perValue;
    }

    public void setPerValue(Integer perValue) {
        this.perValue = perValue;
    }

    public IncidentSatisfactionV2Do withSatCategoryId(String satCategoryId) {
        this.satCategoryId = satCategoryId;
        return this;
    }

    /**
     * 满意度维度id
     * @return satCategoryId
     */
    public String getSatCategoryId() {
        return satCategoryId;
    }

    public void setSatCategoryId(String satCategoryId) {
        this.satCategoryId = satCategoryId;
    }

    public IncidentSatisfactionV2Do withSatCategoryName(String satCategoryName) {
        this.satCategoryName = satCategoryName;
        return this;
    }

    /**
     * 满意度维度名称
     * @return satCategoryName
     */
    public String getSatCategoryName() {
        return satCategoryName;
    }

    public void setSatCategoryName(String satCategoryName) {
        this.satCategoryName = satCategoryName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentSatisfactionV2Do incidentSatisfactionV2Do = (IncidentSatisfactionV2Do) o;
        return Objects.equals(this.value, incidentSatisfactionV2Do.value)
            && Objects.equals(this.satisfactionId, incidentSatisfactionV2Do.satisfactionId)
            && Objects.equals(this.satisfactionValue, incidentSatisfactionV2Do.satisfactionValue)
            && Objects.equals(this.satisfactionName, incidentSatisfactionV2Do.satisfactionName)
            && Objects.equals(this.perValue, incidentSatisfactionV2Do.perValue)
            && Objects.equals(this.satCategoryId, incidentSatisfactionV2Do.satCategoryId)
            && Objects.equals(this.satCategoryName, incidentSatisfactionV2Do.satCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(value, satisfactionId, satisfactionValue, satisfactionName, perValue, satCategoryId, satCategoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentSatisfactionV2Do {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    satisfactionId: ").append(toIndentedString(satisfactionId)).append("\n");
        sb.append("    satisfactionValue: ").append(toIndentedString(satisfactionValue)).append("\n");
        sb.append("    satisfactionName: ").append(toIndentedString(satisfactionName)).append("\n");
        sb.append("    perValue: ").append(toIndentedString(perValue)).append("\n");
        sb.append("    satCategoryId: ").append(toIndentedString(satCategoryId)).append("\n");
        sb.append("    satCategoryName: ").append(toIndentedString(satCategoryName)).append("\n");
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
