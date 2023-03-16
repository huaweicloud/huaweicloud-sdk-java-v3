package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IvsStandardByVideoAndNameAndIdRequestBody
 */
public class IvsStandardByVideoAndNameAndIdRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private Meta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private IvsStandardByVideoAndNameAndIdRequestBodyData data;

    public IvsStandardByVideoAndNameAndIdRequestBody withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public IvsStandardByVideoAndNameAndIdRequestBody withMeta(Consumer<Meta> metaSetter) {
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

    public IvsStandardByVideoAndNameAndIdRequestBody withData(IvsStandardByVideoAndNameAndIdRequestBodyData data) {
        this.data = data;
        return this;
    }

    public IvsStandardByVideoAndNameAndIdRequestBody withData(
        Consumer<IvsStandardByVideoAndNameAndIdRequestBodyData> dataSetter) {
        if (this.data == null) {
            this.data = new IvsStandardByVideoAndNameAndIdRequestBodyData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public IvsStandardByVideoAndNameAndIdRequestBodyData getData() {
        return data;
    }

    public void setData(IvsStandardByVideoAndNameAndIdRequestBodyData data) {
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
        IvsStandardByVideoAndNameAndIdRequestBody ivsStandardByVideoAndNameAndIdRequestBody =
            (IvsStandardByVideoAndNameAndIdRequestBody) o;
        return Objects.equals(this.meta, ivsStandardByVideoAndNameAndIdRequestBody.meta)
            && Objects.equals(this.data, ivsStandardByVideoAndNameAndIdRequestBody.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IvsStandardByVideoAndNameAndIdRequestBody {\n");
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
