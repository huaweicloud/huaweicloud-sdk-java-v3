package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主页催审返回体。
 */
public class PushPortalInfoResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PushPortalInfoResponseModelData data;

    public PushPortalInfoResponseModel withData(PushPortalInfoResponseModelData data) {
        this.data = data;
        return this;
    }

    public PushPortalInfoResponseModel withData(Consumer<PushPortalInfoResponseModelData> dataSetter) {
        if (this.data == null) {
            this.data = new PushPortalInfoResponseModelData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PushPortalInfoResponseModelData getData() {
        return data;
    }

    public void setData(PushPortalInfoResponseModelData data) {
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
        PushPortalInfoResponseModel that = (PushPortalInfoResponseModel) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushPortalInfoResponseModel {\n");
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
