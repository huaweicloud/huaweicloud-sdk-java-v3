package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSubtitleFileReq
 */
public class CreateSubtitleFileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private CallBackConfig callbackConfig;

    public CreateSubtitleFileReq withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 剧本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public CreateSubtitleFileReq withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * 剧本序号。  > * 剧本序号不填生成所有场景的字幕；如果需要生成单场景的字幕，需要填剧本序号。
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public CreateSubtitleFileReq withCallbackConfig(CallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public CreateSubtitleFileReq withCallbackConfig(Consumer<CallBackConfig> callbackConfigSetter) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new CallBackConfig();
            callbackConfigSetter.accept(this.callbackConfig);
        }

        return this;
    }

    /**
     * Get callbackConfig
     * @return callbackConfig
     */
    public CallBackConfig getCallbackConfig() {
        return callbackConfig;
    }

    public void setCallbackConfig(CallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubtitleFileReq that = (CreateSubtitleFileReq) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.sequenceNo, that.sequenceNo)
            && Objects.equals(this.callbackConfig, that.callbackConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId, sequenceNo, callbackConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubtitleFileReq {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
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
