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
public class ShowDecoyPortStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num")

    private Integer eventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_propose")

    private List<DecoyPortBasePortStruct> linuxPropose = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_propose")

    private List<DecoyPortBasePortStruct> windowsPropose = null;

    public ShowDecoyPortStatisticsResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**： 开启防护的主机数量 **取值范围**： 最小值0，最大值2147483647 
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

    public ShowDecoyPortStatisticsResponse withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * **参数解释**： 策略数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public ShowDecoyPortStatisticsResponse withEventNum(Integer eventNum) {
        this.eventNum = eventNum;
        return this;
    }

    /**
     * **参数解释**： 未处理的事件数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return eventNum
     */
    public Integer getEventNum() {
        return eventNum;
    }

    public void setEventNum(Integer eventNum) {
        this.eventNum = eventNum;
    }

    public ShowDecoyPortStatisticsResponse withLinuxPropose(List<DecoyPortBasePortStruct> linuxPropose) {
        this.linuxPropose = linuxPropose;
        return this;
    }

    public ShowDecoyPortStatisticsResponse addLinuxProposeItem(DecoyPortBasePortStruct linuxProposeItem) {
        if (this.linuxPropose == null) {
            this.linuxPropose = new ArrayList<>();
        }
        this.linuxPropose.add(linuxProposeItem);
        return this;
    }

    public ShowDecoyPortStatisticsResponse withLinuxPropose(
        Consumer<List<DecoyPortBasePortStruct>> linuxProposeSetter) {
        if (this.linuxPropose == null) {
            this.linuxPropose = new ArrayList<>();
        }
        linuxProposeSetter.accept(this.linuxPropose);
        return this;
    }

    /**
     * **参数解释**： linux的推荐端口配置 **取值范围**： 不涉及 
     * @return linuxPropose
     */
    public List<DecoyPortBasePortStruct> getLinuxPropose() {
        return linuxPropose;
    }

    public void setLinuxPropose(List<DecoyPortBasePortStruct> linuxPropose) {
        this.linuxPropose = linuxPropose;
    }

    public ShowDecoyPortStatisticsResponse withWindowsPropose(List<DecoyPortBasePortStruct> windowsPropose) {
        this.windowsPropose = windowsPropose;
        return this;
    }

    public ShowDecoyPortStatisticsResponse addWindowsProposeItem(DecoyPortBasePortStruct windowsProposeItem) {
        if (this.windowsPropose == null) {
            this.windowsPropose = new ArrayList<>();
        }
        this.windowsPropose.add(windowsProposeItem);
        return this;
    }

    public ShowDecoyPortStatisticsResponse withWindowsPropose(
        Consumer<List<DecoyPortBasePortStruct>> windowsProposeSetter) {
        if (this.windowsPropose == null) {
            this.windowsPropose = new ArrayList<>();
        }
        windowsProposeSetter.accept(this.windowsPropose);
        return this;
    }

    /**
     * **参数解释**： windows的推荐端口配置 **取值范围**： 不涉及 
     * @return windowsPropose
     */
    public List<DecoyPortBasePortStruct> getWindowsPropose() {
        return windowsPropose;
    }

    public void setWindowsPropose(List<DecoyPortBasePortStruct> windowsPropose) {
        this.windowsPropose = windowsPropose;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDecoyPortStatisticsResponse that = (ShowDecoyPortStatisticsResponse) obj;
        return Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.policyNum, that.policyNum)
            && Objects.equals(this.eventNum, that.eventNum) && Objects.equals(this.linuxPropose, that.linuxPropose)
            && Objects.equals(this.windowsPropose, that.windowsPropose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostNum, policyNum, eventNum, linuxPropose, windowsPropose);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDecoyPortStatisticsResponse {\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
        sb.append("    linuxPropose: ").append(toIndentedString(linuxPropose)).append("\n");
        sb.append("    windowsPropose: ").append(toIndentedString(windowsPropose)).append("\n");
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
