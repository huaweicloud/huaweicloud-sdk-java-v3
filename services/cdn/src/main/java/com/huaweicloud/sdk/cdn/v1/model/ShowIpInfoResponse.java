package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIpInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdn_ips")

    private List<CdnIps> cdnIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

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

    /**
     * IP归属信息列表。
     * @return cdnIps
     */
    public List<CdnIps> getCdnIps() {
        return cdnIps;
    }

    public void setCdnIps(List<CdnIps> cdnIps) {
        this.cdnIps = cdnIps;
    }

    public ShowIpInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpInfoResponse that = (ShowIpInfoResponse) obj;
        return Objects.equals(this.cdnIps, that.cdnIps) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdnIps, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpInfoResponse {\n");
        sb.append("    cdnIps: ").append(toIndentedString(cdnIps)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
