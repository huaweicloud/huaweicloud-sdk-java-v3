package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新告警请求body体
 */
public class ChangeAlertRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_ids")

    private List<String> batchIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Alert dataObject;

    public ChangeAlertRequestBody withBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
        return this;
    }

    public ChangeAlertRequestBody addBatchIdsItem(String batchIdsItem) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        this.batchIds.add(batchIdsItem);
        return this;
    }

    public ChangeAlertRequestBody withBatchIds(Consumer<List<String>> batchIdsSetter) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        batchIdsSetter.accept(this.batchIds);
        return this;
    }

    /**
     * 更新告警的ID列表
     * @return batchIds
     */
    public List<String> getBatchIds() {
        return batchIds;
    }

    public void setBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
    }

    public ChangeAlertRequestBody withDataObject(Alert dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ChangeAlertRequestBody withDataObject(Consumer<Alert> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new Alert();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public Alert getDataObject() {
        return dataObject;
    }

    public void setDataObject(Alert dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeAlertRequestBody that = (ChangeAlertRequestBody) obj;
        return Objects.equals(this.batchIds, that.batchIds) && Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIds, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAlertRequestBody {\n");
        sb.append("    batchIds: ").append(toIndentedString(batchIds)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
