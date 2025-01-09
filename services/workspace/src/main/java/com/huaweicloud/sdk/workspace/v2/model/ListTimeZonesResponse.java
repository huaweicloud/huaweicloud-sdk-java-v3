package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTimeZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zones")

    private List<Timezones> timeZones = null;

    public ListTimeZonesResponse withTimeZones(List<Timezones> timeZones) {
        this.timeZones = timeZones;
        return this;
    }

    public ListTimeZonesResponse addTimeZonesItem(Timezones timeZonesItem) {
        if (this.timeZones == null) {
            this.timeZones = new ArrayList<>();
        }
        this.timeZones.add(timeZonesItem);
        return this;
    }

    public ListTimeZonesResponse withTimeZones(Consumer<List<Timezones>> timeZonesSetter) {
        if (this.timeZones == null) {
            this.timeZones = new ArrayList<>();
        }
        timeZonesSetter.accept(this.timeZones);
        return this;
    }

    /**
     * 时区列表。
     * @return timeZones
     */
    public List<Timezones> getTimeZones() {
        return timeZones;
    }

    public void setTimeZones(List<Timezones> timeZones) {
        this.timeZones = timeZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTimeZonesResponse that = (ListTimeZonesResponse) obj;
        return Objects.equals(this.timeZones, that.timeZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTimeZonesResponse {\n");
        sb.append("    timeZones: ").append(toIndentedString(timeZones)).append("\n");
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
