package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSiteNetworkBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private String siteNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_connection_id")

    private String siteConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSiteConnectionBandwidthRequestBody body;

    public UpdateSiteNetworkBandwidthRequest withSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    /**
     * 分支网络的ID。
     * @return siteNetworkId
     */
    public String getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    public UpdateSiteNetworkBandwidthRequest withSiteConnectionId(String siteConnectionId) {
        this.siteConnectionId = siteConnectionId;
        return this;
    }

    /**
     * 实例ID。
     * @return siteConnectionId
     */
    public String getSiteConnectionId() {
        return siteConnectionId;
    }

    public void setSiteConnectionId(String siteConnectionId) {
        this.siteConnectionId = siteConnectionId;
    }

    public UpdateSiteNetworkBandwidthRequest withBody(UpdateSiteConnectionBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSiteNetworkBandwidthRequest withBody(Consumer<UpdateSiteConnectionBandwidthRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSiteConnectionBandwidthRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSiteConnectionBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSiteConnectionBandwidthRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSiteNetworkBandwidthRequest that = (UpdateSiteNetworkBandwidthRequest) obj;
        return Objects.equals(this.siteNetworkId, that.siteNetworkId)
            && Objects.equals(this.siteConnectionId, that.siteConnectionId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteNetworkId, siteConnectionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSiteNetworkBandwidthRequest {\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
        sb.append("    siteConnectionId: ").append(toIndentedString(siteConnectionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
