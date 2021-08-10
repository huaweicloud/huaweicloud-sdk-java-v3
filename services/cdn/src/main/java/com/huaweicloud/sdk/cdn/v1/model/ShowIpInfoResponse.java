package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowIpInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdn_ips")

    private List<CdnIps> cdnIps = null;

    public ShowIpInfoResponse withCdnIps(List<CdnIps> cdnIps) {
        this.cdnIps = cdnIps;
        return this;
    }

    public ShowIpInfoResponse addCdnIpsItem(CdnIps cdnIpsItem) {
        if (this.cdnIps == null) {
            this.cdnIps = new ArrayList<>();
        }
        this.cdnIps.add(cdnIpsItem);
        return this;
    }

    public ShowIpInfoResponse withCdnIps(Consumer<List<CdnIps>> cdnIpsSetter) {
        if (this.cdnIps == null) {
            this.cdnIps = new ArrayList<>();
        }
        cdnIpsSetter.accept(this.cdnIps);
        return this;
    }

    /** IP归属信息列表。
     * 
     * @return cdnIps */
    public List<CdnIps> getCdnIps() {
        return cdnIps;
    }

    public void setCdnIps(List<CdnIps> cdnIps) {
        this.cdnIps = cdnIps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIpInfoResponse showIpInfoResponse = (ShowIpInfoResponse) o;
        return Objects.equals(this.cdnIps, showIpInfoResponse.cdnIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdnIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpInfoResponse {\n");
        sb.append("    cdnIps: ").append(toIndentedString(cdnIps)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
