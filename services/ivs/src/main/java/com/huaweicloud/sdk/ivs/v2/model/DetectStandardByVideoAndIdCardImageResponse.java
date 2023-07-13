package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DetectStandardByVideoAndIdCardImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private Meta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private IvsStandardByVideoAndIdCardImageResponseBodyResult result;

    public DetectStandardByVideoAndIdCardImageResponse withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public DetectStandardByVideoAndIdCardImageResponse withMeta(Consumer<Meta> metaSetter) {
        if (this.meta == null) {
            this.meta = new Meta();
            metaSetter.accept(this.meta);
        }

        return this;
    }

    /**
     * Get meta
     * @return meta
     */
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public DetectStandardByVideoAndIdCardImageResponse withResult(
        IvsStandardByVideoAndIdCardImageResponseBodyResult result) {
        this.result = result;
        return this;
    }

    public DetectStandardByVideoAndIdCardImageResponse withResult(
        Consumer<IvsStandardByVideoAndIdCardImageResponseBodyResult> resultSetter) {
        if (this.result == null) {
            this.result = new IvsStandardByVideoAndIdCardImageResponseBodyResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public IvsStandardByVideoAndIdCardImageResponseBodyResult getResult() {
        return result;
    }

    public void setResult(IvsStandardByVideoAndIdCardImageResponseBodyResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectStandardByVideoAndIdCardImageResponse that = (DetectStandardByVideoAndIdCardImageResponse) obj;
        return Objects.equals(this.meta, that.meta) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectStandardByVideoAndIdCardImageResponse {\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
