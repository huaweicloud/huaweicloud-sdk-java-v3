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
    @JsonProperty(value = "publish_param")

    private PublishParam publishParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_param")

    private RecordParam recordParam;

    public UpdateIndividualJobReq withPublishParam(PublishParam publishParam) {
        this.publishParam = publishParam;
        return this;
    }

    public UpdateIndividualJobReq withPublishParam(Consumer<PublishParam> publishParamSetter) {
        if (this.publishParam == null) {
            this.publishParam = new PublishParam();
            publishParamSetter.accept(this.publishParam);
        }

        return this;
    }

    /**
     * Get publishParam
     * @return publishParam
     */
    public PublishParam getPublishParam() {
        return publishParam;
    }

    public void setPublishParam(PublishParam publishParam) {
        this.publishParam = publishParam;
    }

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIndividualJobReq updateIndividualJobReq = (UpdateIndividualJobReq) o;
        return Objects.equals(this.publishParam, updateIndividualJobReq.publishParam)
            && Objects.equals(this.recordParam, updateIndividualJobReq.recordParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishParam, recordParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndividualJobReq {\n");
        sb.append("    publishParam: ").append(toIndentedString(publishParam)).append("\n");
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
