package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 设置SQL限流开关状态请求体
 */
public class ChangeSqlLimitSwitchStatusBody {

    /**
     * 开关状态
     */
    public static final class SwitchStatusEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final SwitchStatusEnum ON = new SwitchStatusEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final SwitchStatusEnum OFF = new SwitchStatusEnum("OFF");

        private static final Map<String, SwitchStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SwitchStatusEnum> createStaticFields() {
            Map<String, SwitchStatusEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SwitchStatusEnum(String value) {
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
        public static SwitchStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SwitchStatusEnum(value));
        }

        public static SwitchStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SwitchStatusEnum) {
                return this.value.equals(((SwitchStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private SwitchStatusEnum switchStatus;

    /**
     * 数据库类型
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatastoreTypeEnum(value));
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    public ChangeSqlLimitSwitchStatusBody withSwitchStatus(SwitchStatusEnum switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * 开关状态
     * @return switchStatus
     */
    public SwitchStatusEnum getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(SwitchStatusEnum switchStatus) {
        this.switchStatus = switchStatus;
    }

    public ChangeSqlLimitSwitchStatusBody withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeSqlLimitSwitchStatusBody that = (ChangeSqlLimitSwitchStatusBody) obj;
        return Objects.equals(this.switchStatus, that.switchStatus)
            && Objects.equals(this.datastoreType, that.datastoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchStatus, datastoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSqlLimitSwitchStatusBody {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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
