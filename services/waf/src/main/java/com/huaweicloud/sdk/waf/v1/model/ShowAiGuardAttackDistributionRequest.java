package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAiGuardAttackDistributionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 检测内容类型筛选，不传则查询全部类型 **约束限制：** 不涉及 **取值范围：** - text: 文本检测 - image: 图片检测 **默认取值：** 不涉及
     */
    public static final class DetectTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final DetectTypeEnum TEXT = new DetectTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final DetectTypeEnum IMAGE = new DetectTypeEnum("image");

        private static final Map<String, DetectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectTypeEnum> createStaticFields() {
            Map<String, DetectTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectTypeEnum(String value) {
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
        public static DetectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DetectTypeEnum(value));
        }

        public static DetectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DetectTypeEnum) {
                return this.value.equals(((DetectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private DetectTypeEnum detectType;

    public ShowAiGuardAttackDistributionRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 开始时间，时间格式为毫秒时间戳 **约束限制：** 不涉及 **取值范围：** 1-9999999999999 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 9999999999999
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowAiGuardAttackDistributionRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 截止时间，时间格式为毫秒时间戳，默认当天时间戳 **约束限制：** 不涉及 **取值范围：** 1-9999999999999 **默认取值：** 当天时间戳
     * minimum: 1
     * maximum: 9999999999999
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ShowAiGuardAttackDistributionRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数解释：** 应用ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowAiGuardAttackDistributionRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页偏移量，默认值为0 **约束限制：** 不涉及 **取值范围：** >=0 **默认取值：** 0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowAiGuardAttackDistributionRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 每页返回的最大数据量，默认值为2000，最大限制为2000 **约束限制：** 最大2000 **取值范围：** 0-2000 **默认取值：** 2000
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowAiGuardAttackDistributionRequest withDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * **参数解释：** 检测内容类型筛选，不传则查询全部类型 **约束限制：** 不涉及 **取值范围：** - text: 文本检测 - image: 图片检测 **默认取值：** 不涉及
     * @return detectType
     */
    public DetectTypeEnum getDetectType() {
        return detectType;
    }

    public void setDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAiGuardAttackDistributionRequest that = (ShowAiGuardAttackDistributionRequest) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.detectType, that.detectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, appId, offset, limit, detectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAiGuardAttackDistributionRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
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
