package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteRepoMemberRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    @JacksonXmlProperty(localName = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    @JacksonXmlProperty(localName = "repository_uuid")

    private String repositoryUuid;

    public DeleteRepoMemberRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 仓库成员id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public DeleteRepoMemberRequest withRepositoryUuid(String repositoryUuid) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRepoMemberRequest deleteRepoMemberRequest = (DeleteRepoMemberRequest) o;
        return Objects.equals(this.memberId, deleteRepoMemberRequest.memberId)
            && Objects.equals(this.repositoryUuid, deleteRepoMemberRequest.repositoryUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, repositoryUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRepoMemberRequest {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
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
