package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 视频数据输入列表
 */
public class InputData {

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

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    @JacksonXmlProperty(localName = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    @JacksonXmlProperty(localName = "node_id")

    private String nodeId;

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

    public InputData withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * type为obs时输入参数  OBS桶名称。 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public InputData withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * type为obs时输入参数  OBS桶内的路径，例如“output/c1.mp4”。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public InputData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * type为url或edgerestful时输入参数  type为url时表示视频数据的URL，目前支持OBS URL，且需要设置该URL对匿名用户可读权限。 type为edgerestful时表示容器获取EDGERESTFUL流的rest请求。格式：http(s):ip:port/xxx。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public InputData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * type为edgecamera时输入参数  边缘摄像头id。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InputData withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * type为vis时输入参数  视频接入服务中的视频流名称。 
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public InputData withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * type为edgerestful或vcn时输入参数  用于运行的边缘节点id, 下发边缘多任务作业时该字段不填写。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public InputData withCertificateCheck(Boolean certificateCheck) {
        this.certificateCheck = certificateCheck;
        return this;
    }

    /**
     * type为edgerestful时输入参数  true：算法侧需要对https请求进行证书校验。 false：算法侧无需证书校验。 默认值：false。 平台侧仅对齐进行输入校验，不涉及业务逻辑。 
     * @return certificateCheck
     */
    public Boolean getCertificateCheck() {
        return certificateCheck;
    }

    public void setCertificateCheck(Boolean certificateCheck) {
        this.certificateCheck = certificateCheck;
    }

    public InputData withRtspPathInResponse(String rtspPathInResponse) {
        this.rtspPathInResponse = rtspPathInResponse;
        return this;
    }

    /**
     * type为edgerestful时输入参数  返回body体中edgerestful流地址的路径，不能以/开头。例如：data/url。 
     * @return rtspPathInResponse
     */
    public String getRtspPathInResponse() {
        return rtspPathInResponse;
    }

    public void setRtspPathInResponse(String rtspPathInResponse) {
        this.rtspPathInResponse = rtspPathInResponse;
    }

    public InputData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * type为vcn时输入参数  设备id号，符合正则表达式：^([0-9]{20}[#]{1}[a-zA-Z0-9]{32})|([0-9]{20}[#]{1}[0-9]{1,10}[#]{1}[a-zA-Z0-9]{32})$。 
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputData inputData = (InputData) o;
        return Objects.equals(this.bucket, inputData.bucket) && Objects.equals(this.path, inputData.path)
            && Objects.equals(this.url, inputData.url) && Objects.equals(this.id, inputData.id)
            && Objects.equals(this.streamName, inputData.streamName) && Objects.equals(this.nodeId, inputData.nodeId)
            && Objects.equals(this.certificateCheck, inputData.certificateCheck)
            && Objects.equals(this.rtspPathInResponse, inputData.rtspPathInResponse)
            && Objects.equals(this.deviceId, inputData.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, path, url, id, streamName, nodeId, certificateCheck, rtspPathInResponse, deviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputData {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    certificateCheck: ").append(toIndentedString(certificateCheck)).append("\n");
        sb.append("    rtspPathInResponse: ").append(toIndentedString(rtspPathInResponse)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
