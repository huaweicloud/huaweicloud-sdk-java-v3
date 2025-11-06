package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLastPushEventInRepositoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private RepositoryBriefDto repository;

    public ShowLastPushEventInRepositoryResponse withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * **参数解释：** 分支或者tag名称。 **取值范围：** 不涉及。
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ShowLastPushEventInRepositoryResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowLastPushEventInRepositoryResponse withRepository(RepositoryBriefDto repository) {
        this.repository = repository;
        return this;
    }

    public ShowLastPushEventInRepositoryResponse withRepository(Consumer<RepositoryBriefDto> repositorySetter) {
        if (this.repository == null) {
            this.repository = new RepositoryBriefDto();
            repositorySetter.accept(this.repository);
        }

        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    public RepositoryBriefDto getRepository() {
        return repository;
    }

    public void setRepository(RepositoryBriefDto repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLastPushEventInRepositoryResponse that = (ShowLastPushEventInRepositoryResponse) obj;
        return Objects.equals(this.ref, that.ref) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, createdAt, repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLastPushEventInRepositoryResponse {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
