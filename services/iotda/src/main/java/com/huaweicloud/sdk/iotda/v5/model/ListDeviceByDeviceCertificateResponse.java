package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDeviceByDeviceCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devices")

    private List<DeviceSimple> devices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceByDeviceCertificateResponse withDevices(List<DeviceSimple> devices) {
        this.devices = devices;
        return this;
    }

    public ListDeviceByDeviceCertificateResponse addDevicesItem(DeviceSimple devicesItem) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    public ListDeviceByDeviceCertificateResponse withDevices(Consumer<List<DeviceSimple>> devicesSetter) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 设备证书列表
     * @return devices
     */
    public List<DeviceSimple> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceSimple> devices) {
        this.devices = devices;
    }

    public ListDeviceByDeviceCertificateResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceByDeviceCertificateResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeviceByDeviceCertificateResponse that = (ListDeviceByDeviceCertificateResponse) obj;
        return Objects.equals(this.devices, that.devices) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceByDeviceCertificateResponse {\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
