package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.UpdateSecretStageRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateSecretStageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret_id")
    
    private String secretId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stage_name")
    
    private String stageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateSecretStageRequestBody body;

    public UpdateSecretStageRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    


    /**
     * Get secretId
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    

    public UpdateSecretStageRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    


    /**
     * Get stageName
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    

    public UpdateSecretStageRequest withBody(UpdateSecretStageRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSecretStageRequest withBody(Consumer<UpdateSecretStageRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateSecretStageRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateSecretStageRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSecretStageRequestBody body) {
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
        UpdateSecretStageRequest updateSecretStageRequest = (UpdateSecretStageRequest) o;
        return Objects.equals(this.secretId, updateSecretStageRequest.secretId) &&
            Objects.equals(this.stageName, updateSecretStageRequest.stageName) &&
            Objects.equals(this.body, updateSecretStageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(secretId, stageName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretStageRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
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

