package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    @JacksonXmlProperty(localName = "instances")

    private List<QueryInstanceResponse> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    public ListInstancesResponse withInstances(List<QueryInstanceResponse> instances) {
        this.instances = instances;
        return this;
    }

    public ListInstancesResponse addInstancesItem(QueryInstanceResponse instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListInstancesResponse withInstances(Consumer<List<QueryInstanceResponse>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例信息。
     * @return instances
     */
    public List<QueryInstanceResponse> getInstances() {
        return instances;
    }

    public void setInstances(List<QueryInstanceResponse> instances) {
        this.instances = instances;
    }

    public ListInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesResponse listInstancesResponse = (ListInstancesResponse) o;
        return Objects.equals(this.instances, listInstancesResponse.instances)
            && Objects.equals(this.totalCount, listInstancesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
