package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecAppTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private BasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apk_component_info")

    private ApkComponentInfo apkComponentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hap_component_info")

    private HapComponentInfo hapComponentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_list")

    private List<VulnInfo> vulnList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_compliance_list")

    private List<PrivacyComplianceInfo> privacyComplianceList = null;

    public ShowSecAppTaskResultResponse withBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowSecAppTaskResultResponse withBasicInfo(Consumer<BasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new BasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowSecAppTaskResultResponse withApkComponentInfo(ApkComponentInfo apkComponentInfo) {
        this.apkComponentInfo = apkComponentInfo;
        return this;
    }

    public ShowSecAppTaskResultResponse withApkComponentInfo(Consumer<ApkComponentInfo> apkComponentInfoSetter) {
        if (this.apkComponentInfo == null) {
            this.apkComponentInfo = new ApkComponentInfo();
            apkComponentInfoSetter.accept(this.apkComponentInfo);
        }

        return this;
    }

    /**
     * Get apkComponentInfo
     * @return apkComponentInfo
     */
    public ApkComponentInfo getApkComponentInfo() {
        return apkComponentInfo;
    }

    public void setApkComponentInfo(ApkComponentInfo apkComponentInfo) {
        this.apkComponentInfo = apkComponentInfo;
    }

    public ShowSecAppTaskResultResponse withHapComponentInfo(HapComponentInfo hapComponentInfo) {
        this.hapComponentInfo = hapComponentInfo;
        return this;
    }

    public ShowSecAppTaskResultResponse withHapComponentInfo(Consumer<HapComponentInfo> hapComponentInfoSetter) {
        if (this.hapComponentInfo == null) {
            this.hapComponentInfo = new HapComponentInfo();
            hapComponentInfoSetter.accept(this.hapComponentInfo);
        }

        return this;
    }

    /**
     * Get hapComponentInfo
     * @return hapComponentInfo
     */
    public HapComponentInfo getHapComponentInfo() {
        return hapComponentInfo;
    }

    public void setHapComponentInfo(HapComponentInfo hapComponentInfo) {
        this.hapComponentInfo = hapComponentInfo;
    }

    public ShowSecAppTaskResultResponse withVulnList(List<VulnInfo> vulnList) {
        this.vulnList = vulnList;
        return this;
    }

    public ShowSecAppTaskResultResponse addVulnListItem(VulnInfo vulnListItem) {
        if (this.vulnList == null) {
            this.vulnList = new ArrayList<>();
        }
        this.vulnList.add(vulnListItem);
        return this;
    }

    public ShowSecAppTaskResultResponse withVulnList(Consumer<List<VulnInfo>> vulnListSetter) {
        if (this.vulnList == null) {
            this.vulnList = new ArrayList<>();
        }
        vulnListSetter.accept(this.vulnList);
        return this;
    }

    /**
     * 漏洞列表
     * @return vulnList
     */
    public List<VulnInfo> getVulnList() {
        return vulnList;
    }

    public void setVulnList(List<VulnInfo> vulnList) {
        this.vulnList = vulnList;
    }

    public ShowSecAppTaskResultResponse withPrivacyComplianceList(List<PrivacyComplianceInfo> privacyComplianceList) {
        this.privacyComplianceList = privacyComplianceList;
        return this;
    }

    public ShowSecAppTaskResultResponse addPrivacyComplianceListItem(PrivacyComplianceInfo privacyComplianceListItem) {
        if (this.privacyComplianceList == null) {
            this.privacyComplianceList = new ArrayList<>();
        }
        this.privacyComplianceList.add(privacyComplianceListItem);
        return this;
    }

    public ShowSecAppTaskResultResponse withPrivacyComplianceList(
        Consumer<List<PrivacyComplianceInfo>> privacyComplianceListSetter) {
        if (this.privacyComplianceList == null) {
            this.privacyComplianceList = new ArrayList<>();
        }
        privacyComplianceListSetter.accept(this.privacyComplianceList);
        return this;
    }

    /**
     * 隐私合规列表
     * @return privacyComplianceList
     */
    public List<PrivacyComplianceInfo> getPrivacyComplianceList() {
        return privacyComplianceList;
    }

    public void setPrivacyComplianceList(List<PrivacyComplianceInfo> privacyComplianceList) {
        this.privacyComplianceList = privacyComplianceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecAppTaskResultResponse that = (ShowSecAppTaskResultResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo)
            && Objects.equals(this.apkComponentInfo, that.apkComponentInfo)
            && Objects.equals(this.hapComponentInfo, that.hapComponentInfo)
            && Objects.equals(this.vulnList, that.vulnList)
            && Objects.equals(this.privacyComplianceList, that.privacyComplianceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, apkComponentInfo, hapComponentInfo, vulnList, privacyComplianceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecAppTaskResultResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    apkComponentInfo: ").append(toIndentedString(apkComponentInfo)).append("\n");
        sb.append("    hapComponentInfo: ").append(toIndentedString(hapComponentInfo)).append("\n");
        sb.append("    vulnList: ").append(toIndentedString(vulnList)).append("\n");
        sb.append("    privacyComplianceList: ").append(toIndentedString(privacyComplianceList)).append("\n");
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
