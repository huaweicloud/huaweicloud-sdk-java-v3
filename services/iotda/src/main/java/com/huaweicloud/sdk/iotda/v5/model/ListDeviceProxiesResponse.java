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
public class ListDeviceProxiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_proxies")

    private List<QueryDeviceProxySimplify> deviceProxies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceProxiesResponse withDeviceProxies(List<QueryDeviceProxySimplify> deviceProxies) {
        this.deviceProxies = deviceProxies;
        return this;
    }

    public ListDeviceProxiesResponse addDeviceProxiesItem(QueryDeviceProxySimplify deviceProxiesItem) {
        if (this.deviceProxies == null) {
            this.deviceProxies = new ArrayList<>();
        }
        this.deviceProxies.add(deviceProxiesItem);
        return this;
    }

    public ListDeviceProxiesResponse withDeviceProxies(Consumer<List<QueryDeviceProxySimplify>> deviceProxiesSetter) {
        if (this.deviceProxies == null) {
            this.deviceProxies = new ArrayList<>();
        }
        deviceProxiesSetter.accept(this.deviceProxies);
        return this;
    }

    /**
     * 代理设备列表
     * @return deviceProxies
     */
    public List<QueryDeviceProxySimplify> getDeviceProxies() {
        return deviceProxies;
    }

    public void setDeviceProxies(List<QueryDeviceProxySimplify> deviceProxies) {
        this.deviceProxies = deviceProxies;
    }

    public ListDeviceProxiesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceProxiesResponse withPage(Consumer<Page> pageSetter) {
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
        ListDeviceProxiesResponse that = (ListDeviceProxiesResponse) obj;
        return Objects.equals(this.deviceProxies, that.deviceProxies) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceProxies, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceProxiesResponse {\n");
        sb.append("    deviceProxies: ").append(toIndentedString(deviceProxies)).append("\n");
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
