package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserAuth
 */
public class UserAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * 用户权限，7表示管理权限，3表示编辑权限，1表示读取权限
     */
    public static final class AuthEnum {

        /**
         * Enum NUMBER_7 for value: 7L
         */
        public static final AuthEnum NUMBER_7 = new AuthEnum(7L);

        /**
         * Enum NUMBER_3 for value: 3L
         */
        public static final AuthEnum NUMBER_3 = new AuthEnum(3L);

        /**
         * Enum NUMBER_1 for value: 1L
         */
        public static final AuthEnum NUMBER_1 = new AuthEnum(1L);

        private static final Map<Long, AuthEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, AuthEnum> createStaticFields() {
            Map<Long, AuthEnum> map = new HashMap<>();
            map.put(7L, NUMBER_7);
            map.put(3L, NUMBER_3);
            map.put(1L, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        AuthEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthEnum(value));
        }

        public static AuthEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthEnum) {
                return this.value.equals(((AuthEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private AuthEnum auth;

    public UserAuth withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id，需要从IAM服务获取
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserAuth withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名，需要从IAM服务获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserAuth withAuth(AuthEnum auth) {
        this.auth = auth;
        return this;
    }

    /**
     * 用户权限，7表示管理权限，3表示编辑权限，1表示读取权限
     * @return auth
     */
    public AuthEnum getAuth() {
        return auth;
    }

    public void setAuth(AuthEnum auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAuth that = (UserAuth) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.auth, that.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuth {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
