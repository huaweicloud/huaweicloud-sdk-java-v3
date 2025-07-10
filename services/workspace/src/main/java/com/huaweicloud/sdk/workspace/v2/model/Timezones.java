package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 返回时区配置信息。
 */
public class Timezones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_desc")

    private String timeZoneDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_name")

    private String timeZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_desc_us")

    private String timeZoneDescUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_desc_cn")

    private String timeZoneDescCn;

    public Timezones withTimeZoneDesc(String timeZoneDesc) {
        this.timeZoneDesc = timeZoneDesc;
        return this;
    }

    /**
     * 时区描述。
     * @return timeZoneDesc
     */
    public String getTimeZoneDesc() {
        return timeZoneDesc;
    }

    public void setTimeZoneDesc(String timeZoneDesc) {
        this.timeZoneDesc = timeZoneDesc;
    }

    public Timezones withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区偏移量。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Timezones withTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
        return this;
    }

    /**
     * 时区地名。
     * @return timeZoneName
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public Timezones withTimeZoneDescUs(String timeZoneDescUs) {
        this.timeZoneDescUs = timeZoneDescUs;
        return this;
    }

    /**
     * 时区英文描述。
     * @return timeZoneDescUs
     */
    public String getTimeZoneDescUs() {
        return timeZoneDescUs;
    }

    public void setTimeZoneDescUs(String timeZoneDescUs) {
        this.timeZoneDescUs = timeZoneDescUs;
    }

    public Timezones withTimeZoneDescCn(String timeZoneDescCn) {
        this.timeZoneDescCn = timeZoneDescCn;
        return this;
    }

    /**
     * 时区中文描述。
     * @return timeZoneDescCn
     */
    public String getTimeZoneDescCn() {
        return timeZoneDescCn;
    }

    public void setTimeZoneDescCn(String timeZoneDescCn) {
        this.timeZoneDescCn = timeZoneDescCn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Timezones that = (Timezones) obj;
        return Objects.equals(this.timeZoneDesc, that.timeZoneDesc) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.timeZoneName, that.timeZoneName)
            && Objects.equals(this.timeZoneDescUs, that.timeZoneDescUs)
            && Objects.equals(this.timeZoneDescCn, that.timeZoneDescCn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneDesc, timeZone, timeZoneName, timeZoneDescUs, timeZoneDescCn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Timezones {\n");
        sb.append("    timeZoneDesc: ").append(toIndentedString(timeZoneDesc)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
        sb.append("    timeZoneDescUs: ").append(toIndentedString(timeZoneDescUs)).append("\n");
        sb.append("    timeZoneDescCn: ").append(toIndentedString(timeZoneDescCn)).append("\n");
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
