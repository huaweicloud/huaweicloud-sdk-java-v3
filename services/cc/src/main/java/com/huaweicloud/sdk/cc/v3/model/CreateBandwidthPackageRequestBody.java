package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建带宽包实例的请求体。
 */
public class CreateBandwidthPackageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package")

    private CreateBandwidthPackage bandwidthPackage;

    public CreateBandwidthPackageRequestBody withBandwidthPackage(CreateBandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }

    public CreateBandwidthPackageRequestBody withBandwidthPackage(
        Consumer<CreateBandwidthPackage> bandwidthPackageSetter) {
        if (this.bandwidthPackage == null) {
            this.bandwidthPackage = new CreateBandwidthPackage();
            bandwidthPackageSetter.accept(this.bandwidthPackage);
        }

        return this;
    }

    /**
     * Get bandwidthPackage
     * @return bandwidthPackage
     */
    public CreateBandwidthPackage getBandwidthPackage() {
        return bandwidthPackage;
    }

    public void setBandwidthPackage(CreateBandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBandwidthPackageRequestBody createBandwidthPackageRequestBody = (CreateBandwidthPackageRequestBody) o;
        return Objects.equals(this.bandwidthPackage, createBandwidthPackageRequestBody.bandwidthPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBandwidthPackageRequestBody {\n");
        sb.append("    bandwidthPackage: ").append(toIndentedString(bandwidthPackage)).append("\n");
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
