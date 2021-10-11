package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListVpcChannelsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channels")

    private List<VpcChannelInfo> vpcChannels = null;

    public ListVpcChannelsV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 本次返回的列表长度
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListVpcChannelsV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 满足条件的记录数
     * 
     * @return total */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListVpcChannelsV2Response withVpcChannels(List<VpcChannelInfo> vpcChannels) {
        this.vpcChannels = vpcChannels;
        return this;
    }

    public ListVpcChannelsV2Response addVpcChannelsItem(VpcChannelInfo vpcChannelsItem) {
        if (this.vpcChannels == null) {
            this.vpcChannels = new ArrayList<>();
        }
        this.vpcChannels.add(vpcChannelsItem);
        return this;
    }

    public ListVpcChannelsV2Response withVpcChannels(Consumer<List<VpcChannelInfo>> vpcChannelsSetter) {
        if (this.vpcChannels == null) {
            this.vpcChannels = new ArrayList<>();
        }
        vpcChannelsSetter.accept(this.vpcChannels);
        return this;
    }

    /** 本次查询到的VPC通道列表
     * 
     * @return vpcChannels */
    public List<VpcChannelInfo> getVpcChannels() {
        return vpcChannels;
    }

    public void setVpcChannels(List<VpcChannelInfo> vpcChannels) {
        this.vpcChannels = vpcChannels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcChannelsV2Response listVpcChannelsV2Response = (ListVpcChannelsV2Response) o;
        return Objects.equals(this.size, listVpcChannelsV2Response.size)
            && Objects.equals(this.total, listVpcChannelsV2Response.total)
            && Objects.equals(this.vpcChannels, listVpcChannelsV2Response.vpcChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, vpcChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcChannelsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    vpcChannels: ").append(toIndentedString(vpcChannels)).append("\n");
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
