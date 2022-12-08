package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListOtpDevicesByUserIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp_devices")

    private List<OtpDevice> otpDevices = null;

    public ListOtpDevicesByUserIdResponse withOtpDevices(List<OtpDevice> otpDevices) {
        this.otpDevices = otpDevices;
        return this;
    }

    public ListOtpDevicesByUserIdResponse addOtpDevicesItem(OtpDevice otpDevicesItem) {
        if (this.otpDevices == null) {
            this.otpDevices = new ArrayList<>();
        }
        this.otpDevices.add(otpDevicesItem);
        return this;
    }

    public ListOtpDevicesByUserIdResponse withOtpDevices(Consumer<List<OtpDevice>> otpDevicesSetter) {
        if (this.otpDevices == null) {
            this.otpDevices = new ArrayList<>();
        }
        otpDevicesSetter.accept(this.otpDevices);
        return this;
    }

    /**
     * otp设备
     * @return otpDevices
     */
    public List<OtpDevice> getOtpDevices() {
        return otpDevices;
    }

    public void setOtpDevices(List<OtpDevice> otpDevices) {
        this.otpDevices = otpDevices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOtpDevicesByUserIdResponse listOtpDevicesByUserIdResponse = (ListOtpDevicesByUserIdResponse) o;
        return Objects.equals(this.otpDevices, listOtpDevicesByUserIdResponse.otpDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOtpDevicesByUserIdResponse {\n");
        sb.append("    otpDevices: ").append(toIndentedString(otpDevices)).append("\n");
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
