package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 克隆服务器类
 */
public class CloneServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_error")

    private String cloneError;

    /**
     * 克隆状态 NOT_READY: 未准备好 READY: 就绪 PREPARING: 准备创建中 CREATING: 创建中 ERROR: 克隆错误 FINISHED: 克隆结束
     */
    public static final class CloneStateEnum {

        /**
         * Enum NOT_READY for value: "NOT_READY"
         */
        public static final CloneStateEnum NOT_READY = new CloneStateEnum("NOT_READY");

        /**
         * Enum READY for value: "READY"
         */
        public static final CloneStateEnum READY = new CloneStateEnum("READY");

        /**
         * Enum PREPARING for value: "PREPARING"
         */
        public static final CloneStateEnum PREPARING = new CloneStateEnum("PREPARING");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final CloneStateEnum CREATING = new CloneStateEnum("CREATING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final CloneStateEnum ERROR = new CloneStateEnum("ERROR");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final CloneStateEnum FINISHED = new CloneStateEnum("FINISHED");

        private static final Map<String, CloneStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloneStateEnum> createStaticFields() {
            Map<String, CloneStateEnum> map = new HashMap<>();
            map.put("NOT_READY", NOT_READY);
            map.put("READY", READY);
            map.put("PREPARING", PREPARING);
            map.put("CREATING", CREATING);
            map.put("ERROR", ERROR);
            map.put("FINISHED", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloneStateEnum(String value) {
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
        public static CloneStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloneStateEnum(value));
        }

        public static CloneStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloneStateEnum) {
                return this.value.equals(((CloneStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_state")

    private CloneStateEnum cloneState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public CloneServer withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * 克隆服务器ID
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public CloneServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 克隆虚拟机的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloneServer withCloneError(String cloneError) {
        this.cloneError = cloneError;
        return this;
    }

    /**
     * 克隆错误信息
     * @return cloneError
     */
    public String getCloneError() {
        return cloneError;
    }

    public void setCloneError(String cloneError) {
        this.cloneError = cloneError;
    }

    public CloneServer withCloneState(CloneStateEnum cloneState) {
        this.cloneState = cloneState;
        return this;
    }

    /**
     * 克隆状态 NOT_READY: 未准备好 READY: 就绪 PREPARING: 准备创建中 CREATING: 创建中 ERROR: 克隆错误 FINISHED: 克隆结束
     * @return cloneState
     */
    public CloneStateEnum getCloneState() {
        return cloneState;
    }

    public void setCloneState(CloneStateEnum cloneState) {
        this.cloneState = cloneState;
    }

    public CloneServer withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 克隆错误信息描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneServer that = (CloneServer) obj;
        return Objects.equals(this.vmId, that.vmId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.cloneError, that.cloneError) && Objects.equals(this.cloneState, that.cloneState)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmId, name, cloneError, cloneState, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneServer {\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cloneError: ").append(toIndentedString(cloneError)).append("\n");
        sb.append("    cloneState: ").append(toIndentedString(cloneState)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
