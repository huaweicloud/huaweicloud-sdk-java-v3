package com.huaweicloud.sdk.vpc.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NeutronUpdateFirewallRuleOption  {

    /**
     * 对通过网络ACL防火墙的流量执行的操作。
     */
    public static final class ActionEnum {

        
        /**
         * Enum DENY for value: "DENY"
         */
        public static final ActionEnum DENY = new ActionEnum("DENY");
        
        /**
         * Enum ALLOW for value: "ALLOW"
         */
        public static final ActionEnum ALLOW = new ActionEnum("ALLOW");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("DENY", DENY);
            map.put("ALLOW", ALLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_ip_address")
    
    private String destinationIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_port")
    
    private String destinationPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Integer ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_ip_address")
    
    private String sourceIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_port")
    
    private String sourcePort;

    public NeutronUpdateFirewallRuleOption withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 对通过网络ACL防火墙的流量执行的操作。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public NeutronUpdateFirewallRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 网络ACL防火墙规则描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronUpdateFirewallRuleOption withDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    


    /**
     * 目的地址或者CIDR。
     * @return destinationIpAddress
     */
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    

    public NeutronUpdateFirewallRuleOption withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    


    /**
     * 目的端口号或者一段端口范围。
     * @return destinationPort
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    

    public NeutronUpdateFirewallRuleOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 是否使能网络ACL防火墙规则。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    

    public NeutronUpdateFirewallRuleOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * IP协议版本。
     * minimum: 4
     * maximum: 6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    

    public NeutronUpdateFirewallRuleOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 网络ACL防火墙规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NeutronUpdateFirewallRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * IP协议，支持TCP,UDP,ICMP, ICMPV6或者IP协议号（0-255）
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public NeutronUpdateFirewallRuleOption withSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    


    /**
     * 源地址或者CIDR。
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    

    public NeutronUpdateFirewallRuleOption withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    


    /**
     * 源端口号或者一段端口范围。
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallRuleOption neutronUpdateFirewallRuleOption = (NeutronUpdateFirewallRuleOption) o;
        return Objects.equals(this.action, neutronUpdateFirewallRuleOption.action) &&
            Objects.equals(this.description, neutronUpdateFirewallRuleOption.description) &&
            Objects.equals(this.destinationIpAddress, neutronUpdateFirewallRuleOption.destinationIpAddress) &&
            Objects.equals(this.destinationPort, neutronUpdateFirewallRuleOption.destinationPort) &&
            Objects.equals(this.enabled, neutronUpdateFirewallRuleOption.enabled) &&
            Objects.equals(this.ipVersion, neutronUpdateFirewallRuleOption.ipVersion) &&
            Objects.equals(this.name, neutronUpdateFirewallRuleOption.name) &&
            Objects.equals(this.protocol, neutronUpdateFirewallRuleOption.protocol) &&
            Objects.equals(this.sourceIpAddress, neutronUpdateFirewallRuleOption.sourceIpAddress) &&
            Objects.equals(this.sourcePort, neutronUpdateFirewallRuleOption.sourcePort);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, description, destinationIpAddress, destinationPort, enabled, ipVersion, name, protocol, sourceIpAddress, sourcePort);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallRuleOption {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
        sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
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

