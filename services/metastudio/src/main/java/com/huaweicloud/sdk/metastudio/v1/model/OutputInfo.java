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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputInfo outputInfo = (OutputInfo) o;
        return Objects.equals(this.faceAddr, outputInfo.faceAddr) && Objects.equals(this.bodyAddr, outputInfo.bodyAddr)
            && Objects.equals(this.audioAddr, outputInfo.audioAddr)
            && Objects.equals(this.sessionId, outputInfo.sessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceAddr, bodyAddr, audioAddr, sessionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputInfo {\n");
        sb.append("    faceAddr: ").append(toIndentedString(faceAddr)).append("\n");
        sb.append("    bodyAddr: ").append(toIndentedString(bodyAddr)).append("\n");
        sb.append("    audioAddr: ").append(toIndentedString(audioAddr)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
