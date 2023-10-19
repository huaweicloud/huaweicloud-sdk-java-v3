package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListConfigTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_num")

    private Integer templateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<ConfigTemplatesListInfo> templates = null;

    public ListConfigTemplatesResponse withTemplateNum(Integer templateNum) {
        this.templateNum = templateNum;
        return this;
    }

    /**
     * 模板个数。
     * @return templateNum
     */
    public Integer getTemplateNum() {
        return templateNum;
    }

    public void setTemplateNum(Integer templateNum) {
        this.templateNum = templateNum;
    }

    public ListConfigTemplatesResponse withTemplates(List<ConfigTemplatesListInfo> templates) {
        this.templates = templates;
        return this;
    }

    public ListConfigTemplatesResponse addTemplatesItem(ConfigTemplatesListInfo templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListConfigTemplatesResponse withTemplates(Consumer<List<ConfigTemplatesListInfo>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 模板的详情数组。
     * @return templates
     */
    public List<ConfigTemplatesListInfo> getTemplates() {
        return templates;
    }

    public void setTemplates(List<ConfigTemplatesListInfo> templates) {
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
        ListConfigTemplatesResponse that = (ListConfigTemplatesResponse) obj;
        return Objects.equals(this.templateNum, that.templateNum) && Objects.equals(this.templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateNum, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigTemplatesResponse {\n");
        sb.append("    templateNum: ").append(toIndentedString(templateNum)).append("\n");
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
