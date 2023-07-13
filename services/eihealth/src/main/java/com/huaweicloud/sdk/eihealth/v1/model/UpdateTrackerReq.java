package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新项目追踪器
 */
public class UpdateTrackerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_lifecycle")

    private String bucketLifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_event")

    private List<DataEvent> dataEvent = null;

    public UpdateTrackerReq withBucketLifecycle(String bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
        return this;
    }

    /**
     * 转储生命周期
     * @return bucketLifecycle
     */
    public String getBucketLifecycle() {
        return bucketLifecycle;
    }

    public void setBucketLifecycle(String bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
    }

    public UpdateTrackerReq withDataEvent(List<DataEvent> dataEvent) {
        this.dataEvent = dataEvent;
        return this;
    }

    public UpdateTrackerReq addDataEventItem(DataEvent dataEventItem) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        this.dataEvent.add(dataEventItem);
        return this;
    }

    public UpdateTrackerReq withDataEvent(Consumer<List<DataEvent>> dataEventSetter) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        dataEventSetter.accept(this.dataEvent);
        return this;
    }

    /**
     * 审计数据类型列表
     * @return dataEvent
     */
    public List<DataEvent> getDataEvent() {
        return dataEvent;
    }

    public void setDataEvent(List<DataEvent> dataEvent) {
        this.dataEvent = dataEvent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrackerReq that = (UpdateTrackerReq) obj;
        return Objects.equals(this.bucketLifecycle, that.bucketLifecycle)
            && Objects.equals(this.dataEvent, that.dataEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketLifecycle, dataEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrackerReq {\n");
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
