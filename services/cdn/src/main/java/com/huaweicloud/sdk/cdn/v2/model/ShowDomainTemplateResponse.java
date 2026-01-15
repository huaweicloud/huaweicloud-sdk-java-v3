package com.huaweicloud.sdk.cdn.v2.model;

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
public class ShowDomainTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<TemplateItem> templates = null;

    public ShowDomainTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 查询域名模板总数 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowDomainTemplateResponse withTemplates(List<TemplateItem> templates) {
        this.templates = templates;
        return this;
    }

    public ShowDomainTemplateResponse addTemplatesItem(TemplateItem templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ShowDomainTemplateResponse withTemplates(Consumer<List<TemplateItem>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * Get templates
     * @return templates
     */
    public List<TemplateItem> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateItem> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainTemplateResponse that = (ShowDomainTemplateResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
