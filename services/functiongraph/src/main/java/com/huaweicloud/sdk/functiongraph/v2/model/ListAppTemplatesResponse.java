package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListAppTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<ListAppTemplatesResult> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Long nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListAppTemplatesResponse withTemplates(List<ListAppTemplatesResult> templates) {
        this.templates = templates;
        return this;
    }

    public ListAppTemplatesResponse addTemplatesItem(ListAppTemplatesResult templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListAppTemplatesResponse withTemplates(Consumer<List<ListAppTemplatesResult>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 函数应用程序模板列表
     * @return templates
     */
    public List<ListAppTemplatesResult> getTemplates() {
        return templates;
    }

    public void setTemplates(List<ListAppTemplatesResult> templates) {
        this.templates = templates;
    }

    public ListAppTemplatesResponse withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次读取位置
     * @return nextMarker
     */
    public Long getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListAppTemplatesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 应用程序模板总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppTemplatesResponse that = (ListAppTemplatesResponse) obj;
        return Objects.equals(this.templates, that.templates) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, nextMarker, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppTemplatesResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
