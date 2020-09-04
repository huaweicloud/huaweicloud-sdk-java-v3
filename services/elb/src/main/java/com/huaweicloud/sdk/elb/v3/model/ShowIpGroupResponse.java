package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.IpGroup;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowIpGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroup")
    
    private IpGroup ipgroup = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;

    public ShowIpGroupResponse withIpgroup(IpGroup ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public ShowIpGroupResponse withIpgroup(Consumer<IpGroup> ipgroupSetter) {
        if(this.ipgroup == null ){
            this.ipgroup = new IpGroup();
            ipgroupSetter.accept(this.ipgroup);
        }
        
        return this;
    }


    /**
     * Get ipgroup
     * @return ipgroup
     */
    public IpGroup getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(IpGroup ipgroup) {
        this.ipgroup = ipgroup;
    }

    public ShowIpGroupResponse withRequestId(String requestId) {
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
        ShowIpGroupResponse showIpGroupResponse = (ShowIpGroupResponse) o;
        return Objects.equals(this.ipgroup, showIpGroupResponse.ipgroup) &&
            Objects.equals(this.requestId, showIpGroupResponse.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipgroup, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpGroupResponse {\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
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

