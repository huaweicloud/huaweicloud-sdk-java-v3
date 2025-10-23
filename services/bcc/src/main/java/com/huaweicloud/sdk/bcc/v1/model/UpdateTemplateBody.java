package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新模板配置
 */
public class UpdateTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_contents")

    private List<TemplateItemEnum> templateContents = null;

    public UpdateTemplateBody withTemplateContents(List<TemplateItemEnum> templateContents) {
        this.templateContents = templateContents;
        return this;
    }

    public UpdateTemplateBody addTemplateContentsItem(TemplateItemEnum templateContentsItem) {
        if (this.templateContents == null) {
            this.templateContents = new ArrayList<>();
        }
        this.templateContents.add(templateContentsItem);
        return this;
    }

    public UpdateTemplateBody withTemplateContents(Consumer<List<TemplateItemEnum>> templateContentsSetter) {
        if (this.templateContents == null) {
            this.templateContents = new ArrayList<>();
        }
        templateContentsSetter.accept(this.templateContents);
        return this;
    }

    /**
     * 模板内容列表
     * @return templateContents
     */
    public List<TemplateItemEnum> getTemplateContents() {
        return templateContents;
    }

    public void setTemplateContents(List<TemplateItemEnum> templateContents) {
        this.templateContents = templateContents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTemplateBody that = (UpdateTemplateBody) obj;
        return Objects.equals(this.templateContents, that.templateContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateContents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplateBody {\n");
        sb.append("    templateContents: ").append(toIndentedString(templateContents)).append("\n");
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
