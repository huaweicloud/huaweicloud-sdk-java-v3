package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * QueryCorpGroupDTO
 */
public class QueryCorpGroupDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupId")

    @JacksonXmlProperty(localName = "groupId")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupName")

    @JacksonXmlProperty(localName = "groupName")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupType")

    @JacksonXmlProperty(localName = "groupType")

    private Integer groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    @JacksonXmlProperty(localName = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    @JacksonXmlProperty(localName = "regionId")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    public QueryCorpGroupDTO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组Id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public QueryCorpGroupDTO withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public QueryCorpGroupDTO withGroupType(Integer groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 分组类型
     * @return groupType
     */
    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public QueryCorpGroupDTO withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 分组备注信息
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public QueryCorpGroupDTO withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID，仅服务列表类型场景必填
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public QueryCorpGroupDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 分组状态 - 0: 正常 - 1: 停用，服务列表类型停用后创建企业就不会再自动分配到该分组 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCorpGroupDTO queryCorpGroupDTO = (QueryCorpGroupDTO) o;
        return Objects.equals(this.groupId, queryCorpGroupDTO.groupId)
            && Objects.equals(this.groupName, queryCorpGroupDTO.groupName)
            && Objects.equals(this.groupType, queryCorpGroupDTO.groupType)
            && Objects.equals(this.remarks, queryCorpGroupDTO.remarks)
            && Objects.equals(this.regionId, queryCorpGroupDTO.regionId)
            && Objects.equals(this.status, queryCorpGroupDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, groupType, remarks, regionId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCorpGroupDTO {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
