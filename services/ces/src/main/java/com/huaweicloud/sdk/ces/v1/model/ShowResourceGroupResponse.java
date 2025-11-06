package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceGroup> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusSchema status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowResourceGroupResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释** 资源分组的名称 **约束限制** 不涉及 **取值范围** 只能为字母、数字、汉字、-或_，长度为[1,128]个字符 **默认取值** 不涉及 
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
     * **参数解释**： 资源分组ID     **约束限制**： 不涉及。  **取值范围**： 以rg开头，后跟22位由字母或数字组成的字符串。长度为[2,24]个字符。       **默认取值**： 不涉及。 
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
     * **参数解释** 创建的资源分组选择一个或者多个资源。 **约束限制** 不超过1000个资源。 
     * @return resources
     */
    public List<ResourceGroup> getResources() {
        return resources;
    }

    public void setResources(List<ResourceGroup> resources) {
        this.resources = resources;
    }

    public ShowResourceGroupResponse withStatus(StatusSchema status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusSchema getStatus() {
        return status;
    }

    public void setStatus(StatusSchema status) {
        this.status = status;
    }

    public ShowResourceGroupResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 资源分组的创建时间，UNIX时间戳，单位毫秒；如：1603819753000。     **约束限制**： 不涉及。  **取值范围**： 在[1,9223372036854775807]区间内 **默认取值**： 不涉及。 
     * minimum: 1
     * maximum: 9223372036854775807
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
     * **参数解释**： 创建资源分组时关联的企业项目，默认值为0，表示企业项目为default。     **约束限制**： 不涉及。  **取值范围**： 由数字、字母和-组成，或者为0（默认企业项目ID）。 **默认取值**： 不涉及。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceGroupResponse that = (ShowResourceGroupResponse) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.metaData, that.metaData)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
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
