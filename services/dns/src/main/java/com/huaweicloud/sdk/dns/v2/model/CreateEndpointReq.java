package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEndpointReq
 */
public class CreateEndpointReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddresses")

    private List<Ipaddresses> ipaddresses = null;

    public CreateEndpointReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 待终端节点名称。 取值范围：1-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEndpointReq withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 终端节点方向。 取值： inbound，表示入站规则。 outbound，表示出站规则。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public CreateEndpointReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 当前子网所在的region。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateEndpointReq withIpaddresses(List<Ipaddresses> ipaddresses) {
        this.ipaddresses = ipaddresses;
        return this;
    }

    public CreateEndpointReq addIpaddressesItem(Ipaddresses ipaddressesItem) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        this.ipaddresses.add(ipaddressesItem);
        return this;
    }

    public CreateEndpointReq withIpaddresses(Consumer<List<Ipaddresses>> ipaddressesSetter) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        ipaddressesSetter.accept(this.ipaddresses);
        return this;
    }

    /**
     * 终端节点的ip地址和子网信息。
     * @return ipaddresses
     */
    public List<Ipaddresses> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(List<Ipaddresses> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEndpointReq createEndpointReq = (CreateEndpointReq) o;
        return Objects.equals(this.name, createEndpointReq.name)
            && Objects.equals(this.direction, createEndpointReq.direction)
            && Objects.equals(this.region, createEndpointReq.region)
            && Objects.equals(this.ipaddresses, createEndpointReq.ipaddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, region, ipaddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
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
