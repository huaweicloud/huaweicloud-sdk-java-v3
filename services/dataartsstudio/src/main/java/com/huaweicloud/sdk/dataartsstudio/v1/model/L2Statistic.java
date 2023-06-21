package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * L2Statistic
 */
public class L2Statistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_name")

    private String subjectAreaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_guid")

    private String subjectAreaGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_object_count")

    private Integer businessObjectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_entity_count")

    private Integer logicEntityCount;

    public L2Statistic withSubjectAreaName(String subjectAreaName) {
        this.subjectAreaName = subjectAreaName;
        return this;
    }

    /**
     * 主题名称
     * @return subjectAreaName
     */
    public String getSubjectAreaName() {
        return subjectAreaName;
    }

    public void setSubjectAreaName(String subjectAreaName) {
        this.subjectAreaName = subjectAreaName;
    }

    public L2Statistic withSubjectAreaGuid(String subjectAreaGuid) {
        this.subjectAreaGuid = subjectAreaGuid;
        return this;
    }

    /**
     * 主题的guid
     * @return subjectAreaGuid
     */
    public String getSubjectAreaGuid() {
        return subjectAreaGuid;
    }

    public void setSubjectAreaGuid(String subjectAreaGuid) {
        this.subjectAreaGuid = subjectAreaGuid;
    }

    public L2Statistic withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 主题序号
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public L2Statistic withBusinessObjectCount(Integer businessObjectCount) {
        this.businessObjectCount = businessObjectCount;
        return this;
    }

    /**
     * 业务对象总数
     * @return businessObjectCount
     */
    public Integer getBusinessObjectCount() {
        return businessObjectCount;
    }

    public void setBusinessObjectCount(Integer businessObjectCount) {
        this.businessObjectCount = businessObjectCount;
    }

    public L2Statistic withLogicEntityCount(Integer logicEntityCount) {
        this.logicEntityCount = logicEntityCount;
        return this;
    }

    /**
     * 逻辑实体总数
     * @return logicEntityCount
     */
    public Integer getLogicEntityCount() {
        return logicEntityCount;
    }

    public void setLogicEntityCount(Integer logicEntityCount) {
        this.logicEntityCount = logicEntityCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L2Statistic l2Statistic = (L2Statistic) o;
        return Objects.equals(this.subjectAreaName, l2Statistic.subjectAreaName)
            && Objects.equals(this.subjectAreaGuid, l2Statistic.subjectAreaGuid)
            && Objects.equals(this.ordinal, l2Statistic.ordinal)
            && Objects.equals(this.businessObjectCount, l2Statistic.businessObjectCount)
            && Objects.equals(this.logicEntityCount, l2Statistic.logicEntityCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectAreaName, subjectAreaGuid, ordinal, businessObjectCount, logicEntityCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L2Statistic {\n");
        sb.append("    subjectAreaName: ").append(toIndentedString(subjectAreaName)).append("\n");
        sb.append("    subjectAreaGuid: ").append(toIndentedString(subjectAreaGuid)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    businessObjectCount: ").append(toIndentedString(businessObjectCount)).append("\n");
        sb.append("    logicEntityCount: ").append(toIndentedString(logicEntityCount)).append("\n");
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
