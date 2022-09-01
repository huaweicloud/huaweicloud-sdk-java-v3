package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetRepoRoleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    @JacksonXmlProperty(localName = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    @JacksonXmlProperty(localName = "repository_uuid")

    private String repositoryUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private SetRepoRoleRequestBody body;

    public SetRepoRoleRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 用户id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public SetRepoRoleRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    /**
     * 仓库uuid
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public SetRepoRoleRequest withBody(SetRepoRoleRequestBody body) {
        this.body = body;
        return this;
    }

    public SetRepoRoleRequest withBody(Consumer<SetRepoRoleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SetRepoRoleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetRepoRoleRequestBody getBody() {
        return body;
    }

    public void setBody(SetRepoRoleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetRepoRoleRequest setRepoRoleRequest = (SetRepoRoleRequest) o;
        return Objects.equals(this.memberId, setRepoRoleRequest.memberId)
            && Objects.equals(this.repositoryUuid, setRepoRoleRequest.repositoryUuid)
            && Objects.equals(this.body, setRepoRoleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, repositoryUuid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRepoRoleRequest {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
