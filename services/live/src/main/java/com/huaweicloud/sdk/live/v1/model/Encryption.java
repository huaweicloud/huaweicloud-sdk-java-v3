package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 加密信息
 */
public class Encryption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_rotation_interval_seconds")

    private Integer keyRotationIntervalSeconds;

    /**
     * 加密方式
     */
    public static final class EncryptionMethodEnum {

        /**
         * Enum SAMPLE_AES for value: "SAMPLE-AES"
         */
        public static final EncryptionMethodEnum SAMPLE_AES = new EncryptionMethodEnum("SAMPLE-AES");

        /**
         * Enum AES_128 for value: "AES-128"
         */
        public static final EncryptionMethodEnum AES_128 = new EncryptionMethodEnum("AES-128");

        private static final Map<String, EncryptionMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionMethodEnum> createStaticFields() {
            Map<String, EncryptionMethodEnum> map = new HashMap<>();
            map.put("SAMPLE-AES", SAMPLE_AES);
            map.put("AES-128", AES_128);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionMethodEnum(String value) {
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
        public static EncryptionMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionMethodEnum(value));
        }

        public static EncryptionMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionMethodEnum) {
                return this.value.equals(((EncryptionMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_method")

    private EncryptionMethodEnum encryptionMethod;

    /**
     * 取值如下： - content：一个频道对应一个密钥 - profile：一个码率对应一个密钥  默认值：content
     */
    public static final class LevelEnum {

        /**
         * Enum CONTENT for value: "content"
         */
        public static final LevelEnum CONTENT = new LevelEnum("content");

        /**
         * Enum PROFILE for value: "profile"
         */
        public static final LevelEnum PROFILE = new LevelEnum("profile");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("content", CONTENT);
            map.put("profile", PROFILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drm_content_id")

    private String drmContentId;

    /**
     * Gets or Sets systemIds
     */
    public static final class SystemIdsEnum {

        /**
         * Enum WIDEVINE for value: "Widevine"
         */
        public static final SystemIdsEnum WIDEVINE = new SystemIdsEnum("Widevine");

        /**
         * Enum PLAYREADY for value: "PlayReady"
         */
        public static final SystemIdsEnum PLAYREADY = new SystemIdsEnum("PlayReady");

        /**
         * Enum FAIRPLAY for value: "FairPlay"
         */
        public static final SystemIdsEnum FAIRPLAY = new SystemIdsEnum("FairPlay");

        private static final Map<String, SystemIdsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SystemIdsEnum> createStaticFields() {
            Map<String, SystemIdsEnum> map = new HashMap<>();
            map.put("Widevine", WIDEVINE);
            map.put("PlayReady", PLAYREADY);
            map.put("FairPlay", FAIRPLAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SystemIdsEnum(String value) {
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
        public static SystemIdsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SystemIdsEnum(value));
        }

        public static SystemIdsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SystemIdsEnum) {
                return this.value.equals(((SystemIdsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_ids")

    private List<SystemIdsEnum> systemIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private String authInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "km_url")

    private String kmUrl;

    public Encryption withKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        return this;
    }

    /**
     * 密钥缓存时间。如果密钥不变，默认缓存七天
     * minimum: 0
     * maximum: 604800
     * @return keyRotationIntervalSeconds
     */
    public Integer getKeyRotationIntervalSeconds() {
        return keyRotationIntervalSeconds;
    }

    public void setKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
    }

    public Encryption withEncryptionMethod(EncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }

    /**
     * 加密方式
     * @return encryptionMethod
     */
    public EncryptionMethodEnum getEncryptionMethod() {
        return encryptionMethod;
    }

    public void setEncryptionMethod(EncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    public Encryption withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 取值如下： - content：一个频道对应一个密钥 - profile：一个码率对应一个密钥  默认值：content
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public Encryption withDrmContentId(String drmContentId) {
        this.drmContentId = drmContentId;
        return this;
    }

    /**
     * 客户生成的DRM内容ID
     * @return drmContentId
     */
    public String getDrmContentId() {
        return drmContentId;
    }

    public void setDrmContentId(String drmContentId) {
        this.drmContentId = drmContentId;
    }

    public Encryption withSystemIds(List<SystemIdsEnum> systemIds) {
        this.systemIds = systemIds;
        return this;
    }

    public Encryption addSystemIdsItem(SystemIdsEnum systemIdsItem) {
        if (this.systemIds == null) {
            this.systemIds = new ArrayList<>();
        }
        this.systemIds.add(systemIdsItem);
        return this;
    }

    public Encryption withSystemIds(Consumer<List<SystemIdsEnum>> systemIdsSetter) {
        if (this.systemIds == null) {
            this.systemIds = new ArrayList<>();
        }
        systemIdsSetter.accept(this.systemIds);
        return this;
    }

    /**
     * system_id枚举值
     * @return systemIds
     */
    public List<SystemIdsEnum> getSystemIds() {
        return systemIds;
    }

    public void setSystemIds(List<SystemIdsEnum> systemIds) {
        this.systemIds = systemIds;
    }

    public Encryption withAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    /**
     * 增加到请求消息体header中的鉴权信息
     * @return authInfo
     */
    public String getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
    }

    public Encryption withKmUrl(String kmUrl) {
        this.kmUrl = kmUrl;
        return this;
    }

    /**
     * 获取密钥的DRM地址
     * @return kmUrl
     */
    public String getKmUrl() {
        return kmUrl;
    }

    public void setKmUrl(String kmUrl) {
        this.kmUrl = kmUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Encryption that = (Encryption) obj;
        return Objects.equals(this.keyRotationIntervalSeconds, that.keyRotationIntervalSeconds)
            && Objects.equals(this.encryptionMethod, that.encryptionMethod) && Objects.equals(this.level, that.level)
            && Objects.equals(this.drmContentId, that.drmContentId) && Objects.equals(this.systemIds, that.systemIds)
            && Objects.equals(this.authInfo, that.authInfo) && Objects.equals(this.kmUrl, that.kmUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(keyRotationIntervalSeconds, encryptionMethod, level, drmContentId, systemIds, authInfo, kmUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encryption {\n");
        sb.append("    keyRotationIntervalSeconds: ").append(toIndentedString(keyRotationIntervalSeconds)).append("\n");
        sb.append("    encryptionMethod: ").append(toIndentedString(encryptionMethod)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    drmContentId: ").append(toIndentedString(drmContentId)).append("\n");
        sb.append("    systemIds: ").append(toIndentedString(systemIds)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    kmUrl: ").append(toIndentedString(kmUrl)).append("\n");
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
