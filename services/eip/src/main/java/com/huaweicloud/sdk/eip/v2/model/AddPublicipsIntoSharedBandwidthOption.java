package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带宽对象
 */
public class AddPublicipsIntoSharedBandwidthOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_info")

    private List<InsertPublicipInfo> publicipInfo = null;

    public AddPublicipsIntoSharedBandwidthOption withPublicipInfo(List<InsertPublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    public AddPublicipsIntoSharedBandwidthOption addPublicipInfoItem(InsertPublicipInfo publicipInfoItem) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public AddPublicipsIntoSharedBandwidthOption withPublicipInfo(
        Consumer<List<InsertPublicipInfo>> publicipInfoSetter) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /**
     * 功能说明：要插入共享带宽的弹性公网IP或者IPv6端口信息  约束：WHOLE类型的带宽支持多个弹性公网IP或者IPv6端口，跟租户的配额相关，默认一个共享带宽的配额为20
     * @return publicipInfo
     */
    public List<InsertPublicipInfo> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<InsertPublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddPublicipsIntoSharedBandwidthOption addPublicipsIntoSharedBandwidthOption =
            (AddPublicipsIntoSharedBandwidthOption) o;
        return Objects.equals(this.publicipInfo, addPublicipsIntoSharedBandwidthOption.publicipInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPublicipsIntoSharedBandwidthOption {\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
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
