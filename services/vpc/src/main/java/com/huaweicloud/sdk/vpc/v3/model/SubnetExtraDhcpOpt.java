package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubnetExtraDhcpOpt
 */
public class SubnetExtraDhcpOpt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_name")

    private String optName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_value")

    private String optValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    public SubnetExtraDhcpOpt withOptName(String optName) {
        this.optName = optName;
        return this;
    }

    /**
     * **参数解释**： 子网配置的NTP地址、DNS域名或租约到期时间的名称。 **取值范围**： - 42：表示子网ntp地址。 - 15：表示DNS配置的域名，用于向DNS服务器获取IP地址。 - 51：表示IPv4子网租约到期时间。 - 651：表示IPv6子网租约到期时间。
     * @return optName
     */
    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    public SubnetExtraDhcpOpt withOptValue(String optValue) {
        this.optValue = optValue;
        return this;
    }

    /**
     * **参数解释**： 子网配置的NTP地址、DNS域名或租约到期时间。 **取值范围**： - opt_name配置为“42”，则表示是子网ntp地址，目前只支持IPv4地址，每个IP地址以逗号隔开，IP地址个数不能超过4个，不能存在相同地址。 - opt_name配置为“15”，则该值表示是DNS配置的域名，用于向DNS服务器获取IP地址。域名只能由字母，数字，中划线组成，中划线不能在开头或末尾。域名可以包含多个字符串，单个字符串不超过63个字符，字符串间以点分隔。域名长度不超过254个字符。 - opt_name配置为“51”，则该值表示是IPv4子网租约到期时间，取值格式有两种，取-1，表示无限租约；数字+h，数字范围是1~175200，比如5h，默认值为87600h。 - opt_name配置为“651”，则该值表示是IPv6子网租约到期时间，取值格式有两种，取-1，表示无限租约；数字+h，数字范围是1~175200，比如5h，默认值为2h。
     * @return optValue
     */
    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

    public SubnetExtraDhcpOpt withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**： 子网的IP版本。 **取值范围**： - 4：默认值，IPv4。 - 6：IPv6，只有opt_name是“651”时，ip_version为6。
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubnetExtraDhcpOpt that = (SubnetExtraDhcpOpt) obj;
        return Objects.equals(this.optName, that.optName) && Objects.equals(this.optValue, that.optValue)
            && Objects.equals(this.ipVersion, that.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optName, optValue, ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetExtraDhcpOpt {\n");
        sb.append("    optName: ").append(toIndentedString(optName)).append("\n");
        sb.append("    optValue: ").append(toIndentedString(optValue)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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
