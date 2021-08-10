package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SatisfactionDimensionSimpleInfoV2 */
public class SatisfactionDimensionSimpleInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_id")

    private Integer satisfactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_name")

    private String satisfactionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_desc")

    private String satisfactionDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_value")

    private Integer perValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sat_category_id")

    private String satCategoryId;

    public SatisfactionDimensionSimpleInfoV2 withValue(Integer value) {
        this.value = value;
        return this;
    }

    /** 总的分数 minimum: 0 maximum: 65535
     * 
     * @return value */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SatisfactionDimensionSimpleInfoV2 withSatisfactionId(Integer satisfactionId) {
        this.satisfactionId = satisfactionId;
        return this;
    }

    /** 满意度id minimum: 0 maximum: 65535
     * 
     * @return satisfactionId */
    public Integer getSatisfactionId() {
        return satisfactionId;
    }

    public void setSatisfactionId(Integer satisfactionId) {
        this.satisfactionId = satisfactionId;
    }

    public SatisfactionDimensionSimpleInfoV2 withSatisfactionName(String satisfactionName) {
        this.satisfactionName = satisfactionName;
        return this;
    }

    /** 满意度名称
     * 
     * @return satisfactionName */
    public String getSatisfactionName() {
        return satisfactionName;
    }

    public void setSatisfactionName(String satisfactionName) {
        this.satisfactionName = satisfactionName;
    }

    public SatisfactionDimensionSimpleInfoV2 withSatisfactionDesc(String satisfactionDesc) {
        this.satisfactionDesc = satisfactionDesc;
        return this;
    }

    /** 满意度描述
     * 
     * @return satisfactionDesc */
    public String getSatisfactionDesc() {
        return satisfactionDesc;
    }

    public void setSatisfactionDesc(String satisfactionDesc) {
        this.satisfactionDesc = satisfactionDesc;
    }

    public SatisfactionDimensionSimpleInfoV2 withPerValue(Integer perValue) {
        this.perValue = perValue;
        return this;
    }

    /** 每格的分数 minimum: 0 maximum: 65535
     * 
     * @return perValue */
    public Integer getPerValue() {
        return perValue;
    }

    public void setPerValue(Integer perValue) {
        this.perValue = perValue;
    }

    public SatisfactionDimensionSimpleInfoV2 withSatCategoryId(String satCategoryId) {
        this.satCategoryId = satCategoryId;
        return this;
    }

    /** 满意度分类id
     * 
     * @return satCategoryId */
    public String getSatCategoryId() {
        return satCategoryId;
    }

    public void setSatCategoryId(String satCategoryId) {
        this.satCategoryId = satCategoryId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SatisfactionDimensionSimpleInfoV2 satisfactionDimensionSimpleInfoV2 = (SatisfactionDimensionSimpleInfoV2) o;
        return Objects.equals(this.value, satisfactionDimensionSimpleInfoV2.value)
            && Objects.equals(this.satisfactionId, satisfactionDimensionSimpleInfoV2.satisfactionId)
            && Objects.equals(this.satisfactionName, satisfactionDimensionSimpleInfoV2.satisfactionName)
            && Objects.equals(this.satisfactionDesc, satisfactionDimensionSimpleInfoV2.satisfactionDesc)
            && Objects.equals(this.perValue, satisfactionDimensionSimpleInfoV2.perValue)
            && Objects.equals(this.satCategoryId, satisfactionDimensionSimpleInfoV2.satCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, satisfactionId, satisfactionName, satisfactionDesc, perValue, satCategoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SatisfactionDimensionSimpleInfoV2 {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    satisfactionId: ").append(toIndentedString(satisfactionId)).append("\n");
        sb.append("    satisfactionName: ").append(toIndentedString(satisfactionName)).append("\n");
        sb.append("    satisfactionDesc: ").append(toIndentedString(satisfactionDesc)).append("\n");
        sb.append("    perValue: ").append(toIndentedString(perValue)).append("\n");
        sb.append("    satCategoryId: ").append(toIndentedString(satCategoryId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
