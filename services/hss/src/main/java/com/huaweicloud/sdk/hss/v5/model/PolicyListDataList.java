package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyListDataList
 */
public class PolicyListDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_list")

    private List<Integer> portList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public PolicyListDataList withPolicyName(String policyName) {
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

    public PolicyListDataList withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public PolicyListDataList withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
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

    public PolicyListDataList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否默认
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PolicyListDataList withPortList(List<Integer> portList) {
        this.portList = portList;
        return this;
    }

    public PolicyListDataList addPortListItem(Integer portListItem) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        this.portList.add(portListItem);
        return this;
    }

    public PolicyListDataList withPortList(Consumer<List<Integer>> portListSetter) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        portListSetter.accept(this.portList);
        return this;
    }

    /**
     * 端口列表
     * @return portList
     */
    public List<Integer> getPortList() {
        return portList;
    }

    public void setPortList(List<Integer> portList) {
        this.portList = portList;
    }

    public PolicyListDataList withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Winodws.
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PolicyListDataList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态，包含如下3种 - applying ：生效中 - success ：已生效 - disable ：未生效
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
        PolicyListDataList that = (PolicyListDataList) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.portList, that.portList) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, policyId, hostNum, isDefault, portList, osType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyListDataList {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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
