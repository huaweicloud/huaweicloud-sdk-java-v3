package com.huaweicloud.sdk.drs.v5.model;

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
 * DeleteUserDriverReq
 */
public class DeleteUserDriverReq {

    /**
     * 指定待删除的驱动文件类型。取值范围： - db2：DB2 for LUW - informix：Informix
     */
    public static final class DriverTypeEnum {

        /**
         * Enum DB2 for value: "db2"
         */
        public static final DriverTypeEnum DB2 = new DriverTypeEnum("db2");

        /**
         * Enum INFORMIX for value: "informix"
         */
        public static final DriverTypeEnum INFORMIX = new DriverTypeEnum("informix");

        private static final Map<String, DriverTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DriverTypeEnum> createStaticFields() {
            Map<String, DriverTypeEnum> map = new HashMap<>();
            map.put("db2", DB2);
            map.put("informix", INFORMIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DriverTypeEnum(String value) {
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
        public static DriverTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DriverTypeEnum(value));
        }

        public static DriverTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DriverTypeEnum) {
                return this.value.equals(((DriverTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_type")

    private DriverTypeEnum driverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_names")

    private List<String> driverNames = null;

    public DeleteUserDriverReq withDriverType(DriverTypeEnum driverType) {
        this.driverType = driverType;
        return this;
    }

    /**
     * 指定待删除的驱动文件类型。取值范围： - db2：DB2 for LUW - informix：Informix
     * @return driverType
     */
    public DriverTypeEnum getDriverType() {
        return driverType;
    }

    public void setDriverType(DriverTypeEnum driverType) {
        this.driverType = driverType;
    }

    public DeleteUserDriverReq withDriverNames(List<String> driverNames) {
        this.driverNames = driverNames;
        return this;
    }

    public DeleteUserDriverReq addDriverNamesItem(String driverNamesItem) {
        if (this.driverNames == null) {
            this.driverNames = new ArrayList<>();
        }
        this.driverNames.add(driverNamesItem);
        return this;
    }

    public DeleteUserDriverReq withDriverNames(Consumer<List<String>> driverNamesSetter) {
        if (this.driverNames == null) {
            this.driverNames = new ArrayList<>();
        }
        driverNamesSetter.accept(this.driverNames);
        return this;
    }

    /**
     * JDBC驱动文件列表，列表长度1-20，driver_name的长度5-64，结尾以.jar结尾。
     * @return driverNames
     */
    public List<String> getDriverNames() {
        return driverNames;
    }

    public void setDriverNames(List<String> driverNames) {
        this.driverNames = driverNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteUserDriverReq that = (DeleteUserDriverReq) obj;
        return Objects.equals(this.driverType, that.driverType) && Objects.equals(this.driverNames, that.driverNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverType, driverNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteUserDriverReq {\n");
        sb.append("    driverType: ").append(toIndentedString(driverType)).append("\n");
        sb.append("    driverNames: ").append(toIndentedString(driverNames)).append("\n");
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
