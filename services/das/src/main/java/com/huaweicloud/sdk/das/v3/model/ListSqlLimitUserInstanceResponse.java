package com.huaweicloud.sdk.das.v3.model;

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
public class ListSqlLimitUserInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "das_instances")

    private List<DASUserInstanceInfo> dasInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListSqlLimitUserInstanceResponse withDasInstances(List<DASUserInstanceInfo> dasInstances) {
        this.dasInstances = dasInstances;
        return this;
    }

    public ListSqlLimitUserInstanceResponse addDasInstancesItem(DASUserInstanceInfo dasInstancesItem) {
        if (this.dasInstances == null) {
            this.dasInstances = new ArrayList<>();
        }
        this.dasInstances.add(dasInstancesItem);
        return this;
    }

    public ListSqlLimitUserInstanceResponse withDasInstances(Consumer<List<DASUserInstanceInfo>> dasInstancesSetter) {
        if (this.dasInstances == null) {
            this.dasInstances = new ArrayList<>();
        }
        dasInstancesSetter.accept(this.dasInstances);
        return this;
    }

    /**
     * 实例列表
     * @return dasInstances
     */
    public List<DASUserInstanceInfo> getDasInstances() {
        return dasInstances;
    }

    public void setDasInstances(List<DASUserInstanceInfo> dasInstances) {
        this.dasInstances = dasInstances;
    }

    public ListSqlLimitUserInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlLimitUserInstanceResponse that = (ListSqlLimitUserInstanceResponse) obj;
        return Objects.equals(this.dasInstances, that.dasInstances) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dasInstances, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlLimitUserInstanceResponse {\n");
        sb.append("    dasInstances: ").append(toIndentedString(dasInstances)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
