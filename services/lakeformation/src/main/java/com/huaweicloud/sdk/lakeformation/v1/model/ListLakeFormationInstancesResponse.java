package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListLakeFormationInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<LakeFormationInstance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListLakeFormationInstancesResponse withInstances(List<LakeFormationInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ListLakeFormationInstancesResponse addInstancesItem(LakeFormationInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListLakeFormationInstancesResponse withInstances(Consumer<List<LakeFormationInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * LakeFormation实例列表
     * @return instances
     */
    public List<LakeFormationInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<LakeFormationInstance> instances) {
        this.instances = instances;
    }

    public ListLakeFormationInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * LakeFormation实例总数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListLakeFormationInstancesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLakeFormationInstancesResponse listLakeFormationInstancesResponse = (ListLakeFormationInstancesResponse) o;
        return Objects.equals(this.instances, listLakeFormationInstancesResponse.instances)
            && Objects.equals(this.total, listLakeFormationInstancesResponse.total)
            && Objects.equals(this.xRequestId, listLakeFormationInstancesResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLakeFormationInstancesResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
