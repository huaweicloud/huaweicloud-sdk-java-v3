package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.NotifyTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNotifyTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template")
    
    private List<NotifyTemplate> template = null;
    
    public ListNotifyTemplateResponse withTemplate(List<NotifyTemplate> template) {
        this.template = template;
        return this;
    }

    
    public ListNotifyTemplateResponse addTemplateItem(NotifyTemplate templateItem) {
        if (this.template == null) {
            this.template = new ArrayList<>();
        }
        this.template.add(templateItem);
        return this;
    }

    public ListNotifyTemplateResponse withTemplate(Consumer<List<NotifyTemplate>> templateSetter) {
        if(this.template == null ){
            this.template = new ArrayList<>();
        }
        templateSetter.accept(this.template);
        return this;
    }

    /**
     * 返回模板组
     * @return template
     */
    public List<NotifyTemplate> getTemplate() {
        return template;
    }

    public void setTemplate(List<NotifyTemplate> template) {
        this.template = template;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNotifyTemplateResponse listNotifyTemplateResponse = (ListNotifyTemplateResponse) o;
        return Objects.equals(this.template, listNotifyTemplateResponse.template);
    }
    @Override
    public int hashCode() {
        return Objects.hash(template);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifyTemplateResponse {\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

