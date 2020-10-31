package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.Template;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTemplatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private String count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templates")
    
    private List<Template> templates = null;
    
    public ShowTemplatesResponse withCount(String count) {
        this.count = count;
        return this;
    }

    


    /**
     * 模板个数
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowTemplatesResponse withTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

    
    public ShowTemplatesResponse addTemplatesItem(Template templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ShowTemplatesResponse withTemplates(Consumer<List<Template>> templatesSetter) {
        if(this.templates == null ){
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 模板信息
     * @return templates
     */
    public List<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Template> templates) {
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
        ShowTemplatesResponse showTemplatesResponse = (ShowTemplatesResponse) o;
        return Objects.equals(this.count, showTemplatesResponse.count) &&
            Objects.equals(this.templates, showTemplatesResponse.templates);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, templates);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplatesResponse {\n");
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

