package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建服务号的返回体。
 */
public class CreatePubInfoResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private CreatePubInfoResponseModelData data;

    public CreatePubInfoResponseModel withData(CreatePubInfoResponseModelData data) {
        this.data = data;
        return this;
    }

    public CreatePubInfoResponseModel withData(Consumer<CreatePubInfoResponseModelData> dataSetter) {
        if (this.data == null) {
            this.data = new CreatePubInfoResponseModelData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public CreatePubInfoResponseModelData getData() {
        return data;
    }

    public void setData(CreatePubInfoResponseModelData data) {
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
        CreatePubInfoResponseModel createPubInfoResponseModel = (CreatePubInfoResponseModel) o;
        return Objects.equals(this.data, createPubInfoResponseModel.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePubInfoResponseModel {\n");
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
