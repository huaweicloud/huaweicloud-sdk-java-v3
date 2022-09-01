package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除通知模板参数体
 */
public class DeleteNotificationTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_names")

    @JacksonXmlProperty(localName = "template_names")

    private List<String> templateNames = null;

    public DeleteNotificationTemplateBody withTemplateNames(List<String> templateNames) {
        this.templateNames = templateNames;
        return this;
    }

    public DeleteNotificationTemplateBody addTemplateNamesItem(String templateNamesItem) {
        if (this.templateNames == null) {
            this.templateNames = new ArrayList<>();
        }
        this.templateNames.add(templateNamesItem);
        return this;
    }

    public DeleteNotificationTemplateBody withTemplateNames(Consumer<List<String>> templateNamesSetter) {
        if (this.templateNames == null) {
            this.templateNames = new ArrayList<>();
        }
        templateNamesSetter.accept(this.templateNames);
        return this;
    }

    /**
     * 待删除模板名称数组
     * @return templateNames
     */
    public List<String> getTemplateNames() {
        return templateNames;
    }

    public void setTemplateNames(List<String> templateNames) {
        this.templateNames = templateNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteNotificationTemplateBody deleteNotificationTemplateBody = (DeleteNotificationTemplateBody) o;
        return Objects.equals(this.templateNames, deleteNotificationTemplateBody.templateNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNotificationTemplateBody {\n");
        sb.append("    templateNames: ").append(toIndentedString(templateNames)).append("\n");
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
