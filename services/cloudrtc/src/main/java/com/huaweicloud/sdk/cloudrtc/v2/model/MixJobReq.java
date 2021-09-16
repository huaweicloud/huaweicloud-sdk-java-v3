package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 合流任务参数，转推和录制至少选一个 */
public class MixJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mix_param")

    private MixParam mixParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_param")

    private PublishParam publishParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_param")

    private RecordParam recordParam;

    public MixJobReq withMixParam(MixParam mixParam) {
        this.mixParam = mixParam;
        return this;
    }

    public MixJobReq withMixParam(Consumer<MixParam> mixParamSetter) {
        if (this.mixParam == null) {
            this.mixParam = new MixParam();
            mixParamSetter.accept(this.mixParam);
        }

        return this;
    }

    /** Get mixParam
     * 
     * @return mixParam */
    public MixParam getMixParam() {
        return mixParam;
    }

    public void setMixParam(MixParam mixParam) {
        this.mixParam = mixParam;
    }

    public MixJobReq withPublishParam(PublishParam publishParam) {
        this.publishParam = publishParam;
        return this;
    }

    public MixJobReq withPublishParam(Consumer<PublishParam> publishParamSetter) {
        if (this.publishParam == null) {
            this.publishParam = new PublishParam();
            publishParamSetter.accept(this.publishParam);
        }

        return this;
    }

    /** Get publishParam
     * 
     * @return publishParam */
    public PublishParam getPublishParam() {
        return publishParam;
    }

    public void setPublishParam(PublishParam publishParam) {
        this.publishParam = publishParam;
    }

    public MixJobReq withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public MixJobReq withRecordParam(Consumer<RecordParam> recordParamSetter) {
        if (this.recordParam == null) {
            this.recordParam = new RecordParam();
            recordParamSetter.accept(this.recordParam);
        }

        return this;
    }

    /** Get recordParam
     * 
     * @return recordParam */
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
        MixJobReq mixJobReq = (MixJobReq) o;
        return Objects.equals(this.mixParam, mixJobReq.mixParam)
            && Objects.equals(this.publishParam, mixJobReq.publishParam)
            && Objects.equals(this.recordParam, mixJobReq.recordParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mixParam, publishParam, recordParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixJobReq {\n");
        sb.append("    mixParam: ").append(toIndentedString(mixParam)).append("\n");
        sb.append("    publishParam: ").append(toIndentedString(publishParam)).append("\n");
        sb.append("    recordParam: ").append(toIndentedString(recordParam)).append("\n");
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
