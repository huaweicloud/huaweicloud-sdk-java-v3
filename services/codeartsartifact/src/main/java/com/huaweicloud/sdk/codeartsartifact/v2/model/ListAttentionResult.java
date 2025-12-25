package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListAttentionResult
 */
public class ListAttentionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainId")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositoryId")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositoryName")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifactId")

    private String artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedUserName")

    private String modifiedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedUserId")

    private String modifiedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedTime")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public ListAttentionResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 序号。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAttentionResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListAttentionResult withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释**： 仓库ID。 **取值范围**： 不涉及。 
     * @return repositoryId
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListAttentionResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释**： 仓库名称。 **取值范围**： 不涉及。 
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ListAttentionResult withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**： 制品类型。 **取值范围**： maven2|docker|npm|go|pypi|rpm|composer|debian|conan|nuget|docker2|cocoapods|ohpm|generic。 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ListAttentionResult withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**： 仓库策略。 **取值范围**： - release：正式仓库。 - snapshot：快照仓库。 
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public ListAttentionResult withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * **参数解释**： 关注的组件序号。 **取值范围**： 不涉及。 
     * @return artifactId
     */
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public ListAttentionResult withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： 关注的组件路径。 **取值范围**： 不涉及。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ListAttentionResult withModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }

    /**
     * **参数解释**： 修改人名称。 **取值范围**： 不涉及。 
     * @return modifiedUserName
     */
    public String getModifiedUserName() {
        return modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public ListAttentionResult withModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }

    /**
     * **参数解释**： 修改人ID。 **取值范围**： 不涉及。 
     * @return modifiedUserId
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public ListAttentionResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户id。 **取值范围**： 只能由英文字母、数字组成，且长度为32个字符。 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListAttentionResult withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释**： 修改时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**： 不涉及。 
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ListAttentionResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 区域。 **取值范围**： 不涉及。 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAttentionResult that = (ListAttentionResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.repositoryName, that.repositoryName) && Objects.equals(this.format, that.format)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.artifactId, that.artifactId)
            && Objects.equals(this.path, that.path) && Objects.equals(this.modifiedUserName, that.modifiedUserName)
            && Objects.equals(this.modifiedUserId, that.modifiedUserId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.modifiedTime, that.modifiedTime) && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            repositoryId,
            repositoryName,
            format,
            policy,
            artifactId,
            path,
            modifiedUserName,
            modifiedUserId,
            userId,
            modifiedTime,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttentionResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    modifiedUserName: ").append(toIndentedString(modifiedUserName)).append("\n");
        sb.append("    modifiedUserId: ").append(toIndentedString(modifiedUserId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
