package com.huaweicloud.sdk.live.v1.model;

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
public class ListIpAuthListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /**
     * 鉴权类型。 包含如下取值： - WHITE：IP白名单鉴权。 - BLACK：IP黑名单鉴权。 - NONE：不鉴权。 
     */
    public static final class AuthTypeEnum {

        /**
         * Enum WHITE for value: "WHITE"
         */
        public static final AuthTypeEnum WHITE = new AuthTypeEnum("WHITE");

        /**
         * Enum BLACK for value: "BLACK"
         */
        public static final AuthTypeEnum BLACK = new AuthTypeEnum("BLACK");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("WHITE", WHITE);
            map.put("BLACK", BLACK);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_auth_list")

    private String ipAuthList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListIpAuthListResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名或播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListIpAuthListResponse withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 鉴权类型。 包含如下取值： - WHITE：IP白名单鉴权。 - BLACK：IP黑名单鉴权。 - NONE：不鉴权。 
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public ListIpAuthListResponse withIpAuthList(String ipAuthList) {
        this.ipAuthList = ipAuthList;
        return this;
    }

    /**
     * IP黑名单列表，IP之间用;分隔，如192.168.0.0;192.168.0.8，最多支持配置100个IP。支持IP网段添加，例如127.0.0.1/24表示采用子网掩码中的前24位为有效位，即用32-24=8bit来表示主机号，该子网可以容纳2^8 - 2 = 254 台主机。故127.0.0.1/24 表示IP网段范围是：127.0.0.1~127.0.0.255
     * @return ipAuthList
     */
    public String getIpAuthList() {
        return ipAuthList;
    }

    public void setIpAuthList(String ipAuthList) {
        this.ipAuthList = ipAuthList;
    }

    public ListIpAuthListResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIpAuthListResponse that = (ListIpAuthListResponse) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.ipAuthList, that.ipAuthList) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, authType, ipAuthList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpAuthListResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    ipAuthList: ").append(toIndentedString(ipAuthList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
