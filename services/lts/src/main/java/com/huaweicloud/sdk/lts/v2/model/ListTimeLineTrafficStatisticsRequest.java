package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTimeLineTrafficStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TimelineTrafficStatisticsRequestBody body;

    public ListTimeLineTrafficStatisticsRequest withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ListTimeLineTrafficStatisticsRequest withBody(TimelineTrafficStatisticsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListTimeLineTrafficStatisticsRequest withBody(Consumer<TimelineTrafficStatisticsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new TimelineTrafficStatisticsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TimelineTrafficStatisticsRequestBody getBody() {
        return body;
    }

    public void setBody(TimelineTrafficStatisticsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTimeLineTrafficStatisticsRequest that = (ListTimeLineTrafficStatisticsRequest) obj;
        return Objects.equals(this.timezone, that.timezone) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timezone, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTimeLineTrafficStatisticsRequest {\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
