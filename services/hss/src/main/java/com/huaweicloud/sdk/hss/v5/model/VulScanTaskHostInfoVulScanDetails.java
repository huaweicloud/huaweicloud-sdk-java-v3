package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulScanTaskHostInfoVulScanDetails
 */
public class VulScanTaskHostInfoVulScanDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_vul_list")

    private List<VulScanTaskHostInfoScanVulList> scanVulList = null;

    public VulScanTaskHostInfoVulScanDetails withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**: 扫描的漏洞类型 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms：Web-CMS漏洞 - app_vul：应用漏洞 - urgent_vul：应急漏洞 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public VulScanTaskHostInfoVulScanDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 该类型漏洞的扫描状态 **取值范围**: - scanning：扫描中 - success：扫描成功 - failed：扫描失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulScanTaskHostInfoVulScanDetails withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**: 扫描失败的原因，只有扫描失败的漏洞类型有该字段 **取值范围**: 字符长度0-1024位 
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public VulScanTaskHostInfoVulScanDetails withScanVulList(List<VulScanTaskHostInfoScanVulList> scanVulList) {
        this.scanVulList = scanVulList;
        return this;
    }

    public VulScanTaskHostInfoVulScanDetails addScanVulListItem(VulScanTaskHostInfoScanVulList scanVulListItem) {
        if (this.scanVulList == null) {
            this.scanVulList = new ArrayList<>();
        }
        this.scanVulList.add(scanVulListItem);
        return this;
    }

    public VulScanTaskHostInfoVulScanDetails withScanVulList(
        Consumer<List<VulScanTaskHostInfoScanVulList>> scanVulListSetter) {
        if (this.scanVulList == null) {
            this.scanVulList = new ArrayList<>();
        }
        scanVulListSetter.accept(this.scanVulList);
        return this;
    }

    /**
     * **参数解释**: 扫描的应急漏洞ID列表，只有漏洞类型为应急漏洞有该字段 **取值范围**: 最小值0，最大值2147483647 
     * @return scanVulList
     */
    public List<VulScanTaskHostInfoScanVulList> getScanVulList() {
        return scanVulList;
    }

    public void setScanVulList(List<VulScanTaskHostInfoScanVulList> scanVulList) {
        this.scanVulList = scanVulList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulScanTaskHostInfoVulScanDetails that = (VulScanTaskHostInfoVulScanDetails) obj;
        return Objects.equals(this.vulType, that.vulType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.scanVulList, that.scanVulList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulType, status, failedReason, scanVulList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanTaskHostInfoVulScanDetails {\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    scanVulList: ").append(toIndentedString(scanVulList)).append("\n");
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
