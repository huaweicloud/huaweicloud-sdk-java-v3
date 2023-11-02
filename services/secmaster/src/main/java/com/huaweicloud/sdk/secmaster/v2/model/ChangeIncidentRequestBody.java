package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新事件请求body体
 */
public class ChangeIncidentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_ids")

    private List<String> batchIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Incident dataObject;

    public ChangeIncidentRequestBody withBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
        return this;
    }

    public ChangeIncidentRequestBody addBatchIdsItem(String batchIdsItem) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        this.batchIds.add(batchIdsItem);
        return this;
    }

    public ChangeIncidentRequestBody withBatchIds(Consumer<List<String>> batchIdsSetter) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        batchIdsSetter.accept(this.batchIds);
        return this;
    }

    /**
     * 更新事件的ID列表
     * @return batchIds
     */
    public List<String> getBatchIds() {
        return batchIds;
    }

    public void setBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
    }

    public ChangeIncidentRequestBody withDataObject(Incident dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ChangeIncidentRequestBody withDataObject(Consumer<Incident> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new Incident();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public Incident getDataObject() {
        return dataObject;
    }

    public void setDataObject(Incident dataObject) {
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
        ChangeIncidentRequestBody that = (ChangeIncidentRequestBody) obj;
        return Objects.equals(this.batchIds, that.batchIds) && Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIds, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeIncidentRequestBody {\n");
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
