package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建数据连接请求
 */
public class DataConnectorReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connector")

    private DataConnector dataConnector;

    public DataConnectorReq withDataConnector(DataConnector dataConnector) {
        this.dataConnector = dataConnector;
        return this;
    }

    public DataConnectorReq withDataConnector(Consumer<DataConnector> dataConnectorSetter) {
        if (this.dataConnector == null) {
            this.dataConnector = new DataConnector();
            dataConnectorSetter.accept(this.dataConnector);
        }

        return this;
    }

    /**
     * Get dataConnector
     * @return dataConnector
     */
    public DataConnector getDataConnector() {
        return dataConnector;
    }

    public void setDataConnector(DataConnector dataConnector) {
        this.dataConnector = dataConnector;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataConnectorReq that = (DataConnectorReq) obj;
        return Objects.equals(this.dataConnector, that.dataConnector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataConnector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConnectorReq {\n");
        sb.append("    dataConnector: ").append(toIndentedString(dataConnector)).append("\n");
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
