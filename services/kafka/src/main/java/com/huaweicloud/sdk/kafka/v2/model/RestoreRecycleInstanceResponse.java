package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RestoreRecycleInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<InstanceResumeResult> instances = null;

    public RestoreRecycleInstanceResponse withInstances(List<InstanceResumeResult> instances) {
        this.instances = instances;
        return this;
    }

    public RestoreRecycleInstanceResponse addInstancesItem(InstanceResumeResult instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public RestoreRecycleInstanceResponse withInstances(Consumer<List<InstanceResumeResult>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释**： 实例列表。
     * @return instances
     */
    public List<InstanceResumeResult> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceResumeResult> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreRecycleInstanceResponse that = (RestoreRecycleInstanceResponse) obj;
        return Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreRecycleInstanceResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
