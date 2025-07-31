package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 服务器组信息 **取值范围**: 不涉及 
 */
public class HostGroupItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_host_num")

    private Integer riskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotect_host_num")

    private Integer unprotectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_outside")

    private Boolean isOutside;

    public HostGroupItem withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 服务器组ID **取值范围**: 字符长度0-64位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public HostGroupItem withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 服务器组名称 **取值范围**: 字符长度0-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public HostGroupItem withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 影响主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public HostGroupItem withRiskHostNum(Integer riskHostNum) {
        this.riskHostNum = riskHostNum;
        return this;
    }

    /**
     * **参数解释**: 有风险服务器数 **取值范围**: 0到2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskHostNum
     */
    public Integer getRiskHostNum() {
        return riskHostNum;
    }

    public void setRiskHostNum(Integer riskHostNum) {
        this.riskHostNum = riskHostNum;
    }

    public HostGroupItem withUnprotectHostNum(Integer unprotectHostNum) {
        this.unprotectHostNum = unprotectHostNum;
        return this;
    }

    /**
     * **参数解释**: 未防护服务器数 **取值范围**: 0到2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unprotectHostNum
     */
    public Integer getUnprotectHostNum() {
        return unprotectHostNum;
    }

    public void setUnprotectHostNum(Integer unprotectHostNum) {
        this.unprotectHostNum = unprotectHostNum;
    }

    public HostGroupItem withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public HostGroupItem addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public HostGroupItem withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 主机id列表 **取值范围**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public HostGroupItem withIsOutside(Boolean isOutside) {
        this.isOutside = isOutside;
        return this;
    }

    /**
     * **参数解释**: 是否是线下数据中心服务器组 **取值范围**: true或者false 
     * @return isOutside
     */
    public Boolean getIsOutside() {
        return isOutside;
    }

    public void setIsOutside(Boolean isOutside) {
        this.isOutside = isOutside;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostGroupItem that = (HostGroupItem) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.riskHostNum, that.riskHostNum)
            && Objects.equals(this.unprotectHostNum, that.unprotectHostNum)
            && Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.isOutside, that.isOutside);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, hostNum, riskHostNum, unprotectHostNum, hostIdList, isOutside);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostGroupItem {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    riskHostNum: ").append(toIndentedString(riskHostNum)).append("\n");
        sb.append("    unprotectHostNum: ").append(toIndentedString(unprotectHostNum)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    isOutside: ").append(toIndentedString(isOutside)).append("\n");
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
