package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 密钥
 */
public class CreateUpdateSecretRespSecret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private List<Secret> secrets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateUpdateSecretRespSecret withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 密钥ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateUpdateSecretRespSecret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 密钥名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateUpdateSecretRespSecret withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 密钥描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateUpdateSecretRespSecret withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateUpdateSecretRespSecret withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 密钥创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateUpdateSecretRespSecret withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 密钥更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateUpdateSecretRespSecret withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    public CreateUpdateSecretRespSecret addSecretsItem(Secret secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    public CreateUpdateSecretRespSecret withSecrets(Consumer<List<Secret>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * 密钥列表
     * @return secrets
     */
    public List<Secret> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<Secret> secrets) {
        this.secrets = secrets;
    }

    public CreateUpdateSecretRespSecret withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateUpdateSecretRespSecret addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateUpdateSecretRespSecret withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUpdateSecretRespSecret createUpdateSecretRespSecret = (CreateUpdateSecretRespSecret) o;
        return Objects.equals(this.id, createUpdateSecretRespSecret.id)
            && Objects.equals(this.name, createUpdateSecretRespSecret.name)
            && Objects.equals(this.description, createUpdateSecretRespSecret.description)
            && Objects.equals(this.projectId, createUpdateSecretRespSecret.projectId)
            && Objects.equals(this.createdAt, createUpdateSecretRespSecret.createdAt)
            && Objects.equals(this.updatedAt, createUpdateSecretRespSecret.updatedAt)
            && Objects.equals(this.secrets, createUpdateSecretRespSecret.secrets)
            && Objects.equals(this.tags, createUpdateSecretRespSecret.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, projectId, createdAt, updatedAt, secrets, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUpdateSecretRespSecret {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
