package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ModifyProxyWeightRequest */
public class ModifyProxyWeightRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_weight")

    private String masterWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_instances")

    private List<ProxyReadonlyInstances> readonlyInstances = null;

    public ModifyProxyWeightRequest withMasterWeight(String masterWeight) {
        this.masterWeight = masterWeight;
        return this;
    }

    /** 主实例权重，取值范围为0~1000。
     * 
     * @return masterWeight */
    public String getMasterWeight() {
        return masterWeight;
    }

    public void setMasterWeight(String masterWeight) {
        this.masterWeight = masterWeight;
    }

    public ModifyProxyWeightRequest withReadonlyInstances(List<ProxyReadonlyInstances> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
        return this;
    }

    public ModifyProxyWeightRequest addReadonlyInstancesItem(ProxyReadonlyInstances readonlyInstancesItem) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        this.readonlyInstances.add(readonlyInstancesItem);
        return this;
    }

    public ModifyProxyWeightRequest withReadonlyInstances(
        Consumer<List<ProxyReadonlyInstances>> readonlyInstancesSetter) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        readonlyInstancesSetter.accept(this.readonlyInstances);
        return this;
    }

    /** 只读实例信息。
     * 
     * @return readonlyInstances */
    public List<ProxyReadonlyInstances> getReadonlyInstances() {
        return readonlyInstances;
    }

    public void setReadonlyInstances(List<ProxyReadonlyInstances> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyProxyWeightRequest modifyProxyWeightRequest = (ModifyProxyWeightRequest) o;
        return Objects.equals(this.masterWeight, modifyProxyWeightRequest.masterWeight)
            && Objects.equals(this.readonlyInstances, modifyProxyWeightRequest.readonlyInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterWeight, readonlyInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProxyWeightRequest {\n");
        sb.append("    masterWeight: ").append(toIndentedString(masterWeight)).append("\n");
        sb.append("    readonlyInstances: ").append(toIndentedString(readonlyInstances)).append("\n");
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
