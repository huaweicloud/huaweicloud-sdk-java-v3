package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据对象批量更新对象
 */
public class DataObjectBatchUpdateForm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_ids")

    private List<String> batchIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_flag")

    private Boolean triggerFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Object dataObject;

    public DataObjectBatchUpdateForm withBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
        return this;
    }

    public DataObjectBatchUpdateForm addBatchIdsItem(String batchIdsItem) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        this.batchIds.add(batchIdsItem);
        return this;
    }

    public DataObjectBatchUpdateForm withBatchIds(Consumer<List<String>> batchIdsSetter) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        batchIdsSetter.accept(this.batchIds);
        return this;
    }

    /**
     * 批量更新ID列表
     * @return batchIds
     */
    public List<String> getBatchIds() {
        return batchIds;
    }

    public void setBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
    }

    public DataObjectBatchUpdateForm withTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
        return this;
    }

    /**
     * 触发标志
     * @return triggerFlag
     */
    public Boolean getTriggerFlag() {
        return triggerFlag;
    }

    public void setTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
    }

    public DataObjectBatchUpdateForm withDataObject(Object dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    /**
     * 数据对象
     * @return dataObject
     */
    public Object getDataObject() {
        return dataObject;
    }

    public void setDataObject(Object dataObject) {
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
        DataObjectBatchUpdateForm that = (DataObjectBatchUpdateForm) obj;
        return Objects.equals(this.batchIds, that.batchIds) && Objects.equals(this.triggerFlag, that.triggerFlag)
            && Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIds, triggerFlag, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataObjectBatchUpdateForm {\n");
        sb.append("    batchIds: ").append(toIndentedString(batchIds)).append("\n");
        sb.append("    triggerFlag: ").append(toIndentedString(triggerFlag)).append("\n");
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
