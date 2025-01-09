package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSharerProductsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_size")

    private String shareSpaceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_gpu")

    private Integer isGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListSharerProductsRequest withProductId(String productId) {
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

    public ListSharerProductsRequest withShareSpaceSize(String shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
        return this;
    }

    /**
     * 协同方数。该套餐支持的最大协同人数。
     * @return shareSpaceSize
     */
    public String getShareSpaceSize() {
        return shareSpaceSize;
    }

    public void setShareSpaceSize(String shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
    }

    public ListSharerProductsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 周期套餐标识。0表示包周期，1表示按需, 6表示一次性计费。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListSharerProductsRequest withIsGpu(Integer isGpu) {
        this.isGpu = isGpu;
        return this;
    }

    /**
     * 是否是GPU套餐。1表示GPU套餐，0表示非GPU套餐，默认null查询所有类型
     * minimum: 0
     * maximum: 1
     * @return isGpu
     */
    public Integer getIsGpu() {
        return isGpu;
    }

    public void setIsGpu(Integer isGpu) {
        this.isGpu = isGpu;
    }

    public ListSharerProductsRequest withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐系列。user_sharer表示用户协同套餐，desktop_sharer表示桌面协同套餐
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ListSharerProductsRequest withLimit(Integer limit) {
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

    public ListSharerProductsRequest withOffset(Integer offset) {
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
        ListSharerProductsRequest that = (ListSharerProductsRequest) obj;
        return Objects.equals(this.productId, that.productId)
            && Objects.equals(this.shareSpaceSize, that.shareSpaceSize)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.isGpu, that.isGpu)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, shareSpaceSize, chargeMode, isGpu, packageType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharerProductsRequest {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    shareSpaceSize: ").append(toIndentedString(shareSpaceSize)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    isGpu: ").append(toIndentedString(isGpu)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
