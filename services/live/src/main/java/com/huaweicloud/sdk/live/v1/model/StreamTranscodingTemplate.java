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
 * StreamTranscodingTemplate
 */
public class StreamTranscodingTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /**
     * 转码流触发模式。 - play：拉流触发转码。 - publish：推流触发转码。 默认为play 
     */
    public static final class TransTypeEnum {

        /**
         * Enum PLAY for value: "play"
         */
        public static final TransTypeEnum PLAY = new TransTypeEnum("play");

        /**
         * Enum PUBLISH for value: "publish"
         */
        public static final TransTypeEnum PUBLISH = new TransTypeEnum("publish");

        private static final Map<String, TransTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransTypeEnum> createStaticFields() {
            Map<String, TransTypeEnum> map = new HashMap<>();
            map.put("play", PLAY);
            map.put("publish", PUBLISH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransTypeEnum(String value) {
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
        public static TransTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransTypeEnum(value));
        }

        public static TransTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransTypeEnum) {
                return this.value.equals(((TransTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_type")

    private TransTypeEnum transType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_info")

    private List<QualityInfo> qualityInfo = null;

    public StreamTranscodingTemplate withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public StreamTranscodingTemplate withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。 默认为“live”，若您需要自定义应用名称，请先提交工单申请。 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public StreamTranscodingTemplate withTransType(TransTypeEnum transType) {
        this.transType = transType;
        return this;
    }

    /**
     * 转码流触发模式。 - play：拉流触发转码。 - publish：推流触发转码。 默认为play 
     * @return transType
     */
    public TransTypeEnum getTransType() {
        return transType;
    }

    public void setTransType(TransTypeEnum transType) {
        this.transType = transType;
    }

    public StreamTranscodingTemplate withQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
        return this;
    }

    public StreamTranscodingTemplate addQualityInfoItem(QualityInfo qualityInfoItem) {
        if (this.qualityInfo == null) {
            this.qualityInfo = new ArrayList<>();
        }
        this.qualityInfo.add(qualityInfoItem);
        return this;
    }

    public StreamTranscodingTemplate withQualityInfo(Consumer<List<QualityInfo>> qualityInfoSetter) {
        if (this.qualityInfo == null) {
            this.qualityInfo = new ArrayList<>();
        }
        qualityInfoSetter.accept(this.qualityInfo);
        return this;
    }

    /**
     * 视频质量信息
     * @return qualityInfo
     */
    public List<QualityInfo> getQualityInfo() {
        return qualityInfo;
    }

    public void setQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamTranscodingTemplate that = (StreamTranscodingTemplate) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.transType, that.transType) && Objects.equals(this.qualityInfo, that.qualityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, transType, qualityInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamTranscodingTemplate {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
        sb.append("    qualityInfo: ").append(toIndentedString(qualityInfo)).append("\n");
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
