package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyProxyConsistRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateProxySessionConsistenceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_id")
    
    
    private String proxyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ModifyProxyConsistRequest body;

    public UpdateProxySessionConsistenceRequest withXLanguage(String xLanguage) {
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

    

    public UpdateProxySessionConsistenceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 租户在某一project下的实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public UpdateProxySessionConsistenceRequest withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    


    /**
     * 租户在某一instance下的数据库代理id。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    

    public UpdateProxySessionConsistenceRequest withBody(ModifyProxyConsistRequest body) {
        this.body = body;
        return this;
    }

    public UpdateProxySessionConsistenceRequest withBody(Consumer<ModifyProxyConsistRequest> bodySetter) {
        if(this.body == null ){
            this.body = new ModifyProxyConsistRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ModifyProxyConsistRequest getBody() {
        return body;
    }

    public void setBody(ModifyProxyConsistRequest body) {
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
        UpdateProxySessionConsistenceRequest updateProxySessionConsistenceRequest = (UpdateProxySessionConsistenceRequest) o;
        return Objects.equals(this.xLanguage, updateProxySessionConsistenceRequest.xLanguage) &&
            Objects.equals(this.instanceId, updateProxySessionConsistenceRequest.instanceId) &&
            Objects.equals(this.proxyId, updateProxySessionConsistenceRequest.proxyId) &&
            Objects.equals(this.body, updateProxySessionConsistenceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, proxyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProxySessionConsistenceRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
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

