package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateExtractAudioTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_asset_id")

    private String audioAssetId;

    public CreateExtractAudioTaskResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /** 视频源媒资ID。
     * 
     * @return assetId */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public CreateExtractAudioTaskResponse withAudioAssetId(String audioAssetId) {
        this.audioAssetId = audioAssetId;
        return this;
    }

    /** 提取的音频媒资ID。
     * 
     * @return audioAssetId */
    public String getAudioAssetId() {
        return audioAssetId;
    }

    public void setAudioAssetId(String audioAssetId) {
        this.audioAssetId = audioAssetId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExtractAudioTaskResponse createExtractAudioTaskResponse = (CreateExtractAudioTaskResponse) o;
        return Objects.equals(this.assetId, createExtractAudioTaskResponse.assetId)
            && Objects.equals(this.audioAssetId, createExtractAudioTaskResponse.audioAssetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, audioAssetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExtractAudioTaskResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    audioAssetId: ").append(toIndentedString(audioAssetId)).append("\n");
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
