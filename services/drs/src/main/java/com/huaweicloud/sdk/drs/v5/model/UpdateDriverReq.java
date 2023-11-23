package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDriverReq
 */
public class UpdateDriverReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_name")

    private String driverName;

    public UpdateDriverReq withDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    /**
     * jdbc驱动文件名称，name的长度5-64，结尾以.jar结尾。
     * @return driverName
     */
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDriverReq that = (UpdateDriverReq) obj;
        return Objects.equals(this.driverName, that.driverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDriverReq {\n");
        sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
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
