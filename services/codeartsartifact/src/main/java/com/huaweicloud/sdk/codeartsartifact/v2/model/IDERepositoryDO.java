package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDERepositoryDO
 */
public class IDERepositoryDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release")

    private String release;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private String snapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includes_pattern")

    private String includesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_right")

    private String shareRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public IDERepositoryDO withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称。 **约束限制**: 长度1-50。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public IDERepositoryDO withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**: 制品类型。 **约束限制**: 不涉及。 **取值范围**: maven2。 **默认取值**: 无。 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public IDERepositoryDO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 仓库描述。 **约束限制**: 最大长度200。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IDERepositoryDO withRelease(String release) {
        this.release = release;
        return this;
    }

    /**
     * **参数解释**: release仓库名称。 **约束限制**: 长度1-50。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public IDERepositoryDO withSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * **参数解释**: snapshot仓库名称。 **约束限制**: 长度1-50。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public IDERepositoryDO withIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
        return this;
    }

    /**
     * **参数解释**: 路径包含规则。 **约束限制**: 最大长度512。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return includesPattern
     */
    public String getIncludesPattern() {
        return includesPattern;
    }

    public void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    public IDERepositoryDO withShareRight(String shareRight) {
        this.shareRight = shareRight;
        return this;
    }

    /**
     * **参数解释**: 共享权限级别。 **约束限制**: 不涉及。 **取值范围**: PROJECT。 **默认取值**: 无。 
     * @return shareRight
     */
    public String getShareRight() {
        return shareRight;
    }

    public void setShareRight(String shareRight) {
        this.shareRight = shareRight;
    }

    public IDERepositoryDO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID，可以从调用API处获取，也可以从控制台获取。获取方式请参考[获取项目ID](CloudArtifact_api_0015.xml)。 **约束限制**: 只能由英文字母、数字组成，且长度为32个字符。 **取值范围**: 不涉及。 **默认取值**: 无。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IDERepositoryDO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 仓库类型。 **约束限制**: 不涉及。 **取值范围**: hosted：本地仓库。 **默认取值**: 无。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDERepositoryDO that = (IDERepositoryDO) obj;
        return Objects.equals(this.repositoryName, that.repositoryName) && Objects.equals(this.format, that.format)
            && Objects.equals(this.description, that.description) && Objects.equals(this.release, that.release)
            && Objects.equals(this.snapshot, that.snapshot)
            && Objects.equals(this.includesPattern, that.includesPattern)
            && Objects.equals(this.shareRight, that.shareRight) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(repositoryName, format, description, release, snapshot, includesPattern, shareRight, projectId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDERepositoryDO {\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    includesPattern: ").append(toIndentedString(includesPattern)).append("\n");
        sb.append("    shareRight: ").append(toIndentedString(shareRight)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
