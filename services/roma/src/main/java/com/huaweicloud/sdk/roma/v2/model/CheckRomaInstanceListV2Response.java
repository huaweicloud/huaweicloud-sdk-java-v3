package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CheckRomaInstanceListV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<RomaInstanceCheckListRespInstances> instances = null;

    public CheckRomaInstanceListV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 列表总数 minimum: 0 maximum: 100
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CheckRomaInstanceListV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 本页数量 minimum: 0 maximum: 100
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CheckRomaInstanceListV2Response withInstances(List<RomaInstanceCheckListRespInstances> instances) {
        this.instances = instances;
        return this;
    }

    public CheckRomaInstanceListV2Response addInstancesItem(RomaInstanceCheckListRespInstances instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public CheckRomaInstanceListV2Response withInstances(
        Consumer<List<RomaInstanceCheckListRespInstances>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /** 实例列表
     * 
     * @return instances */
    public List<RomaInstanceCheckListRespInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<RomaInstanceCheckListRespInstances> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRomaInstanceListV2Response checkRomaInstanceListV2Response = (CheckRomaInstanceListV2Response) o;
        return Objects.equals(this.total, checkRomaInstanceListV2Response.total)
            && Objects.equals(this.size, checkRomaInstanceListV2Response.size)
            && Objects.equals(this.instances, checkRomaInstanceListV2Response.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRomaInstanceListV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
