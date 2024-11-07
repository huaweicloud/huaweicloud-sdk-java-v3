package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSiteNetworkBandwidthSizeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_connection")

    private SiteConnection siteConnection;

    public UpdateSiteNetworkBandwidthSizeResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateSiteNetworkBandwidthSizeResponse withSiteConnection(SiteConnection siteConnection) {
        this.siteConnection = siteConnection;
        return this;
    }

    public UpdateSiteNetworkBandwidthSizeResponse withSiteConnection(Consumer<SiteConnection> siteConnectionSetter) {
        if (this.siteConnection == null) {
            this.siteConnection = new SiteConnection();
            siteConnectionSetter.accept(this.siteConnection);
        }

        return this;
    }

    /**
     * Get siteConnection
     * @return siteConnection
     */
    public SiteConnection getSiteConnection() {
        return siteConnection;
    }

    public void setSiteConnection(SiteConnection siteConnection) {
        this.siteConnection = siteConnection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSiteNetworkBandwidthSizeResponse that = (UpdateSiteNetworkBandwidthSizeResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.siteConnection, that.siteConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, siteConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSiteNetworkBandwidthSizeResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    siteConnection: ").append(toIndentedString(siteConnection)).append("\n");
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
