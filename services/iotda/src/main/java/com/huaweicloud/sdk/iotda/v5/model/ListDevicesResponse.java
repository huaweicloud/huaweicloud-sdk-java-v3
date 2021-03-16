package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import com.huaweicloud.sdk.iotda.v5.model.QueryDeviceSimplify;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDevicesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="devices")
    
    private List<QueryDeviceSimplify> devices = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page;

    public ListDevicesResponse withDevices(List<QueryDeviceSimplify> devices) {
        this.devices = devices;
        return this;
    }

    
    public ListDevicesResponse addDevicesItem(QueryDeviceSimplify devicesItem) {
        this.devices.add(devicesItem);
        return this;
    }

    public ListDevicesResponse withDevices(Consumer<List<QueryDeviceSimplify>> devicesSetter) {
        if(this.devices == null ){
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 设备信息列表。
     * @return devices
     */
    public List<QueryDeviceSimplify> getDevices() {
        return devices;
    }

    public void setDevices(List<QueryDeviceSimplify> devices) {
        this.devices = devices;
    }

    

    public ListDevicesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDevicesResponse withPage(Consumer<Page> pageSetter) {
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
        ListDevicesResponse listDevicesResponse = (ListDevicesResponse) o;
        return Objects.equals(this.devices, listDevicesResponse.devices) &&
            Objects.equals(this.page, listDevicesResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(devices, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesResponse {\n");
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

