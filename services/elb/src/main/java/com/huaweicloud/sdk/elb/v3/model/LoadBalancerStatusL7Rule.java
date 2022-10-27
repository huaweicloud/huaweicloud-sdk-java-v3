package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询负载均衡状态树返回对象中的rule数据模型。
 */
public class LoadBalancerStatusL7Rule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    public LoadBalancerStatusL7Rule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * L7转发规则ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerStatusL7Rule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 匹配内容类型。  取值： - HOST_NAME：域名匹配。 - PATH：URL路径匹配。  使用说明： 同一个l7policy下创建的所有的l7rule的HOST_NAME不能重复。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LoadBalancerStatusL7Rule withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 转发规则的配置状态。  取值： - ACTIVE：使用中，默认值。 - ERROR：当前规则所属策略与同一监听器下的其他策略存在相同的规则配置。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusL7Rule loadBalancerStatusL7Rule = (LoadBalancerStatusL7Rule) o;
        return Objects.equals(this.id, loadBalancerStatusL7Rule.id)
            && Objects.equals(this.type, loadBalancerStatusL7Rule.type)
            && Objects.equals(this.provisioningStatus, loadBalancerStatusL7Rule.provisioningStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, provisioningStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusL7Rule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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
