package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * RecordIndexRequestBody
 */
public class RecordIndexRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    @JacksonXmlProperty(localName = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    @JacksonXmlProperty(localName = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    @JacksonXmlProperty(localName = "object")

    private String _object;

    public RecordIndexRequestBody withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public RecordIndexRequestBody withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * app名
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public RecordIndexRequestBody withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public RecordIndexRequestBody withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。格式为：YYYY-MM-DDTHH:mm:ssZ（UTC时间），开始时间与结束时间的间隔最大为12小时。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public RecordIndexRequestBody withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式为：YYYY-MM-DDTHH:mm:ssZ（UTC时间），开始时间与结束时间的间隔最大为12小时。结束时间不允许大于当前时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public RecordIndexRequestBody withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * \"m3u8文件在OBS中的储存路径。支持下列字符串的转义   - {publish_domain}   - {app}   - {stream}   - {start_time}   - {end_time} 其中{start_time},{end_time}为返回结果的实际时间。 默认值为Index/{publish_domain}/{app}/{stream}/{stream}-{start_time}-{end_time}\"
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordIndexRequestBody recordIndexRequestBody = (RecordIndexRequestBody) o;
        return Objects.equals(this.publishDomain, recordIndexRequestBody.publishDomain)
            && Objects.equals(this.app, recordIndexRequestBody.app)
            && Objects.equals(this.stream, recordIndexRequestBody.stream)
            && Objects.equals(this.startTime, recordIndexRequestBody.startTime)
            && Objects.equals(this.endTime, recordIndexRequestBody.endTime)
            && Objects.equals(this._object, recordIndexRequestBody._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, startTime, endTime, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordIndexRequestBody {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
