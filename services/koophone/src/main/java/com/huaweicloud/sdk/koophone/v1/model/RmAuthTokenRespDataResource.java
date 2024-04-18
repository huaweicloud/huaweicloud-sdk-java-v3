package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源集合
 */
public class RmAuthTokenRespDataResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk")

    private RmAuthTokenRespDataResourceSdk sdk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc")

    private RmAuthTokenRespDataResourceRtc rtc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kp_id")

    private String kpId;

    public RmAuthTokenRespDataResource withSdk(RmAuthTokenRespDataResourceSdk sdk) {
        this.sdk = sdk;
        return this;
    }

    public RmAuthTokenRespDataResource withSdk(Consumer<RmAuthTokenRespDataResourceSdk> sdkSetter) {
        if (this.sdk == null) {
            this.sdk = new RmAuthTokenRespDataResourceSdk();
            sdkSetter.accept(this.sdk);
        }

        return this;
    }

    /**
     * Get sdk
     * @return sdk
     */
    public RmAuthTokenRespDataResourceSdk getSdk() {
        return sdk;
    }

    public void setSdk(RmAuthTokenRespDataResourceSdk sdk) {
        this.sdk = sdk;
    }

    public RmAuthTokenRespDataResource withRtc(RmAuthTokenRespDataResourceRtc rtc) {
        this.rtc = rtc;
        return this;
    }

    public RmAuthTokenRespDataResource withRtc(Consumer<RmAuthTokenRespDataResourceRtc> rtcSetter) {
        if (this.rtc == null) {
            this.rtc = new RmAuthTokenRespDataResourceRtc();
            rtcSetter.accept(this.rtc);
        }

        return this;
    }

    /**
     * Get rtc
     * @return rtc
     */
    public RmAuthTokenRespDataResourceRtc getRtc() {
        return rtc;
    }

    public void setRtc(RmAuthTokenRespDataResourceRtc rtc) {
        this.rtc = rtc;
    }

    public RmAuthTokenRespDataResource withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public RmAuthTokenRespDataResource withKpId(String kpId) {
        this.kpId = kpId;
        return this;
    }

    /**
     * 云机实例Id，如whklpuo1
     * @return kpId
     */
    public String getKpId() {
        return kpId;
    }

    public void setKpId(String kpId) {
        this.kpId = kpId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespDataResource that = (RmAuthTokenRespDataResource) obj;
        return Objects.equals(this.sdk, that.sdk) && Objects.equals(this.rtc, that.rtc)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.kpId, that.kpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sdk, rtc, deviceId, kpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespDataResource {\n");
        sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
        sb.append("    rtc: ").append(toIndentedString(rtc)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    kpId: ").append(toIndentedString(kpId)).append("\n");
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
