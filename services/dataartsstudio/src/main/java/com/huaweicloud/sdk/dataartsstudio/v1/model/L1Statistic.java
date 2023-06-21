package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * L1Statistic
 */
public class L1Statistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_group_name")

    private String subjectAreaGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_group_name_en")

    private String subjectAreaGroupNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_group_guid")

    private String subjectAreaGroupGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_count")

    private Integer subjectAreaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_object_count")

    private Integer businessObjectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_entity_count")

    private Integer logicEntityCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_area_statistics")

    private List<L2Statistic> subjectAreaStatistics = null;

    public L1Statistic withSubjectAreaGroupName(String subjectAreaGroupName) {
        this.subjectAreaGroupName = subjectAreaGroupName;
        return this;
    }

    /**
     * 主题域分组名称
     * @return subjectAreaGroupName
     */
    public String getSubjectAreaGroupName() {
        return subjectAreaGroupName;
    }

    public void setSubjectAreaGroupName(String subjectAreaGroupName) {
        this.subjectAreaGroupName = subjectAreaGroupName;
    }

    public L1Statistic withSubjectAreaGroupNameEn(String subjectAreaGroupNameEn) {
        this.subjectAreaGroupNameEn = subjectAreaGroupNameEn;
        return this;
    }

    /**
     * 主题域分组英文名称
     * @return subjectAreaGroupNameEn
     */
    public String getSubjectAreaGroupNameEn() {
        return subjectAreaGroupNameEn;
    }

    public void setSubjectAreaGroupNameEn(String subjectAreaGroupNameEn) {
        this.subjectAreaGroupNameEn = subjectAreaGroupNameEn;
    }

    public L1Statistic withSubjectAreaGroupGuid(String subjectAreaGroupGuid) {
        this.subjectAreaGroupGuid = subjectAreaGroupGuid;
        return this;
    }

    /**
     * 主题域分组的guid
     * @return subjectAreaGroupGuid
     */
    public String getSubjectAreaGroupGuid() {
        return subjectAreaGroupGuid;
    }

    public void setSubjectAreaGroupGuid(String subjectAreaGroupGuid) {
        this.subjectAreaGroupGuid = subjectAreaGroupGuid;
    }

    public L1Statistic withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 主题域分组序号
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public L1Statistic withSubjectAreaCount(Integer subjectAreaCount) {
        this.subjectAreaCount = subjectAreaCount;
        return this;
    }

    /**
     * 主题总数
     * @return subjectAreaCount
     */
    public Integer getSubjectAreaCount() {
        return subjectAreaCount;
    }

    public void setSubjectAreaCount(Integer subjectAreaCount) {
        this.subjectAreaCount = subjectAreaCount;
    }

    public L1Statistic withBusinessObjectCount(Integer businessObjectCount) {
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

    public L1Statistic withLogicEntityCount(Integer logicEntityCount) {
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

    public L1Statistic withSubjectAreaStatistics(List<L2Statistic> subjectAreaStatistics) {
        this.subjectAreaStatistics = subjectAreaStatistics;
        return this;
    }

    public L1Statistic addSubjectAreaStatisticsItem(L2Statistic subjectAreaStatisticsItem) {
        if (this.subjectAreaStatistics == null) {
            this.subjectAreaStatistics = new ArrayList<>();
        }
        this.subjectAreaStatistics.add(subjectAreaStatisticsItem);
        return this;
    }

    public L1Statistic withSubjectAreaStatistics(Consumer<List<L2Statistic>> subjectAreaStatisticsSetter) {
        if (this.subjectAreaStatistics == null) {
            this.subjectAreaStatistics = new ArrayList<>();
        }
        subjectAreaStatisticsSetter.accept(this.subjectAreaStatistics);
        return this;
    }

    /**
     * 主题统计信息
     * @return subjectAreaStatistics
     */
    public List<L2Statistic> getSubjectAreaStatistics() {
        return subjectAreaStatistics;
    }

    public void setSubjectAreaStatistics(List<L2Statistic> subjectAreaStatistics) {
        this.subjectAreaStatistics = subjectAreaStatistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L1Statistic l1Statistic = (L1Statistic) o;
        return Objects.equals(this.subjectAreaGroupName, l1Statistic.subjectAreaGroupName)
            && Objects.equals(this.subjectAreaGroupNameEn, l1Statistic.subjectAreaGroupNameEn)
            && Objects.equals(this.subjectAreaGroupGuid, l1Statistic.subjectAreaGroupGuid)
            && Objects.equals(this.ordinal, l1Statistic.ordinal)
            && Objects.equals(this.subjectAreaCount, l1Statistic.subjectAreaCount)
            && Objects.equals(this.businessObjectCount, l1Statistic.businessObjectCount)
            && Objects.equals(this.logicEntityCount, l1Statistic.logicEntityCount)
            && Objects.equals(this.subjectAreaStatistics, l1Statistic.subjectAreaStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectAreaGroupName,
            subjectAreaGroupNameEn,
            subjectAreaGroupGuid,
            ordinal,
            subjectAreaCount,
            businessObjectCount,
            logicEntityCount,
            subjectAreaStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L1Statistic {\n");
        sb.append("    subjectAreaGroupName: ").append(toIndentedString(subjectAreaGroupName)).append("\n");
        sb.append("    subjectAreaGroupNameEn: ").append(toIndentedString(subjectAreaGroupNameEn)).append("\n");
        sb.append("    subjectAreaGroupGuid: ").append(toIndentedString(subjectAreaGroupGuid)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    subjectAreaCount: ").append(toIndentedString(subjectAreaCount)).append("\n");
        sb.append("    businessObjectCount: ").append(toIndentedString(businessObjectCount)).append("\n");
        sb.append("    logicEntityCount: ").append(toIndentedString(logicEntityCount)).append("\n");
        sb.append("    subjectAreaStatistics: ").append(toIndentedString(subjectAreaStatistics)).append("\n");
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
