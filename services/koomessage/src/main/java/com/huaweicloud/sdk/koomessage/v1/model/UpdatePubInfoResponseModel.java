package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更改服务号详情返回体。
 */
public class UpdatePubInfoResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private UpdatePubInfoResponseModelData data;

    public UpdatePubInfoResponseModel withData(UpdatePubInfoResponseModelData data) {
        this.data = data;
        return this;
    }

    public UpdatePubInfoResponseModel withData(Consumer<UpdatePubInfoResponseModelData> dataSetter) {
        if (this.data == null) {
            this.data = new UpdatePubInfoResponseModelData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public UpdatePubInfoResponseModelData getData() {
        return data;
    }

    public void setData(UpdatePubInfoResponseModelData data) {
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
        UpdatePubInfoResponseModel that = (UpdatePubInfoResponseModel) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePubInfoResponseModel {\n");
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
