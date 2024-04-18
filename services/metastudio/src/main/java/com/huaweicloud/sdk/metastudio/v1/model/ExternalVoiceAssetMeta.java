package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 第三方TTS音色元数据。
 */
public class ExternalVoiceAssetMeta {

    /**
     * 第三方TTS供应商类型。 * XIMALAYA：喜马拉雅TTS * HUAWEI_EI：EI TTS * MOBVOI：出门问问TTS
     */
    public static final class ProviderEnum {

        /**
         * Enum XIMALAYA for value: "XIMALAYA"
         */
        public static final ProviderEnum XIMALAYA = new ProviderEnum("XIMALAYA");

        /**
         * Enum HUAWEI_EI for value: "HUAWEI_EI"
         */
        public static final ProviderEnum HUAWEI_EI = new ProviderEnum("HUAWEI_EI");

        /**
         * Enum MOBVOI for value: "MOBVOI"
         */
        public static final ProviderEnum MOBVOI = new ProviderEnum("MOBVOI");

        private static final Map<String, ProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderEnum> createStaticFields() {
            Map<String, ProviderEnum> map = new HashMap<>();
            map.put("XIMALAYA", XIMALAYA);
            map.put("HUAWEI_EI", HUAWEI_EI);
            map.put("MOBVOI", MOBVOI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderEnum(value));
        }

        public static ProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderEnum) {
                return this.value.equals(((ProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private ProviderEnum provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobvoi_voice_meta")

    private MobvoiVoiceAssetMeta mobvoiVoiceMeta;

    public ExternalVoiceAssetMeta withProvider(ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 第三方TTS供应商类型。 * XIMALAYA：喜马拉雅TTS * HUAWEI_EI：EI TTS * MOBVOI：出门问问TTS
     * @return provider
     */
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public ExternalVoiceAssetMeta withMobvoiVoiceMeta(MobvoiVoiceAssetMeta mobvoiVoiceMeta) {
        this.mobvoiVoiceMeta = mobvoiVoiceMeta;
        return this;
    }

    public ExternalVoiceAssetMeta withMobvoiVoiceMeta(Consumer<MobvoiVoiceAssetMeta> mobvoiVoiceMetaSetter) {
        if (this.mobvoiVoiceMeta == null) {
            this.mobvoiVoiceMeta = new MobvoiVoiceAssetMeta();
            mobvoiVoiceMetaSetter.accept(this.mobvoiVoiceMeta);
        }

        return this;
    }

    /**
     * Get mobvoiVoiceMeta
     * @return mobvoiVoiceMeta
     */
    public MobvoiVoiceAssetMeta getMobvoiVoiceMeta() {
        return mobvoiVoiceMeta;
    }

    public void setMobvoiVoiceMeta(MobvoiVoiceAssetMeta mobvoiVoiceMeta) {
        this.mobvoiVoiceMeta = mobvoiVoiceMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalVoiceAssetMeta that = (ExternalVoiceAssetMeta) obj;
        return Objects.equals(this.provider, that.provider)
            && Objects.equals(this.mobvoiVoiceMeta, that.mobvoiVoiceMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, mobvoiVoiceMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalVoiceAssetMeta {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    mobvoiVoiceMeta: ").append(toIndentedString(mobvoiVoiceMeta)).append("\n");
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
