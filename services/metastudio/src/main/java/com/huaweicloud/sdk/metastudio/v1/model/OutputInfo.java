package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 输出信息。
 */
public class OutputInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_addr")

    private String faceAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_addr")

    private String bodyAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_addr")

    private String audioAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private Integer sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_data_version")

    private String outputDataVersion;

    public OutputInfo withFaceAddr(String faceAddr) {
        this.faceAddr = faceAddr;
        return this;
    }

    /**
     * 面部表情输入地址。
     * @return faceAddr
     */
    public String getFaceAddr() {
        return faceAddr;
    }

    public void setFaceAddr(String faceAddr) {
        this.faceAddr = faceAddr;
    }

    public OutputInfo withBodyAddr(String bodyAddr) {
        this.bodyAddr = bodyAddr;
        return this;
    }

    /**
     * 身体动作输入地址。
     * @return bodyAddr
     */
    public String getBodyAddr() {
        return bodyAddr;
    }

    public void setBodyAddr(String bodyAddr) {
        this.bodyAddr = bodyAddr;
    }

    public OutputInfo withAudioAddr(String audioAddr) {
        this.audioAddr = audioAddr;
        return this;
    }

    /**
     * 音频输入地址。
     * @return audioAddr
     */
    public String getAudioAddr() {
        return audioAddr;
    }

    public void setAudioAddr(String audioAddr) {
        this.audioAddr = audioAddr;
    }

    public OutputInfo withSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID。
     * minimum: 0
     * maximum: 4294967295
     * @return sessionId
     */
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public OutputInfo withOutputDataVersion(String outputDataVersion) {
        this.outputDataVersion = outputDataVersion;
        return this;
    }

    /**
     * 输出数据的格式版本，如请求中无此参数，则输出数据格式为1.0，可选值有： 1.0: 对应的输出为：         动作数据：75个骨骼旋转值         表情数据：52ARkit表情及参数 2.0: 对应的输出为：         动作数据：55个骨骼旋转值+骨骼3D坐标         表情数据：178个控制器的数据
     * @return outputDataVersion
     */
    public String getOutputDataVersion() {
        return outputDataVersion;
    }

    public void setOutputDataVersion(String outputDataVersion) {
        this.outputDataVersion = outputDataVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputInfo that = (OutputInfo) obj;
        return Objects.equals(this.faceAddr, that.faceAddr) && Objects.equals(this.bodyAddr, that.bodyAddr)
            && Objects.equals(this.audioAddr, that.audioAddr) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.outputDataVersion, that.outputDataVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceAddr, bodyAddr, audioAddr, sessionId, outputDataVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputInfo {\n");
        sb.append("    faceAddr: ").append(toIndentedString(faceAddr)).append("\n");
        sb.append("    bodyAddr: ").append(toIndentedString(bodyAddr)).append("\n");
        sb.append("    audioAddr: ").append(toIndentedString(audioAddr)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    outputDataVersion: ").append(toIndentedString(outputDataVersion)).append("\n");
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
