package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IvsStandardByVideoAndIdCardImageRequestBody
 */
public class IvsStandardByVideoAndIdCardImageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private Meta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private IvsStandardByVideoAndIdCardImageRequestBodyData data;

    public IvsStandardByVideoAndIdCardImageRequestBody withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public IvsStandardByVideoAndIdCardImageRequestBody withMeta(Consumer<Meta> metaSetter) {
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

    public IvsStandardByVideoAndIdCardImageRequestBody withData(IvsStandardByVideoAndIdCardImageRequestBodyData data) {
        this.data = data;
        return this;
    }

    public IvsStandardByVideoAndIdCardImageRequestBody withData(
        Consumer<IvsStandardByVideoAndIdCardImageRequestBodyData> dataSetter) {
        if (this.data == null) {
            this.data = new IvsStandardByVideoAndIdCardImageRequestBodyData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public IvsStandardByVideoAndIdCardImageRequestBodyData getData() {
        return data;
    }

    public void setData(IvsStandardByVideoAndIdCardImageRequestBodyData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IvsStandardByVideoAndIdCardImageRequestBody ivsStandardByVideoAndIdCardImageRequestBody =
            (IvsStandardByVideoAndIdCardImageRequestBody) o;
        return Objects.equals(this.meta, ivsStandardByVideoAndIdCardImageRequestBody.meta)
            && Objects.equals(this.data, ivsStandardByVideoAndIdCardImageRequestBody.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IvsStandardByVideoAndIdCardImageRequestBody {\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
