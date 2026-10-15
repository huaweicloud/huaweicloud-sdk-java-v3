package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHealthReportTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private Boolean system;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chapters_config")

    private Map<String, ChapterConfig> chaptersConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    public ShowHealthReportTemplateResponse withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID。
     * minimum: 1
     * maximum: 9999999999
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public ShowHealthReportTemplateResponse withTemplateName(String templateName) {
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

    public ShowHealthReportTemplateResponse withDescription(String description) {
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

    public ShowHealthReportTemplateResponse withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * 是否为系统预设模板（true-系统模板 false-自定义模板）。
     * @return system
     */
    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public ShowHealthReportTemplateResponse withChaptersConfig(Map<String, ChapterConfig> chaptersConfig) {
        this.chaptersConfig = chaptersConfig;
        return this;
    }

    public ShowHealthReportTemplateResponse putChaptersConfigItem(String key, ChapterConfig chaptersConfigItem) {
        if (this.chaptersConfig == null) {
            this.chaptersConfig = new HashMap<>();
        }
        this.chaptersConfig.put(key, chaptersConfigItem);
        return this;
    }

    public ShowHealthReportTemplateResponse withChaptersConfig(
        Consumer<Map<String, ChapterConfig>> chaptersConfigSetter) {
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
    public Map<String, ChapterConfig> getChaptersConfig() {
        return chaptersConfig;
    }

    public void setChaptersConfig(Map<String, ChapterConfig> chaptersConfig) {
        this.chaptersConfig = chaptersConfig;
    }

    public ShowHealthReportTemplateResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ShowHealthReportTemplateResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHealthReportTemplateResponse that = (ShowHealthReportTemplateResponse) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.system, that.system)
            && Objects.equals(this.chaptersConfig, that.chaptersConfig) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, description, system, chaptersConfig, createAt, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthReportTemplateResponse {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    chaptersConfig: ").append(toIndentedString(chaptersConfig)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
