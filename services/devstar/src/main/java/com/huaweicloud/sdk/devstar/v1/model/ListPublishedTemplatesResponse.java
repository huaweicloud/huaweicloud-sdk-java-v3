package com.huaweicloud.sdk.devstar.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.TemplateSimpleInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPublishedTemplatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templates")
    
    private List<TemplateSimpleInfo> templates = null;
    
    public ListPublishedTemplatesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 返回模板的数量
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPublishedTemplatesResponse withTemplates(List<TemplateSimpleInfo> templates) {
        this.templates = templates;
        return this;
    }

    
    public ListPublishedTemplatesResponse addTemplatesItem(TemplateSimpleInfo templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListPublishedTemplatesResponse withTemplates(Consumer<List<TemplateSimpleInfo>> templatesSetter) {
        if(this.templates == null ){
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 返回模板的列表
     * @return templates
     */
    public List<TemplateSimpleInfo> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateSimpleInfo> templates) {
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
        ListPublishedTemplatesResponse listPublishedTemplatesResponse = (ListPublishedTemplatesResponse) o;
        return Objects.equals(this.count, listPublishedTemplatesResponse.count) &&
            Objects.equals(this.templates, listPublishedTemplatesResponse.templates);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, templates);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublishedTemplatesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

