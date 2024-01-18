package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_size")

    private Integer diskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_num")

    private Integer diskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_period")

    private Boolean isPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deh_id")

    private String dehId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public CheckQuotaRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品id。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CheckQuotaRequest withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订单需要创建总实例数、订购数量。
     * minimum: 1
     * maximum: 100
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    public CheckQuotaRequest withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * 单台实例所需的磁盘大小（最大系统盘1块*1024、数据盘10块*32768）。
     * minimum: 10
     * maximum: 328704
     * @return diskSize
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public CheckQuotaRequest withDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
        return this;
    }

    /**
     * 单台实例所需的磁盘数量（最大系统盘1块、数据盘10块）。
     * minimum: 1
     * maximum: 11
     * @return diskNum
     */
    public Integer getDiskNum() {
        return diskNum;
    }

    public void setDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
    }

    public CheckQuotaRequest withIsPeriod(Boolean isPeriod) {
        this.isPeriod = isPeriod;
        return this;
    }

    /**
     * 是否包周期。
     * @return isPeriod
     */
    public Boolean getIsPeriod() {
        return isPeriod;
    }

    public void setIsPeriod(Boolean isPeriod) {
        this.isPeriod = isPeriod;
    }

    public CheckQuotaRequest withDehId(String dehId) {
        this.dehId = dehId;
        return this;
    }

    /**
     * 主机id。
     * @return dehId
     */
    public String getDehId() {
        return dehId;
    }

    public void setDehId(String dehId) {
        this.dehId = dehId;
    }

    public CheckQuotaRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云专属分布式存储池id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckQuotaRequest that = (CheckQuotaRequest) obj;
        return Objects.equals(this.productId, that.productId)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum)
            && Objects.equals(this.diskSize, that.diskSize) && Objects.equals(this.diskNum, that.diskNum)
            && Objects.equals(this.isPeriod, that.isPeriod) && Objects.equals(this.dehId, that.dehId)
            && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, subscriptionNum, diskSize, diskNum, isPeriod, dehId, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckQuotaRequest {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
        sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
        sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
        sb.append("    isPeriod: ").append(toIndentedString(isPeriod)).append("\n");
        sb.append("    dehId: ").append(toIndentedString(dehId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
