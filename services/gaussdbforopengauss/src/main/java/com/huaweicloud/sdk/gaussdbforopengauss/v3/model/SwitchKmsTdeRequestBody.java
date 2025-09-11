package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SwitchKmsTdeRequestBody
 */
public class SwitchKmsTdeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_tde_key_id")

    private String kmsTdeKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_project_name")

    private String kmsProjectName;

    /**
     * **参数解释**: 需要切换的状态：on表示开启。 **约束限制**: 不涉及。 **取值范围**: on: 开启。 **默认取值**: on
     */
    public static final class KmsTdeStatusEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final KmsTdeStatusEnum ON = new KmsTdeStatusEnum("on");

        private static final Map<String, KmsTdeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KmsTdeStatusEnum> createStaticFields() {
            Map<String, KmsTdeStatusEnum> map = new HashMap<>();
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KmsTdeStatusEnum(String value) {
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
        public static KmsTdeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KmsTdeStatusEnum(value));
        }

        public static KmsTdeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KmsTdeStatusEnum) {
                return this.value.equals(((KmsTdeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_tde_status")

    private KmsTdeStatusEnum kmsTdeStatus;

    public SwitchKmsTdeRequestBody withKmsTdeKeyId(String kmsTdeKeyId) {
        this.kmsTdeKeyId = kmsTdeKeyId;
        return this;
    }

    /**
     * **参数解释**: kms主密钥ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return kmsTdeKeyId
     */
    public String getKmsTdeKeyId() {
        return kmsTdeKeyId;
    }

    public void setKmsTdeKeyId(String kmsTdeKeyId) {
        this.kmsTdeKeyId = kmsTdeKeyId;
    }

    public SwitchKmsTdeRequestBody withKmsProjectName(String kmsProjectName) {
        this.kmsProjectName = kmsProjectName;
        return this;
    }

    /**
     * **参数解释**: GaussDB使用透明加密的KMS主密钥ID所在资源空间名称。 获取方法请参见[获取项目名称](https://support.huaweicloud.com/api-gaussdb/gaussdb_api_196.html)。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return kmsProjectName
     */
    public String getKmsProjectName() {
        return kmsProjectName;
    }

    public void setKmsProjectName(String kmsProjectName) {
        this.kmsProjectName = kmsProjectName;
    }

    public SwitchKmsTdeRequestBody withKmsTdeStatus(KmsTdeStatusEnum kmsTdeStatus) {
        this.kmsTdeStatus = kmsTdeStatus;
        return this;
    }

    /**
     * **参数解释**: 需要切换的状态：on表示开启。 **约束限制**: 不涉及。 **取值范围**: on: 开启。 **默认取值**: on
     * @return kmsTdeStatus
     */
    public KmsTdeStatusEnum getKmsTdeStatus() {
        return kmsTdeStatus;
    }

    public void setKmsTdeStatus(KmsTdeStatusEnum kmsTdeStatus) {
        this.kmsTdeStatus = kmsTdeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchKmsTdeRequestBody that = (SwitchKmsTdeRequestBody) obj;
        return Objects.equals(this.kmsTdeKeyId, that.kmsTdeKeyId)
            && Objects.equals(this.kmsProjectName, that.kmsProjectName)
            && Objects.equals(this.kmsTdeStatus, that.kmsTdeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmsTdeKeyId, kmsProjectName, kmsTdeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchKmsTdeRequestBody {\n");
        sb.append("    kmsTdeKeyId: ").append(toIndentedString(kmsTdeKeyId)).append("\n");
        sb.append("    kmsProjectName: ").append(toIndentedString(kmsProjectName)).append("\n");
        sb.append("    kmsTdeStatus: ").append(toIndentedString(kmsTdeStatus)).append("\n");
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
