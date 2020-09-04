package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateIpGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroup")
    
    private UpdateIpGroupOption ipgroup = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;

    public UpdateIpGroupRequestBody withIpgroup(UpdateIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public UpdateIpGroupRequestBody withIpgroup(Consumer<UpdateIpGroupOption> ipgroupSetter) {
        if(this.ipgroup == null ){
            this.ipgroup = new UpdateIpGroupOption();
            ipgroupSetter.accept(this.ipgroup);
        }
        
        return this;
    }


    /**
     * Get ipgroup
     * @return ipgroup
     */
    public UpdateIpGroupOption getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(UpdateIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
    }

    public UpdateIpGroupRequestBody withRequestId(String requestId) {
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
        UpdateIpGroupRequestBody updateIpGroupRequestBody = (UpdateIpGroupRequestBody) o;
        return Objects.equals(this.ipgroup, updateIpGroupRequestBody.ipgroup) &&
            Objects.equals(this.requestId, updateIpGroupRequestBody.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipgroup, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupRequestBody {\n");
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

