package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListVpcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcs")

    private List<Vpc> vpcs = null;

    public ListVpcsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 虚拟私有云的总数。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVpcsResponse withVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public ListVpcsResponse addVpcsItem(Vpc vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public ListVpcsResponse withVpcs(Consumer<List<Vpc>> vpcsSetter) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /** 虚拟私有云数组对象。
     * 
     * @return vpcs */
    public List<Vpc> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcsResponse listVpcsResponse = (ListVpcsResponse) o;
        return Objects.equals(this.count, listVpcsResponse.count) && Objects.equals(this.vpcs, listVpcsResponse.vpcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, vpcs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
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
