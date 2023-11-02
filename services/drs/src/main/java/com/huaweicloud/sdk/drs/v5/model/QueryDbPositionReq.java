package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 采集数据库位点信息
 */
public class QueryDbPositionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_position_time")

    private String resetPositionTime;

    public QueryDbPositionReq withResetPositionTime(String resetPositionTime) {
        this.resetPositionTime = resetPositionTime;
        return this;
    }

    /**
     * 重置位点时间, 使用UTC时间 示例：2023-09-19 15:00:00，UTC时间是2023-09-19T07:00:00Z
     * @return resetPositionTime
     */
    public String getResetPositionTime() {
        return resetPositionTime;
    }

    public void setResetPositionTime(String resetPositionTime) {
        this.resetPositionTime = resetPositionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDbPositionReq that = (QueryDbPositionReq) obj;
        return Objects.equals(this.resetPositionTime, that.resetPositionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resetPositionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDbPositionReq {\n");
        sb.append("    resetPositionTime: ").append(toIndentedString(resetPositionTime)).append("\n");
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
