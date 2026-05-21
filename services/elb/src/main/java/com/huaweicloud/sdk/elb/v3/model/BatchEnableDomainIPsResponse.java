package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchEnableDomainIPsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<DnsIpResponse> ips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public BatchEnableDomainIPsResponse withIps(List<DnsIpResponse> ips) {
        this.ips = ips;
        return this;
    }

    public BatchEnableDomainIPsResponse addIpsItem(DnsIpResponse ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public BatchEnableDomainIPsResponse withIps(Consumer<List<DnsIpResponse>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器域名解析的IP地址列表。  **约束限制**：如果负载均衡器的公网域名和私网域名域名解析开关都没有打开，则为空列表。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ips
     */
    public List<DnsIpResponse> getIps() {
        return ips;
    }

    public void setIps(List<DnsIpResponse> ips) {
        this.ips = ips;
    }

    public BatchEnableDomainIPsResponse withRequestId(String requestId) {
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
        BatchEnableDomainIPsResponse that = (BatchEnableDomainIPsResponse) obj;
        return Objects.equals(this.ips, that.ips) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ips, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchEnableDomainIPsResponse {\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
