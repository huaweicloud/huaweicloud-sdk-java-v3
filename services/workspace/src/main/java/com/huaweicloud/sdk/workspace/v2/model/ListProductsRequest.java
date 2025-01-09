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
    @JsonProperty(value = "flavor_id")

    private String flavorId;

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
    @JsonProperty(value = "deh_product_id")

    private String dehProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deh")

    private Boolean isDeh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products_range")

    private String productsRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

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

    public ListProductsRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 产品flavor_id。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
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

    public ListProductsRequest withDehProductId(String dehProductId) {
        this.dehProductId = dehProductId;
        return this;
    }

    /**
     * wdh套餐id。
     * @return dehProductId
     */
    public String getDehProductId() {
        return dehProductId;
    }

    public void setDehProductId(String dehProductId) {
        this.dehProductId = dehProductId;
    }

    public ListProductsRequest withIsDeh(Boolean isDeh) {
        this.isDeh = isDeh;
        return this;
    }

    /**
     * 是否为wdh产品。
     * @return isDeh
     */
    public Boolean getIsDeh() {
        return isDeh;
    }

    public void setIsDeh(Boolean isDeh) {
        this.isDeh = isDeh;
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

    public ListProductsRequest withProductsRange(String productsRange) {
        this.productsRange = productsRange;
        return this;
    }

    /**
     * 查询套餐的范围(all：查询所有套餐，包括培训版；若为null则不包含培训版套餐）
     * @return productsRange
     */
    public String getProductsRange() {
        return productsRange;
    }

    public void setProductsRange(String productsRange) {
        this.productsRange = productsRange;
    }

    public ListProductsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，范围0-100，默认100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProductsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认0。
     * minimum: 0
     * maximum: 5000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProductsRequest that = (ListProductsRequest) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.dehProductId, that.dehProductId) && Objects.equals(this.isDeh, that.isDeh)
            && Objects.equals(this.packageType, that.packageType)
            && Objects.equals(this.productsRange, that.productsRange) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            flavorId,
            availabilityZone,
            osType,
            chargeMode,
            architecture,
            dehProductId,
            isDeh,
            packageType,
            productsRange,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRequest {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    dehProductId: ").append(toIndentedString(dehProductId)).append("\n");
        sb.append("    isDeh: ").append(toIndentedString(isDeh)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    productsRange: ").append(toIndentedString(productsRange)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
