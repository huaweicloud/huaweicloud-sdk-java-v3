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
 * 数据开发细粒度连接配置信息
 */
public class DataWareHouseDTODwConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_flag")

    private Boolean fgacFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_type")

    private String fgacType;

    /**
     * 数据源连通性测试状态：   * UNKNOWN - 连通性未测试   * TESTING - 连通性测试中   * SUCCESS - 连通性测试成功   * FAILED - 连通性测试失败
     */
    public static final class FgacConnStatusEnum {

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final FgacConnStatusEnum UNKNOWN = new FgacConnStatusEnum("UNKNOWN");

        /**
         * Enum TESTING for value: "TESTING"
         */
        public static final FgacConnStatusEnum TESTING = new FgacConnStatusEnum("TESTING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final FgacConnStatusEnum SUCCESS = new FgacConnStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final FgacConnStatusEnum FAILED = new FgacConnStatusEnum("FAILED");

        private static final Map<String, FgacConnStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FgacConnStatusEnum> createStaticFields() {
            Map<String, FgacConnStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("TESTING", TESTING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FgacConnStatusEnum(String value) {
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
        public static FgacConnStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FgacConnStatusEnum(value));
        }

        public static FgacConnStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FgacConnStatusEnum) {
                return this.value.equals(((FgacConnStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_conn_status")

    private FgacConnStatusEnum fgacConnStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_conn_test_time")

    private Long fgacConnTestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_conn_test_error")

    private String fgacConnTestError;

    public DataWareHouseDTODwConfig withFgacFlag(Boolean fgacFlag) {
        this.fgacFlag = fgacFlag;
        return this;
    }

    /**
     * 是否开启细粒度认证,true表示开启细粒度认证,false表示关闭细粒度认证。
     * @return fgacFlag
     */
    public Boolean getFgacFlag() {
        return fgacFlag;
    }

    public void setFgacFlag(Boolean fgacFlag) {
        this.fgacFlag = fgacFlag;
    }

    public DataWareHouseDTODwConfig withFgacType(String fgacType) {
        this.fgacType = fgacType;
        return this;
    }

    /**
     * 细粒度认证类型，开启细粒度认证时才生效。\"0\"表示开发态细粒度认证，支持数据开发细粒度脚本运行、作业测试运行，\"1\"表示调度态细粒度认证，支持数据开发细粒度脚本运行、作业测试运行、作业执行调度。
     * @return fgacType
     */
    public String getFgacType() {
        return fgacType;
    }

    public void setFgacType(String fgacType) {
        this.fgacType = fgacType;
    }

    public DataWareHouseDTODwConfig withFgacConnStatus(FgacConnStatusEnum fgacConnStatus) {
        this.fgacConnStatus = fgacConnStatus;
        return this;
    }

    /**
     * 数据源连通性测试状态：   * UNKNOWN - 连通性未测试   * TESTING - 连通性测试中   * SUCCESS - 连通性测试成功   * FAILED - 连通性测试失败
     * @return fgacConnStatus
     */
    public FgacConnStatusEnum getFgacConnStatus() {
        return fgacConnStatus;
    }

    public void setFgacConnStatus(FgacConnStatusEnum fgacConnStatus) {
        this.fgacConnStatus = fgacConnStatus;
    }

    public DataWareHouseDTODwConfig withFgacConnTestTime(Long fgacConnTestTime) {
        this.fgacConnTestTime = fgacConnTestTime;
        return this;
    }

    /**
     * 最近一次连通性测试时间
     * minimum: 0
     * maximum: 4070880010000
     * @return fgacConnTestTime
     */
    public Long getFgacConnTestTime() {
        return fgacConnTestTime;
    }

    public void setFgacConnTestTime(Long fgacConnTestTime) {
        this.fgacConnTestTime = fgacConnTestTime;
    }

    public DataWareHouseDTODwConfig withFgacConnTestError(String fgacConnTestError) {
        this.fgacConnTestError = fgacConnTestError;
        return this;
    }

    /**
     * 联通性测试失败信息，如果连通性测试成功或者未测试联通性，失败信息为空字符串
     * @return fgacConnTestError
     */
    public String getFgacConnTestError() {
        return fgacConnTestError;
    }

    public void setFgacConnTestError(String fgacConnTestError) {
        this.fgacConnTestError = fgacConnTestError;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataWareHouseDTODwConfig that = (DataWareHouseDTODwConfig) obj;
        return Objects.equals(this.fgacFlag, that.fgacFlag) && Objects.equals(this.fgacType, that.fgacType)
            && Objects.equals(this.fgacConnStatus, that.fgacConnStatus)
            && Objects.equals(this.fgacConnTestTime, that.fgacConnTestTime)
            && Objects.equals(this.fgacConnTestError, that.fgacConnTestError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fgacFlag, fgacType, fgacConnStatus, fgacConnTestTime, fgacConnTestError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataWareHouseDTODwConfig {\n");
        sb.append("    fgacFlag: ").append(toIndentedString(fgacFlag)).append("\n");
        sb.append("    fgacType: ").append(toIndentedString(fgacType)).append("\n");
        sb.append("    fgacConnStatus: ").append(toIndentedString(fgacConnStatus)).append("\n");
        sb.append("    fgacConnTestTime: ").append(toIndentedString(fgacConnTestTime)).append("\n");
        sb.append("    fgacConnTestError: ").append(toIndentedString(fgacConnTestError)).append("\n");
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
