package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新带宽的请求体
 */
public class UpdatePrePaidBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private UpdatePrePaidBandwidthOption bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private UpdatePrePaidBandwidthExtendParamOption extendParam;

    public UpdatePrePaidBandwidthRequestBody withBandwidth(UpdatePrePaidBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdatePrePaidBandwidthRequestBody withBandwidth(Consumer<UpdatePrePaidBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new UpdatePrePaidBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public UpdatePrePaidBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(UpdatePrePaidBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UpdatePrePaidBandwidthRequestBody withExtendParam(UpdatePrePaidBandwidthExtendParamOption extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public UpdatePrePaidBandwidthRequestBody withExtendParam(
        Consumer<UpdatePrePaidBandwidthExtendParamOption> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new UpdatePrePaidBandwidthExtendParamOption();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public UpdatePrePaidBandwidthExtendParamOption getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(UpdatePrePaidBandwidthExtendParamOption extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrePaidBandwidthRequestBody updatePrePaidBandwidthRequestBody = (UpdatePrePaidBandwidthRequestBody) o;
        return Objects.equals(this.bandwidth, updatePrePaidBandwidthRequestBody.bandwidth)
            && Objects.equals(this.extendParam, updatePrePaidBandwidthRequestBody.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrePaidBandwidthRequestBody {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
