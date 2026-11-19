package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扫描信息
 */
public class ScansInfoRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerabilities_statistics_info_list")

    private List<Object> vulnerabilitiesStatisticsInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_change_history_info_list")

    private List<Object> accountChangeHistoryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "danger_ports_info_list")

    private List<Object> dangerPortsInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_info_list")

    private List<Object> weakPwdInfoList = null;

    public ScansInfoRes withVulnerabilitiesStatisticsInfoList(List<Object> vulnerabilitiesStatisticsInfoList) {
        this.vulnerabilitiesStatisticsInfoList = vulnerabilitiesStatisticsInfoList;
        return this;
    }

    public ScansInfoRes addVulnerabilitiesStatisticsInfoListItem(Object vulnerabilitiesStatisticsInfoListItem) {
        if (this.vulnerabilitiesStatisticsInfoList == null) {
            this.vulnerabilitiesStatisticsInfoList = new ArrayList<>();
        }
        this.vulnerabilitiesStatisticsInfoList.add(vulnerabilitiesStatisticsInfoListItem);
        return this;
    }

    public ScansInfoRes withVulnerabilitiesStatisticsInfoList(
        Consumer<List<Object>> vulnerabilitiesStatisticsInfoListSetter) {
        if (this.vulnerabilitiesStatisticsInfoList == null) {
            this.vulnerabilitiesStatisticsInfoList = new ArrayList<>();
        }
        vulnerabilitiesStatisticsInfoListSetter.accept(this.vulnerabilitiesStatisticsInfoList);
        return this;
    }

    /**
     * **参数解释**： 漏洞统计列表 **取值范围**： 0-200个VulnerabilitiesStatisticsInfo对象 
     * @return vulnerabilitiesStatisticsInfoList
     */
    public List<Object> getVulnerabilitiesStatisticsInfoList() {
        return vulnerabilitiesStatisticsInfoList;
    }

    public void setVulnerabilitiesStatisticsInfoList(List<Object> vulnerabilitiesStatisticsInfoList) {
        this.vulnerabilitiesStatisticsInfoList = vulnerabilitiesStatisticsInfoList;
    }

    public ScansInfoRes withAccountChangeHistoryInfoList(List<Object> accountChangeHistoryInfoList) {
        this.accountChangeHistoryInfoList = accountChangeHistoryInfoList;
        return this;
    }

    public ScansInfoRes addAccountChangeHistoryInfoListItem(Object accountChangeHistoryInfoListItem) {
        if (this.accountChangeHistoryInfoList == null) {
            this.accountChangeHistoryInfoList = new ArrayList<>();
        }
        this.accountChangeHistoryInfoList.add(accountChangeHistoryInfoListItem);
        return this;
    }

    public ScansInfoRes withAccountChangeHistoryInfoList(Consumer<List<Object>> accountChangeHistoryInfoListSetter) {
        if (this.accountChangeHistoryInfoList == null) {
            this.accountChangeHistoryInfoList = new ArrayList<>();
        }
        accountChangeHistoryInfoListSetter.accept(this.accountChangeHistoryInfoList);
        return this;
    }

    /**
     * **参数解释**： 资产账号变动记录列表 **取值范围**： 0-200个AccountChangeHistoryInfo对象 
     * @return accountChangeHistoryInfoList
     */
    public List<Object> getAccountChangeHistoryInfoList() {
        return accountChangeHistoryInfoList;
    }

    public void setAccountChangeHistoryInfoList(List<Object> accountChangeHistoryInfoList) {
        this.accountChangeHistoryInfoList = accountChangeHistoryInfoList;
    }

    public ScansInfoRes withDangerPortsInfoList(List<Object> dangerPortsInfoList) {
        this.dangerPortsInfoList = dangerPortsInfoList;
        return this;
    }

    public ScansInfoRes addDangerPortsInfoListItem(Object dangerPortsInfoListItem) {
        if (this.dangerPortsInfoList == null) {
            this.dangerPortsInfoList = new ArrayList<>();
        }
        this.dangerPortsInfoList.add(dangerPortsInfoListItem);
        return this;
    }

    public ScansInfoRes withDangerPortsInfoList(Consumer<List<Object>> dangerPortsInfoListSetter) {
        if (this.dangerPortsInfoList == null) {
            this.dangerPortsInfoList = new ArrayList<>();
        }
        dangerPortsInfoListSetter.accept(this.dangerPortsInfoList);
        return this;
    }

    /**
     * **参数解释**： 危险开放端口列表 **取值范围**： 0-200个DangerPortsInfo对象 
     * @return dangerPortsInfoList
     */
    public List<Object> getDangerPortsInfoList() {
        return dangerPortsInfoList;
    }

    public void setDangerPortsInfoList(List<Object> dangerPortsInfoList) {
        this.dangerPortsInfoList = dangerPortsInfoList;
    }

    public ScansInfoRes withWeakPwdInfoList(List<Object> weakPwdInfoList) {
        this.weakPwdInfoList = weakPwdInfoList;
        return this;
    }

    public ScansInfoRes addWeakPwdInfoListItem(Object weakPwdInfoListItem) {
        if (this.weakPwdInfoList == null) {
            this.weakPwdInfoList = new ArrayList<>();
        }
        this.weakPwdInfoList.add(weakPwdInfoListItem);
        return this;
    }

    public ScansInfoRes withWeakPwdInfoList(Consumer<List<Object>> weakPwdInfoListSetter) {
        if (this.weakPwdInfoList == null) {
            this.weakPwdInfoList = new ArrayList<>();
        }
        weakPwdInfoListSetter.accept(this.weakPwdInfoList);
        return this;
    }

    /**
     * **参数解释**： 弱口令列表 **取值范围**： 0-200个WeakPwdInfo对象 
     * @return weakPwdInfoList
     */
    public List<Object> getWeakPwdInfoList() {
        return weakPwdInfoList;
    }

    public void setWeakPwdInfoList(List<Object> weakPwdInfoList) {
        this.weakPwdInfoList = weakPwdInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScansInfoRes that = (ScansInfoRes) obj;
        return Objects.equals(this.vulnerabilitiesStatisticsInfoList, that.vulnerabilitiesStatisticsInfoList)
            && Objects.equals(this.accountChangeHistoryInfoList, that.accountChangeHistoryInfoList)
            && Objects.equals(this.dangerPortsInfoList, that.dangerPortsInfoList)
            && Objects.equals(this.weakPwdInfoList, that.weakPwdInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnerabilitiesStatisticsInfoList,
            accountChangeHistoryInfoList,
            dangerPortsInfoList,
            weakPwdInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScansInfoRes {\n");
        sb.append("    vulnerabilitiesStatisticsInfoList: ")
            .append(toIndentedString(vulnerabilitiesStatisticsInfoList))
            .append("\n");
        sb.append("    accountChangeHistoryInfoList: ")
            .append(toIndentedString(accountChangeHistoryInfoList))
            .append("\n");
        sb.append("    dangerPortsInfoList: ").append(toIndentedString(dangerPortsInfoList)).append("\n");
        sb.append("    weakPwdInfoList: ").append(toIndentedString(weakPwdInfoList)).append("\n");
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
