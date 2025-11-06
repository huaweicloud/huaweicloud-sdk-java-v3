package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitDto commit;

    public CreateTagResponse withName(String name) {
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

    public CreateTagResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 标签描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateTagResponse withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 基于commitid
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public CreateTagResponse withCommit(CommitDto commit) {
        this.commit = commit;
        return this;
    }

    public CreateTagResponse withCommit(Consumer<CommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitDto getCommit() {
        return commit;
    }

    public void setCommit(CommitDto commit) {
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
        CreateTagResponse that = (CreateTagResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.message, that.message)
            && Objects.equals(this.target, that.target) && Objects.equals(this.commit, that.commit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, target, commit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTagResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
