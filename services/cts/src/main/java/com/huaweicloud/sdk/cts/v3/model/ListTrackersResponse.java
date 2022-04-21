package com.huaweicloud.sdk.cts.v3.model;

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
public class ListTrackersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trackers")

    private List<TrackerResponseBody> trackers = null;

    public ListTrackersResponse withTrackers(List<TrackerResponseBody> trackers) {
        this.trackers = trackers;
        return this;
    }

    public ListTrackersResponse addTrackersItem(TrackerResponseBody trackersItem) {
        if (this.trackers == null) {
            this.trackers = new ArrayList<>();
        }
        this.trackers.add(trackersItem);
        return this;
    }

    public ListTrackersResponse withTrackers(Consumer<List<TrackerResponseBody>> trackersSetter) {
        if (this.trackers == null) {
            this.trackers = new ArrayList<>();
        }
        trackersSetter.accept(this.trackers);
        return this;
    }

    /**
     * 本次查询追踪器列表返回的追踪器数组。
     * @return trackers
     */
    public List<TrackerResponseBody> getTrackers() {
        return trackers;
    }

    public void setTrackers(List<TrackerResponseBody> trackers) {
        this.trackers = trackers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTrackersResponse listTrackersResponse = (ListTrackersResponse) o;
        return Objects.equals(this.trackers, listTrackersResponse.trackers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrackersResponse {\n");
        sb.append("    trackers: ").append(toIndentedString(trackers)).append("\n");
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
