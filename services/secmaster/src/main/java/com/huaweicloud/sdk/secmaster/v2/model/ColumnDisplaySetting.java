package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表格列展示设置
 */
public class ColumnDisplaySetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_required")

    private Boolean mappingRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_sequence_number")

    private Integer groupSequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intra_group_sequence_number")

    private Integer intraGroupSequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_qualified")

    private String valueQualified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_description")

    private String displayDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public ColumnDisplaySetting withMappingRequired(Boolean mappingRequired) {
        this.mappingRequired = mappingRequired;
        return this;
    }

    /**
     * 映射是否必填
     * @return mappingRequired
     */
    public Boolean getMappingRequired() {
        return mappingRequired;
    }

    public void setMappingRequired(Boolean mappingRequired) {
        this.mappingRequired = mappingRequired;
    }

    public ColumnDisplaySetting withGroupSequenceNumber(Integer groupSequenceNumber) {
        this.groupSequenceNumber = groupSequenceNumber;
        return this;
    }

    /**
     * 组顺序编号
     * minimum: 0
     * maximum: 100
     * @return groupSequenceNumber
     */
    public Integer getGroupSequenceNumber() {
        return groupSequenceNumber;
    }

    public void setGroupSequenceNumber(Integer groupSequenceNumber) {
        this.groupSequenceNumber = groupSequenceNumber;
    }

    public ColumnDisplaySetting withIntraGroupSequenceNumber(Integer intraGroupSequenceNumber) {
        this.intraGroupSequenceNumber = intraGroupSequenceNumber;
        return this;
    }

    /**
     * 组内顺序编号
     * minimum: 0
     * maximum: 100
     * @return intraGroupSequenceNumber
     */
    public Integer getIntraGroupSequenceNumber() {
        return intraGroupSequenceNumber;
    }

    public void setIntraGroupSequenceNumber(Integer intraGroupSequenceNumber) {
        this.intraGroupSequenceNumber = intraGroupSequenceNumber;
    }

    public ColumnDisplaySetting withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 值类型
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public ColumnDisplaySetting withValueQualified(String valueQualified) {
        this.valueQualified = valueQualified;
        return this;
    }

    /**
     * 合法值
     * @return valueQualified
     */
    public String getValueQualified() {
        return valueQualified;
    }

    public void setValueQualified(String valueQualified) {
        this.valueQualified = valueQualified;
    }

    public ColumnDisplaySetting withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ColumnDisplaySetting withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * 显示描述
     * @return displayDescription
     */
    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public ColumnDisplaySetting withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnDisplaySetting that = (ColumnDisplaySetting) obj;
        return Objects.equals(this.mappingRequired, that.mappingRequired)
            && Objects.equals(this.groupSequenceNumber, that.groupSequenceNumber)
            && Objects.equals(this.intraGroupSequenceNumber, that.intraGroupSequenceNumber)
            && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.valueQualified, that.valueQualified)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.displayDescription, that.displayDescription)
            && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mappingRequired,
            groupSequenceNumber,
            intraGroupSequenceNumber,
            valueType,
            valueQualified,
            displayName,
            displayDescription,
            groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnDisplaySetting {\n");
        sb.append("    mappingRequired: ").append(toIndentedString(mappingRequired)).append("\n");
        sb.append("    groupSequenceNumber: ").append(toIndentedString(groupSequenceNumber)).append("\n");
        sb.append("    intraGroupSequenceNumber: ").append(toIndentedString(intraGroupSequenceNumber)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    valueQualified: ").append(toIndentedString(valueQualified)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
