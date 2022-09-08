package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RetentionLog
 */
public class RetentionLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo")

    private String repo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_id")

    private Integer retentionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public RetentionLog withCreatedAt(String createdAt) {
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

    public RetentionLog withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RetentionLog withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RetentionLog withRepo(String repo) {
        this.repo = repo;
        return this;
    }

    /**
     * 镜像仓库名
     * @return repo
     */
    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public RetentionLog withRetentionId(Integer retentionId) {
        this.retentionId = retentionId;
        return this;
    }

    /**
     * 老化规则ID
     * @return retentionId
     */
    public Integer getRetentionId() {
        return retentionId;
    }

    public void setRetentionId(Integer retentionId) {
        this.retentionId = retentionId;
    }

    public RetentionLog withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public RetentionLog withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 镜像版本
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetentionLog retentionLog = (RetentionLog) o;
        return Objects.equals(this.createdAt, retentionLog.createdAt) && Objects.equals(this.id, retentionLog.id)
            && Objects.equals(this.namespace, retentionLog.namespace) && Objects.equals(this.repo, retentionLog.repo)
            && Objects.equals(this.retentionId, retentionLog.retentionId)
            && Objects.equals(this.ruleType, retentionLog.ruleType) && Objects.equals(this.tag, retentionLog.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id, namespace, repo, retentionId, ruleType, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetentionLog {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    retentionId: ").append(toIndentedString(retentionId)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
