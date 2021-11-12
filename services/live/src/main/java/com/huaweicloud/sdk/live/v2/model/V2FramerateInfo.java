package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 实时帧率 */
public class V2FramerateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<Long> dataList = null;

    public V2FramerateInfo withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /** 推流域名。
     * 
     * @return publishDomain */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public V2FramerateInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用名称。
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public V2FramerateInfo withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /** 流名。
     * 
     * @return stream */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public V2FramerateInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 采样开始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public V2FramerateInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 采样结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public V2FramerateInfo withDataList(List<Long> dataList) {
        this.dataList = dataList;
        return this;
    }

    public V2FramerateInfo addDataListItem(Long dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public V2FramerateInfo withDataList(Consumer<List<Long>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /** 帧率信息列表，单位为fps。
     * 
     * @return dataList */
    public List<Long> getDataList() {
        return dataList;
    }

    public void setDataList(List<Long> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2FramerateInfo v2FramerateInfo = (V2FramerateInfo) o;
        return Objects.equals(this.publishDomain, v2FramerateInfo.publishDomain)
            && Objects.equals(this.app, v2FramerateInfo.app) && Objects.equals(this.stream, v2FramerateInfo.stream)
            && Objects.equals(this.startTime, v2FramerateInfo.startTime)
            && Objects.equals(this.endTime, v2FramerateInfo.endTime)
            && Objects.equals(this.dataList, v2FramerateInfo.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, startTime, endTime, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2FramerateInfo {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
