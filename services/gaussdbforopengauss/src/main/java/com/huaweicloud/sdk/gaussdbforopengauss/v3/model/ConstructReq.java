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
 * 搭建容灾请求参数。
 */
public class ConstructReq {

    /**
     * 容灾类型。
     */
    public static final class DisasterTypeEnum {

        /**
         * Enum STREAM for value: "stream"
         */
        public static final DisasterTypeEnum STREAM = new DisasterTypeEnum("stream");

        /**
         * Enum DORADO for value: "dorado"
         */
        public static final DisasterTypeEnum DORADO = new DisasterTypeEnum("dorado");

        private static final Map<String, DisasterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisasterTypeEnum> createStaticFields() {
            Map<String, DisasterTypeEnum> map = new HashMap<>();
            map.put("stream", STREAM);
            map.put("dorado", DORADO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisasterTypeEnum(String value) {
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
        public static DisasterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisasterTypeEnum(value));
        }

        public static DisasterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisasterTypeEnum) {
                return this.value.equals(((DisasterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_type")

    private DisasterTypeEnum disasterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_ip")

    private String drIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_user_name")

    private String drUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_user_password")

    private String drUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_task_name")

    private String drTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lite_dr_mode")

    private String liteDrMode;

    public ConstructReq withDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
        return this;
    }

    /**
     * 容灾类型。
     * @return disasterType
     */
    public DisasterTypeEnum getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
    }

    public ConstructReq withDrIp(String drIp) {
        this.drIp = drIp;
        return this;
    }

    /**
     * 对端实例任意数据ip。
     * @return drIp
     */
    public String getDrIp() {
        return drIp;
    }

    public void setDrIp(String drIp) {
        this.drIp = drIp;
    }

    public ConstructReq withDrUserName(String drUserName) {
        this.drUserName = drUserName;
        return this;
    }

    /**
     * 对端实例账户名称。
     * @return drUserName
     */
    public String getDrUserName() {
        return drUserName;
    }

    public void setDrUserName(String drUserName) {
        this.drUserName = drUserName;
    }

    public ConstructReq withDrUserPassword(String drUserPassword) {
        this.drUserPassword = drUserPassword;
        return this;
    }

    /**
     * 对端实例账户密码。
     * @return drUserPassword
     */
    public String getDrUserPassword() {
        return drUserPassword;
    }

    public void setDrUserPassword(String drUserPassword) {
        this.drUserPassword = drUserPassword;
    }

    public ConstructReq withDrTaskName(String drTaskName) {
        this.drTaskName = drTaskName;
        return this;
    }

    /**
     * 容灾任务名称
     * @return drTaskName
     */
    public String getDrTaskName() {
        return drTaskName;
    }

    public void setDrTaskName(String drTaskName) {
        this.drTaskName = drTaskName;
    }

    public ConstructReq withLiteDrMode(String liteDrMode) {
        this.liteDrMode = liteDrMode;
        return this;
    }

    /**
     * 灾备实例为轻量化部署.
     * @return liteDrMode
     */
    public String getLiteDrMode() {
        return liteDrMode;
    }

    public void setLiteDrMode(String liteDrMode) {
        this.liteDrMode = liteDrMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConstructReq that = (ConstructReq) obj;
        return Objects.equals(this.disasterType, that.disasterType) && Objects.equals(this.drIp, that.drIp)
            && Objects.equals(this.drUserName, that.drUserName)
            && Objects.equals(this.drUserPassword, that.drUserPassword)
            && Objects.equals(this.drTaskName, that.drTaskName) && Objects.equals(this.liteDrMode, that.liteDrMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterType, drIp, drUserName, drUserPassword, drTaskName, liteDrMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstructReq {\n");
        sb.append("    disasterType: ").append(toIndentedString(disasterType)).append("\n");
        sb.append("    drIp: ").append(toIndentedString(drIp)).append("\n");
        sb.append("    drUserName: ").append(toIndentedString(drUserName)).append("\n");
        sb.append("    drUserPassword: ").append(toIndentedString(drUserPassword)).append("\n");
        sb.append("    drTaskName: ").append(toIndentedString(drTaskName)).append("\n");
        sb.append("    liteDrMode: ").append(toIndentedString(liteDrMode)).append("\n");
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
