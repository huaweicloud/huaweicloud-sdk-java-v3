package com.huaweicloud.sdk.kms.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.UpdateKeyRotationIntervalRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateKeyRotationIntervalRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId = "v1.0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateKeyRotationIntervalRequestBody body = null;

    public UpdateKeyRotationIntervalRequest withVersionId(String versionId) {
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

    public UpdateKeyRotationIntervalRequest withBody(UpdateKeyRotationIntervalRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateKeyRotationIntervalRequest withBody(Consumer<UpdateKeyRotationIntervalRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateKeyRotationIntervalRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateKeyRotationIntervalRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateKeyRotationIntervalRequestBody body) {
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
        UpdateKeyRotationIntervalRequest updateKeyRotationIntervalRequest = (UpdateKeyRotationIntervalRequest) o;
        return Objects.equals(this.versionId, updateKeyRotationIntervalRequest.versionId) &&
            Objects.equals(this.body, updateKeyRotationIntervalRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyRotationIntervalRequest {\n");
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
