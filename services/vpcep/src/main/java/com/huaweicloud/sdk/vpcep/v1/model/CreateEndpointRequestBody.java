package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建终端节接口请求结构体
 */
public class CreateEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_id")

    private String endpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dns")

    private Boolean enableDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<String> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ip")

    private String portIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private List<String> whitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_whitelist")

    private Boolean enableWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement")

    private List<PolicyStatement> policyStatement = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_document")

    private Object policyDocument;

    /**
     * 指定终端节点的IP版本，仅专业型终端节点支持此参数。  - ipv4,  IPv4 - dualstack, 双栈
     */
    public static final class IpVersionEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final IpVersionEnum IPV4 = new IpVersionEnum("ipv4");

        /**
         * Enum DUALSTACK for value: "dualstack"
         */
        public static final IpVersionEnum DUALSTACK = new IpVersionEnum("dualstack");

        private static final Map<String, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpVersionEnum> createStaticFields() {
            Map<String, IpVersionEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("dualstack", DUALSTACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpVersionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private IpVersionEnum ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private String ipv6Address;

    public CreateEndpointRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 创建连接Interface类型终端节点服务的终端节点时，此参数必选。 需要指定vpc_id对应VPC下已创建的网络（network）的ID，UUID格式。 说明： - VPC的子网网段不能与198.19.128.0/17重叠 - VPC路由表中自定义路由的目的地址不能与198.19.128.0/17重叠
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateEndpointRequestBody withEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
        return this;
    }

    /**
     * 终端节点服务的ID。 可以通过查询终端节点服务概 要获取要连接的终端节点服务 ID。
     * @return endpointServiceId
     */
    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public CreateEndpointRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点所在的VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateEndpointRequestBody withEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
        return this;
    }

    /**
     * 是否创建域名。  - true：创建域名  - false：不创建域名 默认值为false。 说明 当创建gateway类型终端节点服务的终端节点时， “enable_dns”设置为true或者false，均不创建域名。
     * @return enableDns
     */
    public Boolean getEnableDns() {
        return enableDns;
    }

    public void setEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
    }

    public CreateEndpointRequestBody withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEndpointRequestBody addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEndpointRequestBody withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组。
     * @return tags
     */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public CreateEndpointRequestBody withRoutetables(List<String> routetables) {
        this.routetables = routetables;
        return this;
    }

    public CreateEndpointRequestBody addRoutetablesItem(String routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public CreateEndpointRequestBody withRoutetables(Consumer<List<String>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /**
     * 路由表ID列表。 创建gateway类型终端节点服务的终端节点时，此参数必选。 不设置此参数时，选择默认路由表。
     * @return routetables
     */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    public CreateEndpointRequestBody withPortIp(String portIp) {
        this.portIp = portIp;
        return this;
    }

    /**
     * 访问所连接的终端节点服务的IP。 创建终端节点时，可以指定访问所连接的终端节点服务的IP，目前只支持IPv4类型 。 创建连接Interface类型终端节点服务的终端节点时，此参数必选。
     * @return portIp
     */
    public String getPortIp() {
        return portIp;
    }

    public void setPortIp(String portIp) {
        this.portIp = portIp;
    }

    public CreateEndpointRequestBody withWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public CreateEndpointRequestBody addWhitelistItem(String whitelistItem) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        this.whitelist.add(whitelistItem);
        return this;
    }

    public CreateEndpointRequestBody withWhitelist(Consumer<List<String>> whitelistSetter) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /**
     * 添加用于控制访问终端节点的白名单。 创建终端节点时，支持访问控制，使用此参数可以添加IPv4或CIDR，默认空列表。 仅当创建连接Interface类型终端节点服务的终端节点时，支持设置此参数。
     * @return whitelist
     */
    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public CreateEndpointRequestBody withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    /**
     * 是否开启网络ACL隔离。
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    public CreateEndpointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述字段，支持中英文字母、数字等字符，不支持“<”或“>”字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEndpointRequestBody withPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
        return this;
    }

    public CreateEndpointRequestBody addPolicyStatementItem(PolicyStatement policyStatementItem) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        this.policyStatement.add(policyStatementItem);
        return this;
    }

    public CreateEndpointRequestBody withPolicyStatement(Consumer<List<PolicyStatement>> policyStatementSetter) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        policyStatementSetter.accept(this.policyStatement);
        return this;
    }

    /**
     * Gateway类型终端节点策略信息，仅限OBS、SFS的终端节点服务的enable_policy值为true时支持该参数。
     * @return policyStatement
     */
    public List<PolicyStatement> getPolicyStatement() {
        return policyStatement;
    }

    public void setPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
    }

    public CreateEndpointRequestBody withPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * 终端节点策略信息，仅当终端节点服务的enable_policy值为true时支持该参数，默认值为完全访问权限。（OBS、SFS的终端节点服务暂不支持该参数）
     * @return policyDocument
     */
    public Object getPolicyDocument() {
        return policyDocument;
    }

    public void setPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
    }

    public CreateEndpointRequestBody withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 指定终端节点的IP版本，仅专业型终端节点支持此参数。  - ipv4,  IPv4 - dualstack, 双栈
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateEndpointRequestBody withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * 访问所连接的终端节点服务的IPv6的地址。  创建终端节点时，可以指定访问所连接的终端节点服务的IP，不指定的情况下，会使用系统生成的一个地址。  仅专业型终端节点支持此参数。
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEndpointRequestBody that = (CreateEndpointRequestBody) obj;
        return Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.endpointServiceId, that.endpointServiceId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.enableDns, that.enableDns) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.routetables, that.routetables) && Objects.equals(this.portIp, that.portIp)
            && Objects.equals(this.whitelist, that.whitelist)
            && Objects.equals(this.enableWhitelist, that.enableWhitelist)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyStatement, that.policyStatement)
            && Objects.equals(this.policyDocument, that.policyDocument)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.ipv6Address, that.ipv6Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId,
            endpointServiceId,
            vpcId,
            enableDns,
            tags,
            routetables,
            portIp,
            whitelist,
            enableWhitelist,
            description,
            policyStatement,
            policyDocument,
            ipVersion,
            ipv6Address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointRequestBody {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    enableDns: ").append(toIndentedString(enableDns)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
        sb.append("    portIp: ").append(toIndentedString(portIp)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyStatement: ").append(toIndentedString(policyStatement)).append("\n");
        sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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
