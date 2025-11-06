package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddTagsResponse
 */
public class AddTagsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitRepoV2 commit;

    public AddTagsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标签名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddTagsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 备注
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AddTagsResponse withCommit(CommitRepoV2 commit) {
        this.commit = commit;
        return this;
    }

    public AddTagsResponse withCommit(Consumer<CommitRepoV2> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitRepoV2();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitRepoV2 getCommit() {
        return commit;
    }

    public void setCommit(CommitRepoV2 commit) {
        this.commit = commit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTagsResponse that = (AddTagsResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.message, that.message)
            && Objects.equals(this.commit, that.commit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, commit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTagsResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
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
