package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.CreateKmsTagRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateKmsTagRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateKmsTagRequestBody body;

    public CreateKmsTagRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    


    /**
     * Get versionId
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    

    public CreateKmsTagRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * Get keyId
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    

    public CreateKmsTagRequest withBody(CreateKmsTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateKmsTagRequest withBody(Consumer<CreateKmsTagRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateKmsTagRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateKmsTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreateKmsTagRequestBody body) {
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
        CreateKmsTagRequest createKmsTagRequest = (CreateKmsTagRequest) o;
        return Objects.equals(this.versionId, createKmsTagRequest.versionId) &&
            Objects.equals(this.keyId, createKmsTagRequest.keyId) &&
            Objects.equals(this.body, createKmsTagRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versionId, keyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKmsTagRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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

