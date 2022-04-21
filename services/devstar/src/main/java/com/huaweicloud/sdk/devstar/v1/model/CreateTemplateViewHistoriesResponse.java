package com.huaweicloud.sdk.devstar.v1.model;

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
public class CreateTemplateViewHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<TemplateViewHistory> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public CreateTemplateViewHistoriesResponse withTemplates(List<TemplateViewHistory> templates) {
        this.templates = templates;
        return this;
    }

    public CreateTemplateViewHistoriesResponse addTemplatesItem(TemplateViewHistory templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public CreateTemplateViewHistoriesResponse withTemplates(Consumer<List<TemplateViewHistory>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 我浏览的模板。
     * @return templates
     */
    public List<TemplateViewHistory> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateViewHistory> templates) {
        this.templates = templates;
    }

    public CreateTemplateViewHistoriesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 我浏览的模板数量。
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemplateViewHistoriesResponse createTemplateViewHistoriesResponse =
            (CreateTemplateViewHistoriesResponse) o;
        return Objects.equals(this.templates, createTemplateViewHistoriesResponse.templates)
            && Objects.equals(this.count, createTemplateViewHistoriesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateViewHistoriesResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
