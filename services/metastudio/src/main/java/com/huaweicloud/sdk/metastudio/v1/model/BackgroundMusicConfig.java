package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 背景音乐配置。
 */
public class BackgroundMusicConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_asset_id")

    private String musicAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Integer volume;

    public BackgroundMusicConfig withMusicAssetId(String musicAssetId) {
        this.musicAssetId = musicAssetId;
        return this;
    }

    /**
     * **参数解释**： 音乐资产ID。 **约束限制**： 不涉及。 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及。
     * @return musicAssetId
     */
    public String getMusicAssetId() {
        return musicAssetId;
    }

    public void setMusicAssetId(String musicAssetId) {
        this.musicAssetId = musicAssetId;
    }

    public BackgroundMusicConfig withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * **参数解释**： 音乐音量。如100，表示音量100%，50表示音量50%。 **约束限制**： 不涉及。
     * minimum: 0
     * maximum: 100
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackgroundMusicConfig that = (BackgroundMusicConfig) obj;
        return Objects.equals(this.musicAssetId, that.musicAssetId) && Objects.equals(this.volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicAssetId, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundMusicConfig {\n");
        sb.append("    musicAssetId: ").append(toIndentedString(musicAssetId)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
