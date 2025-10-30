package com.huaweicloud.sdk.rds.v3.model;

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
public class ListSmallVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_stores")

    private List<DatabaseSmallVersion> dataStores = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSmallVersionResponse withDataStores(List<DatabaseSmallVersion> dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    public ListSmallVersionResponse addDataStoresItem(DatabaseSmallVersion dataStoresItem) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        this.dataStores.add(dataStoresItem);
        return this;
    }

    public ListSmallVersionResponse withDataStores(Consumer<List<DatabaseSmallVersion>> dataStoresSetter) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        dataStoresSetter.accept(this.dataStores);
        return this;
    }

    /**
     * 参数解释： 数据库版本信息列表。
     * @return dataStores
     */
    public List<DatabaseSmallVersion> getDataStores() {
        return dataStores;
    }

    public void setDataStores(List<DatabaseSmallVersion> dataStores) {
        this.dataStores = dataStores;
    }

    public ListSmallVersionResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 参数解释： 查询总个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSmallVersionResponse that = (ListSmallVersionResponse) obj;
        return Objects.equals(this.dataStores, that.dataStores) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStores, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmallVersionResponse {\n");
        sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
