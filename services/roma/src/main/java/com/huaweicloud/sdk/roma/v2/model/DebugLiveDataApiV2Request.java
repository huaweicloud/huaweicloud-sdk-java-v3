package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiTest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DebugLiveDataApiV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_id")
    
    private String ldApiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private LdApiTest body;

    public DebugLiveDataApiV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public DebugLiveDataApiV2Request withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    


    /**
     * 后端API的编号，可通过查询API信息获取该编号。
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    

    public DebugLiveDataApiV2Request withBody(LdApiTest body) {
        this.body = body;
        return this;
    }

    public DebugLiveDataApiV2Request withBody(Consumer<LdApiTest> bodySetter) {
        if(this.body == null ){
            this.body = new LdApiTest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public LdApiTest getBody() {
        return body;
    }

    public void setBody(LdApiTest body) {
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
        DebugLiveDataApiV2Request debugLiveDataApiV2Request = (DebugLiveDataApiV2Request) o;
        return Objects.equals(this.instanceId, debugLiveDataApiV2Request.instanceId) &&
            Objects.equals(this.ldApiId, debugLiveDataApiV2Request.ldApiId) &&
            Objects.equals(this.body, debugLiveDataApiV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ldApiId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugLiveDataApiV2Request {\n");
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

