package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ddos状态响应体
 */
public class DDosStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    private String floatingIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_address")

    private String floatingIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_threshold")

    private Long cleanThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_threshold")

    private String blockThreshold;

    public DDosStatus withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    /**
     * EIP的ID
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public DDosStatus withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    /**
     * 浮动IP地址
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public DDosStatus withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * EIP所属类型，可选范围： - Anti-DDoS：eip属于Anti-DDoS流量清洗 - CNAD：eip属于DDoS原生高级防护
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public DDosStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态，可选范围： - normal：表示正常 - configging：表示设置中 - notConfig：表示未设置 - packetcleaning：表示清洗 - packetdropping：表示黑洞
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DDosStatus withCleanThreshold(Long cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
        return this;
    }

    /**
     * 清洗阈值
     * @return cleanThreshold
     */
    public Long getCleanThreshold() {
        return cleanThreshold;
    }

    public void setCleanThreshold(Long cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
    }

    public DDosStatus withBlockThreshold(String blockThreshold) {
        this.blockThreshold = blockThreshold;
        return this;
    }

    /**
     * 黑洞阈值
     * @return blockThreshold
     */
    public String getBlockThreshold() {
        return blockThreshold;
    }

    public void setBlockThreshold(String blockThreshold) {
        this.blockThreshold = blockThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DDosStatus that = (DDosStatus) obj;
        return Objects.equals(this.floatingIpId, that.floatingIpId)
            && Objects.equals(this.floatingIpAddress, that.floatingIpAddress)
            && Objects.equals(this.productType, that.productType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cleanThreshold, that.cleanThreshold)
            && Objects.equals(this.blockThreshold, that.blockThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingIpId, floatingIpAddress, productType, status, cleanThreshold, blockThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DDosStatus {\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cleanThreshold: ").append(toIndentedString(cleanThreshold)).append("\n");
        sb.append("    blockThreshold: ").append(toIndentedString(blockThreshold)).append("\n");
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
