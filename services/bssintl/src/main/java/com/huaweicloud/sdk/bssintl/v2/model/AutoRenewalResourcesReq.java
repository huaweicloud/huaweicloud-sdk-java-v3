package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoRenewalResourcesReq
 */
public class AutoRenewalResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew_times")

    private Integer autoRenewTimes;

    public AutoRenewalResourcesReq withAutoRenewTimes(Integer autoRenewTimes) {
        this.autoRenewTimes = autoRenewTimes;
        return this;
    }

    /**
     * |参数名称：自动续费次数| |参数的约束及描述：该参数非必填，范围限制：0-99，0代表不限制次数。 首次开通自动续费，此参数不携带或携带值为null时，默认为不限制次数 已开通自动续费，重置自动续费次数时此参数必填，否则不做处理，不进行修改|
     * minimum: 0
     * maximum: 99
     * @return autoRenewTimes
     */
    public Integer getAutoRenewTimes() {
        return autoRenewTimes;
    }

    public void setAutoRenewTimes(Integer autoRenewTimes) {
        this.autoRenewTimes = autoRenewTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoRenewalResourcesReq that = (AutoRenewalResourcesReq) obj;
        return Objects.equals(this.autoRenewTimes, that.autoRenewTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoRenewTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoRenewalResourcesReq {\n");
        sb.append("    autoRenewTimes: ").append(toIndentedString(autoRenewTimes)).append("\n");
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
