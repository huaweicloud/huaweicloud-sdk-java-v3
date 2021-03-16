package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.CreateDatakeyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateDatakeyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateDatakeyRequestBody body;

    public CreateDatakeyRequest withVersionId(String versionId) {
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

    

    public CreateDatakeyRequest withBody(CreateDatakeyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateDatakeyRequest withBody(Consumer<CreateDatakeyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateDatakeyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateDatakeyRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDatakeyRequestBody body) {
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
        CreateDatakeyRequest createDatakeyRequest = (CreateDatakeyRequest) o;
        return Objects.equals(this.versionId, createDatakeyRequest.versionId) &&
            Objects.equals(this.body, createDatakeyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyRequest {\n");
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

