package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiScriptCreate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateLiveDataApiScriptV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_id")
    
    private String ldApiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private LdApiScriptCreate body;

    public CreateLiveDataApiScriptV2Request withInstanceId(String instanceId) {
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

    

    public CreateLiveDataApiScriptV2Request withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    


    /**
     * Get ldApiId
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    

    public CreateLiveDataApiScriptV2Request withBody(LdApiScriptCreate body) {
        this.body = body;
        return this;
    }

    public CreateLiveDataApiScriptV2Request withBody(Consumer<LdApiScriptCreate> bodySetter) {
        if(this.body == null ){
            this.body = new LdApiScriptCreate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public LdApiScriptCreate getBody() {
        return body;
    }

    public void setBody(LdApiScriptCreate body) {
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
        CreateLiveDataApiScriptV2Request createLiveDataApiScriptV2Request = (CreateLiveDataApiScriptV2Request) o;
        return Objects.equals(this.instanceId, createLiveDataApiScriptV2Request.instanceId) &&
            Objects.equals(this.ldApiId, createLiveDataApiScriptV2Request.ldApiId) &&
            Objects.equals(this.body, createLiveDataApiScriptV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ldApiId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLiveDataApiScriptV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
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

