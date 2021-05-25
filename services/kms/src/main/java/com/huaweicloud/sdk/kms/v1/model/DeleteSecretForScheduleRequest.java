package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.DeleteSecretForScheduleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSecretForScheduleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret_id")
    
    private String secretId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DeleteSecretForScheduleRequestBody body;

    public DeleteSecretForScheduleRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    


    /**
     * 凭据的资源标识符。
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    

    public DeleteSecretForScheduleRequest withBody(DeleteSecretForScheduleRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteSecretForScheduleRequest withBody(Consumer<DeleteSecretForScheduleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new DeleteSecretForScheduleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeleteSecretForScheduleRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteSecretForScheduleRequestBody body) {
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
        DeleteSecretForScheduleRequest deleteSecretForScheduleRequest = (DeleteSecretForScheduleRequest) o;
        return Objects.equals(this.secretId, deleteSecretForScheduleRequest.secretId) &&
            Objects.equals(this.body, deleteSecretForScheduleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(secretId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecretForScheduleRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
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

