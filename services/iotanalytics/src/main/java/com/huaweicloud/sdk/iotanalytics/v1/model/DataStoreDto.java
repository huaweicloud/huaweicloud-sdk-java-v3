package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储信息
 */
public class DataStoreDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_group_id")

    private String dataStoreGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public DataStoreDto withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /**
     * 存储ID
     * @return dataStoreId
     */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public DataStoreDto withDataStoreGroupId(String dataStoreGroupId) {
        this.dataStoreGroupId = dataStoreGroupId;
        return this;
    }

    /**
     * 存储组ID
     * @return dataStoreGroupId
     */
    public String getDataStoreGroupId() {
        return dataStoreGroupId;
    }

    public void setDataStoreGroupId(String dataStoreGroupId) {
        this.dataStoreGroupId = dataStoreGroupId;
    }

    public DataStoreDto withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataStoreDto dataStoreDto = (DataStoreDto) o;
        return Objects.equals(this.dataStoreId, dataStoreDto.dataStoreId)
            && Objects.equals(this.dataStoreGroupId, dataStoreDto.dataStoreGroupId)
            && Objects.equals(this.productId, dataStoreDto.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId, dataStoreGroupId, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataStoreDto {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    dataStoreGroupId: ").append(toIndentedString(dataStoreGroupId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
