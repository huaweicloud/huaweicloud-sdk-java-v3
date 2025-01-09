package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSecurityGroupRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private List<String> securityGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_group_id")

    private List<String> remoteGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ip_prefix")

    private String remoteIpPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private List<Integer> priority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethertype")

    private List<String> ethertype = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_address_group_id")

    private List<String> remoteAddressGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public ListSecurityGroupRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回个数 取值范围：0-2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityGroupRulesRequest withMarker(String marker) {
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

    public ListSecurityGroupRulesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListSecurityGroupRulesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 功能说明：安全组规则ID，支持多个ID过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListSecurityGroupRulesRequest withSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public ListSecurityGroupRulesRequest addSecurityGroupIdItem(String securityGroupIdItem) {
        if (this.securityGroupId == null) {
            this.securityGroupId = new ArrayList<>();
        }
        this.securityGroupId.add(securityGroupIdItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withSecurityGroupId(Consumer<List<String>> securityGroupIdSetter) {
        if (this.securityGroupId == null) {
            this.securityGroupId = new ArrayList<>();
        }
        securityGroupIdSetter.accept(this.securityGroupId);
        return this;
    }

    /**
     * 功能说明：安全组规则所属安全组ID，支持多个ID过滤
     * @return securityGroupId
     */
    public List<String> getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ListSecurityGroupRulesRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public ListSecurityGroupRulesRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * 功能说明：安全组规则协议，支持多条过滤
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public ListSecurityGroupRulesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListSecurityGroupRulesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 功能说明：安全组规则的描述，支持多个描述同时过滤
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListSecurityGroupRulesRequest withRemoteGroupId(List<String> remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    public ListSecurityGroupRulesRequest addRemoteGroupIdItem(String remoteGroupIdItem) {
        if (this.remoteGroupId == null) {
            this.remoteGroupId = new ArrayList<>();
        }
        this.remoteGroupId.add(remoteGroupIdItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withRemoteGroupId(Consumer<List<String>> remoteGroupIdSetter) {
        if (this.remoteGroupId == null) {
            this.remoteGroupId = new ArrayList<>();
        }
        remoteGroupIdSetter.accept(this.remoteGroupId);
        return this;
    }

    /**
     * 功能说明：远端安全组ID，支持多ID过滤
     * @return remoteGroupId
     */
    public List<String> getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(List<String> remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    public ListSecurityGroupRulesRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 功能说明：安全组规则方向
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListSecurityGroupRulesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 功能说明：安全组规则生效策略。 取值范围：allow表示允许，deny表示拒绝。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListSecurityGroupRulesRequest withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    /**
     * 功能说明：远端IP地址 取值范围：cidr格式
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    public ListSecurityGroupRulesRequest withPriority(List<Integer> priority) {
        this.priority = priority;
        return this;
    }

    public ListSecurityGroupRulesRequest addPriorityItem(Integer priorityItem) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        this.priority.add(priorityItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withPriority(Consumer<List<Integer>> prioritySetter) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        prioritySetter.accept(this.priority);
        return this;
    }

    /**
     * 功能说明：优先级，支持多条过滤。
     * @return priority
     */
    public List<Integer> getPriority() {
        return priority;
    }

    public void setPriority(List<Integer> priority) {
        this.priority = priority;
    }

    public ListSecurityGroupRulesRequest withEthertype(List<String> ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public ListSecurityGroupRulesRequest addEthertypeItem(String ethertypeItem) {
        if (this.ethertype == null) {
            this.ethertype = new ArrayList<>();
        }
        this.ethertype.add(ethertypeItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withEthertype(Consumer<List<String>> ethertypeSetter) {
        if (this.ethertype == null) {
            this.ethertype = new ArrayList<>();
        }
        ethertypeSetter.accept(this.ethertype);
        return this;
    }

    /**
     * 功能说明：IP协议类型，支持多条过滤。 取值范围：IPv4,IPv6,ipv4,ipv6
     * @return ethertype
     */
    public List<String> getEthertype() {
        return ethertype;
    }

    public void setEthertype(List<String> ethertype) {
        this.ethertype = ethertype;
    }

    public ListSecurityGroupRulesRequest withRemoteAddressGroupId(List<String> remoteAddressGroupId) {
        this.remoteAddressGroupId = remoteAddressGroupId;
        return this;
    }

    public ListSecurityGroupRulesRequest addRemoteAddressGroupIdItem(String remoteAddressGroupIdItem) {
        if (this.remoteAddressGroupId == null) {
            this.remoteAddressGroupId = new ArrayList<>();
        }
        this.remoteAddressGroupId.add(remoteAddressGroupIdItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withRemoteAddressGroupId(Consumer<List<String>> remoteAddressGroupIdSetter) {
        if (this.remoteAddressGroupId == null) {
            this.remoteAddressGroupId = new ArrayList<>();
        }
        remoteAddressGroupIdSetter.accept(this.remoteAddressGroupId);
        return this;
    }

    /**
     * 功能说明：远端IP地址组ID，支持多ID过滤。
     * @return remoteAddressGroupId
     */
    public List<String> getRemoteAddressGroupId() {
        return remoteAddressGroupId;
    }

    public void setRemoteAddressGroupId(List<String> remoteAddressGroupId) {
        this.remoteAddressGroupId = remoteAddressGroupId;
    }

    public ListSecurityGroupRulesRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 功能说明：是否启用安全组规则，不支持多值过滤。 取值范围：true, false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityGroupRulesRequest that = (ListSecurityGroupRulesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.description, that.description)
            && Objects.equals(this.remoteGroupId, that.remoteGroupId) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.action, that.action) && Objects.equals(this.remoteIpPrefix, that.remoteIpPrefix)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.ethertype, that.ethertype)
            && Objects.equals(this.remoteAddressGroupId, that.remoteAddressGroupId)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            id,
            securityGroupId,
            protocol,
            description,
            remoteGroupId,
            direction,
            action,
            remoteIpPrefix,
            priority,
            ethertype,
            remoteAddressGroupId,
            enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupRulesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    remoteAddressGroupId: ").append(toIndentedString(remoteAddressGroupId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
