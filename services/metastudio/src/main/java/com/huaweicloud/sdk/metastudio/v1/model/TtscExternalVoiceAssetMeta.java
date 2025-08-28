package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 第三方TTS音色元数据。
 */
public class TtscExternalVoiceAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobvoi_voice_meta")

    private TtscMobvoiVoiceAssetMeta mobvoiVoiceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audiox_voice_meta")

    private TtscAudioxVoiceAssetMeta audioxVoiceMeta;

    public TtscExternalVoiceAssetMeta withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 第三方TTS供应商类型。 * XIMALAYA：喜马拉雅TTS * HUAWEI_EI：EI TTS * MOBVOI：出门问问TTS
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public TtscExternalVoiceAssetMeta withMobvoiVoiceMeta(TtscMobvoiVoiceAssetMeta mobvoiVoiceMeta) {
        this.mobvoiVoiceMeta = mobvoiVoiceMeta;
        return this;
    }

    public TtscExternalVoiceAssetMeta withMobvoiVoiceMeta(Consumer<TtscMobvoiVoiceAssetMeta> mobvoiVoiceMetaSetter) {
        if (this.mobvoiVoiceMeta == null) {
            this.mobvoiVoiceMeta = new TtscMobvoiVoiceAssetMeta();
            mobvoiVoiceMetaSetter.accept(this.mobvoiVoiceMeta);
        }

        return this;
    }

    /**
     * Get mobvoiVoiceMeta
     * @return mobvoiVoiceMeta
     */
    public TtscMobvoiVoiceAssetMeta getMobvoiVoiceMeta() {
        return mobvoiVoiceMeta;
    }

    public void setMobvoiVoiceMeta(TtscMobvoiVoiceAssetMeta mobvoiVoiceMeta) {
        this.mobvoiVoiceMeta = mobvoiVoiceMeta;
    }

    public TtscExternalVoiceAssetMeta withAudioxVoiceMeta(TtscAudioxVoiceAssetMeta audioxVoiceMeta) {
        this.audioxVoiceMeta = audioxVoiceMeta;
        return this;
    }

    public TtscExternalVoiceAssetMeta withAudioxVoiceMeta(Consumer<TtscAudioxVoiceAssetMeta> audioxVoiceMetaSetter) {
        if (this.audioxVoiceMeta == null) {
            this.audioxVoiceMeta = new TtscAudioxVoiceAssetMeta();
            audioxVoiceMetaSetter.accept(this.audioxVoiceMeta);
        }

        return this;
    }

    /**
     * Get audioxVoiceMeta
     * @return audioxVoiceMeta
     */
    public TtscAudioxVoiceAssetMeta getAudioxVoiceMeta() {
        return audioxVoiceMeta;
    }

    public void setAudioxVoiceMeta(TtscAudioxVoiceAssetMeta audioxVoiceMeta) {
        this.audioxVoiceMeta = audioxVoiceMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtscExternalVoiceAssetMeta that = (TtscExternalVoiceAssetMeta) obj;
        return Objects.equals(this.provider, that.provider)
            && Objects.equals(this.mobvoiVoiceMeta, that.mobvoiVoiceMeta)
            && Objects.equals(this.audioxVoiceMeta, that.audioxVoiceMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, mobvoiVoiceMeta, audioxVoiceMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtscExternalVoiceAssetMeta {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    mobvoiVoiceMeta: ").append(toIndentedString(mobvoiVoiceMeta)).append("\n");
        sb.append("    audioxVoiceMeta: ").append(toIndentedString(audioxVoiceMeta)).append("\n");
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
