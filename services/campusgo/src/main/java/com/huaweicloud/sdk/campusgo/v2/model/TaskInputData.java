package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.net.URI;
import java.util.Objects;
import java.util.UUID;

/**
 * 输入数据的配置信息
 */
public class TaskInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    @JacksonXmlProperty(localName = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private URI url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    @JacksonXmlProperty(localName = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_check")

    @JacksonXmlProperty(localName = "certificate_check")

    private Boolean certificateCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtsp_path_in_response")

    @JacksonXmlProperty(localName = "rtsp_path_in_response")

    private String rtspPathInResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    @JacksonXmlProperty(localName = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_type")

    @JacksonXmlProperty(localName = "stream_type")

    private Integer streamType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private Integer index;

    public TaskInputData withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * VIS的视频流名称，当输入为vis类型时必选
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public TaskInputData withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名，当输入为obs类型是必选
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TaskInputData withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * OBS的路径，当输入为obs类型时必选
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TaskInputData withUrl(URI url) {
        this.url = url;
        return this;
    }

    /**
     * url输入源的地址或者获取视频流地址的restful请求地址，当输入为url或者edgerestful类型时必选
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public TaskInputData withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 获取视频流的restful请求携带的请求头，当输入为edgerestful类型时可选
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public TaskInputData withCertificateCheck(Boolean certificateCheck) {
        this.certificateCheck = certificateCheck;
        return this;
    }

    /**
     * 是否需要对https请求进行证书校验，当输入为edgerestful类型时必选
     * @return certificateCheck
     */
    public Boolean getCertificateCheck() {
        return certificateCheck;
    }

    public void setCertificateCheck(Boolean certificateCheck) {
        this.certificateCheck = certificateCheck;
    }

    public TaskInputData withRtspPathInResponse(String rtspPathInResponse) {
        this.rtspPathInResponse = rtspPathInResponse;
        return this;
    }

    /**
     * restful请求返回的body中，视频流地址的路径，当输入为edgerestful类型时必选
     * @return rtspPathInResponse
     */
    public String getRtspPathInResponse() {
        return rtspPathInResponse;
    }

    public void setRtspPathInResponse(String rtspPathInResponse) {
        this.rtspPathInResponse = rtspPathInResponse;
    }

    public TaskInputData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * VCN设备ID，当输入为vcn类型时必选
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public TaskInputData withStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }

    /**
     * 准备进行分析的码流，其中1代表主码流，2代表子码流1,3代表子码流2，当输入为vcn类型时可选
     * minimum: 1
     * maximum: 3
     * @return streamType
     */
    public Integer getStreamType() {
        return streamType;
    }

    public void setStreamType(Integer streamType) {
        this.streamType = streamType;
    }

    public TaskInputData withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * IEF挂载的边缘设备的ID，当输入为edgecamera类型时必选
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TaskInputData withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 可选，当前输入的序号，从0开始递增，不可重复
     * minimum: 0
     * maximum: 49
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInputData taskInputData = (TaskInputData) o;
        return Objects.equals(this.streamName, taskInputData.streamName)
            && Objects.equals(this.bucket, taskInputData.bucket) && Objects.equals(this.path, taskInputData.path)
            && Objects.equals(this.url, taskInputData.url) && Objects.equals(this.headers, taskInputData.headers)
            && Objects.equals(this.certificateCheck, taskInputData.certificateCheck)
            && Objects.equals(this.rtspPathInResponse, taskInputData.rtspPathInResponse)
            && Objects.equals(this.deviceId, taskInputData.deviceId)
            && Objects.equals(this.streamType, taskInputData.streamType) && Objects.equals(this.id, taskInputData.id)
            && Objects.equals(this.index, taskInputData.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName,
            bucket,
            path,
            url,
            headers,
            certificateCheck,
            rtspPathInResponse,
            deviceId,
            streamType,
            id,
            index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInputData {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    certificateCheck: ").append(toIndentedString(certificateCheck)).append("\n");
        sb.append("    rtspPathInResponse: ").append(toIndentedString(rtspPathInResponse)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
