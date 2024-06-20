package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListProvisioningTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<ProvisioningTemplateSimple> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListProvisioningTemplatesResponse withTemplates(List<ProvisioningTemplateSimple> templates) {
        this.templates = templates;
        return this;
    }

    public ListProvisioningTemplatesResponse addTemplatesItem(ProvisioningTemplateSimple templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListProvisioningTemplatesResponse withTemplates(Consumer<List<ProvisioningTemplateSimple>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * **参数说明**：预调配模板详情。
     * @return templates
     */
    public List<ProvisioningTemplateSimple> getTemplates() {
        return templates;
    }

    public void setTemplates(List<ProvisioningTemplateSimple> templates) {
        this.templates = templates;
    }

    public ListProvisioningTemplatesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListProvisioningTemplatesResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProvisioningTemplatesResponse that = (ListProvisioningTemplatesResponse) obj;
        return Objects.equals(this.templates, that.templates) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvisioningTemplatesResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
