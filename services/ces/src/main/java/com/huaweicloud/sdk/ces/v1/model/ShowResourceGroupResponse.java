package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    @JacksonXmlProperty(localName = "resources")

    private List<ResourceGroup> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    @JacksonXmlProperty(localName = "meta_data")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowResourceGroupResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称，如：Resource-Group-ECS-01。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowResourceGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组的ID，如：rg1603786526428bWbVmk4rP。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowResourceGroupResponse withResources(List<ResourceGroup> resources) {
        this.resources = resources;
        return this;
    }

    public ShowResourceGroupResponse addResourcesItem(ResourceGroup resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowResourceGroupResponse withResources(Consumer<List<ResourceGroup>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 一组或者多个资源信息。
     * @return resources
     */
    public List<ResourceGroup> getResources() {
        return resources;
    }

    public void setResources(List<ResourceGroup> resources) {
        this.resources = resources;
    }

    public ShowResourceGroupResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源分组的当前状态，值可为health、unhealth、no_alarm_rule；health表示健康，unhealth表示不健康，no_alarm_rule表示未设置告警规则。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowResourceGroupResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源分组的创建时间，UNIX时间戳，单位毫秒；如：1603819753000。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowResourceGroupResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ShowResourceGroupResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public ShowResourceGroupResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 创建资源分组时关联的企业项目，默认值为0，表示企业项目为default。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceGroupResponse showResourceGroupResponse = (ShowResourceGroupResponse) o;
        return Objects.equals(this.groupName, showResourceGroupResponse.groupName)
            && Objects.equals(this.groupId, showResourceGroupResponse.groupId)
            && Objects.equals(this.resources, showResourceGroupResponse.resources)
            && Objects.equals(this.status, showResourceGroupResponse.status)
            && Objects.equals(this.createTime, showResourceGroupResponse.createTime)
            && Objects.equals(this.metaData, showResourceGroupResponse.metaData)
            && Objects.equals(this.enterpriseProjectId, showResourceGroupResponse.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupId, resources, status, createTime, metaData, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceGroupResponse {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
