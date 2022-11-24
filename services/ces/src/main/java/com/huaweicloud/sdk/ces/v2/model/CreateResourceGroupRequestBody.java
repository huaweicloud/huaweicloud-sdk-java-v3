package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateResourceGroupRequestBody
 */
public class CreateResourceGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_ep_ids")

    private List<String> associationEpIds = null;

    public CreateResourceGroupRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称，只能为字母、数字、汉字、-、_，最大长度为128
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateResourceGroupRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源分组归属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateResourceGroupRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源分组创建方式，取值只能为EPS（同步企业项目）,TAG（标签动态匹配）,不传为手动添加
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateResourceGroupRequestBody withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public CreateResourceGroupRequestBody addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateResourceGroupRequestBody withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签动态匹配时的关联标签,type为TAG时必传
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    public CreateResourceGroupRequestBody withAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
        return this;
    }

    public CreateResourceGroupRequestBody addAssociationEpIdsItem(String associationEpIdsItem) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        this.associationEpIds.add(associationEpIdsItem);
        return this;
    }

    public CreateResourceGroupRequestBody withAssociationEpIds(Consumer<List<String>> associationEpIdsSetter) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        associationEpIdsSetter.accept(this.associationEpIds);
        return this;
    }

    /**
     * 该资源分组内包含的资源来源的企业项目ID，type为EPS时必传
     * @return associationEpIds
     */
    public List<String> getAssociationEpIds() {
        return associationEpIds;
    }

    public void setAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResourceGroupRequestBody createResourceGroupRequestBody = (CreateResourceGroupRequestBody) o;
        return Objects.equals(this.groupName, createResourceGroupRequestBody.groupName)
            && Objects.equals(this.enterpriseProjectId, createResourceGroupRequestBody.enterpriseProjectId)
            && Objects.equals(this.type, createResourceGroupRequestBody.type)
            && Objects.equals(this.tags, createResourceGroupRequestBody.tags)
            && Objects.equals(this.associationEpIds, createResourceGroupRequestBody.associationEpIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, enterpriseProjectId, type, tags, associationEpIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceGroupRequestBody {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    associationEpIds: ").append(toIndentedString(associationEpIds)).append("\n");
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
