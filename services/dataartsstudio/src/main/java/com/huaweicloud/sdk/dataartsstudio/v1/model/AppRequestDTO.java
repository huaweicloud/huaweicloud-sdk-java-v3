package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AppRequestDTO
 */
public class AppRequestDTO {

    /**
     * 应用类型
     */
    public static final class AppTypeEnum {

        /**
         * Enum APIG for value: "APIG"
         */
        public static final AppTypeEnum APIG = new AppTypeEnum("APIG");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AppTypeEnum IAM = new AppTypeEnum("IAM");

        /**
         * Enum APIGW for value: "APIGW"
         */
        public static final AppTypeEnum APIGW = new AppTypeEnum("APIGW");

        /**
         * Enum DLM for value: "DLM"
         */
        public static final AppTypeEnum DLM = new AppTypeEnum("DLM");

        /**
         * Enum ROMA_APIC for value: "ROMA_APIC"
         */
        public static final AppTypeEnum ROMA_APIC = new AppTypeEnum("ROMA_APIC");

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("APIG", APIG);
            map.put("IAM", IAM);
            map.put("APIGW", APIGW);
            map.put("DLM", DLM);
            map.put("ROMA_APIC", ROMA_APIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppTypeEnum(value));
        }

        public static AppTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 网关类型
     */
    public static final class ApigTypeEnum {

        /**
         * Enum APIG for value: "APIG"
         */
        public static final ApigTypeEnum APIG = new ApigTypeEnum("APIG");

        /**
         * Enum APIGW for value: "APIGW"
         */
        public static final ApigTypeEnum APIGW = new ApigTypeEnum("APIGW");

        /**
         * Enum ROMA_APIC for value: "ROMA_APIC"
         */
        public static final ApigTypeEnum ROMA_APIC = new ApigTypeEnum("ROMA_APIC");

        private static final Map<String, ApigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApigTypeEnum> createStaticFields() {
            Map<String, ApigTypeEnum> map = new HashMap<>();
            map.put("APIG", APIG);
            map.put("APIGW", APIGW);
            map.put("ROMA_APIC", ROMA_APIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApigTypeEnum(String value) {
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
        public static ApigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApigTypeEnum(value));
        }

        public static ApigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApigTypeEnum) {
                return this.value.equals(((ApigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_type")

    private ApigTypeEnum apigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_instance_id")

    private String apigInstanceId;

    public AppRequestDTO withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用类型
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public AppRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppRequestDTO withApigType(ApigTypeEnum apigType) {
        this.apigType = apigType;
        return this;
    }

    /**
     * 网关类型
     * @return apigType
     */
    public ApigTypeEnum getApigType() {
        return apigType;
    }

    public void setApigType(ApigTypeEnum apigType) {
        this.apigType = apigType;
    }

    public AppRequestDTO withApigInstanceId(String apigInstanceId) {
        this.apigInstanceId = apigInstanceId;
        return this;
    }

    /**
     * 网关实例编号
     * @return apigInstanceId
     */
    public String getApigInstanceId() {
        return apigInstanceId;
    }

    public void setApigInstanceId(String apigInstanceId) {
        this.apigInstanceId = apigInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppRequestDTO that = (AppRequestDTO) obj;
        return Objects.equals(this.appType, that.appType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.apigType, that.apigType)
            && Objects.equals(this.apigInstanceId, that.apigInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appType, name, description, apigType, apigInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppRequestDTO {\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    apigType: ").append(toIndentedString(apigType)).append("\n");
        sb.append("    apigInstanceId: ").append(toIndentedString(apigInstanceId)).append("\n");
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
