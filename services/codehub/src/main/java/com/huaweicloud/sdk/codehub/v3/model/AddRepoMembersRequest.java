package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.CreateRepoMemberRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddRepoMembersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_uuid")
    
    private String repositoryUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateRepoMemberRequest body = null;

    public AddRepoMembersRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    


    /**
     * Get repositoryUuid
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public AddRepoMembersRequest withBody(CreateRepoMemberRequest body) {
        this.body = body;
        return this;
    }

    public AddRepoMembersRequest withBody(Consumer<CreateRepoMemberRequest> bodySetter) {
        if(this.body == null ){
            this.body = new CreateRepoMemberRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateRepoMemberRequest getBody() {
        return body;
    }

    public void setBody(CreateRepoMemberRequest body) {
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
        AddRepoMembersRequest addRepoMembersRequest = (AddRepoMembersRequest) o;
        return Objects.equals(this.repositoryUuid, addRepoMembersRequest.repositoryUuid) &&
            Objects.equals(this.body, addRepoMembersRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRepoMembersRequest {\n");
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

