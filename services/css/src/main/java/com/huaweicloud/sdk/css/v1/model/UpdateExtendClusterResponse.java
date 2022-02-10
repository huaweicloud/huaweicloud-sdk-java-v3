package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateExtendClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ExtendClusterInstancesResp> instances = null;

    public UpdateExtendClusterResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 集群ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateExtendClusterResponse withInstances(List<ExtendClusterInstancesResp> instances) {
        this.instances = instances;
        return this;
    }

    public UpdateExtendClusterResponse addInstancesItem(ExtendClusterInstancesResp instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public UpdateExtendClusterResponse withInstances(Consumer<List<ExtendClusterInstancesResp>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /** 扩容实例列表。
     * 
     * @return instances */
    public List<ExtendClusterInstancesResp> getInstances() {
        return instances;
    }

    public void setInstances(List<ExtendClusterInstancesResp> instances) {
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
        UpdateExtendClusterResponse updateExtendClusterResponse = (UpdateExtendClusterResponse) o;
        return Objects.equals(this.id, updateExtendClusterResponse.id)
            && Objects.equals(this.instances, updateExtendClusterResponse.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExtendClusterResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
