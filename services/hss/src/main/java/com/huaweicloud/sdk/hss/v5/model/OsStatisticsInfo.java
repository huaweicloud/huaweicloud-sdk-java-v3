package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作系统统计数据
 */
public class OsStatisticsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    public OsStatisticsInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * os_name
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public OsStatisticsInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * os_type
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public OsStatisticsInfo withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * os_number
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OsStatisticsInfo that = (OsStatisticsInfo) obj;
        return Objects.equals(this.osName, that.osName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osName, osType, number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsStatisticsInfo {\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
