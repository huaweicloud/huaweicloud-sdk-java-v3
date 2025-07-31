package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机开启/关闭白名单策略防护
 */
public class SwitchAppWhitelistPolicyHostRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_app_whitelist")

    private Boolean enableAppWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_info_list")

    private List<AppPolicyInfoList> policyInfoList = null;

    public SwitchAppWhitelistPolicyHostRequestInfo withEnableAppWhitelist(Boolean enableAppWhitelist) {
        this.enableAppWhitelist = enableAppWhitelist;
        return this;
    }

    /**
     * 是否开启/关闭白名单策略防护
     * @return enableAppWhitelist
     */
    public Boolean getEnableAppWhitelist() {
        return enableAppWhitelist;
    }

    public void setEnableAppWhitelist(Boolean enableAppWhitelist) {
        this.enableAppWhitelist = enableAppWhitelist;
    }

    public SwitchAppWhitelistPolicyHostRequestInfo withPolicyInfoList(List<AppPolicyInfoList> policyInfoList) {
        this.policyInfoList = policyInfoList;
        return this;
    }

    public SwitchAppWhitelistPolicyHostRequestInfo addPolicyInfoListItem(AppPolicyInfoList policyInfoListItem) {
        if (this.policyInfoList == null) {
            this.policyInfoList = new ArrayList<>();
        }
        this.policyInfoList.add(policyInfoListItem);
        return this;
    }

    public SwitchAppWhitelistPolicyHostRequestInfo withPolicyInfoList(
        Consumer<List<AppPolicyInfoList>> policyInfoListSetter) {
        if (this.policyInfoList == null) {
            this.policyInfoList = new ArrayList<>();
        }
        policyInfoListSetter.accept(this.policyInfoList);
        return this;
    }

    /**
     * 策略关联主机列表
     * @return policyInfoList
     */
    public List<AppPolicyInfoList> getPolicyInfoList() {
        return policyInfoList;
    }

    public void setPolicyInfoList(List<AppPolicyInfoList> policyInfoList) {
        this.policyInfoList = policyInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchAppWhitelistPolicyHostRequestInfo that = (SwitchAppWhitelistPolicyHostRequestInfo) obj;
        return Objects.equals(this.enableAppWhitelist, that.enableAppWhitelist)
            && Objects.equals(this.policyInfoList, that.policyInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableAppWhitelist, policyInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchAppWhitelistPolicyHostRequestInfo {\n");
        sb.append("    enableAppWhitelist: ").append(toIndentedString(enableAppWhitelist)).append("\n");
        sb.append("    policyInfoList: ").append(toIndentedString(policyInfoList)).append("\n");
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
