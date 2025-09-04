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
public class ListDeviceAuthenticationTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<AuthenticationTemplateSimple> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceAuthenticationTemplatesResponse withTemplates(List<AuthenticationTemplateSimple> templates) {
        this.templates = templates;
        return this;
    }

    public ListDeviceAuthenticationTemplatesResponse addTemplatesItem(AuthenticationTemplateSimple templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListDeviceAuthenticationTemplatesResponse withTemplates(
        Consumer<List<AuthenticationTemplateSimple>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * **参数说明**：鉴权模板详情列表。
     * @return templates
     */
    public List<AuthenticationTemplateSimple> getTemplates() {
        return templates;
    }

    public void setTemplates(List<AuthenticationTemplateSimple> templates) {
        this.templates = templates;
    }

    public ListDeviceAuthenticationTemplatesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceAuthenticationTemplatesResponse withPage(Consumer<Page> pageSetter) {
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
        ListDeviceAuthenticationTemplatesResponse that = (ListDeviceAuthenticationTemplatesResponse) obj;
        return Objects.equals(this.templates, that.templates) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceAuthenticationTemplatesResponse {\n");
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
