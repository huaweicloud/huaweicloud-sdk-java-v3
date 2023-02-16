package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBindEipRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateGaussMySqlInstanceEipRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ModifyBindEipRequest body;

    public UpdateGaussMySqlInstanceEipRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public UpdateGaussMySqlInstanceEipRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 租户在某一project下的实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public UpdateGaussMySqlInstanceEipRequest withBody(ModifyBindEipRequest body) {
        this.body = body;
        return this;
    }

    public UpdateGaussMySqlInstanceEipRequest withBody(Consumer<ModifyBindEipRequest> bodySetter) {
        if(this.body == null ){
            this.body = new ModifyBindEipRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ModifyBindEipRequest getBody() {
        return body;
    }

    public void setBody(ModifyBindEipRequest body) {
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
        UpdateGaussMySqlInstanceEipRequest updateGaussMySqlInstanceEipRequest = (UpdateGaussMySqlInstanceEipRequest) o;
        return Objects.equals(this.xLanguage, updateGaussMySqlInstanceEipRequest.xLanguage) &&
            Objects.equals(this.instanceId, updateGaussMySqlInstanceEipRequest.instanceId) &&
            Objects.equals(this.body, updateGaussMySqlInstanceEipRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGaussMySqlInstanceEipRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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

