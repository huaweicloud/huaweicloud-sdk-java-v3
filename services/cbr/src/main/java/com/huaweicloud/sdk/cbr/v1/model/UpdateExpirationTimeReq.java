package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateExpirationTimeReq
 */
public class UpdateExpirationTimeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_expiration_date")

    private String expectExpirationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public UpdateExpirationTimeReq withExpectExpirationDate(String expectExpirationDate) {
        this.expectExpirationDate = expectExpirationDate;
        return this;
    }

    /**
     * 预期过期日期，格式：YYYY-MM-DD。
     * @return expectExpirationDate
     */
    public String getExpectExpirationDate() {
        return expectExpirationDate;
    }

    public void setExpectExpirationDate(String expectExpirationDate) {
        this.expectExpirationDate = expectExpirationDate;
    }

    public UpdateExpirationTimeReq withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 用户所在时区，格式形如 UTC+08:00
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateExpirationTimeReq that = (UpdateExpirationTimeReq) obj;
        return Objects.equals(this.expectExpirationDate, that.expectExpirationDate)
            && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectExpirationDate, timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExpirationTimeReq {\n");
        sb.append("    expectExpirationDate: ").append(toIndentedString(expectExpirationDate)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
