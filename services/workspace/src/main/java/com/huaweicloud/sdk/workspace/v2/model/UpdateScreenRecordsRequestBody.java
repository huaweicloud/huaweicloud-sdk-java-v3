package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新录屏审计请求体
 */
public class UpdateScreenRecordsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_type")

    private String trafficLimitType;

    public UpdateScreenRecordsRequestBody withTrafficLimitType(String trafficLimitType) {
        this.trafficLimitType = trafficLimitType;
        return this;
    }

    /**
     * 录屏限速类型
     * @return trafficLimitType
     */
    public String getTrafficLimitType() {
        return trafficLimitType;
    }

    public void setTrafficLimitType(String trafficLimitType) {
        this.trafficLimitType = trafficLimitType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScreenRecordsRequestBody that = (UpdateScreenRecordsRequestBody) obj;
        return Objects.equals(this.trafficLimitType, that.trafficLimitType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficLimitType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScreenRecordsRequestBody {\n");
        sb.append("    trafficLimitType: ").append(toIndentedString(trafficLimitType)).append("\n");
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
