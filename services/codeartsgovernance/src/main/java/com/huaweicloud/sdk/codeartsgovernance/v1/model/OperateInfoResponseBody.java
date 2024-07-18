package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OperateInfoResponseBody
 */
public class OperateInfoResponseBody {

    /**
     * 状态码:   * success - 成功   * failure - 失败 
     */
    public static final class InfoCodeEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final InfoCodeEnum SUCCESS = new InfoCodeEnum("success");

        /**
         * Enum FAILURE for value: "failure"
         */
        public static final InfoCodeEnum FAILURE = new InfoCodeEnum("failure");

        private static final Map<String, InfoCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InfoCodeEnum> createStaticFields() {
            Map<String, InfoCodeEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failure", FAILURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InfoCodeEnum(String value) {
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
        public static InfoCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InfoCodeEnum(value));
        }

        public static InfoCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InfoCodeEnum) {
                return this.value.equals(((InfoCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_code")

    private InfoCodeEnum infoCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_description")

    private String infoDescription;

    public OperateInfoResponseBody withInfoCode(InfoCodeEnum infoCode) {
        this.infoCode = infoCode;
        return this;
    }

    /**
     * 状态码:   * success - 成功   * failure - 失败 
     * @return infoCode
     */
    public InfoCodeEnum getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(InfoCodeEnum infoCode) {
        this.infoCode = infoCode;
    }

    public OperateInfoResponseBody withInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
        return this;
    }

    /**
     * 返回的提示信息
     * @return infoDescription
     */
    public String getInfoDescription() {
        return infoDescription;
    }

    public void setInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateInfoResponseBody that = (OperateInfoResponseBody) obj;
        return Objects.equals(this.infoCode, that.infoCode)
            && Objects.equals(this.infoDescription, that.infoDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoCode, infoDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateInfoResponseBody {\n");
        sb.append("    infoCode: ").append(toIndentedString(infoCode)).append("\n");
        sb.append("    infoDescription: ").append(toIndentedString(infoDescription)).append("\n");
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
