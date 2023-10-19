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
    @JsonProperty(value = "data")

    private HttpFirewallInstanceListResponseData data;

    public ListFirewallListResponse withUserSupportEps(Boolean userSupportEps) {
        this.userSupportEps = userSupportEps;
        return this;
    }

    /**
     * 是否支持eps
     * @return userSupportEps
     */
    public Boolean getUserSupportEps() {
        return userSupportEps;
    }

    public void setUserSupportEps(Boolean userSupportEps) {
        this.userSupportEps = userSupportEps;
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
        return Objects.equals(this.userSupportEps, that.userSupportEps) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userSupportEps, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirewallListResponse {\n");
        sb.append("    userSupportEps: ").append(toIndentedString(userSupportEps)).append("\n");
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
