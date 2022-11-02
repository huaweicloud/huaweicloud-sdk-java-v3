package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateServerBlockDeviceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_device")

    private UpdateServerBlockDeviceOption blockDevice;

    public UpdateServerBlockDeviceReq withBlockDevice(UpdateServerBlockDeviceOption blockDevice) {
        this.blockDevice = blockDevice;
        return this;
    }

    public UpdateServerBlockDeviceReq withBlockDevice(Consumer<UpdateServerBlockDeviceOption> blockDeviceSetter) {
        if (this.blockDevice == null) {
            this.blockDevice = new UpdateServerBlockDeviceOption();
            blockDeviceSetter.accept(this.blockDevice);
        }

        return this;
    }

    /**
     * Get blockDevice
     * @return blockDevice
     */
    public UpdateServerBlockDeviceOption getBlockDevice() {
        return blockDevice;
    }

    public void setBlockDevice(UpdateServerBlockDeviceOption blockDevice) {
        this.blockDevice = blockDevice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerBlockDeviceReq updateServerBlockDeviceReq = (UpdateServerBlockDeviceReq) o;
        return Objects.equals(this.blockDevice, updateServerBlockDeviceReq.blockDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerBlockDeviceReq {\n");
        sb.append("    blockDevice: ").append(toIndentedString(blockDevice)).append("\n");
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
