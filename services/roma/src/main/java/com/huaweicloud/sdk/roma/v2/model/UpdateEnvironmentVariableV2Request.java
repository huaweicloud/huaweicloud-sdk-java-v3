package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.EnvVariableBase;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateEnvironmentVariableV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_variable_id")
    
    private String envVariableId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private EnvVariableBase body = null;

    public UpdateEnvironmentVariableV2Request withInstanceId(String instanceId) {
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

    public UpdateEnvironmentVariableV2Request withEnvVariableId(String envVariableId) {
        this.envVariableId = envVariableId;
        return this;
    }

    


    /**
     * Get envVariableId
     * @return envVariableId
     */
    public String getEnvVariableId() {
        return envVariableId;
    }

    public void setEnvVariableId(String envVariableId) {
        this.envVariableId = envVariableId;
    }

    public UpdateEnvironmentVariableV2Request withBody(EnvVariableBase body) {
        this.body = body;
        return this;
    }

    public UpdateEnvironmentVariableV2Request withBody(Consumer<EnvVariableBase> bodySetter) {
        if(this.body == null ){
            this.body = new EnvVariableBase();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EnvVariableBase getBody() {
        return body;
    }

    public void setBody(EnvVariableBase body) {
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
        UpdateEnvironmentVariableV2Request updateEnvironmentVariableV2Request = (UpdateEnvironmentVariableV2Request) o;
        return Objects.equals(this.instanceId, updateEnvironmentVariableV2Request.instanceId) &&
            Objects.equals(this.envVariableId, updateEnvironmentVariableV2Request.envVariableId) &&
            Objects.equals(this.body, updateEnvironmentVariableV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, envVariableId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEnvironmentVariableV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    envVariableId: ").append(toIndentedString(envVariableId)).append("\n");
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

