package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.Quota;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Quota quota;

    public ShowQuotaResponse withRequestId(String requestId) {
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

    

    public ShowQuotaResponse withQuota(Quota quota) {
        this.quota = quota;
        return this;
    }

    public ShowQuotaResponse withQuota(Consumer<Quota> quotaSetter) {
        if(this.quota == null ){
            this.quota = new Quota();
            quotaSetter.accept(this.quota);
        }
        
        return this;
    }


    /**
     * Get quota
     * @return quota
     */
    public Quota getQuota() {
        return quota;
    }

    public void setQuota(Quota quota) {
        this.quota = quota;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQuotaResponse showQuotaResponse = (ShowQuotaResponse) o;
        return Objects.equals(this.requestId, showQuotaResponse.requestId) &&
            Objects.equals(this.quota, showQuotaResponse.quota);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, quota);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

