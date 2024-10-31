package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListFirewallListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_support_eps")

    private Boolean userSupportEps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_ndr")

    private Boolean hasNdr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_postpaid")

    private Boolean isSupportPostpaid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_basic_version")

    private Boolean isSupportBasicVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_buy_professional")

    private Boolean isSupportBuyProfessional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private HttpFirewallInstanceListResponseData data;

    public ListFirewallListResponse withUserSupportEps(Boolean userSupportEps) {
        this.userSupportEps = userSupportEps;
        return this;
    }

    /**
     * 是否支持企业项目，true表示是，false表示不是
     * @return userSupportEps
     */
    public Boolean getUserSupportEps() {
        return userSupportEps;
    }

    public void setUserSupportEps(Boolean userSupportEps) {
        this.userSupportEps = userSupportEps;
    }

    public ListFirewallListResponse withHasNdr(Boolean hasNdr) {
        this.hasNdr = hasNdr;
        return this;
    }

    /**
     * 是否存在ndr，true表示是，false表示不是，NDR为原旁路版防火墙，现已停止售卖。
     * @return hasNdr
     */
    public Boolean getHasNdr() {
        return hasNdr;
    }

    public void setHasNdr(Boolean hasNdr) {
        this.hasNdr = hasNdr;
    }

    public ListFirewallListResponse withIsSupportPostpaid(Boolean isSupportPostpaid) {
        this.isSupportPostpaid = isSupportPostpaid;
        return this;
    }

    /**
     * 是否支持按需购买，true表示是，false表示不是
     * @return isSupportPostpaid
     */
    public Boolean getIsSupportPostpaid() {
        return isSupportPostpaid;
    }

    public void setIsSupportPostpaid(Boolean isSupportPostpaid) {
        this.isSupportPostpaid = isSupportPostpaid;
    }

    public ListFirewallListResponse withIsSupportBasicVersion(Boolean isSupportBasicVersion) {
        this.isSupportBasicVersion = isSupportBasicVersion;
        return this;
    }

    /**
     * 是否支持基础版，true表示是，false表示不是
     * @return isSupportBasicVersion
     */
    public Boolean getIsSupportBasicVersion() {
        return isSupportBasicVersion;
    }

    public void setIsSupportBasicVersion(Boolean isSupportBasicVersion) {
        this.isSupportBasicVersion = isSupportBasicVersion;
    }

    public ListFirewallListResponse withIsSupportBuyProfessional(Boolean isSupportBuyProfessional) {
        this.isSupportBuyProfessional = isSupportBuyProfessional;
        return this;
    }

    /**
     * 是否支持购买专业版，true表示是，false表示不是
     * @return isSupportBuyProfessional
     */
    public Boolean getIsSupportBuyProfessional() {
        return isSupportBuyProfessional;
    }

    public void setIsSupportBuyProfessional(Boolean isSupportBuyProfessional) {
        this.isSupportBuyProfessional = isSupportBuyProfessional;
    }

    public ListFirewallListResponse withData(HttpFirewallInstanceListResponseData data) {
        this.data = data;
        return this;
    }

    public ListFirewallListResponse withData(Consumer<HttpFirewallInstanceListResponseData> dataSetter) {
        if (this.data == null) {
            this.data = new HttpFirewallInstanceListResponseData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public HttpFirewallInstanceListResponseData getData() {
        return data;
    }

    public void setData(HttpFirewallInstanceListResponseData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFirewallListResponse that = (ListFirewallListResponse) obj;
        return Objects.equals(this.userSupportEps, that.userSupportEps) && Objects.equals(this.hasNdr, that.hasNdr)
            && Objects.equals(this.isSupportPostpaid, that.isSupportPostpaid)
            && Objects.equals(this.isSupportBasicVersion, that.isSupportBasicVersion)
            && Objects.equals(this.isSupportBuyProfessional, that.isSupportBuyProfessional)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(userSupportEps, hasNdr, isSupportPostpaid, isSupportBasicVersion, isSupportBuyProfessional, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirewallListResponse {\n");
        sb.append("    userSupportEps: ").append(toIndentedString(userSupportEps)).append("\n");
        sb.append("    hasNdr: ").append(toIndentedString(hasNdr)).append("\n");
        sb.append("    isSupportPostpaid: ").append(toIndentedString(isSupportPostpaid)).append("\n");
        sb.append("    isSupportBasicVersion: ").append(toIndentedString(isSupportBasicVersion)).append("\n");
        sb.append("    isSupportBuyProfessional: ").append(toIndentedString(isSupportBuyProfessional)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
