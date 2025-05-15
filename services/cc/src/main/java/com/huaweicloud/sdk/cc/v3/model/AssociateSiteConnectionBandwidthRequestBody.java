package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联分支连接带宽的请求体。
 */
public class AssociateSiteConnectionBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_connection")

    private AssociateSiteConnectionBandwidth siteConnection;

    public AssociateSiteConnectionBandwidthRequestBody withSiteConnection(
        AssociateSiteConnectionBandwidth siteConnection) {
        this.siteConnection = siteConnection;
        return this;
    }

    public AssociateSiteConnectionBandwidthRequestBody withSiteConnection(
        Consumer<AssociateSiteConnectionBandwidth> siteConnectionSetter) {
        if (this.siteConnection == null) {
            this.siteConnection = new AssociateSiteConnectionBandwidth();
            siteConnectionSetter.accept(this.siteConnection);
        }

        return this;
    }

    /**
     * Get siteConnection
     * @return siteConnection
     */
    public AssociateSiteConnectionBandwidth getSiteConnection() {
        return siteConnection;
    }

    public void setSiteConnection(AssociateSiteConnectionBandwidth siteConnection) {
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
        AssociateSiteConnectionBandwidthRequestBody that = (AssociateSiteConnectionBandwidthRequestBody) obj;
        return Objects.equals(this.siteConnection, that.siteConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateSiteConnectionBandwidthRequestBody {\n");
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
