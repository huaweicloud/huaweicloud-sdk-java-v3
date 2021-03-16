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
public class NeutronFirewallRule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 功能说明：对通过网络ACL的流量执行的操作。 取值范围：DENY（拒绝）/ALLOW（允许）
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof ActionEnum) {
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
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Integer ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_ip_address")
    
    private String destinationIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_port")
    
    private String destinationPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_ip_address")
    
    private String sourceIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_port")
    
    private String sourcePort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public NeutronFirewallRule withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 功能说明：网络ACL规则的uuid标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NeutronFirewallRule withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：网络ACL规则名称。 取值范围：0-255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NeutronFirewallRule withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：网络ACL规则描述 取值范围：0-255个字符长度
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronFirewallRule withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 功能说明：对通过网络ACL的流量执行的操作。 取值范围：DENY（拒绝）/ALLOW（允许）
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public NeutronFirewallRule withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 功能说明：IP协议 取值范围：支持TCP,UDP,ICMP, ICMPV6或者IP协议号（0-255）
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public NeutronFirewallRule withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * 功能说明：IP协议版本 取值范围：Ipv4/Ipv6
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

    

    public NeutronFirewallRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 功能说明：是否使能网络ACL规则。 取值范围：true/false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    

    public NeutronFirewallRule withDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    


    /**
     * 功能说明：目的地址或者CIDR。
     * @return destinationIpAddress
     */
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    

    public NeutronFirewallRule withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    


    /**
     * 功能说明：目的端口号或者一段端口范围。
     * @return destinationPort
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    

    public NeutronFirewallRule withSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    


    /**
     * 功能说明：源地址或者CIDR。
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    

    public NeutronFirewallRule withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    


    /**
     * 功能说明：源端口号或者一段端口范围。
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    

    public NeutronFirewallRule withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 功能说明：项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public NeutronFirewallRule withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 功能说明：项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronFirewallRule neutronFirewallRule = (NeutronFirewallRule) o;
        return Objects.equals(this.id, neutronFirewallRule.id) &&
            Objects.equals(this.name, neutronFirewallRule.name) &&
            Objects.equals(this.description, neutronFirewallRule.description) &&
            Objects.equals(this.action, neutronFirewallRule.action) &&
            Objects.equals(this.protocol, neutronFirewallRule.protocol) &&
            Objects.equals(this.ipVersion, neutronFirewallRule.ipVersion) &&
            Objects.equals(this.enabled, neutronFirewallRule.enabled) &&
            Objects.equals(this.destinationIpAddress, neutronFirewallRule.destinationIpAddress) &&
            Objects.equals(this.destinationPort, neutronFirewallRule.destinationPort) &&
            Objects.equals(this.sourceIpAddress, neutronFirewallRule.sourceIpAddress) &&
            Objects.equals(this.sourcePort, neutronFirewallRule.sourcePort) &&
            Objects.equals(this.tenantId, neutronFirewallRule.tenantId) &&
            Objects.equals(this.projectId, neutronFirewallRule.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, action, protocol, ipVersion, enabled, destinationIpAddress, destinationPort, sourceIpAddress, sourcePort, tenantId, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronFirewallRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
        sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

