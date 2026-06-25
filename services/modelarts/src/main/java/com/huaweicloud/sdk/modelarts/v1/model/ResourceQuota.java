package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源配额参数。
 */
public class ResourceQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private String quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    public ResourceQuota withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源类型 **取值范围**：可选值如下： -  VPC：虚拟私有云。 -  SUBNET：子网。 -  SECURITY_GROUP：安全组。 -  SECURITY_GROUP_RULE：安全组规则。 -  PUBLIC_IP：公网IP。 -  VPC_PEER：VPC对端链接个数。 -  FIREWALL：防火墙。 -  SHARE_BANDWIDTH：共享带宽。 -  SHARE_BANDWIDTH_IP：共享带宽IP。 -  LOADBALANCER：负载均衡。 -  LISTENER：监听器。 -  PHYSICAL_CONNECT：物理连接。 -  VIRTUAL_INTERFACE：虚拟接口。 -  VPC_CONTAIN_ROUTETABLE：VPC包含的路由表。 -  ROUTETABLE_CONTAIN_ROUTES：路由表包含的路由。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceQuota withQuota(String quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**： 资源配额上限。 **取值范围**： 不涉及。
     * @return quota
     */
    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public ResourceQuota withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**： 已使用配额。 **取值范围**： 不涉及。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceQuota that = (ResourceQuota) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceQuota {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
