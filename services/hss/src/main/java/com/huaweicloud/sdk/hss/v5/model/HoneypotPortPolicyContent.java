package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 端口蜜罐策略配置
 */
public class HoneypotPortPolicyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports_list")

    private List<HoneypotPortPolicyContentPortsList> portsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_ip")

    private List<String> whiteIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private List<String> hostId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_list")

    private List<String> groupList = null;

    public HoneypotPortPolicyContent withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 操作系统类型 **取值范围**： - Linux：Linux。 - Windows：Windows。 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public HoneypotPortPolicyContent withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public HoneypotPortPolicyContent withPortsList(List<HoneypotPortPolicyContentPortsList> portsList) {
        this.portsList = portsList;
        return this;
    }

    public HoneypotPortPolicyContent addPortsListItem(HoneypotPortPolicyContentPortsList portsListItem) {
        if (this.portsList == null) {
            this.portsList = new ArrayList<>();
        }
        this.portsList.add(portsListItem);
        return this;
    }

    public HoneypotPortPolicyContent withPortsList(Consumer<List<HoneypotPortPolicyContentPortsList>> portsListSetter) {
        if (this.portsList == null) {
            this.portsList = new ArrayList<>();
        }
        portsListSetter.accept(this.portsList);
        return this;
    }

    /**
     * 端口与协议
     * @return portsList
     */
    public List<HoneypotPortPolicyContentPortsList> getPortsList() {
        return portsList;
    }

    public void setPortsList(List<HoneypotPortPolicyContentPortsList> portsList) {
        this.portsList = portsList;
    }

    public HoneypotPortPolicyContent withWhiteIp(List<String> whiteIp) {
        this.whiteIp = whiteIp;
        return this;
    }

    public HoneypotPortPolicyContent addWhiteIpItem(String whiteIpItem) {
        if (this.whiteIp == null) {
            this.whiteIp = new ArrayList<>();
        }
        this.whiteIp.add(whiteIpItem);
        return this;
    }

    public HoneypotPortPolicyContent withWhiteIp(Consumer<List<String>> whiteIpSetter) {
        if (this.whiteIp == null) {
            this.whiteIp = new ArrayList<>();
        }
        whiteIpSetter.accept(this.whiteIp);
        return this;
    }

    /**
     * ip白名单
     * @return whiteIp
     */
    public List<String> getWhiteIp() {
        return whiteIp;
    }

    public void setWhiteIp(List<String> whiteIp) {
        this.whiteIp = whiteIp;
    }

    public HoneypotPortPolicyContent withHostId(List<String> hostId) {
        this.hostId = hostId;
        return this;
    }

    public HoneypotPortPolicyContent addHostIdItem(String hostIdItem) {
        if (this.hostId == null) {
            this.hostId = new ArrayList<>();
        }
        this.hostId.add(hostIdItem);
        return this;
    }

    public HoneypotPortPolicyContent withHostId(Consumer<List<String>> hostIdSetter) {
        if (this.hostId == null) {
            this.hostId = new ArrayList<>();
        }
        hostIdSetter.accept(this.hostId);
        return this;
    }

    /**
     * 主机列表
     * @return hostId
     */
    public List<String> getHostId() {
        return hostId;
    }

    public void setHostId(List<String> hostId) {
        this.hostId = hostId;
    }

    public HoneypotPortPolicyContent withGroupList(List<String> groupList) {
        this.groupList = groupList;
        return this;
    }

    public HoneypotPortPolicyContent addGroupListItem(String groupListItem) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupListItem);
        return this;
    }

    public HoneypotPortPolicyContent withGroupList(Consumer<List<String>> groupListSetter) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        groupListSetter.accept(this.groupList);
        return this;
    }

    /**
     * 分组列表
     * @return groupList
     */
    public List<String> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<String> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoneypotPortPolicyContent that = (HoneypotPortPolicyContent) obj;
        return Objects.equals(this.osType, that.osType) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.portsList, that.portsList) && Objects.equals(this.whiteIp, that.whiteIp)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.groupList, that.groupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType, policyName, portsList, whiteIp, hostId, groupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HoneypotPortPolicyContent {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    portsList: ").append(toIndentedString(portsList)).append("\n");
        sb.append("    whiteIp: ").append(toIndentedString(whiteIp)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
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
