package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源分组修改请求体
 */
public class PutResourceGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    public PutResourceGroupReq withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组名称，只能为字母、数字、汉字、-、_，最大长度为128
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public PutResourceGroupReq withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public PutResourceGroupReq addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PutResourceGroupReq withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutResourceGroupReq that = (PutResourceGroupReq) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutResourceGroupReq {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
