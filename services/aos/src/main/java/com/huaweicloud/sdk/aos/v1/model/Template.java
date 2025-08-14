package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Template
 */
public class Template {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version_id")

    private String latestVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version_description")

    private String latestVersionDescription;

    public Template withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板的唯一ID，由模板服务随机生成
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Template withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板（Template）的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Template withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 模板的描述。可用于客户识别自己的模板
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public Template withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 模板的生成时间，格式遵循RFC3339，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Template withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 模板的更新时间，格式遵循RFC3339，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Template withLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
        return this;
    }

    /**
     * 模板中最新的模板版本ID
     * @return latestVersionId
     */
    public String getLatestVersionId() {
        return latestVersionId;
    }

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    public Template withLatestVersionDescription(String latestVersionDescription) {
        this.latestVersionDescription = latestVersionDescription;
        return this;
    }

    /**
     * 模板中最新模板版本的版本描述
     * @return latestVersionDescription
     */
    public String getLatestVersionDescription() {
        return latestVersionDescription;
    }

    public void setLatestVersionDescription(String latestVersionDescription) {
        this.latestVersionDescription = latestVersionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Template that = (Template) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateDescription, that.templateDescription)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.latestVersionId, that.latestVersionId)
            && Objects.equals(this.latestVersionDescription, that.latestVersionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            templateName,
            templateDescription,
            createTime,
            updateTime,
            latestVersionId,
            latestVersionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    latestVersionId: ").append(toIndentedString(latestVersionId)).append("\n");
        sb.append("    latestVersionDescription: ").append(toIndentedString(latestVersionDescription)).append("\n");
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
