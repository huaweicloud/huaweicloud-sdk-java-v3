package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update indicator request body
 */
public class UpdateIndicatorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_flag")

    private Boolean triggerFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private IndicatorDataObjectDetail dataObject;

    public UpdateIndicatorRequestBody withTriggerFlag(Boolean triggerFlag) {
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

    public UpdateIndicatorRequestBody withDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public UpdateIndicatorRequestBody withDataObject(Consumer<IndicatorDataObjectDetail> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new IndicatorDataObjectDetail();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public IndicatorDataObjectDetail getDataObject() {
        return dataObject;
    }

    public void setDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIndicatorRequestBody updateIndicatorRequestBody = (UpdateIndicatorRequestBody) o;
        return Objects.equals(this.triggerFlag, updateIndicatorRequestBody.triggerFlag)
            && Objects.equals(this.dataObject, updateIndicatorRequestBody.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerFlag, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndicatorRequestBody {\n");
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
