package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteDataStoreRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    private String dataStoreId;

    public DeleteDataStoreRequest withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /** 存储 ID
     * 
     * @return dataStoreId */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDataStoreRequest deleteDataStoreRequest = (DeleteDataStoreRequest) o;
        return Objects.equals(this.dataStoreId, deleteDataStoreRequest.dataStoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDataStoreRequest {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
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
