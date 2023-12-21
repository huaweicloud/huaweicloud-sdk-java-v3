package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowOmUrlResponse extends SdkResponse {

    /**
     * 链接获取状态     # SUCCESS(0): 成功；非SUCCESS状态都认为获取失败，需要展示错误代码及description     # IAM_USER_CONFLICT(1016): IAM用户冲突；     # HOST_NOT_MANAGE(1): 查询主机未被纳管；     # HOST_ACCOUNT_NOT_EXIST(553): 主机账户不可用；     # IAM_USER_NO_PERMISSION(901): IAM用户无运维该主机权限；     # CUR_VERSION_NOT_SUPPORT_OPERATION(9001):当前服务版本不支持;     # INS_WHITE_LIST_INITIALIZING(9002):实例白名单正在初始化，请稍后重试;     # UNKNOWN_ERROR(9003):未知错误;
     */
    public static final class StateEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");

        /**
         * Enum IAM_USER_CONFLICT for value: "IAM_USER_CONFLICT"
         */
        public static final StateEnum IAM_USER_CONFLICT = new StateEnum("IAM_USER_CONFLICT");

        /**
         * Enum HOST_NOT_MANAGE for value: "HOST_NOT_MANAGE"
         */
        public static final StateEnum HOST_NOT_MANAGE = new StateEnum("HOST_NOT_MANAGE");

        /**
         * Enum HOST_ACCOUNT_NOT_EXIST for value: "HOST_ACCOUNT_NOT_EXIST"
         */
        public static final StateEnum HOST_ACCOUNT_NOT_EXIST = new StateEnum("HOST_ACCOUNT_NOT_EXIST");

        /**
         * Enum IAM_USER_NO_PERMISSION for value: "IAM_USER_NO_PERMISSION"
         */
        public static final StateEnum IAM_USER_NO_PERMISSION = new StateEnum("IAM_USER_NO_PERMISSION");

        /**
         * Enum CUR_VERSION_NOT_SUPPORT_OPERATION for value: "CUR_VERSION_NOT_SUPPORT_OPERATION"
         */
        public static final StateEnum CUR_VERSION_NOT_SUPPORT_OPERATION =
            new StateEnum("CUR_VERSION_NOT_SUPPORT_OPERATION");

        /**
         * Enum INS_WHITE_LIST_INITIALIZING for value: "INS_WHITE_LIST_INITIALIZING"
         */
        public static final StateEnum INS_WHITE_LIST_INITIALIZING = new StateEnum("INS_WHITE_LIST_INITIALIZING");

        /**
         * Enum UNKNOWN_ERROR for value: "UNKNOWN_ERROR"
         */
        public static final StateEnum UNKNOWN_ERROR = new StateEnum("UNKNOWN_ERROR");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("IAM_USER_CONFLICT", IAM_USER_CONFLICT);
            map.put("HOST_NOT_MANAGE", HOST_NOT_MANAGE);
            map.put("HOST_ACCOUNT_NOT_EXIST", HOST_ACCOUNT_NOT_EXIST);
            map.put("IAM_USER_NO_PERMISSION", IAM_USER_NO_PERMISSION);
            map.put("CUR_VERSION_NOT_SUPPORT_OPERATION", CUR_VERSION_NOT_SUPPORT_OPERATION);
            map.put("INS_WHITE_LIST_INITIALIZING", INS_WHITE_LIST_INITIALIZING);
            map.put("UNKNOWN_ERROR", UNKNOWN_ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_url")

    private String loginUrl;

    public ShowOmUrlResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 链接获取状态     # SUCCESS(0): 成功；非SUCCESS状态都认为获取失败，需要展示错误代码及description     # IAM_USER_CONFLICT(1016): IAM用户冲突；     # HOST_NOT_MANAGE(1): 查询主机未被纳管；     # HOST_ACCOUNT_NOT_EXIST(553): 主机账户不可用；     # IAM_USER_NO_PERMISSION(901): IAM用户无运维该主机权限；     # CUR_VERSION_NOT_SUPPORT_OPERATION(9001):当前服务版本不支持;     # INS_WHITE_LIST_INITIALIZING(9002):实例白名单正在初始化，请稍后重试;     # UNKNOWN_ERROR(9003):未知错误;
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowOmUrlResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 链接获取异常时说明提示
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowOmUrlResponse withLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * ECS运维登录地址
     * @return loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOmUrlResponse that = (ShowOmUrlResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.description, that.description)
            && Objects.equals(this.loginUrl, that.loginUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, description, loginUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOmUrlResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
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
