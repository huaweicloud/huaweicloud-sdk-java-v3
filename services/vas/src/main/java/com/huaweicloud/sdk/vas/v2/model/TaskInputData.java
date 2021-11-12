package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;
import java.util.Objects;
import java.util.UUID;

/** 输入数据的配置信息 */
public class TaskInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private URI url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_check")

    private Boolean certificateCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtsp_path_in_response")

    private String rtspPathInResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private UUID nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_type")

    private Integer streamType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public TaskInputData withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /** VIS的视频流名称，当输入为vis类型时必填。
     * 
     * @return streamName */
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

    /** OBS桶名，当输入为obs类型时必填。
     * 
     * @return bucket */
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

    /** OBS的路径，当输入为obs类型时必填。
     * 
     * @return path */
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

    /** url输入源的地址或者获取视频流地址的restful请求地址，当输入为url类型或者edgerestful类型时必填。长度不超过1000。
     * 
     * @return url */
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

    /** 获取视频流地址的restful请求携带的请求头，当输入为edgerestful类型时可选。整体呈json格式，以键值对的形式表示请求头和取值，最多允许10组。
     * 
     * @return headers */
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

    /** 是否需要对https请求进行证书校验，当输入为edgerestful类型时必填。取值为true或者false。
     * 
     * @return certificateCheck */
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

    /** restful请求返回的body中，视频流地址的路径，当输入为edgerestful类型时必填。长度不超过1024。
     * 
     * @return rtspPathInResponse */
    public String getRtspPathInResponse() {
        return rtspPathInResponse;
    }

    public void setRtspPathInResponse(String rtspPathInResponse) {
        this.rtspPathInResponse = rtspPathInResponse;
    }

    public TaskInputData withNodeId(UUID nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** IEF节点的ID，仅部分服务在输入类型为edgerestful或vcn时需填且必填。
     * 
     * @return nodeId */
    public UUID getNodeId() {
        return nodeId;
    }

    public void setNodeId(UUID nodeId) {
        this.nodeId = nodeId;
    }

    public TaskInputData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** VCN设备ID，当输入为vcn类型时必填。
     * 
     * @return deviceId */
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

    /** 准备进行分析的码流，当输入为vcn类型时选填。取值范围为1~3，其中1代表主码流，2代表子码流1,3代表子码流2。 minimum: 1 maximum: 3
     * 
     * @return streamType */
    public Integer getStreamType() {
        return streamType;
    }

    public void setStreamType(Integer streamType) {
        this.streamType = streamType;
    }

    public TaskInputData withId(String id) {
        this.id = id;
        return this;
    }

    /** IEF挂载的边缘设备的ID，当输入为edgecamera类型时必填。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
            && Objects.equals(this.nodeId, taskInputData.nodeId)
            && Objects.equals(this.deviceId, taskInputData.deviceId)
            && Objects.equals(this.streamType, taskInputData.streamType) && Objects.equals(this.id, taskInputData.id);
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
            nodeId,
            deviceId,
            streamType,
            id);
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
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
