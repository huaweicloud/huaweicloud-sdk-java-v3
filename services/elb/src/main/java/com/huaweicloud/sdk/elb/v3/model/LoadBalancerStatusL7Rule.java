package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：查询负载均衡状态树返回对象中的rule数据模型。  **默认取值**：不涉及
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
     * **参数解释**：L7转发规则ID。  **取值范围**：不涉及
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
     * **参数解释**：匹配内容类型。  **取值范围**： - HOST_NAME：域名匹配。 - PATH：URL路径匹配。
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
     * **参数解释**：转发规则的配置状态。  **取值范围**： - ACTIVE：使用中，默认值。 - ERROR：当前规则所属策略与同一监听器下的其他策略存在相同的规则配置。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadBalancerStatusL7Rule that = (LoadBalancerStatusL7Rule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus);
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
