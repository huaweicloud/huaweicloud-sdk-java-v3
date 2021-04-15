package com.huaweicloud.sdk.devstar.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.TemplateViewHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTemplateViewHistoriesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templates")
    
    private List<TemplateViewHistory> templates = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListTemplateViewHistoriesResponse withTemplates(List<TemplateViewHistory> templates) {
        this.templates = templates;
        return this;
    }

    
    public ListTemplateViewHistoriesResponse addTemplatesItem(TemplateViewHistory templatesItem) {
        if(this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListTemplateViewHistoriesResponse withTemplates(Consumer<List<TemplateViewHistory>> templatesSetter) {
        if(this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 我浏览的模板
     * @return templates
     */
    public List<TemplateViewHistory> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateViewHistory> templates) {
        this.templates = templates;
    }

    

    public ListTemplateViewHistoriesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 我浏览的模板数量
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
        ListTemplateViewHistoriesResponse listTemplateViewHistoriesResponse = (ListTemplateViewHistoriesResponse) o;
        return Objects.equals(this.templates, listTemplateViewHistoriesResponse.templates) &&
            Objects.equals(this.count, listTemplateViewHistoriesResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templates, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateViewHistoriesResponse {\n");
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

