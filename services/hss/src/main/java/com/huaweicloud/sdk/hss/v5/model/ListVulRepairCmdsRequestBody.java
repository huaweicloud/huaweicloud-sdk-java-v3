package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 漏洞操作信息 **取值范围**: 不涉及 
 */
public class ListVulRepairCmdsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulOperateInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_data_list")

    private List<HostVulOperateInfo> hostDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_container")

    private Boolean isContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public ListVulRepairCmdsRequestBody withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * **参数解释**: 选择全部漏洞类型,该参数优先级高于data_list和host_data_list **约束限制**: 不涉及 **取值范围**: - all_vul：选择全部漏洞 - all_host：选择全部主机漏洞 - all_vul_container_host：选择所有容器节点 - all_vul_container：选择所有容器  **默认取值**: 不涉及 
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public ListVulRepairCmdsRequestBody withDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListVulRepairCmdsRequestBody addDataListItem(VulOperateInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListVulRepairCmdsRequestBody withDataList(Consumer<List<VulOperateInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 漏洞列表 **约束限制**: 不涉及 **取值范围**: 最少1条，最多500条 **默认取值**: 不涉及 
     * @return dataList
     */
    public List<VulOperateInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
    }

    public ListVulRepairCmdsRequestBody withHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
        return this;
    }

    public ListVulRepairCmdsRequestBody addHostDataListItem(HostVulOperateInfo hostDataListItem) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        this.hostDataList.add(hostDataListItem);
        return this;
    }

    public ListVulRepairCmdsRequestBody withHostDataList(Consumer<List<HostVulOperateInfo>> hostDataListSetter) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        hostDataListSetter.accept(this.hostDataList);
        return this;
    }

    /**
     * **参数解释**: 主机维度漏洞列表 **约束限制**: 不涉及 **取值范围**: 最少1条，最多500条 **默认取值**: 不涉及 
     * @return hostDataList
     */
    public List<HostVulOperateInfo> getHostDataList() {
        return hostDataList;
    }

    public void setHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
    }

    public ListVulRepairCmdsRequestBody withIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
        return this;
    }

    /**
     * **参数解释**: 是否是容器场景 **约束限制**: 不涉及 **取值范围**: - true：是容器场景 - false：不是容器场景 **默认取值**: false 
     * @return isContainer
     */
    public Boolean getIsContainer() {
        return isContainer;
    }

    public void setIsContainer(Boolean isContainer) {
        this.isContainer = isContainer;
    }

    public ListVulRepairCmdsRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及 
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
        ListVulRepairCmdsRequestBody that = (ListVulRepairCmdsRequestBody) obj;
        return Objects.equals(this.selectType, that.selectType) && Objects.equals(this.dataList, that.dataList)
            && Objects.equals(this.hostDataList, that.hostDataList)
            && Objects.equals(this.isContainer, that.isContainer) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectType, dataList, hostDataList, isContainer, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVulRepairCmdsRequestBody {\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    hostDataList: ").append(toIndentedString(hostDataList)).append("\n");
        sb.append("    isContainer: ").append(toIndentedString(isContainer)).append("\n");
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
