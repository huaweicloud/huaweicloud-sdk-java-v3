package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowProtectionStatusStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_scan_time")

    private Long vulScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "av_upgrade_time")

    private Long avUpgradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_enabled_list")

    private List<ProtectionEnabledTypes> protectionEnabledList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ProtectStatusStatistics> dataList = null;

    public ShowProtectionStatusStatisticsResponse withVulScanTime(Long vulScanTime) {
        this.vulScanTime = vulScanTime;
        return this;
    }

    /**
     * **参数解释**: 漏洞扫描时间，Unix时间戳格式，单位为毫秒 **取值范围**: 最小值0，最大值9223372036854775807 
     * @return vulScanTime
     */
    public Long getVulScanTime() {
        return vulScanTime;
    }

    public void setVulScanTime(Long vulScanTime) {
        this.vulScanTime = vulScanTime;
    }

    public ShowProtectionStatusStatisticsResponse withAvUpgradeTime(Long avUpgradeTime) {
        this.avUpgradeTime = avUpgradeTime;
        return this;
    }

    /**
     * **参数解释**: 病毒库更新时间，Unix时间戳格式，单位为毫秒 **取值范围**: 最小值0，最大值9223372036854775807 
     * @return avUpgradeTime
     */
    public Long getAvUpgradeTime() {
        return avUpgradeTime;
    }

    public void setAvUpgradeTime(Long avUpgradeTime) {
        this.avUpgradeTime = avUpgradeTime;
    }

    public ShowProtectionStatusStatisticsResponse withProtectionEnabledList(
        List<ProtectionEnabledTypes> protectionEnabledList) {
        this.protectionEnabledList = protectionEnabledList;
        return this;
    }

    public ShowProtectionStatusStatisticsResponse addProtectionEnabledListItem(
        ProtectionEnabledTypes protectionEnabledListItem) {
        if (this.protectionEnabledList == null) {
            this.protectionEnabledList = new ArrayList<>();
        }
        this.protectionEnabledList.add(protectionEnabledListItem);
        return this;
    }

    public ShowProtectionStatusStatisticsResponse withProtectionEnabledList(
        Consumer<List<ProtectionEnabledTypes>> protectionEnabledListSetter) {
        if (this.protectionEnabledList == null) {
            this.protectionEnabledList = new ArrayList<>();
        }
        protectionEnabledListSetter.accept(this.protectionEnabledList);
        return this;
    }

    /**
     * **参数解释**: 已开启防护的类型列表 **取值范围**: 0-200个ProtectionEnabledTypes对象 
     * @return protectionEnabledList
     */
    public List<ProtectionEnabledTypes> getProtectionEnabledList() {
        return protectionEnabledList;
    }

    public void setProtectionEnabledList(List<ProtectionEnabledTypes> protectionEnabledList) {
        this.protectionEnabledList = protectionEnabledList;
    }

    public ShowProtectionStatusStatisticsResponse withDataList(List<ProtectStatusStatistics> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ShowProtectionStatusStatisticsResponse addDataListItem(ProtectStatusStatistics dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ShowProtectionStatusStatisticsResponse withDataList(Consumer<List<ProtectStatusStatistics>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 防护状态统计列表 **取值范围**: 0-200个ProtectStatusStatistics对象 
     * @return dataList
     */
    public List<ProtectStatusStatistics> getDataList() {
        return dataList;
    }

    public void setDataList(List<ProtectStatusStatistics> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProtectionStatusStatisticsResponse that = (ShowProtectionStatusStatisticsResponse) obj;
        return Objects.equals(this.vulScanTime, that.vulScanTime)
            && Objects.equals(this.avUpgradeTime, that.avUpgradeTime)
            && Objects.equals(this.protectionEnabledList, that.protectionEnabledList)
            && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulScanTime, avUpgradeTime, protectionEnabledList, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectionStatusStatisticsResponse {\n");
        sb.append("    vulScanTime: ").append(toIndentedString(vulScanTime)).append("\n");
        sb.append("    avUpgradeTime: ").append(toIndentedString(avUpgradeTime)).append("\n");
        sb.append("    protectionEnabledList: ").append(toIndentedString(protectionEnabledList)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
