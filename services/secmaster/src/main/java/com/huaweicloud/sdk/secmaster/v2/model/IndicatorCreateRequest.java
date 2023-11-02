package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建指标请求参数
 */
public class IndicatorCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private CreateIndicatorDetail dataObject;

    public IndicatorCreateRequest withDataObject(CreateIndicatorDetail dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public IndicatorCreateRequest withDataObject(Consumer<CreateIndicatorDetail> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new CreateIndicatorDetail();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public CreateIndicatorDetail getDataObject() {
        return dataObject;
    }

    public void setDataObject(CreateIndicatorDetail dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndicatorCreateRequest that = (IndicatorCreateRequest) obj;
        return Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorCreateRequest {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
