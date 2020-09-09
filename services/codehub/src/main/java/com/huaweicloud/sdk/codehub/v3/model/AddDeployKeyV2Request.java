package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddDeployKeyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_id")
    
    private Integer repositoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddDeployKeyRequestBody body = null;

    public AddDeployKeyV2Request withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    


    /**
     * Get repositoryId
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public AddDeployKeyV2Request withBody(AddDeployKeyRequestBody body) {
        this.body = body;
        return this;
    }

    public AddDeployKeyV2Request withBody(Consumer<AddDeployKeyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new AddDeployKeyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddDeployKeyRequestBody getBody() {
        return body;
    }

    public void setBody(AddDeployKeyRequestBody body) {
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
        AddDeployKeyV2Request addDeployKeyV2Request = (AddDeployKeyV2Request) o;
        return Objects.equals(this.repositoryId, addDeployKeyV2Request.repositoryId) &&
            Objects.equals(this.body, addDeployKeyV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeployKeyV2Request {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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

