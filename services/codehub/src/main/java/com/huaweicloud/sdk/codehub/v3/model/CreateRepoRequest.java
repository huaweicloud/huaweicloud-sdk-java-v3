package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateRepoRequest
 */
public class CreateRepoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_members")

    private Integer importMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_url")

    private String importUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitignore_id")

    private String gitignoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_id")

    private Integer licenseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_readme")

    private Integer enableReadme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caller")

    private String caller;

    public CreateRepoRequest withImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
        return this;
    }

    /**
     * 是否导入项目成员，取值范围：0->不导入项目成员，1->导入项目成员
     * @return importMembers
     */
    public Integer getImportMembers() {
        return importMembers;
    }

    public void setImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
    }

    public CreateRepoRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 仓库名称，取值范围：可以输入英文大小写字母、数字、连字符、下划线，且必须以字母开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRepoRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 指定项目的UUID
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public CreateRepoRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 复制模板的ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateRepoRequest withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * 仓库状态，取值范围：0->私有，20->公开只读
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public CreateRepoRequest withImportUrl(String importUrl) {
        this.importUrl = importUrl;
        return this;
    }

    /**
     * 模板仓库的https地址的base64加密
     * @return importUrl
     */
    public String getImportUrl() {
        return importUrl;
    }

    public void setImportUrl(String importUrl) {
        this.importUrl = importUrl;
    }

    public CreateRepoRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 仓库描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRepoRequest withGitignoreId(String gitignoreId) {
        this.gitignoreId = gitignoreId;
        return this;
    }

    /**
     * 根据编程语言生成.gitignore文件
     * @return gitignoreId
     */
    public String getGitignoreId() {
        return gitignoreId;
    }

    public void setGitignoreId(String gitignoreId) {
        this.gitignoreId = gitignoreId;
    }

    public CreateRepoRequest withLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     * 许可证id
     * @return licenseId
     */
    public Integer getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public CreateRepoRequest withEnableReadme(Integer enableReadme) {
        this.enableReadme = enableReadme;
        return this;
    }

    /**
     * 是否允许生成README文件
     * @return enableReadme
     */
    public Integer getEnableReadme() {
        return enableReadme;
    }

    public void setEnableReadme(Integer enableReadme) {
        this.enableReadme = enableReadme;
    }

    public CreateRepoRequest withCaller(String caller) {
        this.caller = caller;
        return this;
    }

    /**
     * 调用者
     * @return caller
     */
    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRepoRequest createRepoRequest = (CreateRepoRequest) o;
        return Objects.equals(this.importMembers, createRepoRequest.importMembers)
            && Objects.equals(this.name, createRepoRequest.name)
            && Objects.equals(this.projectUuid, createRepoRequest.projectUuid)
            && Objects.equals(this.templateId, createRepoRequest.templateId)
            && Objects.equals(this.visibilityLevel, createRepoRequest.visibilityLevel)
            && Objects.equals(this.importUrl, createRepoRequest.importUrl)
            && Objects.equals(this.description, createRepoRequest.description)
            && Objects.equals(this.gitignoreId, createRepoRequest.gitignoreId)
            && Objects.equals(this.licenseId, createRepoRequest.licenseId)
            && Objects.equals(this.enableReadme, createRepoRequest.enableReadme)
            && Objects.equals(this.caller, createRepoRequest.caller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importMembers,
            name,
            projectUuid,
            templateId,
            visibilityLevel,
            importUrl,
            description,
            gitignoreId,
            licenseId,
            enableReadme,
            caller);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepoRequest {\n");
        sb.append("    importMembers: ").append(toIndentedString(importMembers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    importUrl: ").append(toIndentedString(importUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gitignoreId: ").append(toIndentedString(gitignoreId)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    enableReadme: ").append(toIndentedString(enableReadme)).append("\n");
        sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
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
