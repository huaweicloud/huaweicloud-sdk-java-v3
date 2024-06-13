package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RelationInfo
 */
public class RelationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_number")

    private String drNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_type")

    private String relateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_system")

    private String sourceSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_number")

    private String associationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public RelationInfo withDrNumber(String drNumber) {
        this.drNumber = drNumber;
        return this;
    }

    /**
     * 需求id
     * @return drNumber
     */
    public String getDrNumber() {
        return drNumber;
    }

    public void setDrNumber(String drNumber) {
        this.drNumber = drNumber;
    }

    public RelationInfo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * 用例uri
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public RelationInfo withRelateType(String relateType) {
        this.relateType = relateType;
        return this;
    }

    /**
     * 资源类型
     * @return relateType
     */
    public String getRelateType() {
        return relateType;
    }

    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    public RelationInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public RelationInfo withSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    /**
     * 来源系统
     * @return sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public RelationInfo withAssociationNumber(String associationNumber) {
        this.associationNumber = associationNumber;
        return this;
    }

    /**
     * 关联资源编号
     * @return associationNumber
     */
    public String getAssociationNumber() {
        return associationNumber;
    }

    public void setAssociationNumber(String associationNumber) {
        this.associationNumber = associationNumber;
    }

    public RelationInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑region，外部使用公有云实际区域，内部使用默认值
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationInfo that = (RelationInfo) obj;
        return Objects.equals(this.drNumber, that.drNumber) && Objects.equals(this.testCaseUri, that.testCaseUri)
            && Objects.equals(this.relateType, that.relateType) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.sourceSystem, that.sourceSystem)
            && Objects.equals(this.associationNumber, that.associationNumber)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drNumber, testCaseUri, relateType, resourceType, sourceSystem, associationNumber, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationInfo {\n");
        sb.append("    drNumber: ").append(toIndentedString(drNumber)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    relateType: ").append(toIndentedString(relateType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
        sb.append("    associationNumber: ").append(toIndentedString(associationNumber)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
