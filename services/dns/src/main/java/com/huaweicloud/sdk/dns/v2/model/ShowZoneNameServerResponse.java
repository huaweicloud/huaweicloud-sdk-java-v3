package com.huaweicloud.sdk.dns.v2.model;

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
public class ShowZoneNameServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_hw_dns")

    private Boolean allHwDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_hw_dns")

    private Boolean includeHwDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_servers")

    private List<String> dnsServers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_dns_servers")

    private List<String> expectedDnsServers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public ShowZoneNameServerResponse withAllHwDns(Boolean allHwDns) {
        this.allHwDns = allHwDns;
        return this;
    }

    /**
     * **参数解释：** 是否全部为华为云DNS服务器地址。 **取值范围：** 不涉及。
     * @return allHwDns
     */
    public Boolean getAllHwDns() {
        return allHwDns;
    }

    public void setAllHwDns(Boolean allHwDns) {
        this.allHwDns = allHwDns;
    }

    public ShowZoneNameServerResponse withIncludeHwDns(Boolean includeHwDns) {
        this.includeHwDns = includeHwDns;
        return this;
    }

    /**
     * **参数解释：** 是否包含华为云DNS服务器地址。  **取值范围：** 不涉及。
     * @return includeHwDns
     */
    public Boolean getIncludeHwDns() {
        return includeHwDns;
    }

    public void setIncludeHwDns(Boolean includeHwDns) {
        this.includeHwDns = includeHwDns;
    }

    public ShowZoneNameServerResponse withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    public ShowZoneNameServerResponse addDnsServersItem(String dnsServersItem) {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList<>();
        }
        this.dnsServers.add(dnsServersItem);
        return this;
    }

    public ShowZoneNameServerResponse withDnsServers(Consumer<List<String>> dnsServersSetter) {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList<>();
        }
        dnsServersSetter.accept(this.dnsServers);
        return this;
    }

    /**
     * **参数解释：** DNS服务器地址。 **取值范围：** 不涉及。
     * @return dnsServers
     */
    public List<String> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public ShowZoneNameServerResponse withExpectedDnsServers(List<String> expectedDnsServers) {
        this.expectedDnsServers = expectedDnsServers;
        return this;
    }

    public ShowZoneNameServerResponse addExpectedDnsServersItem(String expectedDnsServersItem) {
        if (this.expectedDnsServers == null) {
            this.expectedDnsServers = new ArrayList<>();
        }
        this.expectedDnsServers.add(expectedDnsServersItem);
        return this;
    }

    public ShowZoneNameServerResponse withExpectedDnsServers(Consumer<List<String>> expectedDnsServersSetter) {
        if (this.expectedDnsServers == null) {
            this.expectedDnsServers = new ArrayList<>();
        }
        expectedDnsServersSetter.accept(this.expectedDnsServers);
        return this;
    }

    /**
     * **参数解释：** 期望的DNS服务器地址。 **取值范围：** 不涉及。
     * @return expectedDnsServers
     */
    public List<String> getExpectedDnsServers() {
        return expectedDnsServers;
    }

    public void setExpectedDnsServers(List<String> expectedDnsServers) {
        this.expectedDnsServers = expectedDnsServers;
    }

    public ShowZoneNameServerResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 公网域名。 **取值范围：** 不涉及。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowZoneNameServerResponse that = (ShowZoneNameServerResponse) obj;
        return Objects.equals(this.allHwDns, that.allHwDns) && Objects.equals(this.includeHwDns, that.includeHwDns)
            && Objects.equals(this.dnsServers, that.dnsServers)
            && Objects.equals(this.expectedDnsServers, that.expectedDnsServers)
            && Objects.equals(this.domainName, that.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allHwDns, includeHwDns, dnsServers, expectedDnsServers, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowZoneNameServerResponse {\n");
        sb.append("    allHwDns: ").append(toIndentedString(allHwDns)).append("\n");
        sb.append("    includeHwDns: ").append(toIndentedString(includeHwDns)).append("\n");
        sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
        sb.append("    expectedDnsServers: ").append(toIndentedString(expectedDnsServers)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
