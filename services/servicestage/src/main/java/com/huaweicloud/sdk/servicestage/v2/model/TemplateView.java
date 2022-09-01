package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 模板参数。
 */
public class TemplateView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    @JacksonXmlProperty(localName = "template_name")

    private Template templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_desc")

    @JacksonXmlProperty(localName = "template_desc")

    private String templateDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    @JacksonXmlProperty(localName = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repo_url")

    @JacksonXmlProperty(localName = "source_repo_url")

    private String sourceRepoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    @JacksonXmlProperty(localName = "runtime")

    private RuntimeType runtime;

    public TemplateView withTemplateName(Template templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Get templateName
     * @return templateName
     */
    public Template getTemplateName() {
        return templateName;
    }

    public void setTemplateName(Template templateName) {
        this.templateName = templateName;
    }

    public TemplateView withTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }

    /**
     * 模板描述。
     * @return templateDesc
     */
    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

    public TemplateView withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 模板类别。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public TemplateView withSourceRepoUrl(String sourceRepoUrl) {
        this.sourceRepoUrl = sourceRepoUrl;
        return this;
    }

    /**
     * 源码仓库URL
     * @return sourceRepoUrl
     */
    public String getSourceRepoUrl() {
        return sourceRepoUrl;
    }

    public void setSourceRepoUrl(String sourceRepoUrl) {
        this.sourceRepoUrl = sourceRepoUrl;
    }

    public TemplateView withRuntime(RuntimeType runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public RuntimeType getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeType runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateView templateView = (TemplateView) o;
        return Objects.equals(this.templateName, templateView.templateName)
            && Objects.equals(this.templateDesc, templateView.templateDesc)
            && Objects.equals(this.sourceType, templateView.sourceType)
            && Objects.equals(this.sourceRepoUrl, templateView.sourceRepoUrl)
            && Objects.equals(this.runtime, templateView.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDesc, sourceType, sourceRepoUrl, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateView {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceRepoUrl: ").append(toIndentedString(sourceRepoUrl)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
