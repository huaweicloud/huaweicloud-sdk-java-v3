package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量从负载均衡器域名解析中移除IP地址的请求体。
 */
public class BatchDisableDomainIPsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<DnsIp> ips = null;

    public BatchDisableDomainIPsRequestBody withIps(List<DnsIp> ips) {
        this.ips = ips;
        return this;
    }

    public BatchDisableDomainIPsRequestBody addIpsItem(DnsIp ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public BatchDisableDomainIPsRequestBody withIps(Consumer<List<DnsIp>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * **参数解释**：需要从负载均衡器域名解析中移除的IP列表。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ips
     */
    public List<DnsIp> getIps() {
        return ips;
    }

    public void setIps(List<DnsIp> ips) {
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
        BatchDisableDomainIPsRequestBody that = (BatchDisableDomainIPsRequestBody) obj;
        return Objects.equals(this.ips, that.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisableDomainIPsRequestBody {\n");
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
