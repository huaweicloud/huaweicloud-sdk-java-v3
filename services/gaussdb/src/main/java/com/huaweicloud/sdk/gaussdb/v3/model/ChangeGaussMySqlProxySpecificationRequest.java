package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusProxyScaleRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeGaussMySqlProxySpecificationRequest  {



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
    
    
    private TaurusProxyScaleRequest body;

    public ChangeGaussMySqlProxySpecificationRequest withXLanguage(String xLanguage) {
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

    

    public ChangeGaussMySqlProxySpecificationRequest withInstanceId(String instanceId) {
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

    

    public ChangeGaussMySqlProxySpecificationRequest withProxyId(String proxyId) {
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

    

    public ChangeGaussMySqlProxySpecificationRequest withBody(TaurusProxyScaleRequest body) {
        this.body = body;
        return this;
    }

    public ChangeGaussMySqlProxySpecificationRequest withBody(Consumer<TaurusProxyScaleRequest> bodySetter) {
        if(this.body == null ){
            this.body = new TaurusProxyScaleRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TaurusProxyScaleRequest getBody() {
        return body;
    }

    public void setBody(TaurusProxyScaleRequest body) {
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
        ChangeGaussMySqlProxySpecificationRequest changeGaussMySqlProxySpecificationRequest = (ChangeGaussMySqlProxySpecificationRequest) o;
        return Objects.equals(this.xLanguage, changeGaussMySqlProxySpecificationRequest.xLanguage) &&
            Objects.equals(this.instanceId, changeGaussMySqlProxySpecificationRequest.instanceId) &&
            Objects.equals(this.proxyId, changeGaussMySqlProxySpecificationRequest.proxyId) &&
            Objects.equals(this.body, changeGaussMySqlProxySpecificationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, proxyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeGaussMySqlProxySpecificationRequest {\n");
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

