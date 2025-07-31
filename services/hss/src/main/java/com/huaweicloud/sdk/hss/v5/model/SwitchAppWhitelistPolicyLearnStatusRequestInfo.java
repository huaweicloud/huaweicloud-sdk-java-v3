package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchAppWhitelistPolicyLearnStatusRequestInfo
 */
public class SwitchAppWhitelistPolicyLearnStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private Integer switchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public SwitchAppWhitelistPolicyLearnStatusRequestInfo withSwitchStatus(Integer switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * 操作状态
     * @return switchStatus
     */
    public Integer getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(Integer switchStatus) {
        this.switchStatus = switchStatus;
    }

    public SwitchAppWhitelistPolicyLearnStatusRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public SwitchAppWhitelistPolicyLearnStatusRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public SwitchAppWhitelistPolicyLearnStatusRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchAppWhitelistPolicyLearnStatusRequestInfo that = (SwitchAppWhitelistPolicyLearnStatusRequestInfo) obj;
        return Objects.equals(this.switchStatus, that.switchStatus) && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchStatus, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchAppWhitelistPolicyLearnStatusRequestInfo {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
