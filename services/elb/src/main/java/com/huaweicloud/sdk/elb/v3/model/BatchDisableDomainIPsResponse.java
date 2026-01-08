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
public class BatchDisableDomainIPsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<ListDnsIpResponseBody> ips = null;

    public BatchDisableDomainIPsResponse withIps(List<ListDnsIpResponseBody> ips) {
        this.ips = ips;
        return this;
    }

    public BatchDisableDomainIPsResponse addIpsItem(ListDnsIpResponseBody ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public BatchDisableDomainIPsResponse withIps(Consumer<List<ListDnsIpResponseBody>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * **参数解释**：返回的负载均衡器的dns ip信息。  **约束限制**：如果负载均衡器的公网域名和私网域名开关都没有打开，则列表为空。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ips
     */
    public List<ListDnsIpResponseBody> getIps() {
        return ips;
    }

    public void setIps(List<ListDnsIpResponseBody> ips) {
        this.ips = ips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDisableDomainIPsResponse that = (BatchDisableDomainIPsResponse) obj;
        return Objects.equals(this.ips, that.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisableDomainIPsResponse {\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
