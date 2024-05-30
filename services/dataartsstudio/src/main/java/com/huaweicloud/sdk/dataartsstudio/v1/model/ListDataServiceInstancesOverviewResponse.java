package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListDataServiceInstancesOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_down")

    private Boolean scaleDown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out")

    private Boolean scaleOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<InstanceOverviewDTO> instances = null;

    public ListDataServiceInstancesOverviewResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 集群数量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDataServiceInstancesOverviewResponse withScaleDown(Boolean scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }

    /**
     * 是否支持缩容。
     * @return scaleDown
     */
    public Boolean getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(Boolean scaleDown) {
        this.scaleDown = scaleDown;
    }

    public ListDataServiceInstancesOverviewResponse withScaleOut(Boolean scaleOut) {
        this.scaleOut = scaleOut;
        return this;
    }

    /**
     * 是否支持扩容。
     * @return scaleOut
     */
    public Boolean getScaleOut() {
        return scaleOut;
    }

    public void setScaleOut(Boolean scaleOut) {
        this.scaleOut = scaleOut;
    }

    public ListDataServiceInstancesOverviewResponse withInstances(List<InstanceOverviewDTO> instances) {
        this.instances = instances;
        return this;
    }

    public ListDataServiceInstancesOverviewResponse addInstancesItem(InstanceOverviewDTO instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListDataServiceInstancesOverviewResponse withInstances(Consumer<List<InstanceOverviewDTO>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 集群概览信息。
     * @return instances
     */
    public List<InstanceOverviewDTO> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceOverviewDTO> instances) {
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
        ListDataServiceInstancesOverviewResponse that = (ListDataServiceInstancesOverviewResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.scaleDown, that.scaleDown)
            && Objects.equals(this.scaleOut, that.scaleOut) && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, scaleDown, scaleOut, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataServiceInstancesOverviewResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    scaleDown: ").append(toIndentedString(scaleDown)).append("\n");
        sb.append("    scaleOut: ").append(toIndentedString(scaleOut)).append("\n");
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
