package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主机信息
 */
public class Hosts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    private String autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public Hosts withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 主机所属AZ。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Hosts withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hosts withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * 在创建云服务器时（未指定主机ID），是否允许云服务器自动分配在一台可用的主机上。取值范围：“on”或“off”默认为 “on”。
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public Hosts withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public Hosts withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 待分配的主机数量
     * minimum: 1
     * maximum: 300
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Hosts withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 主机产品Id
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hosts that = (Hosts) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.name, that.name)
            && Objects.equals(this.autoPlacement, that.autoPlacement) && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.quantity, that.quantity) && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, name, autoPlacement, hostType, quantity, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hosts {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
