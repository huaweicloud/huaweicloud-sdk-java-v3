package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 日志接入格式多行日志 */
public class AccessConfigFormatMutil {

    /** 单行日志。time：日志时间，regular：正则模式。 */
    public static final class ModeEnum {

        /** Enum TIME for value: "time" */
        public static final ModeEnum TIME = new ModeEnum("time");

        /** Enum REGULAR for value: "regular" */
        public static final ModeEnum REGULAR = new ModeEnum("regular");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("time", TIME);
            map.put("regular", REGULAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public AccessConfigFormatMutil withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /** 单行日志。time：日志时间，regular：正则模式。
     * 
     * @return mode */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AccessConfigFormatMutil withValue(String value) {
        this.value = value;
        return this;
    }

    /** 日志时间。 当mode为\"regular\"，则输入正则表达式
     * 当mode为\"time\"，则时间通配符：用日志打印时间来标识一条日志数据，通过时间通配符来匹配日志，每条日志的行首显示日志的打印时间；如果日志中的时间格式为：2019-01-01
     * 23:59:59，时间通配符应该填写为：YYYY-MM-DD hh:mm:ss；如果日志中的时间格式为：19-1-1 23:59:59，时间通配符应该填写为：YY-M-D hh:mm:ss
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigFormatMutil accessConfigFormatMutil = (AccessConfigFormatMutil) o;
        return Objects.equals(this.mode, accessConfigFormatMutil.mode)
            && Objects.equals(this.value, accessConfigFormatMutil.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigFormatMutil {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
