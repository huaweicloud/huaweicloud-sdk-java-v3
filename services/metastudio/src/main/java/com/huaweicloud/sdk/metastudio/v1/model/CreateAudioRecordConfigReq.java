package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建语音录制配置请求。
 */
public class CreateAudioRecordConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_endpoint")

    private String obsEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_audio_record")

    private Boolean enableAudioRecord;

    public CreateAudioRecordConfigReq withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释**： 接收语音录制的obs桶名。 **约束限制**： 不涉及 **取值范围**： 字符长度1-64 **默认取值**： 不涉及
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public CreateAudioRecordConfigReq withObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
        return this;
    }

    /**
     * **参数解释**： 接收语音录制的obs终端节点。 **约束限制**： 需要为obs合法终端节点。 **取值范围**： 字符长度1-64 **默认取值**： 不涉及
     * @return obsEndpoint
     */
    public String getObsEndpoint() {
        return obsEndpoint;
    }

    public void setObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
    }

    public CreateAudioRecordConfigReq withEnableAudioRecord(Boolean enableAudioRecord) {
        this.enableAudioRecord = enableAudioRecord;
        return this;
    }

    /**
     * 语音录制开关
     * @return enableAudioRecord
     */
    public Boolean getEnableAudioRecord() {
        return enableAudioRecord;
    }

    public void setEnableAudioRecord(Boolean enableAudioRecord) {
        this.enableAudioRecord = enableAudioRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAudioRecordConfigReq that = (CreateAudioRecordConfigReq) obj;
        return Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.obsEndpoint, that.obsEndpoint)
            && Objects.equals(this.enableAudioRecord, that.enableAudioRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsBucketName, obsEndpoint, enableAudioRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAudioRecordConfigReq {\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsEndpoint: ").append(toIndentedString(obsEndpoint)).append("\n");
        sb.append("    enableAudioRecord: ").append(toIndentedString(enableAudioRecord)).append("\n");
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
