package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeadLockOriginDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_data")

    private String originData;

    public ShowDeadLockOriginDataResponse withOriginData(String originData) {
        this.originData = originData;
        return this;
    }

    /**
     * 原始数据
     * @return originData
     */
    public String getOriginData() {
        return originData;
    }

    public void setOriginData(String originData) {
        this.originData = originData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockOriginDataResponse that = (ShowDeadLockOriginDataResponse) obj;
        return Objects.equals(this.originData, that.originData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockOriginDataResponse {\n");
        sb.append("    originData: ").append(toIndentedString(originData)).append("\n");
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
