package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新IP地址组IP列表请求参数。
 */
public class UpdateIpListOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<UpadateIpGroupIpOption> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateIpListOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * IP地址组的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpListOption withIpList(List<UpadateIpGroupIpOption> ipList) {
        this.ipList = ipList;
        return this;
    }

    public UpdateIpListOption addIpListItem(UpadateIpGroupIpOption ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public UpdateIpListOption withIpList(Consumer<List<UpadateIpGroupIpOption>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * IP地址组中包含的IP列表。
     * @return ipList
     */
    public List<UpadateIpGroupIpOption> getIpList() {
        return ipList;
    }

    public void setIpList(List<UpadateIpGroupIpOption> ipList) {
        this.ipList = ipList;
    }

    public UpdateIpListOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * IP地址组的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpListOption that = (UpdateIpListOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ipList, that.ipList)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipList, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpListOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
