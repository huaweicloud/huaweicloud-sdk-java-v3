package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 批量删除IP地址组中的IP。 */
public class BatchDeleteIpListOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpGroupIp> ipList = null;

    public BatchDeleteIpListOption withIpList(List<IpGroupIp> ipList) {
        this.ipList = ipList;
        return this;
    }

    public BatchDeleteIpListOption addIpListItem(IpGroupIp ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public BatchDeleteIpListOption withIpList(Consumer<List<IpGroupIp>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /** IP列表。
     * 
     * @return ipList */
    public List<IpGroupIp> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpGroupIp> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteIpListOption batchDeleteIpListOption = (BatchDeleteIpListOption) o;
        return Objects.equals(this.ipList, batchDeleteIpListOption.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpListOption {\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
