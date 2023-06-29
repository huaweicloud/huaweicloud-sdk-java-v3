package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 菜单催审返回体。
 */
public class PushMenuInfoResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PushMenuInfoResponseModelData data;

    public PushMenuInfoResponseModel withData(PushMenuInfoResponseModelData data) {
        this.data = data;
        return this;
    }

    public PushMenuInfoResponseModel withData(Consumer<PushMenuInfoResponseModelData> dataSetter) {
        if (this.data == null) {
            this.data = new PushMenuInfoResponseModelData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PushMenuInfoResponseModelData getData() {
        return data;
    }

    public void setData(PushMenuInfoResponseModelData data) {
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
        PushMenuInfoResponseModel that = (PushMenuInfoResponseModel) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushMenuInfoResponseModel {\n");
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
