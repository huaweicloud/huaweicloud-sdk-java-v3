package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ShowRestorableListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restorable_instances")

    private List<QueryRestoreList> restorableInstances = null;

    public ShowRestorableListResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 可恢复的实例总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowRestorableListResponse withRestorableInstances(List<QueryRestoreList> restorableInstances) {
        this.restorableInstances = restorableInstances;
        return this;
    }

    public ShowRestorableListResponse addRestorableInstancesItem(QueryRestoreList restorableInstancesItem) {
        if (this.restorableInstances == null) {
            this.restorableInstances = new ArrayList<>();
        }
        this.restorableInstances.add(restorableInstancesItem);
        return this;
    }

    public ShowRestorableListResponse withRestorableInstances(
        Consumer<List<QueryRestoreList>> restorableInstancesSetter) {
        if (this.restorableInstances == null) {
            this.restorableInstances = new ArrayList<>();
        }
        restorableInstancesSetter.accept(this.restorableInstances);
        return this;
    }

    /**
     * 可恢复的实例信息
     * @return restorableInstances
     */
    public List<QueryRestoreList> getRestorableInstances() {
        return restorableInstances;
    }

    public void setRestorableInstances(List<QueryRestoreList> restorableInstances) {
        this.restorableInstances = restorableInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRestorableListResponse that = (ShowRestorableListResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.restorableInstances, that.restorableInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, restorableInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestorableListResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    restorableInstances: ").append(toIndentedString(restorableInstances)).append("\n");
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
