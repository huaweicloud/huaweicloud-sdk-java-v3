package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto create Response Object
 */
public class BandwidthPkgResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processedTime")

    private String processedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthId")

    private String bandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkgSize")

    private Integer pkgSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingInfo")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public BandwidthPkgResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * - 功能说明：加油包ID - 取值范围：1-64，支持数字、字母、中文、_(下划线)、-（中划线）
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BandwidthPkgResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * - 功能说明：加油包名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public BandwidthPkgResp withProcessedTime(String processedTime) {
        this.processedTime = processedTime;
        return this;
    }

    /**
     * - 功能说明：资源创建时间，UTC时间格式：2016-03-28T00:00:00Z
     * @return processedTime
     */
    public String getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(String processedTime) {
        this.processedTime = processedTime;
    }

    public BandwidthPkgResp withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * - 功能说明：加油包绑定的原带宽ID
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public BandwidthPkgResp withPkgSize(Integer pkgSize) {
        this.pkgSize = pkgSize;
        return this;
    }

    /**
     * - 功能说明：加油包的大小，即在原始带宽之上提升的带宽大小 - 取值范围：>1M，pkgSize+原始带宽大小 < 云服务带宽接口限制的带宽上限
     * @return pkgSize
     */
    public Integer getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(Integer pkgSize) {
        this.pkgSize = pkgSize;
    }

    public BandwidthPkgResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * - 功能说明：租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public BandwidthPkgResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * - 功能说明：加油包订单相关信息格式：非空时值为''orderId:productId''
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public BandwidthPkgResp withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * - 功能说明：加油包起始生效时间，UTC时间格式：2016-03-28T00:00:00Z - 取值范围：startTime >= 服务处理请求的时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BandwidthPkgResp withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * - 功能说明：加油包结束时间UTC时间格式：2016-03-28T00:00:00Z - 取值范围：startTime < endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BandwidthPkgResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - 功能说明：加油包资源状态，仅管理员权限可以变更状态 - 取值范围：''pending'', ''active'', ''completed'', ''error''
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthPkgResp that = (BandwidthPkgResp) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.processedTime, that.processedTime)
            && Objects.equals(this.bandwidthId, that.bandwidthId) && Objects.equals(this.pkgSize, that.pkgSize)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            resourceName,
            processedTime,
            bandwidthId,
            pkgSize,
            tenantId,
            billingInfo,
            startTime,
            endTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPkgResp {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    pkgSize: ").append(toIndentedString(pkgSize)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
