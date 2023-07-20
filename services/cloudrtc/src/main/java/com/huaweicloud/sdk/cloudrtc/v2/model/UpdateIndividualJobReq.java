package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新单流任务请求，转推和录制至少选一个
 */
public class UpdateIndividualJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_param")

    private RecordParam recordParam;

    public UpdateIndividualJobReq withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public UpdateIndividualJobReq withRecordParam(Consumer<RecordParam> recordParamSetter) {
        if (this.recordParam == null) {
            this.recordParam = new RecordParam();
            recordParamSetter.accept(this.recordParam);
        }

        return this;
    }

    /**
     * Get recordParam
     * @return recordParam
     */
    public RecordParam getRecordParam() {
        return recordParam;
    }

    public void setRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIndividualJobReq that = (UpdateIndividualJobReq) obj;
        return Objects.equals(this.recordParam, that.recordParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndividualJobReq {\n");
        sb.append("    recordParam: ").append(toIndentedString(recordParam)).append("\n");
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
