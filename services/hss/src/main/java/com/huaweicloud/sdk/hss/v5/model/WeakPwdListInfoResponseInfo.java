package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器弱口令列表
 */
public class WeakPwdListInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_accounts")

    private List<WeakPwdAccountInfoResponseInfo> weakPwdAccounts = null;

    public WeakPwdListInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WeakPwdListInfoResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WeakPwdListInfoResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public WeakPwdListInfoResponseInfo withWeakPwdAccounts(List<WeakPwdAccountInfoResponseInfo> weakPwdAccounts) {
        this.weakPwdAccounts = weakPwdAccounts;
        return this;
    }

    public WeakPwdListInfoResponseInfo addWeakPwdAccountsItem(WeakPwdAccountInfoResponseInfo weakPwdAccountsItem) {
        if (this.weakPwdAccounts == null) {
            this.weakPwdAccounts = new ArrayList<>();
        }
        this.weakPwdAccounts.add(weakPwdAccountsItem);
        return this;
    }

    public WeakPwdListInfoResponseInfo withWeakPwdAccounts(
        Consumer<List<WeakPwdAccountInfoResponseInfo>> weakPwdAccountsSetter) {
        if (this.weakPwdAccounts == null) {
            this.weakPwdAccounts = new ArrayList<>();
        }
        weakPwdAccountsSetter.accept(this.weakPwdAccounts);
        return this;
    }

    /**
     * 弱口令账号列表
     * @return weakPwdAccounts
     */
    public List<WeakPwdAccountInfoResponseInfo> getWeakPwdAccounts() {
        return weakPwdAccounts;
    }

    public void setWeakPwdAccounts(List<WeakPwdAccountInfoResponseInfo> weakPwdAccounts) {
        this.weakPwdAccounts = weakPwdAccounts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeakPwdListInfoResponseInfo weakPwdListInfoResponseInfo = (WeakPwdListInfoResponseInfo) o;
        return Objects.equals(this.hostId, weakPwdListInfoResponseInfo.hostId)
            && Objects.equals(this.hostName, weakPwdListInfoResponseInfo.hostName)
            && Objects.equals(this.hostIp, weakPwdListInfoResponseInfo.hostIp)
            && Objects.equals(this.weakPwdAccounts, weakPwdListInfoResponseInfo.weakPwdAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostIp, weakPwdAccounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakPwdListInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    weakPwdAccounts: ").append(toIndentedString(weakPwdAccounts)).append("\n");
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
