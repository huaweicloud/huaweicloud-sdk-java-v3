package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享Vpc专线入参。
 */
public class ApplySharedVpcDedicatedParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private List<String> availabilityZone = null;

    public ApplySharedVpcDedicatedParam withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 租户指定的共享Vpc专线地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ApplySharedVpcDedicatedParam withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 租户指定共享Vpc专线地址端口。
     * minimum: 1025
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ApplySharedVpcDedicatedParam withAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public ApplySharedVpcDedicatedParam addAvailabilityZoneItem(String availabilityZoneItem) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public ApplySharedVpcDedicatedParam withAvailabilityZone(Consumer<List<String>> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * 开通服务资源使用的可用分区，默认随机使用2个可用区。
     * @return availabilityZone
     */
    public List<String> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplySharedVpcDedicatedParam that = (ApplySharedVpcDedicatedParam) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.port, that.port)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, port, availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplySharedVpcDedicatedParam {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
