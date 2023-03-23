package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建SNAT规则的请求体。
 */
public class CreatePrivateSnatOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_ids")

    private List<String> transitIpIds = null;

    public CreatePrivateSnatOption withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CreatePrivateSnatOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：规则匹配的CIDR。取值约束：与virsubnet_id参数二选一。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreatePrivateSnatOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 功能说明：规则匹配的子网的ID。 取值约束：与cidr参数二选一。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public CreatePrivateSnatOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SNAT规则的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePrivateSnatOption withTransitIpIds(List<String> transitIpIds) {
        this.transitIpIds = transitIpIds;
        return this;
    }

    public CreatePrivateSnatOption addTransitIpIdsItem(String transitIpIdsItem) {
        if (this.transitIpIds == null) {
            this.transitIpIds = new ArrayList<>();
        }
        this.transitIpIds.add(transitIpIdsItem);
        return this;
    }

    public CreatePrivateSnatOption withTransitIpIds(Consumer<List<String>> transitIpIdsSetter) {
        if (this.transitIpIds == null) {
            this.transitIpIds = new ArrayList<>();
        }
        transitIpIdsSetter.accept(this.transitIpIds);
        return this;
    }

    /**
     * 功能说明：中转IP的ID的列表。 取值约束：中转IP的ID个数不能超过1个。
     * @return transitIpIds
     */
    public List<String> getTransitIpIds() {
        return transitIpIds;
    }

    public void setTransitIpIds(List<String> transitIpIds) {
        this.transitIpIds = transitIpIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrivateSnatOption createPrivateSnatOption = (CreatePrivateSnatOption) o;
        return Objects.equals(this.gatewayId, createPrivateSnatOption.gatewayId)
            && Objects.equals(this.cidr, createPrivateSnatOption.cidr)
            && Objects.equals(this.virsubnetId, createPrivateSnatOption.virsubnetId)
            && Objects.equals(this.description, createPrivateSnatOption.description)
            && Objects.equals(this.transitIpIds, createPrivateSnatOption.transitIpIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, cidr, virsubnetId, description, transitIpIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateSnatOption {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    transitIpIds: ").append(toIndentedString(transitIpIds)).append("\n");
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
