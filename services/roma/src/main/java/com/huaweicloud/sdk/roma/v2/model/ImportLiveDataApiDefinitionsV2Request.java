package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2RequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ImportLiveDataApiDefinitionsV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ImportLiveDataApiDefinitionsV2RequestBody body;

    public ImportLiveDataApiDefinitionsV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ImportLiveDataApiDefinitionsV2Request withBody(ImportLiveDataApiDefinitionsV2RequestBody body) {
        this.body = body;
        return this;
    }

    public ImportLiveDataApiDefinitionsV2Request withBody(Consumer<ImportLiveDataApiDefinitionsV2RequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ImportLiveDataApiDefinitionsV2RequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ImportLiveDataApiDefinitionsV2RequestBody getBody() {
        return body;
    }

    public void setBody(ImportLiveDataApiDefinitionsV2RequestBody body) {
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
        ImportLiveDataApiDefinitionsV2Request importLiveDataApiDefinitionsV2Request = (ImportLiveDataApiDefinitionsV2Request) o;
        return Objects.equals(this.instanceId, importLiveDataApiDefinitionsV2Request.instanceId) &&
            Objects.equals(this.body, importLiveDataApiDefinitionsV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportLiveDataApiDefinitionsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

