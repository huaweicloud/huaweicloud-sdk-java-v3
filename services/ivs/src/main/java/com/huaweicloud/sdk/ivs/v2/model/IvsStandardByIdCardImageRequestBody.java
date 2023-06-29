package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IvsStandardByIdCardImageRequestBody
 */
public class IvsStandardByIdCardImageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private Meta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private IvsStandardByIdCardImageRequestBodyData data;

    public IvsStandardByIdCardImageRequestBody withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public IvsStandardByIdCardImageRequestBody withMeta(Consumer<Meta> metaSetter) {
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

    public IvsStandardByIdCardImageRequestBody withData(IvsStandardByIdCardImageRequestBodyData data) {
        this.data = data;
        return this;
    }

    public IvsStandardByIdCardImageRequestBody withData(Consumer<IvsStandardByIdCardImageRequestBodyData> dataSetter) {
        if (this.data == null) {
            this.data = new IvsStandardByIdCardImageRequestBodyData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public IvsStandardByIdCardImageRequestBodyData getData() {
        return data;
    }

    public void setData(IvsStandardByIdCardImageRequestBodyData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IvsStandardByIdCardImageRequestBody that = (IvsStandardByIdCardImageRequestBody) obj;
        return Objects.equals(this.meta, that.meta) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IvsStandardByIdCardImageRequestBody {\n");
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
