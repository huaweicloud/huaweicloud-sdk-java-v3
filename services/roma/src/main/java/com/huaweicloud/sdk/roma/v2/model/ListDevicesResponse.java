package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDevicesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connect_address")
    
    private String connectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_connect_address")
    
    private String sslConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_connect_address")
    
    private String ipv6ConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_ssl_connect_address")
    
    private String ipv6SslConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<Device> items = null;
    
    public ListDevicesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListDevicesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回数量
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListDevicesResponse withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    


    /**
     * 设备接入地址
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    

    public ListDevicesResponse withSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
        return this;
    }

    


    /**
     * 设备接入SSL地址
     * @return sslConnectAddress
     */
    public String getSslConnectAddress() {
        return sslConnectAddress;
    }

    public void setSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
    }

    

    public ListDevicesResponse withIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
        return this;
    }

    


    /**
     * 设备接入IPV6地址
     * @return ipv6ConnectAddress
     */
    public String getIpv6ConnectAddress() {
        return ipv6ConnectAddress;
    }

    public void setIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
    }

    

    public ListDevicesResponse withIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
        return this;
    }

    


    /**
     * 设备接入IPV6 SSL地址
     * @return ipv6SslConnectAddress
     */
    public String getIpv6SslConnectAddress() {
        return ipv6SslConnectAddress;
    }

    public void setIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
    }

    

    public ListDevicesResponse withItems(List<Device> items) {
        this.items = items;
        return this;
    }

    
    public ListDevicesResponse addItemsItem(Device itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListDevicesResponse withItems(Consumer<List<Device>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 设备ID列表
     * @return items
     */
    public List<Device> getItems() {
        return items;
    }

    public void setItems(List<Device> items) {
        this.items = items;
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
        return Objects.equals(this.total, listDevicesResponse.total) &&
            Objects.equals(this.size, listDevicesResponse.size) &&
            Objects.equals(this.connectAddress, listDevicesResponse.connectAddress) &&
            Objects.equals(this.sslConnectAddress, listDevicesResponse.sslConnectAddress) &&
            Objects.equals(this.ipv6ConnectAddress, listDevicesResponse.ipv6ConnectAddress) &&
            Objects.equals(this.ipv6SslConnectAddress, listDevicesResponse.ipv6SslConnectAddress) &&
            Objects.equals(this.items, listDevicesResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, connectAddress, sslConnectAddress, ipv6ConnectAddress, ipv6SslConnectAddress, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    sslConnectAddress: ").append(toIndentedString(sslConnectAddress)).append("\n");
        sb.append("    ipv6ConnectAddress: ").append(toIndentedString(ipv6ConnectAddress)).append("\n");
        sb.append("    ipv6SslConnectAddress: ").append(toIndentedString(ipv6SslConnectAddress)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

