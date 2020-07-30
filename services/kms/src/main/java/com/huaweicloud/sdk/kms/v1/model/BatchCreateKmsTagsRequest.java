package com.huaweicloud.sdk.kms.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.BatchCreateKmsTagsReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchCreateKmsTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId = "v1.0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchCreateKmsTagsReq body = null;

    public BatchCreateKmsTagsRequest withKeyId(String keyId) {
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

    public BatchCreateKmsTagsRequest withVersionId(String versionId) {
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

    public BatchCreateKmsTagsRequest withBody(BatchCreateKmsTagsReq body) {
        this.body = body;
        return this;
    }

    public BatchCreateKmsTagsRequest withBody(Consumer<BatchCreateKmsTagsReq> bodySetter) {
        if(this.body == null ){
            this.body = new BatchCreateKmsTagsReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchCreateKmsTagsReq getBody() {
        return body;
    }

    public void setBody(BatchCreateKmsTagsReq body) {
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
        BatchCreateKmsTagsRequest batchCreateKmsTagsRequest = (BatchCreateKmsTagsRequest) o;
        return Objects.equals(this.keyId, batchCreateKmsTagsRequest.keyId) &&
            Objects.equals(this.versionId, batchCreateKmsTagsRequest.versionId) &&
            Objects.equals(this.body, batchCreateKmsTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateKmsTagsRequest {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

