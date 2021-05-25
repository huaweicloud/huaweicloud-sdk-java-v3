package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.ScheduleKeyDeletionRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteKeyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ScheduleKeyDeletionRequestBody body;

    public DeleteKeyRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    


    /**
     * API版本号
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    

    public DeleteKeyRequest withBody(ScheduleKeyDeletionRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteKeyRequest withBody(Consumer<ScheduleKeyDeletionRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ScheduleKeyDeletionRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ScheduleKeyDeletionRequestBody getBody() {
        return body;
    }

    public void setBody(ScheduleKeyDeletionRequestBody body) {
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
        DeleteKeyRequest deleteKeyRequest = (DeleteKeyRequest) o;
        return Objects.equals(this.versionId, deleteKeyRequest.versionId) &&
            Objects.equals(this.body, deleteKeyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKeyRequest {\n");
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

