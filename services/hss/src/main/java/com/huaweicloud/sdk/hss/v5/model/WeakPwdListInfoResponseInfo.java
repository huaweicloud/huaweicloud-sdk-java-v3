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
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_accounts")

    private List<WeakPwdAccountInfoResponseInfo> weakPwdAccounts = null;

    public WeakPwdListInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
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
     * 服务器IP（私有IP），为兼容用户使用，不删除此字段
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public WeakPwdListInfoResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public WeakPwdListInfoResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 服务器公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public WeakPwdListInfoResponseInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最近扫描时间，时间戳单位：毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeakPwdListInfoResponseInfo that = (WeakPwdListInfoResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.weakPwdAccounts, that.weakPwdAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostIp, privateIp, publicIp, updateTime, weakPwdAccounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakPwdListInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
