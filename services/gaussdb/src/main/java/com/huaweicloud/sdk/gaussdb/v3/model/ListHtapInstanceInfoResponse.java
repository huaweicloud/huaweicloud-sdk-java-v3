package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListHtapInstanceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<HtapInstanceListInstances> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_htap_instance_num_of_taurus")

    private Integer maxHtapInstanceNumOfTaurus;

    public ListHtapInstanceInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * HTAP实例个数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHtapInstanceInfoResponse withInstances(List<HtapInstanceListInstances> instances) {
        this.instances = instances;
        return this;
    }

    public ListHtapInstanceInfoResponse addInstancesItem(HtapInstanceListInstances instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListHtapInstanceInfoResponse withInstances(Consumer<List<HtapInstanceListInstances>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * HTAP实例信息。
     * @return instances
     */
    public List<HtapInstanceListInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<HtapInstanceListInstances> instances) {
        this.instances = instances;
    }

    public ListHtapInstanceInfoResponse withMaxHtapInstanceNumOfTaurus(Integer maxHtapInstanceNumOfTaurus) {
        this.maxHtapInstanceNumOfTaurus = maxHtapInstanceNumOfTaurus;
        return this;
    }

    /**
     * 最大HTAP实例个数。
     * @return maxHtapInstanceNumOfTaurus
     */
    public Integer getMaxHtapInstanceNumOfTaurus() {
        return maxHtapInstanceNumOfTaurus;
    }

    public void setMaxHtapInstanceNumOfTaurus(Integer maxHtapInstanceNumOfTaurus) {
        this.maxHtapInstanceNumOfTaurus = maxHtapInstanceNumOfTaurus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHtapInstanceInfoResponse that = (ListHtapInstanceInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.maxHtapInstanceNumOfTaurus, that.maxHtapInstanceNumOfTaurus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, instances, maxHtapInstanceNumOfTaurus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHtapInstanceInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    maxHtapInstanceNumOfTaurus: ").append(toIndentedString(maxHtapInstanceNumOfTaurus)).append("\n");
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
