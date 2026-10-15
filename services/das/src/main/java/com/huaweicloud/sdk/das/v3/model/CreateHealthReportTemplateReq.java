package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateHealthReportTemplateReq
 */
public class CreateHealthReportTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chapters_config")

    private Map<String, ChapterConfigReq> chaptersConfig = null;

    public CreateHealthReportTemplateReq withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public CreateHealthReportTemplateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateHealthReportTemplateReq withChaptersConfig(Map<String, ChapterConfigReq> chaptersConfig) {
        this.chaptersConfig = chaptersConfig;
        return this;
    }

    public CreateHealthReportTemplateReq putChaptersConfigItem(String key, ChapterConfigReq chaptersConfigItem) {
        if (this.chaptersConfig == null) {
            this.chaptersConfig = new HashMap<>();
        }
        this.chaptersConfig.put(key, chaptersConfigItem);
        return this;
    }

    public CreateHealthReportTemplateReq withChaptersConfig(
        Consumer<Map<String, ChapterConfigReq>> chaptersConfigSetter) {
        if (this.chaptersConfig == null) {
            this.chaptersConfig = new HashMap<>();
        }
        chaptersConfigSetter.accept(this.chaptersConfig);
        return this;
    }

    /**
     * 章节配置，key为章节编码，value为章节配置对象。
     * @return chaptersConfig
     */
    public Map<String, ChapterConfigReq> getChaptersConfig() {
        return chaptersConfig;
    }

    public void setChaptersConfig(Map<String, ChapterConfigReq> chaptersConfig) {
        this.chaptersConfig = chaptersConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHealthReportTemplateReq that = (CreateHealthReportTemplateReq) obj;
        return Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.chaptersConfig, that.chaptersConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, description, chaptersConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthReportTemplateReq {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    chaptersConfig: ").append(toIndentedString(chaptersConfig)).append("\n");
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
