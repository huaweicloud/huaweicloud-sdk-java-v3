package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.DeviceGroupResponseDTO;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDeviceGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_groups")
    
    private List<DeviceGroupResponseDTO> deviceGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page = null;

    public ListDeviceGroupsResponse withDeviceGroups(List<DeviceGroupResponseDTO> deviceGroups) {
        this.deviceGroups = deviceGroups;
        return this;
    }

    
    public ListDeviceGroupsResponse addDeviceGroupsItem(DeviceGroupResponseDTO deviceGroupsItem) {
        if (this.deviceGroups == null) {
            this.deviceGroups = new ArrayList<>();
        }
        this.deviceGroups.add(deviceGroupsItem);
        return this;
    }

    public ListDeviceGroupsResponse withDeviceGroups(Consumer<List<DeviceGroupResponseDTO>> deviceGroupsSetter) {
        if(this.deviceGroups == null ){
            this.deviceGroups = new ArrayList<>();
        }
        deviceGroupsSetter.accept(this.deviceGroups);
        return this;
    }

    /**
     * 设备组信息列表。
     * @return deviceGroups
     */
    public List<DeviceGroupResponseDTO> getDeviceGroups() {
        return deviceGroups;
    }

    public void setDeviceGroups(List<DeviceGroupResponseDTO> deviceGroups) {
        this.deviceGroups = deviceGroups;
    }

    public ListDeviceGroupsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceGroupsResponse withPage(Consumer<Page> pageSetter) {
        if(this.page == null ){
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
        return Objects.equals(this.deviceGroups, listDeviceGroupsResponse.deviceGroups) &&
            Objects.equals(this.page, listDeviceGroupsResponse.page);
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

