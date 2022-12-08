package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBandwidthPackageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package")

    private BandwidthPackage bandwidthPackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateBandwidthPackageResponse withBandwidthPackage(BandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }

    public CreateBandwidthPackageResponse withBandwidthPackage(Consumer<BandwidthPackage> bandwidthPackageSetter) {
        if (this.bandwidthPackage == null) {
            this.bandwidthPackage = new BandwidthPackage();
            bandwidthPackageSetter.accept(this.bandwidthPackage);
        }

        return this;
    }

    /**
     * Get bandwidthPackage
     * @return bandwidthPackage
     */
    public BandwidthPackage getBandwidthPackage() {
        return bandwidthPackage;
    }

    public void setBandwidthPackage(BandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }

    public CreateBandwidthPackageResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBandwidthPackageResponse createBandwidthPackageResponse = (CreateBandwidthPackageResponse) o;
        return Objects.equals(this.bandwidthPackage, createBandwidthPackageResponse.bandwidthPackage)
            && Objects.equals(this.requestId, createBandwidthPackageResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackage, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBandwidthPackageResponse {\n");
        sb.append("    bandwidthPackage: ").append(toIndentedString(bandwidthPackage)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
