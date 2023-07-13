package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面使用时间。
 */
public class DesktopUsedInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_time")

    private String useTime;

    public DesktopUsedInfo withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期，格式：yyyy-MM-dd（UTC时间）。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DesktopUsedInfo withUseTime(String useTime) {
        this.useTime = useTime;
        return this;
    }

    /**
     * 总共在线时间单位:小时数（h）,精确到两位小数，如：1.32。
     * @return useTime
     */
    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopUsedInfo that = (DesktopUsedInfo) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.useTime, that.useTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, useTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopUsedInfo {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    useTime: ").append(toIndentedString(useTime)).append("\n");
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
