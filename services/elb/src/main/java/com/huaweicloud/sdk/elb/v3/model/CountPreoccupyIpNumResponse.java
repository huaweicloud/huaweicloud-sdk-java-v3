package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.PreoccupyIp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CountPreoccupyIpNumResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preoccupy_ip")
    
    private PreoccupyIp preoccupyIp = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;

    public CountPreoccupyIpNumResponse withPreoccupyIp(PreoccupyIp preoccupyIp) {
        this.preoccupyIp = preoccupyIp;
        return this;
    }

    public CountPreoccupyIpNumResponse withPreoccupyIp(Consumer<PreoccupyIp> preoccupyIpSetter) {
        if(this.preoccupyIp == null ){
            this.preoccupyIp = new PreoccupyIp();
            preoccupyIpSetter.accept(this.preoccupyIp);
        }
        
        return this;
    }


    /**
     * Get preoccupyIp
     * @return preoccupyIp
     */
    public PreoccupyIp getPreoccupyIp() {
        return preoccupyIp;
    }

    public void setPreoccupyIp(PreoccupyIp preoccupyIp) {
        this.preoccupyIp = preoccupyIp;
    }

    public CountPreoccupyIpNumResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。 注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountPreoccupyIpNumResponse countPreoccupyIpNumResponse = (CountPreoccupyIpNumResponse) o;
        return Objects.equals(this.preoccupyIp, countPreoccupyIpNumResponse.preoccupyIp) &&
            Objects.equals(this.requestId, countPreoccupyIpNumResponse.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(preoccupyIp, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountPreoccupyIpNumResponse {\n");
        sb.append("    preoccupyIp: ").append(toIndentedString(preoccupyIp)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

