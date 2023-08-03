package com.huaweicloud.sdk.mrs.v2.model;

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
public class ListDataConnectorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connectors")

    private List<DataConnectorDetail> dataConnectors = null;

    public ListDataConnectorResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据连接总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDataConnectorResponse withDataConnectors(List<DataConnectorDetail> dataConnectors) {
        this.dataConnectors = dataConnectors;
        return this;
    }

    public ListDataConnectorResponse addDataConnectorsItem(DataConnectorDetail dataConnectorsItem) {
        if (this.dataConnectors == null) {
            this.dataConnectors = new ArrayList<>();
        }
        this.dataConnectors.add(dataConnectorsItem);
        return this;
    }

    public ListDataConnectorResponse withDataConnectors(Consumer<List<DataConnectorDetail>> dataConnectorsSetter) {
        if (this.dataConnectors == null) {
            this.dataConnectors = new ArrayList<>();
        }
        dataConnectorsSetter.accept(this.dataConnectors);
        return this;
    }

    /**
     * 数据连接详情列表
     * @return dataConnectors
     */
    public List<DataConnectorDetail> getDataConnectors() {
        return dataConnectors;
    }

    public void setDataConnectors(List<DataConnectorDetail> dataConnectors) {
        this.dataConnectors = dataConnectors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataConnectorResponse that = (ListDataConnectorResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.dataConnectors, that.dataConnectors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, dataConnectors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataConnectorResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    dataConnectors: ").append(toIndentedString(dataConnectors)).append("\n");
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
