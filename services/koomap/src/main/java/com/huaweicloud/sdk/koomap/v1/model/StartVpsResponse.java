package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartVpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utmcode")

    private String utmcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isCalibrationSucc")

    private Boolean isCalibrationSucc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cacheData")

    private String cacheData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pose")

    private VPSServiceRespPose pose;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestId")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "couplingTime")

    private Integer couplingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpsMode")

    private Integer vpsMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processMode")

    private String processMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpsFloor")

    private Integer vpsFloor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "VpsCode")

    private Integer vpsCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Integer retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public StartVpsResponse withUtmcode(String utmcode) {
        this.utmcode = utmcode;
        return this;
    }

    /**
     * 地区UTM编码。
     * @return utmcode
     */
    public String getUtmcode() {
        return utmcode;
    }

    public void setUtmcode(String utmcode) {
        this.utmcode = utmcode;
    }

    public StartVpsResponse withIsCalibrationSucc(Boolean isCalibrationSucc) {
        this.isCalibrationSucc = isCalibrationSucc;
        return this;
    }

    /**
     * 是否启用在线云标定。 -  false：否 -  true：是
     * @return isCalibrationSucc
     */
    public Boolean getIsCalibrationSucc() {
        return isCalibrationSucc;
    }

    public void setIsCalibrationSucc(Boolean isCalibrationSucc) {
        this.isCalibrationSucc = isCalibrationSucc;
    }

    public StartVpsResponse withCacheData(String cacheData) {
        this.cacheData = cacheData;
        return this;
    }

    /**
     * 缓存数据。
     * @return cacheData
     */
    public String getCacheData() {
        return cacheData;
    }

    public void setCacheData(String cacheData) {
        this.cacheData = cacheData;
    }

    public StartVpsResponse withPose(VPSServiceRespPose pose) {
        this.pose = pose;
        return this;
    }

    public StartVpsResponse withPose(Consumer<VPSServiceRespPose> poseSetter) {
        if (this.pose == null) {
            this.pose = new VPSServiceRespPose();
            poseSetter.accept(this.pose);
        }

        return this;
    }

    /**
     * Get pose
     * @return pose
     */
    public VPSServiceRespPose getPose() {
        return pose;
    }

    public void setPose(VPSServiceRespPose pose) {
        this.pose = pose;
    }

    public StartVpsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public StartVpsResponse withCouplingTime(Integer couplingTime) {
        this.couplingTime = couplingTime;
        return this;
    }

    /**
     * 根据云端负载建议端侧重定位时间（单位ms），int类型默认值15000。
     * @return couplingTime
     */
    public Integer getCouplingTime() {
        return couplingTime;
    }

    public void setCouplingTime(Integer couplingTime) {
        this.couplingTime = couplingTime;
    }

    public StartVpsResponse withVpsMode(Integer vpsMode) {
        this.vpsMode = vpsMode;
        return this;
    }

    /**
     * 建议预检测模式。 - 0：gvps - 1：lod
     * @return vpsMode
     */
    public Integer getVpsMode() {
        return vpsMode;
    }

    public void setVpsMode(Integer vpsMode) {
        this.vpsMode = vpsMode;
    }

    public StartVpsResponse withProcessMode(String processMode) {
        this.processMode = processMode;
        return this;
    }

    /**
     * 云端处理模式。 - gvps：高精视觉定位 - lodvps：模型视觉定位
     * @return processMode
     */
    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public StartVpsResponse withVpsFloor(Integer vpsFloor) {
        this.vpsFloor = vpsFloor;
        return this;
    }

    /**
     * 楼层信息。
     * @return vpsFloor
     */
    public Integer getVpsFloor() {
        return vpsFloor;
    }

    public void setVpsFloor(Integer vpsFloor) {
        this.vpsFloor = vpsFloor;
    }

    public StartVpsResponse withVpsCode(Integer vpsCode) {
        this.vpsCode = vpsCode;
        return this;
    }

    /**
     * 状态码。
     * @return vpsCode
     */
    public Integer getVpsCode() {
        return vpsCode;
    }

    public void setVpsCode(Integer vpsCode) {
        this.vpsCode = vpsCode;
    }

    public StartVpsResponse withRetry(Integer retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 限制端侧手动单击的时间间隔（单位ms），默认值3000。
     * @return retry
     */
    public Integer getRetry() {
        return retry;
    }

    public void setRetry(Integer retry) {
        this.retry = retry;
    }

    public StartVpsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 请求结果是否成功。 - succeeded：成功 - failed：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StartVpsResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartVpsResponse that = (StartVpsResponse) obj;
        return Objects.equals(this.utmcode, that.utmcode)
            && Objects.equals(this.isCalibrationSucc, that.isCalibrationSucc)
            && Objects.equals(this.cacheData, that.cacheData) && Objects.equals(this.pose, that.pose)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.couplingTime, that.couplingTime)
            && Objects.equals(this.vpsMode, that.vpsMode) && Objects.equals(this.processMode, that.processMode)
            && Objects.equals(this.vpsFloor, that.vpsFloor) && Objects.equals(this.vpsCode, that.vpsCode)
            && Objects.equals(this.retry, that.retry) && Objects.equals(this.status, that.status)
            && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utmcode,
            isCalibrationSucc,
            cacheData,
            pose,
            requestId,
            couplingTime,
            vpsMode,
            processMode,
            vpsFloor,
            vpsCode,
            retry,
            status,
            xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartVpsResponse {\n");
        sb.append("    utmcode: ").append(toIndentedString(utmcode)).append("\n");
        sb.append("    isCalibrationSucc: ").append(toIndentedString(isCalibrationSucc)).append("\n");
        sb.append("    cacheData: ").append(toIndentedString(cacheData)).append("\n");
        sb.append("    pose: ").append(toIndentedString(pose)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    couplingTime: ").append(toIndentedString(couplingTime)).append("\n");
        sb.append("    vpsMode: ").append(toIndentedString(vpsMode)).append("\n");
        sb.append("    processMode: ").append(toIndentedString(processMode)).append("\n");
        sb.append("    vpsFloor: ").append(toIndentedString(vpsFloor)).append("\n");
        sb.append("    vpsCode: ").append(toIndentedString(vpsCode)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
