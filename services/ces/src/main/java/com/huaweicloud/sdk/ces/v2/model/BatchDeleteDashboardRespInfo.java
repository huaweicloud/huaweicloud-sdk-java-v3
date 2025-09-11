package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchDeleteDashboardRespInfo
 */
public class BatchDeleteDashboardRespInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    /**
     * 处理结果, successful: 成功, error: 失败
     */
    public static final class RetStatusEnum {

        /**
         * Enum SUCCESSFUL for value: "successful"
         */
        public static final RetStatusEnum SUCCESSFUL = new RetStatusEnum("successful");

        /**
         * Enum ERROR for value: "error"
         */
        public static final RetStatusEnum ERROR = new RetStatusEnum("error");

        private static final Map<String, RetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RetStatusEnum> createStaticFields() {
            Map<String, RetStatusEnum> map = new HashMap<>();
            map.put("successful", SUCCESSFUL);
            map.put("error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RetStatusEnum(String value) {
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
        public static RetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RetStatusEnum(value));
        }

        public static RetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RetStatusEnum) {
                return this.value.equals(((RetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private RetStatusEnum retStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public BatchDeleteDashboardRespInfo withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * **参数描述**： 监控看板id **约束限制** 不涉及 **取值范围** 以db开头，包含22个字母和数字，长度为24个字符 **默认取值** 不涉及 
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public BatchDeleteDashboardRespInfo withRetStatus(RetStatusEnum retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * 处理结果, successful: 成功, error: 失败
     * @return retStatus
     */
    public RetStatusEnum getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(RetStatusEnum retStatus) {
        this.retStatus = retStatus;
    }

    public BatchDeleteDashboardRespInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
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
        BatchDeleteDashboardRespInfo that = (BatchDeleteDashboardRespInfo) obj;
        return Objects.equals(this.dashboardId, that.dashboardId) && Objects.equals(this.retStatus, that.retStatus)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardId, retStatus, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDashboardRespInfo {\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
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
