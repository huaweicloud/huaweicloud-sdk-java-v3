package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞操作列表
 */
public class VulBackupStatisticsRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulOperateInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_data_list")

    private List<HostVulOperateInfo> hostDataList = null;

    public VulBackupStatisticsRequestInfo withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * **参数解释**: 选择全部漏洞类型，该参数优先级高于data_list和host_data_list **约束限制**: 不涉及 **取值范围**: - all_vul：选择全部漏洞 - all_host：选择全部主机漏洞  **默认取值**: 不涉及 
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public VulBackupStatisticsRequestInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型，当select_type选择all_vul时，需要传递该参数 **约束限制**: 不涉及 **取值范围**: - linux_vul : 漏洞类型-linux漏洞 - windows_vul : 漏洞类型-windows漏洞 - web_cms : Web-CMS漏洞 - app_vul : 应用漏洞 - urgent_vul : 应急漏洞  **默认取值**: linux_vul 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VulBackupStatisticsRequestInfo withDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public VulBackupStatisticsRequestInfo addDataListItem(VulOperateInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public VulBackupStatisticsRequestInfo withDataList(Consumer<List<VulOperateInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 漏洞列表 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
     * @return dataList
     */
    public List<VulOperateInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
    }

    public VulBackupStatisticsRequestInfo withHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
        return this;
    }

    public VulBackupStatisticsRequestInfo addHostDataListItem(HostVulOperateInfo hostDataListItem) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        this.hostDataList.add(hostDataListItem);
        return this;
    }

    public VulBackupStatisticsRequestInfo withHostDataList(Consumer<List<HostVulOperateInfo>> hostDataListSetter) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        hostDataListSetter.accept(this.hostDataList);
        return this;
    }

    /**
     * **参数解释**: 主机维度漏洞列表 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
     * @return hostDataList
     */
    public List<HostVulOperateInfo> getHostDataList() {
        return hostDataList;
    }

    public void setHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulBackupStatisticsRequestInfo that = (VulBackupStatisticsRequestInfo) obj;
        return Objects.equals(this.selectType, that.selectType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.dataList, that.dataList) && Objects.equals(this.hostDataList, that.hostDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectType, type, dataList, hostDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulBackupStatisticsRequestInfo {\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    hostDataList: ").append(toIndentedString(hostDataList)).append("\n");
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
