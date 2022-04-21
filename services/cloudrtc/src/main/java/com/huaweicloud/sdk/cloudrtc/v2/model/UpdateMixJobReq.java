package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合流任务参数
 */
public class UpdateMixJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mix_param")

    private UpdateMixParam mixParam;

    public UpdateMixJobReq withMixParam(UpdateMixParam mixParam) {
        this.mixParam = mixParam;
        return this;
    }

    public UpdateMixJobReq withMixParam(Consumer<UpdateMixParam> mixParamSetter) {
        if (this.mixParam == null) {
            this.mixParam = new UpdateMixParam();
            mixParamSetter.accept(this.mixParam);
        }

        return this;
    }

    /**
     * Get mixParam
     * @return mixParam
     */
    public UpdateMixParam getMixParam() {
        return mixParam;
    }

    public void setMixParam(UpdateMixParam mixParam) {
        this.mixParam = mixParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMixJobReq updateMixJobReq = (UpdateMixJobReq) o;
        return Objects.equals(this.mixParam, updateMixJobReq.mixParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mixParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMixJobReq {\n");
        sb.append("    mixParam: ").append(toIndentedString(mixParam)).append("\n");
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
