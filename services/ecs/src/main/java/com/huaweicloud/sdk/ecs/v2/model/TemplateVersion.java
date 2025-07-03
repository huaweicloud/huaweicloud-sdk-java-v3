package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateVersion
 */
public class TemplateVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_data")

    private TemplateData templateData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_number")

    private Integer versionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template_id")

    private String launchTemplateId;

    public TemplateVersion withTemplateData(TemplateData templateData) {
        this.templateData = templateData;
        return this;
    }

    public TemplateVersion withTemplateData(Consumer<TemplateData> templateDataSetter) {
        if (this.templateData == null) {
            this.templateData = new TemplateData();
            templateDataSetter.accept(this.templateData);
        }

        return this;
    }

    /**
     * Get templateData
     * @return templateData
     */
    public TemplateData getTemplateData() {
        return templateData;
    }

    public void setTemplateData(TemplateData templateData) {
        this.templateData = templateData;
    }

    public TemplateVersion withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * 版本号
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public TemplateVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 版本id
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public TemplateVersion withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 版本描述
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public TemplateVersion withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TemplateVersion withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * 模板id
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateVersion that = (TemplateVersion) obj;
        return Objects.equals(this.templateData, that.templateData)
            && Objects.equals(this.versionNumber, that.versionNumber) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.launchTemplateId, that.launchTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateData, versionNumber, versionId, versionDescription, createdAt, launchTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateVersion {\n");
        sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
        sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    launchTemplateId: ").append(toIndentedString(launchTemplateId)).append("\n");
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
