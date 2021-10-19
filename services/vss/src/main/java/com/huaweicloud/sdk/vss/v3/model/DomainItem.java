package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** DomainItem */
public class DomainItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high")

    private Integer high;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle")

    private Integer middle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low")

    private Integer low;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private Integer hint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_level_domain_id")

    private String topLevelDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /** 域名的认证状态: * unauth - 未认证 * auth - 已认证 * invalid - 认证文件无效 * manual - 人工认证 */
    public static final class AuthStatusEnum {

        /** Enum UNAUTH for value: "unauth" */
        public static final AuthStatusEnum UNAUTH = new AuthStatusEnum("unauth");

        /** Enum AUTH for value: "auth" */
        public static final AuthStatusEnum AUTH = new AuthStatusEnum("auth");

        /** Enum INVALID for value: "invalid" */
        public static final AuthStatusEnum INVALID = new AuthStatusEnum("invalid");

        /** Enum MANUAL for value: "manual" */
        public static final AuthStatusEnum MANUAL = new AuthStatusEnum("manual");

        private static final Map<String, AuthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthStatusEnum> createStaticFields() {
            Map<String, AuthStatusEnum> map = new HashMap<>();
            map.put("unauth", UNAUTH);
            map.put("auth", AUTH);
            map.put("invalid", INVALID);
            map.put("manual", MANUAL);
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
            AuthStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthStatusEnum(value);
            }
            return result;
        }

        public static AuthStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 协议类型: * http:// - HTTP * https:// - HTTPS */
    public static final class ProtocolTypeEnum {

        /** Enum HTTP_ for value: "http://" */
        public static final ProtocolTypeEnum HTTP_ = new ProtocolTypeEnum("http://");

        /** Enum HTTPS_ for value: "https://" */
        public static final ProtocolTypeEnum HTTPS_ = new ProtocolTypeEnum("https://");

        private static final Map<String, ProtocolTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolTypeEnum> createStaticFields() {
            Map<String, ProtocolTypeEnum> map = new HashMap<>();
            map.put("http://", HTTP_);
            map.put("https://", HTTPS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolTypeEnum(String value) {
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
        public static ProtocolTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolTypeEnum(value);
            }
            return result;
        }

        public static ProtocolTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolTypeEnum) {
                return this.value.equals(((ProtocolTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private ProtocolTypeEnum protocolType;

    public DomainItem withHigh(Integer high) {
        this.high = high;
        return this;
    }

    /** 高危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return high */
    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public DomainItem withMiddle(Integer middle) {
        this.middle = middle;
        return this;
    }

    /** 中危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return middle */
    public Integer getMiddle() {
        return middle;
    }

    public void setMiddle(Integer middle) {
        this.middle = middle;
    }

    public DomainItem withLow(Integer low) {
        this.low = low;
        return this;
    }

    /** 低危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return low */
    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public DomainItem withHint(Integer hint) {
        this.hint = hint;
        return this;
    }

    /** 提示危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return hint */
    public Integer getHint() {
        return hint;
    }

    public void setHint(Integer hint) {
        this.hint = hint;
    }

    public DomainItem withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 域名id
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DomainItem withTopLevelDomainId(String topLevelDomainId) {
        this.topLevelDomainId = topLevelDomainId;
        return this;
    }

    /** 一级域名id
     * 
     * @return topLevelDomainId */
    public String getTopLevelDomainId() {
        return topLevelDomainId;
    }

    public void setTopLevelDomainId(String topLevelDomainId) {
        this.topLevelDomainId = topLevelDomainId;
    }

    public DomainItem withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 域名
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainItem withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /** 域名的别名
     * 
     * @return alias */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DomainItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建域名资产的时间
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DomainItem withAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /** 域名的认证状态: * unauth - 未认证 * auth - 已认证 * invalid - 认证文件无效 * manual - 人工认证
     * 
     * @return authStatus */
    public AuthStatusEnum getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
    }

    public DomainItem withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /** 协议类型: * http:// - HTTP * https:// - HTTPS
     * 
     * @return protocolType */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainItem domainItem = (DomainItem) o;
        return Objects.equals(this.high, domainItem.high) && Objects.equals(this.middle, domainItem.middle)
            && Objects.equals(this.low, domainItem.low) && Objects.equals(this.hint, domainItem.hint)
            && Objects.equals(this.domainId, domainItem.domainId)
            && Objects.equals(this.topLevelDomainId, domainItem.topLevelDomainId)
            && Objects.equals(this.domainName, domainItem.domainName) && Objects.equals(this.alias, domainItem.alias)
            && Objects.equals(this.createTime, domainItem.createTime)
            && Objects.equals(this.authStatus, domainItem.authStatus)
            && Objects.equals(this.protocolType, domainItem.protocolType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(high,
            middle,
            low,
            hint,
            domainId,
            topLevelDomainId,
            domainName,
            alias,
            createTime,
            authStatus,
            protocolType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainItem {\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    topLevelDomainId: ").append(toIndentedString(topLevelDomainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
