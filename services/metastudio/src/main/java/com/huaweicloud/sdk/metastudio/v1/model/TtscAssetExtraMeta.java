package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产元数据。根据资产类型选择其中一个填写。
 */
public class TtscAssetExtraMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_model_meta")

    private TtscVoiceModelAssetMeta voiceModelMeta;

    public TtscAssetExtraMeta withVoiceModelMeta(TtscVoiceModelAssetMeta voiceModelMeta) {
        this.voiceModelMeta = voiceModelMeta;
        return this;
    }

    public TtscAssetExtraMeta withVoiceModelMeta(Consumer<TtscVoiceModelAssetMeta> voiceModelMetaSetter) {
        if (this.voiceModelMeta == null) {
            this.voiceModelMeta = new TtscVoiceModelAssetMeta();
            voiceModelMetaSetter.accept(this.voiceModelMeta);
        }

        return this;
    }

    /**
     * Get voiceModelMeta
     * @return voiceModelMeta
     */
    public TtscVoiceModelAssetMeta getVoiceModelMeta() {
        return voiceModelMeta;
    }

    public void setVoiceModelMeta(TtscVoiceModelAssetMeta voiceModelMeta) {
        this.voiceModelMeta = voiceModelMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtscAssetExtraMeta that = (TtscAssetExtraMeta) obj;
        return Objects.equals(this.voiceModelMeta, that.voiceModelMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceModelMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtscAssetExtraMeta {\n");
        sb.append("    voiceModelMeta: ").append(toIndentedString(voiceModelMeta)).append("\n");
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
