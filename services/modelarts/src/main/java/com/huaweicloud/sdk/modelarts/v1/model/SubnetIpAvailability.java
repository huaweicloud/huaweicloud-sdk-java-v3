package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子网可用的IP信息。
 */
public class SubnetIpAvailability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipVersion")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedIps")

    private Integer usedIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalIps")

    private Integer totalIps;

    public SubnetIpAvailability withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释**：子网的cidr。 **取值范围**：不涉及。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public SubnetIpAvailability withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**：网络版本。 **取值范围**：可选值如下： - 4：代表ipV4
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public SubnetIpAvailability withUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
        return this;
    }

    /**
     * **参数解释**：已使用的IP数量。 **取值范围**：不涉及。
     * @return usedIps
     */
    public Integer getUsedIps() {
        return usedIps;
    }

    public void setUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
    }

    public SubnetIpAvailability withTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
        return this;
    }

    /**
     * **参数解释**：子网中总的IP数量。 **取值范围**：不涉及。
     * @return totalIps
     */
    public Integer getTotalIps() {
        return totalIps;
    }

    public void setTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubnetIpAvailability that = (SubnetIpAvailability) obj;
        return Objects.equals(this.cidr, that.cidr) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.usedIps, that.usedIps) && Objects.equals(this.totalIps, that.totalIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr, ipVersion, usedIps, totalIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetIpAvailability {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    usedIps: ").append(toIndentedString(usedIps)).append("\n");
        sb.append("    totalIps: ").append(toIndentedString(totalIps)).append("\n");
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
