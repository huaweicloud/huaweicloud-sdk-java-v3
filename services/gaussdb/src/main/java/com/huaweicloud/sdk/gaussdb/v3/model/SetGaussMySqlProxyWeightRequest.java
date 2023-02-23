package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyProxyWeightRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SetGaussMySqlProxyWeightRequest  {


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
    

    private TaurusModifyProxyWeightRequest body;

    public SetGaussMySqlProxyWeightRequest withXLanguage(String xLanguage) {
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

    

    public SetGaussMySqlProxyWeightRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public SetGaussMySqlProxyWeightRequest withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    


    /**
     * 数据库代理ID，严格匹配UUID规则。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    

    public SetGaussMySqlProxyWeightRequest withBody(TaurusModifyProxyWeightRequest body) {
        this.body = body;
        return this;
    }

    public SetGaussMySqlProxyWeightRequest withBody(Consumer<TaurusModifyProxyWeightRequest> bodySetter) {
        if(this.body == null ){
            this.body = new TaurusModifyProxyWeightRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TaurusModifyProxyWeightRequest getBody() {
        return body;
    }

    public void setBody(TaurusModifyProxyWeightRequest body) {
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
        SetGaussMySqlProxyWeightRequest setGaussMySqlProxyWeightRequest = (SetGaussMySqlProxyWeightRequest) o;
        return Objects.equals(this.xLanguage, setGaussMySqlProxyWeightRequest.xLanguage) &&
            Objects.equals(this.instanceId, setGaussMySqlProxyWeightRequest.instanceId) &&
            Objects.equals(this.proxyId, setGaussMySqlProxyWeightRequest.proxyId) &&
            Objects.equals(this.body, setGaussMySqlProxyWeightRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, proxyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetGaussMySqlProxyWeightRequest {\n");
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

