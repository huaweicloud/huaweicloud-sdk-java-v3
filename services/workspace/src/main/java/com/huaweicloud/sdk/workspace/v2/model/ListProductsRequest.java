package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProductsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    public ListProductsRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListProductsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListProductsRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 产品套餐的操作系统类型，当前支持：Windows、Linux。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListProductsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 周期套餐标识。0表示包周期，1表示按需。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListProductsRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 架构类型，当前支持：arm、x86。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ListProductsRequest withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐系列。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductsRequest listProductsRequest = (ListProductsRequest) o;
        return Objects.equals(this.productId, listProductsRequest.productId)
            && Objects.equals(this.availabilityZone, listProductsRequest.availabilityZone)
            && Objects.equals(this.osType, listProductsRequest.osType)
            && Objects.equals(this.chargeMode, listProductsRequest.chargeMode)
            && Objects.equals(this.architecture, listProductsRequest.architecture)
            && Objects.equals(this.packageType, listProductsRequest.packageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, availabilityZone, osType, chargeMode, architecture, packageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRequest {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
