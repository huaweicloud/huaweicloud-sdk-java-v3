package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 智能信息基础版模板状态查询返回体。
 */
public class ListVmsTemplateStatusResponseMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<VmsTemplateStatus> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListVmsTemplateStatusResponseMode withTemplates(List<VmsTemplateStatus> templates) {
        this.templates = templates;
        return this;
    }

    public ListVmsTemplateStatusResponseMode addTemplatesItem(VmsTemplateStatus templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListVmsTemplateStatusResponseMode withTemplates(Consumer<List<VmsTemplateStatus>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 智能信息基础版模板列表。
     * @return templates
     */
    public List<VmsTemplateStatus> getTemplates() {
        return templates;
    }

    public void setTemplates(List<VmsTemplateStatus> templates) {
        this.templates = templates;
    }

    public ListVmsTemplateStatusResponseMode withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVmsTemplateStatusResponseMode withPageInfo(Consumer<Page> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new Page();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public Page getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVmsTemplateStatusResponseMode listVmsTemplateStatusResponseMode = (ListVmsTemplateStatusResponseMode) o;
        return Objects.equals(this.templates, listVmsTemplateStatusResponseMode.templates)
            && Objects.equals(this.pageInfo, listVmsTemplateStatusResponseMode.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsTemplateStatusResponseMode {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
