package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulScanTaskHostInfo
 */
public class VulScanTaskHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private List<VulScanTaskHostInfoFailedReasons> failedReasons = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_scan_details")

    private List<VulScanTaskHostInfoVulScanDetails> vulScanDetails = null;

    public VulScanTaskHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public VulScanTaskHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulScanTaskHostInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public VulScanTaskHostInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP地址
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public VulScanTaskHostInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下:   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public VulScanTaskHostInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 主机的扫描状态，包含如下：   -scanning : 扫描中   -success : 扫描成功   -failed : 扫描失败
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public VulScanTaskHostInfo withFailedReasons(List<VulScanTaskHostInfoFailedReasons> failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public VulScanTaskHostInfo addFailedReasonsItem(VulScanTaskHostInfoFailedReasons failedReasonsItem) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        this.failedReasons.add(failedReasonsItem);
        return this;
    }

    public VulScanTaskHostInfo withFailedReasons(Consumer<List<VulScanTaskHostInfoFailedReasons>> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        failedReasonsSetter.accept(this.failedReasons);
        return this;
    }

    /**
     * 扫描失败的原因列表
     * @return failedReasons
     */
    public List<VulScanTaskHostInfoFailedReasons> getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(List<VulScanTaskHostInfoFailedReasons> failedReasons) {
        this.failedReasons = failedReasons;
    }

    public VulScanTaskHostInfo withVulScanDetails(List<VulScanTaskHostInfoVulScanDetails> vulScanDetails) {
        this.vulScanDetails = vulScanDetails;
        return this;
    }

    public VulScanTaskHostInfo addVulScanDetailsItem(VulScanTaskHostInfoVulScanDetails vulScanDetailsItem) {
        if (this.vulScanDetails == null) {
            this.vulScanDetails = new ArrayList<>();
        }
        this.vulScanDetails.add(vulScanDetailsItem);
        return this;
    }

    public VulScanTaskHostInfo withVulScanDetails(
        Consumer<List<VulScanTaskHostInfoVulScanDetails>> vulScanDetailsSetter) {
        if (this.vulScanDetails == null) {
            this.vulScanDetails = new ArrayList<>();
        }
        vulScanDetailsSetter.accept(this.vulScanDetails);
        return this;
    }

    /**
     * 该主机的扫描详情信息
     * @return vulScanDetails
     */
    public List<VulScanTaskHostInfoVulScanDetails> getVulScanDetails() {
        return vulScanDetails;
    }

    public void setVulScanDetails(List<VulScanTaskHostInfoVulScanDetails> vulScanDetails) {
        this.vulScanDetails = vulScanDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulScanTaskHostInfo that = (VulScanTaskHostInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.failedReasons, that.failedReasons)
            && Objects.equals(this.vulScanDetails, that.vulScanDetails);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(hostId, hostName, publicIp, privateIp, assetValue, scanStatus, failedReasons, vulScanDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanTaskHostInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    vulScanDetails: ").append(toIndentedString(vulScanDetails)).append("\n");
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
