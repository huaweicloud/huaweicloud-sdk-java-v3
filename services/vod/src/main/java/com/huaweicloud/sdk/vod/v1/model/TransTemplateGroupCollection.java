package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TransTemplateGroupCollection
 */
public class TransTemplateGroupCollection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_list")

    @JacksonXmlProperty(localName = "template_group_list")

    private List<String> templateGroupList = null;

    public TransTemplateGroupCollection withName(String name) {
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

    public TransTemplateGroupCollection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板组集合描述<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransTemplateGroupCollection withTemplateGroupList(List<String> templateGroupList) {
        this.templateGroupList = templateGroupList;
        return this;
    }

    public TransTemplateGroupCollection addTemplateGroupListItem(String templateGroupListItem) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        this.templateGroupList.add(templateGroupListItem);
        return this;
    }

    public TransTemplateGroupCollection withTemplateGroupList(Consumer<List<String>> templateGroupListSetter) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        templateGroupListSetter.accept(this.templateGroupList);
        return this;
    }

    /**
     * 模板组列表,模板ID<br/> 
     * @return templateGroupList
     */
    public List<String> getTemplateGroupList() {
        return templateGroupList;
    }

    public void setTemplateGroupList(List<String> templateGroupList) {
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
        TransTemplateGroupCollection transTemplateGroupCollection = (TransTemplateGroupCollection) o;
        return Objects.equals(this.name, transTemplateGroupCollection.name)
            && Objects.equals(this.description, transTemplateGroupCollection.description)
            && Objects.equals(this.templateGroupList, transTemplateGroupCollection.templateGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, templateGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransTemplateGroupCollection {\n");
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
