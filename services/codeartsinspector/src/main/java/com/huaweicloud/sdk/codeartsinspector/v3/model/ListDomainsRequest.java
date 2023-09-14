package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 网站域名的认证状态:   * unauth - 未认证   * auth - 已认证   * invalid - 认证文件无效   * manual - 人工认证   * skip - 免认证 
     */
    public static final class AuthStatusEnum {

        /**
         * Enum UNAUTH for value: "unauth"
         */
        public static final AuthStatusEnum UNAUTH = new AuthStatusEnum("unauth");

        /**
         * Enum AUTH for value: "auth"
         */
        public static final AuthStatusEnum AUTH = new AuthStatusEnum("auth");

        /**
         * Enum INVALID for value: "invalid"
         */
        public static final AuthStatusEnum INVALID = new AuthStatusEnum("invalid");

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final AuthStatusEnum MANUAL = new AuthStatusEnum("manual");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final AuthStatusEnum SKIP = new AuthStatusEnum("skip");

        private static final Map<String, AuthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthStatusEnum> createStaticFields() {
            Map<String, AuthStatusEnum> map = new HashMap<>();
            map.put("unauth", UNAUTH);
            map.put("auth", AUTH);
            map.put("invalid", INVALID);
            map.put("manual", MANUAL);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthStatusEnum(String value) {
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
        public static AuthStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthStatusEnum(value));
        }

        public static AuthStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthStatusEnum) {
                return this.value.equals(((AuthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_status")

    private AuthStatusEnum authStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListDomainsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 网站域名ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListDomainsRequest withAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * 网站域名的认证状态:   * unauth - 未认证   * auth - 已认证   * invalid - 认证文件无效   * manual - 人工认证   * skip - 免认证 
     * @return authStatus
     */
    public AuthStatusEnum getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
    }

    public ListDomainsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询，偏移量，表示从此偏移量开始查询
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDomainsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询，每页显示的条目数量
     * minimum: 1
     * maximum: 10000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainsRequest that = (ListDomainsRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.authStatus, that.authStatus)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, authStatus, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
