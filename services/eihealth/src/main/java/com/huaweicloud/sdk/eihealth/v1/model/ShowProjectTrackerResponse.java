package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowProjectTrackerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_lifecycle")

    private Integer bucketLifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_event")

    private List<String> dataEvent = null;

    public ShowProjectTrackerResponse withBucketLifecycle(Integer bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
        return this;
    }

    /**
     * 追踪器配置转储生命周期
     * @return bucketLifecycle
     */
    public Integer getBucketLifecycle() {
        return bucketLifecycle;
    }

    public void setBucketLifecycle(Integer bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
    }

    public ShowProjectTrackerResponse withDataEvent(List<String> dataEvent) {
        this.dataEvent = dataEvent;
        return this;
    }

    public ShowProjectTrackerResponse addDataEventItem(String dataEventItem) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        this.dataEvent.add(dataEventItem);
        return this;
    }

    public ShowProjectTrackerResponse withDataEvent(Consumer<List<String>> dataEventSetter) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        dataEventSetter.accept(this.dataEvent);
        return this;
    }

    /**
     * 追踪器配置监听事件
     * @return dataEvent
     */
    public List<String> getDataEvent() {
        return dataEvent;
    }

    public void setDataEvent(List<String> dataEvent) {
        this.dataEvent = dataEvent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectTrackerResponse showProjectTrackerResponse = (ShowProjectTrackerResponse) o;
        return Objects.equals(this.bucketLifecycle, showProjectTrackerResponse.bucketLifecycle)
            && Objects.equals(this.dataEvent, showProjectTrackerResponse.dataEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketLifecycle, dataEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectTrackerResponse {\n");
        sb.append("    bucketLifecycle: ").append(toIndentedString(bucketLifecycle)).append("\n");
        sb.append("    dataEvent: ").append(toIndentedString(dataEvent)).append("\n");
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
