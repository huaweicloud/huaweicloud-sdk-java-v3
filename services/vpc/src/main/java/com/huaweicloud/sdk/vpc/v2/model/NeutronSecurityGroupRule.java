package com.huaweicloud.sdk.vpc.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NeutronSecurityGroupRule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 功能说明：规则方向 取值范围：ingress、egress
     */
    public static final class DirectionEnum {

        
        /**
         * Enum INGRESS for value: "ingress"
         */
        public static final DirectionEnum INGRESS = new DirectionEnum("ingress");
        
        /**
         * Enum EGRESS for value: "egress"
         */
        public static final DirectionEnum EGRESS = new DirectionEnum("egress");
        

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("ingress", INGRESS);
            map.put("egress", EGRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direction")
    
    private DirectionEnum direction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ethertype")
    
    private String ethertype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_max")
    
    private Integer portRangeMax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_min")
    
    private Integer portRangeMin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_group_id")
    
    private String remoteGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_ip_prefix")
    
    private String remoteIpPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private OffsetDateTime updatedAt;

    public NeutronSecurityGroupRule withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 安全组规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronSecurityGroupRule withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    


    /**
     * 功能说明：规则方向 取值范围：ingress、egress
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    

    public NeutronSecurityGroupRule withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    


    /**
     * 功能说明：网络类型 取值范围：IPv4、IPv6
     * @return ethertype
     */
    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    

    public NeutronSecurityGroupRule withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 安全组规则ID，查询安全组规则非必选
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NeutronSecurityGroupRule withPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
        return this;
    }

    


    /**
     * 功能说明：最大端口 取值范围：当协议类型为ICMP时，该值表示ICMP的code
     * @return portRangeMax
     */
    public Integer getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    

    public NeutronSecurityGroupRule withPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
        return this;
    }

    


    /**
     * 功能说明：最小端口 当协议类型为ICMP时，该值表示ICMP的type。protocol为tcp和udp时，port_range_max和port_range_min必须同时输入，且port_range_max应大于等于port_range_min。protocol为icmp时，指定ICMP code（port_range_max）时，必须同时指定ICMP type（port_range_min）。
     * @return portRangeMin
     */
    public Integer getPortRangeMin() {
        return portRangeMin;
    }

    public void setPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
    }

    

    public NeutronSecurityGroupRule withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 功能说明：tcp/udp/icmp/icmpv6或IP协议编号（0~255） 约束：协议为icmpv6时，网络类型应该为IPv6；协议为icmp时，网络类型应该为IPv4
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public NeutronSecurityGroupRule withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    


    /**
     * 所属安全组的对端ID
     * @return remoteGroupId
     */
    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    

    public NeutronSecurityGroupRule withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    


    /**
     * 对端ip网段
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    

    public NeutronSecurityGroupRule withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 所属安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public NeutronSecurityGroupRule withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public NeutronSecurityGroupRule withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public NeutronSecurityGroupRule withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 功能说明：资源创建UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

    public NeutronSecurityGroupRule withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 功能说明：资源更新UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronSecurityGroupRule neutronSecurityGroupRule = (NeutronSecurityGroupRule) o;
        return Objects.equals(this.description, neutronSecurityGroupRule.description) &&
            Objects.equals(this.direction, neutronSecurityGroupRule.direction) &&
            Objects.equals(this.ethertype, neutronSecurityGroupRule.ethertype) &&
            Objects.equals(this.id, neutronSecurityGroupRule.id) &&
            Objects.equals(this.portRangeMax, neutronSecurityGroupRule.portRangeMax) &&
            Objects.equals(this.portRangeMin, neutronSecurityGroupRule.portRangeMin) &&
            Objects.equals(this.protocol, neutronSecurityGroupRule.protocol) &&
            Objects.equals(this.remoteGroupId, neutronSecurityGroupRule.remoteGroupId) &&
            Objects.equals(this.remoteIpPrefix, neutronSecurityGroupRule.remoteIpPrefix) &&
            Objects.equals(this.securityGroupId, neutronSecurityGroupRule.securityGroupId) &&
            Objects.equals(this.tenantId, neutronSecurityGroupRule.tenantId) &&
            Objects.equals(this.projectId, neutronSecurityGroupRule.projectId) &&
            Objects.equals(this.createdAt, neutronSecurityGroupRule.createdAt) &&
            Objects.equals(this.updatedAt, neutronSecurityGroupRule.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, direction, ethertype, id, portRangeMax, portRangeMin, protocol, remoteGroupId, remoteIpPrefix, securityGroupId, tenantId, projectId, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronSecurityGroupRule {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    portRangeMax: ").append(toIndentedString(portRangeMax)).append("\n");
        sb.append("    portRangeMin: ").append(toIndentedString(portRangeMin)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

