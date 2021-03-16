package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.L7Policy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateL7PolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policy")
    
    private L7Policy l7policy;

    public CreateL7PolicyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public CreateL7PolicyResponse withL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public CreateL7PolicyResponse withL7policy(Consumer<L7Policy> l7policySetter) {
        if(this.l7policy == null ){
            this.l7policy = new L7Policy();
            l7policySetter.accept(this.l7policy);
        }
        
        return this;
    }


    /**
     * Get l7policy
     * @return l7policy
     */
    public L7Policy getL7policy() {
        return l7policy;
    }

    public void setL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7PolicyResponse createL7PolicyResponse = (CreateL7PolicyResponse) o;
        return Objects.equals(this.requestId, createL7PolicyResponse.requestId) &&
            Objects.equals(this.l7policy, createL7PolicyResponse.l7policy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, l7policy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7PolicyResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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

