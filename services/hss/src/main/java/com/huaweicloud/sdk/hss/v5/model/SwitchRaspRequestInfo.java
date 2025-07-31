package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchRaspRequestInfo
 */
public class SwitchRaspRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_status")

    private Boolean appStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_attach")

    private Boolean autoAttach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_port_list")

    private List<Integer> raspPortList = null;

    public SwitchRaspRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public SwitchRaspRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public SwitchRaspRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * HostId list
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public SwitchRaspRequestInfo withAppStatus(Boolean appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    /**
     * 应用防护开关状态
     * @return appStatus
     */
    public Boolean getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Boolean appStatus) {
        this.appStatus = appStatus;
    }

    public SwitchRaspRequestInfo withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用防护类型
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public SwitchRaspRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 防护策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public SwitchRaspRequestInfo withAutoAttach(Boolean autoAttach) {
        this.autoAttach = autoAttach;
        return this;
    }

    /**
     * 动态防护开关状态
     * @return autoAttach
     */
    public Boolean getAutoAttach() {
        return autoAttach;
    }

    public void setAutoAttach(Boolean autoAttach) {
        this.autoAttach = autoAttach;
    }

    public SwitchRaspRequestInfo withRaspPortList(List<Integer> raspPortList) {
        this.raspPortList = raspPortList;
        return this;
    }

    public SwitchRaspRequestInfo addRaspPortListItem(Integer raspPortListItem) {
        if (this.raspPortList == null) {
            this.raspPortList = new ArrayList<>();
        }
        this.raspPortList.add(raspPortListItem);
        return this;
    }

    public SwitchRaspRequestInfo withRaspPortList(Consumer<List<Integer>> raspPortListSetter) {
        if (this.raspPortList == null) {
            this.raspPortList = new ArrayList<>();
        }
        raspPortListSetter.accept(this.raspPortList);
        return this;
    }

    /**
     * RASP端口列表，列表元素与host_id_list对应，app_status为true时支持生效
     * @return raspPortList
     */
    public List<Integer> getRaspPortList() {
        return raspPortList;
    }

    public void setRaspPortList(List<Integer> raspPortList) {
        this.raspPortList = raspPortList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchRaspRequestInfo that = (SwitchRaspRequestInfo) obj;
        return Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.appStatus, that.appStatus)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.autoAttach, that.autoAttach) && Objects.equals(this.raspPortList, that.raspPortList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIdList, appStatus, appType, policyId, autoAttach, raspPortList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchRaspRequestInfo {\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    autoAttach: ").append(toIndentedString(autoAttach)).append("\n");
        sb.append("    raspPortList: ").append(toIndentedString(raspPortList)).append("\n");
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
