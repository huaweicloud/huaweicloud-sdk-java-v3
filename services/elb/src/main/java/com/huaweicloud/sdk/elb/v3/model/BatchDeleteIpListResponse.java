package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteIpListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private IpGroup ipgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public BatchDeleteIpListResponse withIpgroup(IpGroup ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public BatchDeleteIpListResponse withIpgroup(Consumer<IpGroup> ipgroupSetter) {
        if (this.ipgroup == null) {
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

    public BatchDeleteIpListResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteIpListResponse that = (BatchDeleteIpListResponse) obj;
        return Objects.equals(this.ipgroup, that.ipgroup) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroup, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpListResponse {\n");
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
