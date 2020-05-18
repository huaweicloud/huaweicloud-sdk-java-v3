package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaSecurityGroupCommonGroup;
import com.huaweicloud.sdk.ecs.v2.model.NovaSecurityGroupCommonIpRange;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class NovaSecurityGroupCommonRule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from_port")
    
    private Integer fromPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private NovaSecurityGroupCommonGroup group = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_protocol")
    
    private String ipProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_range")
    
    private NovaSecurityGroupCommonIpRange ipRange = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_group_id")
    
    private String parentGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to_port")
    
    private Integer toPort;

    public NovaSecurityGroupCommonRule withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    


    /**
     * 起始端口，范围1-65535，且不大于to_port。 ip_protocol设置为icmp时，from_port表示type，范围是0-255。
     * @return fromPort
     */
    public Integer getFromPort() {
        return fromPort;
    }

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public NovaSecurityGroupCommonRule withGroup(NovaSecurityGroupCommonGroup group) {
        this.group = group;
        return this;
    }

    public NovaSecurityGroupCommonRule withGroup(Consumer<NovaSecurityGroupCommonGroup> groupSetter) {
        if(this.group == null ){
            this.group = new NovaSecurityGroupCommonGroup();
        }
        groupSetter.accept(this.group);
        return this;
    }


    /**
     * Get group
     * @return group
     */
    public NovaSecurityGroupCommonGroup getGroup() {
        return group;
    }

    public void setGroup(NovaSecurityGroupCommonGroup group) {
        this.group = group;
    }

    public NovaSecurityGroupCommonRule withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 安全组规则ID，UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaSecurityGroupCommonRule withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    


    /**
     * 协议类型或直接指定IP协议号，取值可为icmp，tcp，udp或IP协议号。
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public NovaSecurityGroupCommonRule withIpRange(NovaSecurityGroupCommonIpRange ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    public NovaSecurityGroupCommonRule withIpRange(Consumer<NovaSecurityGroupCommonIpRange> ipRangeSetter) {
        if(this.ipRange == null ){
            this.ipRange = new NovaSecurityGroupCommonIpRange();
        }
        ipRangeSetter.accept(this.ipRange);
        return this;
    }


    /**
     * Get ipRange
     * @return ipRange
     */
    public NovaSecurityGroupCommonIpRange getIpRange() {
        return ipRange;
    }

    public void setIpRange(NovaSecurityGroupCommonIpRange ipRange) {
        this.ipRange = ipRange;
    }

    public NovaSecurityGroupCommonRule withParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }

    


    /**
     * 相关联的安全组ID，UUID格式。
     * @return parentGroupId
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public NovaSecurityGroupCommonRule withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    


    /**
     * 终止端口，范围1-65535，且不小于from_port。 ip_protocol设置为icmp时，to_port表示code，范围是0-255，且如果from_port为-1，to_port为-1表示任意ICMP报文。
     * @return toPort
     */
    public Integer getToPort() {
        return toPort;
    }

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaSecurityGroupCommonRule novaSecurityGroupCommonRule = (NovaSecurityGroupCommonRule) o;
        return Objects.equals(this.fromPort, novaSecurityGroupCommonRule.fromPort) &&
            Objects.equals(this.group, novaSecurityGroupCommonRule.group) &&
            Objects.equals(this.id, novaSecurityGroupCommonRule.id) &&
            Objects.equals(this.ipProtocol, novaSecurityGroupCommonRule.ipProtocol) &&
            Objects.equals(this.ipRange, novaSecurityGroupCommonRule.ipRange) &&
            Objects.equals(this.parentGroupId, novaSecurityGroupCommonRule.parentGroupId) &&
            Objects.equals(this.toPort, novaSecurityGroupCommonRule.toPort);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fromPort, group, id, ipProtocol, ipRange, parentGroupId, toPort);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaSecurityGroupCommonRule {\n");
            sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
            sb.append("    group: ").append(toIndentedString(group)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
            sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
            sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
            sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
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

