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
public class ShowDecoyPortPolicyDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_list")

    private List<PolicyDetailsPortList> portList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_ip")

    private List<String> whiteIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_list")

    private List<String> hostList = null;

    public ShowDecoyPortPolicyDetailsResponse withPolicyName(String policyName) {
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

    public ShowDecoyPortPolicyDetailsResponse withPortList(List<PolicyDetailsPortList> portList) {
        this.portList = portList;
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse addPortListItem(PolicyDetailsPortList portListItem) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        this.portList.add(portListItem);
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse withPortList(Consumer<List<PolicyDetailsPortList>> portListSetter) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        portListSetter.accept(this.portList);
        return this;
    }

    /**
     * 端口与协议
     * @return portList
     */
    public List<PolicyDetailsPortList> getPortList() {
        return portList;
    }

    public void setPortList(List<PolicyDetailsPortList> portList) {
        this.portList = portList;
    }

    public ShowDecoyPortPolicyDetailsResponse withOsType(String osType) {
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

    public ShowDecoyPortPolicyDetailsResponse withWhiteIp(List<String> whiteIp) {
        this.whiteIp = whiteIp;
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse addWhiteIpItem(String whiteIpItem) {
        if (this.whiteIp == null) {
            this.whiteIp = new ArrayList<>();
        }
        this.whiteIp.add(whiteIpItem);
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse withWhiteIp(Consumer<List<String>> whiteIpSetter) {
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

    public ShowDecoyPortPolicyDetailsResponse withHostList(List<String> hostList) {
        this.hostList = hostList;
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse addHostListItem(String hostListItem) {
        if (this.hostList == null) {
            this.hostList = new ArrayList<>();
        }
        this.hostList.add(hostListItem);
        return this;
    }

    public ShowDecoyPortPolicyDetailsResponse withHostList(Consumer<List<String>> hostListSetter) {
        if (this.hostList == null) {
            this.hostList = new ArrayList<>();
        }
        hostListSetter.accept(this.hostList);
        return this;
    }

    /**
     * 主机列表
     * @return hostList
     */
    public List<String> getHostList() {
        return hostList;
    }

    public void setHostList(List<String> hostList) {
        this.hostList = hostList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDecoyPortPolicyDetailsResponse that = (ShowDecoyPortPolicyDetailsResponse) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.portList, that.portList)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.whiteIp, that.whiteIp)
            && Objects.equals(this.hostList, that.hostList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, portList, osType, whiteIp, hostList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDecoyPortPolicyDetailsResponse {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    whiteIp: ").append(toIndentedString(whiteIp)).append("\n");
        sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
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
