package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OperateUserReq
 */
public class OperateUserReq {

    /**
     * 操作类型，可选值为： - LOCK：锁定用户。 - UNLOCK：解锁用户。 - RESET_PWD：重置用户密码。
     */
    public static final class OpTypeEnum {

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final OpTypeEnum LOCK = new OpTypeEnum("LOCK");

        /**
         * Enum UNLOCK for value: "UNLOCK"
         */
        public static final OpTypeEnum UNLOCK = new OpTypeEnum("UNLOCK");

        /**
         * Enum RESET_PWD for value: "RESET_PWD"
         */
        public static final OpTypeEnum RESET_PWD = new OpTypeEnum("RESET_PWD");

        private static final Map<String, OpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OpTypeEnum> createStaticFields() {
            Map<String, OpTypeEnum> map = new HashMap<>();
            map.put("LOCK", LOCK);
            map.put("UNLOCK", UNLOCK);
            map.put("RESET_PWD", RESET_PWD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OpTypeEnum(String value) {
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
        public static OpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OpTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OpTypeEnum(value);
            }
            return result;
        }

        public static OpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OpTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OpTypeEnum) {
                return this.value.equals(((OpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private OpTypeEnum opType;

    public OperateUserReq withOpType(OpTypeEnum opType) {
        this.opType = opType;
        return this;
    }

    /**
     * 操作类型，可选值为： - LOCK：锁定用户。 - UNLOCK：解锁用户。 - RESET_PWD：重置用户密码。
     * @return opType
     */
    public OpTypeEnum getOpType() {
        return opType;
    }

    public void setOpType(OpTypeEnum opType) {
        this.opType = opType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateUserReq operateUserReq = (OperateUserReq) o;
        return Objects.equals(this.opType, operateUserReq.opType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateUserReq {\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
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
