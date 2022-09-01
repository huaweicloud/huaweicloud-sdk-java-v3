package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ListTemplatesRespList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    @JacksonXmlProperty(localName = "templates")

    private List<ListTemplatesRespPayloadTemplates> templates = null;

    public ListTemplatesRespList withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 模板总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListTemplatesRespList withTemplates(List<ListTemplatesRespPayloadTemplates> templates) {
        this.templates = templates;
        return this;
    }

    public ListTemplatesRespList addTemplatesItem(ListTemplatesRespPayloadTemplates templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListTemplatesRespList withTemplates(Consumer<List<ListTemplatesRespPayloadTemplates>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 模板详细信息
     * @return templates
     */
    public List<ListTemplatesRespPayloadTemplates> getTemplates() {
        return templates;
    }

    public void setTemplates(List<ListTemplatesRespPayloadTemplates> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplatesRespList listTemplatesRespList = (ListTemplatesRespList) o;
        return Objects.equals(this.totalCount, listTemplatesRespList.totalCount)
            && Objects.equals(this.templates, listTemplatesRespList.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesRespList {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
