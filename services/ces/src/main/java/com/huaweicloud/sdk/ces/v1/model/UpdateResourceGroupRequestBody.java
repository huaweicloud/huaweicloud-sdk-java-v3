package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新资源分组，请求参数。
 */
public class UpdateResourceGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<CreateResourceGroup> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    public UpdateResourceGroupRequestBody withGroupName(String groupName) {
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

    public UpdateResourceGroupRequestBody withResources(List<CreateResourceGroup> resources) {
        this.resources = resources;
        return this;
    }

    public UpdateResourceGroupRequestBody addResourcesItem(CreateResourceGroup resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public UpdateResourceGroupRequestBody withResources(Consumer<List<CreateResourceGroup>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释** 手动创建时的资源详情。 **约束限制** 不超过1000个资源。 
     * @return resources
     */
    public List<CreateResourceGroup> getResources() {
        return resources;
    }

    public void setResources(List<CreateResourceGroup> resources) {
        this.resources = resources;
    }

    public UpdateResourceGroupRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 资源分组添加资源方式 **约束限制** 不涉及 **取值范围** 取值只能为EPS（同步企业项目），TAG（标签动态匹配），不传为手动添加。 **默认取值** 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateResourceGroupRequestBody withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public UpdateResourceGroupRequestBody addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public UpdateResourceGroupRequestBody withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * **参数解释** 该资源分组内包含的资源来源的企业项目ID。 **约束限制** type为EPS时必传，不超过50个企业项目ID。 
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public UpdateResourceGroupRequestBody withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateResourceGroupRequestBody addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateResourceGroupRequestBody withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 标签动态匹配时的关联标签。 **约束限制** type为TAG时必传，不超过50个标签。 
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResourceGroupRequestBody that = (UpdateResourceGroupRequestBody) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.type, that.type) && Objects.equals(this.relationIds, that.relationIds)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, resources, type, relationIds, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceGroupRequestBody {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
