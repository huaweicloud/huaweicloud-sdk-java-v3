package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 中心网络策略变化。
 */
public class CentralNetworkElementChange {

    /**
     * 实例状态。 - CreateCentralNetworkPlane: 新增中心网络平面 - DeleteCentralNetworkPlane: 移除中心网络平面 - UpdateCentralNetworkPlane: 更新中心网络平面 - CreateCentralNetworkErInstance: 新增中心网络ER实例 - DeleteCentralNetworkErInstance: 移除中心网络ER实例 - CreateCentralNetworkErConnection: 新增中心网络ER连接 - DeleteCentralNetworkErConnection: 移除中心网络ER连接 - CreateCentralNetworkErTable: 新增中心网络ER路由表 - DeleteCentralNetworkErTable: 移除中心网络ER路由表 - SwitchCentralNetworkErTable: 切换中心网络ER路由表
     */
    public static final class OperationIdEnum {

        /**
         * Enum CREATECENTRALNETWORKPLANE for value: "CreateCentralNetworkPlane"
         */
        public static final OperationIdEnum CREATECENTRALNETWORKPLANE =
            new OperationIdEnum("CreateCentralNetworkPlane");

        /**
         * Enum DELETECENTRALNETWORKPLANE for value: "DeleteCentralNetworkPlane"
         */
        public static final OperationIdEnum DELETECENTRALNETWORKPLANE =
            new OperationIdEnum("DeleteCentralNetworkPlane");

        /**
         * Enum UPDATECENTRALNETWORKPLANE for value: "UpdateCentralNetworkPlane"
         */
        public static final OperationIdEnum UPDATECENTRALNETWORKPLANE =
            new OperationIdEnum("UpdateCentralNetworkPlane");

        /**
         * Enum CREATECENTRALNETWORKERINSTANCE for value: "CreateCentralNetworkErInstance"
         */
        public static final OperationIdEnum CREATECENTRALNETWORKERINSTANCE =
            new OperationIdEnum("CreateCentralNetworkErInstance");

        /**
         * Enum DELETECENTRALNETWORKERINSTANCE for value: "DeleteCentralNetworkErInstance"
         */
        public static final OperationIdEnum DELETECENTRALNETWORKERINSTANCE =
            new OperationIdEnum("DeleteCentralNetworkErInstance");

        /**
         * Enum CREATECENTRALNETWORKERCONNECTION for value: "CreateCentralNetworkErConnection"
         */
        public static final OperationIdEnum CREATECENTRALNETWORKERCONNECTION =
            new OperationIdEnum("CreateCentralNetworkErConnection");

        /**
         * Enum DELETECENTRALNETWORKERCONNECTION for value: "DeleteCentralNetworkErConnection"
         */
        public static final OperationIdEnum DELETECENTRALNETWORKERCONNECTION =
            new OperationIdEnum("DeleteCentralNetworkErConnection");

        /**
         * Enum CREATECENTRALNETWORKERTABLE for value: "CreateCentralNetworkErTable"
         */
        public static final OperationIdEnum CREATECENTRALNETWORKERTABLE =
            new OperationIdEnum("CreateCentralNetworkErTable");

        /**
         * Enum DELETECENTRALNETWORKERTABLE for value: "DeleteCentralNetworkErTable"
         */
        public static final OperationIdEnum DELETECENTRALNETWORKERTABLE =
            new OperationIdEnum("DeleteCentralNetworkErTable");

        /**
         * Enum SWITCHCENTRALNETWORKERTABLE for value: "SwitchCentralNetworkErTable"
         */
        public static final OperationIdEnum SWITCHCENTRALNETWORKERTABLE =
            new OperationIdEnum("SwitchCentralNetworkErTable");

        private static final Map<String, OperationIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationIdEnum> createStaticFields() {
            Map<String, OperationIdEnum> map = new HashMap<>();
            map.put("CreateCentralNetworkPlane", CREATECENTRALNETWORKPLANE);
            map.put("DeleteCentralNetworkPlane", DELETECENTRALNETWORKPLANE);
            map.put("UpdateCentralNetworkPlane", UPDATECENTRALNETWORKPLANE);
            map.put("CreateCentralNetworkErInstance", CREATECENTRALNETWORKERINSTANCE);
            map.put("DeleteCentralNetworkErInstance", DELETECENTRALNETWORKERINSTANCE);
            map.put("CreateCentralNetworkErConnection", CREATECENTRALNETWORKERCONNECTION);
            map.put("DeleteCentralNetworkErConnection", DELETECENTRALNETWORKERCONNECTION);
            map.put("CreateCentralNetworkErTable", CREATECENTRALNETWORKERTABLE);
            map.put("DeleteCentralNetworkErTable", DELETECENTRALNETWORKERTABLE);
            map.put("SwitchCentralNetworkErTable", SWITCHCENTRALNETWORKERTABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationIdEnum(String value) {
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
        public static OperationIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationIdEnum(value));
        }

        public static OperationIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationIdEnum) {
                return this.value.equals(((OperationIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private OperationIdEnum operationId;

    public CentralNetworkElementChange withOperationId(OperationIdEnum operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 实例状态。 - CreateCentralNetworkPlane: 新增中心网络平面 - DeleteCentralNetworkPlane: 移除中心网络平面 - UpdateCentralNetworkPlane: 更新中心网络平面 - CreateCentralNetworkErInstance: 新增中心网络ER实例 - DeleteCentralNetworkErInstance: 移除中心网络ER实例 - CreateCentralNetworkErConnection: 新增中心网络ER连接 - DeleteCentralNetworkErConnection: 移除中心网络ER连接 - CreateCentralNetworkErTable: 新增中心网络ER路由表 - DeleteCentralNetworkErTable: 移除中心网络ER路由表 - SwitchCentralNetworkErTable: 切换中心网络ER路由表
     * @return operationId
     */
    public OperationIdEnum getOperationId() {
        return operationId;
    }

    public void setOperationId(OperationIdEnum operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkElementChange that = (CentralNetworkElementChange) obj;
        return Objects.equals(this.operationId, that.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkElementChange {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
