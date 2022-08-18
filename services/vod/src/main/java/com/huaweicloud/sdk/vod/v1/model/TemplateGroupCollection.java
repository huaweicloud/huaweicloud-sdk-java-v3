package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateGroupCollection
 */
public class TemplateGroupCollection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_collection_id")

    private String groupCollectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_list")

    private List<TemplateGroup> templateGroupList = null;

    public TemplateGroupCollection withGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
        return this;
    }

    /**
     * 模板组集合id<br/> 
     * @return groupCollectionId
     */
    public String getGroupCollectionId() {
        return groupCollectionId;
    }

    public void setGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
    }

    public TemplateGroupCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板组集合名称<br/> 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateGroupCollection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板介绍<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateGroupCollection withTemplateGroupList(List<TemplateGroup> templateGroupList) {
        this.templateGroupList = templateGroupList;
        return this;
    }

    public TemplateGroupCollection addTemplateGroupListItem(TemplateGroup templateGroupListItem) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        this.templateGroupList.add(templateGroupListItem);
        return this;
    }

    public TemplateGroupCollection withTemplateGroupList(Consumer<List<TemplateGroup>> templateGroupListSetter) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        templateGroupListSetter.accept(this.templateGroupList);
        return this;
    }

    /**
     * 转码组列表<br/> 
     * @return templateGroupList
     */
    public List<TemplateGroup> getTemplateGroupList() {
        return templateGroupList;
    }

    public void setTemplateGroupList(List<TemplateGroup> templateGroupList) {
        this.templateGroupList = templateGroupList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateGroupCollection templateGroupCollection = (TemplateGroupCollection) o;
        return Objects.equals(this.groupCollectionId, templateGroupCollection.groupCollectionId)
            && Objects.equals(this.name, templateGroupCollection.name)
            && Objects.equals(this.description, templateGroupCollection.description)
            && Objects.equals(this.templateGroupList, templateGroupCollection.templateGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupCollectionId, name, description, templateGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateGroupCollection {\n");
        sb.append("    groupCollectionId: ").append(toIndentedString(groupCollectionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    templateGroupList: ").append(toIndentedString(templateGroupList)).append("\n");
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
