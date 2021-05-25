package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronListSecurityGroupRulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direction")
    
    private String direction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ethertype")
    
    private String ethertype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_ip_prefix")
    
    private String remoteIpPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_group_id")
    
    private String remoteGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_max")
    
    private String portRangeMax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_min")
    
    private String portRangeMin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;

    public NeutronListSecurityGroupRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public NeutronListSecurityGroupRulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页查询起始的资源ID，为空时查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public NeutronListSecurityGroupRulesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 按照安全组规则对应的id过滤查询结果
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NeutronListSecurityGroupRulesRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    


    /**
     * 按照安全组规则的方向过滤查询结果，支持ingress和egress进行过滤
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    

    public NeutronListSecurityGroupRulesRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 按照安全组规则的IP协议过滤查询结果
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public NeutronListSecurityGroupRulesRequest withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    


    /**
     * 按照网络类型过滤查询结果，支持IPv4或者IPv6
     * @return ethertype
     */
    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    

    public NeutronListSecurityGroupRulesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 按照安全组规则的描述过滤查询结果
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronListSecurityGroupRulesRequest withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    


    /**
     * 按照与此安全组规则匹配的远端IP网段过滤查询结果
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    

    public NeutronListSecurityGroupRulesRequest withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    


    /**
     * 按照与此安全组规则关联的远端安全组ID过滤查询结果
     * @return remoteGroupId
     */
    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    

    public NeutronListSecurityGroupRulesRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 按照与此安全组规则所属的安全组ID过滤查询结果
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public NeutronListSecurityGroupRulesRequest withPortRangeMax(String portRangeMax) {
        this.portRangeMax = portRangeMax;
        return this;
    }

    


    /**
     * 按照最大端口过滤查询结果
     * @return portRangeMax
     */
    public String getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(String portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    

    public NeutronListSecurityGroupRulesRequest withPortRangeMin(String portRangeMin) {
        this.portRangeMin = portRangeMin;
        return this;
    }

    


    /**
     * 按照最小端口过滤查询结果
     * @return portRangeMin
     */
    public String getPortRangeMin() {
        return portRangeMin;
    }

    public void setPortRangeMin(String portRangeMin) {
        this.portRangeMin = portRangeMin;
    }

    

    public NeutronListSecurityGroupRulesRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 按照安全组规则所属的项目ID过滤查询结果
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListSecurityGroupRulesRequest neutronListSecurityGroupRulesRequest = (NeutronListSecurityGroupRulesRequest) o;
        return Objects.equals(this.limit, neutronListSecurityGroupRulesRequest.limit) &&
            Objects.equals(this.marker, neutronListSecurityGroupRulesRequest.marker) &&
            Objects.equals(this.id, neutronListSecurityGroupRulesRequest.id) &&
            Objects.equals(this.direction, neutronListSecurityGroupRulesRequest.direction) &&
            Objects.equals(this.protocol, neutronListSecurityGroupRulesRequest.protocol) &&
            Objects.equals(this.ethertype, neutronListSecurityGroupRulesRequest.ethertype) &&
            Objects.equals(this.description, neutronListSecurityGroupRulesRequest.description) &&
            Objects.equals(this.remoteIpPrefix, neutronListSecurityGroupRulesRequest.remoteIpPrefix) &&
            Objects.equals(this.remoteGroupId, neutronListSecurityGroupRulesRequest.remoteGroupId) &&
            Objects.equals(this.securityGroupId, neutronListSecurityGroupRulesRequest.securityGroupId) &&
            Objects.equals(this.portRangeMax, neutronListSecurityGroupRulesRequest.portRangeMax) &&
            Objects.equals(this.portRangeMin, neutronListSecurityGroupRulesRequest.portRangeMin) &&
            Objects.equals(this.tenantId, neutronListSecurityGroupRulesRequest.tenantId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, direction, protocol, ethertype, description, remoteIpPrefix, remoteGroupId, securityGroupId, portRangeMax, portRangeMin, tenantId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListSecurityGroupRulesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    portRangeMax: ").append(toIndentedString(portRangeMax)).append("\n");
        sb.append("    portRangeMin: ").append(toIndentedString(portRangeMin)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

