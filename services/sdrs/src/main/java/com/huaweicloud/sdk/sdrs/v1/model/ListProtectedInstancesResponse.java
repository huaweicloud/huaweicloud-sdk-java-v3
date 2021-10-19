package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListProtectedInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instances")

    private List<ShowProtectedInstanceParams> protectedInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListProtectedInstancesResponse withProtectedInstances(List<ShowProtectedInstanceParams> protectedInstances) {
        this.protectedInstances = protectedInstances;
        return this;
    }

    public ListProtectedInstancesResponse addProtectedInstancesItem(
        ShowProtectedInstanceParams protectedInstancesItem) {
        if (this.protectedInstances == null) {
            this.protectedInstances = new ArrayList<>();
        }
        this.protectedInstances.add(protectedInstancesItem);
        return this;
    }

    public ListProtectedInstancesResponse withProtectedInstances(
        Consumer<List<ShowProtectedInstanceParams>> protectedInstancesSetter) {
        if (this.protectedInstances == null) {
            this.protectedInstances = new ArrayList<>();
        }
        protectedInstancesSetter.accept(this.protectedInstances);
        return this;
    }

    /** 保护实例的信息列表。
     * 
     * @return protectedInstances */
    public List<ShowProtectedInstanceParams> getProtectedInstances() {
        return protectedInstances;
    }

    public void setProtectedInstances(List<ShowProtectedInstanceParams> protectedInstances) {
        this.protectedInstances = protectedInstances;
    }

    public ListProtectedInstancesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 列表中包含的保护实例个数。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProtectedInstancesResponse listProtectedInstancesResponse = (ListProtectedInstancesResponse) o;
        return Objects.equals(this.protectedInstances, listProtectedInstancesResponse.protectedInstances)
            && Objects.equals(this.count, listProtectedInstancesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstances, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectedInstancesResponse {\n");
        sb.append("    protectedInstances: ").append(toIndentedString(protectedInstances)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
