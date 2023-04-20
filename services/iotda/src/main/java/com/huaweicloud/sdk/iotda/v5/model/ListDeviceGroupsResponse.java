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
public class ListDeviceGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_groups")

    private List<DeviceGroupResponsSummery> deviceGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceGroupsResponse withDeviceGroups(List<DeviceGroupResponsSummery> deviceGroups) {
        this.deviceGroups = deviceGroups;
        return this;
    }

    public ListDeviceGroupsResponse addDeviceGroupsItem(DeviceGroupResponsSummery deviceGroupsItem) {
        if (this.deviceGroups == null) {
            this.deviceGroups = new ArrayList<>();
        }
        this.deviceGroups.add(deviceGroupsItem);
        return this;
    }

    public ListDeviceGroupsResponse withDeviceGroups(Consumer<List<DeviceGroupResponsSummery>> deviceGroupsSetter) {
        if (this.deviceGroups == null) {
            this.deviceGroups = new ArrayList<>();
        }
        deviceGroupsSetter.accept(this.deviceGroups);
        return this;
    }

    /**
     * 设备组信息列表。
     * @return deviceGroups
     */
    public List<DeviceGroupResponsSummery> getDeviceGroups() {
        return deviceGroups;
    }

    public void setDeviceGroups(List<DeviceGroupResponsSummery> deviceGroups) {
        this.deviceGroups = deviceGroups;
    }

    public ListDeviceGroupsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceGroupsResponse withPage(Consumer<Page> pageSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceGroupsResponse listDeviceGroupsResponse = (ListDeviceGroupsResponse) o;
        return Objects.equals(this.deviceGroups, listDeviceGroupsResponse.deviceGroups)
            && Objects.equals(this.page, listDeviceGroupsResponse.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceGroups, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceGroupsResponse {\n");
        sb.append("    deviceGroups: ").append(toIndentedString(deviceGroups)).append("\n");
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
