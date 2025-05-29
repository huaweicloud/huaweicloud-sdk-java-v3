package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ShowImageTemplateListResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_templates")

    private List<ShowImageTemplateListResponseBodyResultImageTemplates> imageTemplates = null;

    public ShowImageTemplateListResponseBodyResult withImageTemplates(
        List<ShowImageTemplateListResponseBodyResultImageTemplates> imageTemplates) {
        this.imageTemplates = imageTemplates;
        return this;
    }

    public ShowImageTemplateListResponseBodyResult addImageTemplatesItem(
        ShowImageTemplateListResponseBodyResultImageTemplates imageTemplatesItem) {
        if (this.imageTemplates == null) {
            this.imageTemplates = new ArrayList<>();
        }
        this.imageTemplates.add(imageTemplatesItem);
        return this;
    }

    public ShowImageTemplateListResponseBodyResult withImageTemplates(
        Consumer<List<ShowImageTemplateListResponseBodyResultImageTemplates>> imageTemplatesSetter) {
        if (this.imageTemplates == null) {
            this.imageTemplates = new ArrayList<>();
        }
        imageTemplatesSetter.accept(this.imageTemplates);
        return this;
    }

    /**
     * 镜像模版列表
     * @return imageTemplates
     */
    public List<ShowImageTemplateListResponseBodyResultImageTemplates> getImageTemplates() {
        return imageTemplates;
    }

    public void setImageTemplates(List<ShowImageTemplateListResponseBodyResultImageTemplates> imageTemplates) {
        this.imageTemplates = imageTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageTemplateListResponseBodyResult that = (ShowImageTemplateListResponseBodyResult) obj;
        return Objects.equals(this.imageTemplates, that.imageTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageTemplateListResponseBodyResult {\n");
        sb.append("    imageTemplates: ").append(toIndentedString(imageTemplates)).append("\n");
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
