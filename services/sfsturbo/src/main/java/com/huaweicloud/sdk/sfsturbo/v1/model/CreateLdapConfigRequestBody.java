package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ldap配置信息
 */
public class CreateLdapConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_dn")

    private String baseDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_dn")

    private String userDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_condition")

    private String filterCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_url")

    private String backupUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_timeout")

    private Integer searchTimeout;

    /**
     * 访问ldap服务器失败后是否允许使用本地用户鉴权
     */
    public static final class AllowLocalUserEnum {

        /**
         * Enum YES for value: "Yes"
         */
        public static final AllowLocalUserEnum YES = new AllowLocalUserEnum("Yes");

        /**
         * Enum NO for value: "No"
         */
        public static final AllowLocalUserEnum NO = new AllowLocalUserEnum("No");

        private static final Map<String, AllowLocalUserEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllowLocalUserEnum> createStaticFields() {
            Map<String, AllowLocalUserEnum> map = new HashMap<>();
            map.put("Yes", YES);
            map.put("No", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AllowLocalUserEnum(String value) {
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
        public static AllowLocalUserEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AllowLocalUserEnum(value));
        }

        public static AllowLocalUserEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AllowLocalUserEnum) {
                return this.value.equals(((AllowLocalUserEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_local_user")

    private AllowLocalUserEnum allowLocalUser;

    public CreateLdapConfigRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * ldap服务器的url，固定格式为 ldap://{ip_address}:{port_number} 或 ldaps://{ip_address}:{port_number}，例如ldap://192.168.xx.xx:60000
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateLdapConfigRequestBody withBaseDn(String baseDn) {
        this.baseDn = baseDn;
        return this;
    }

    /**
     * 数据库中的域
     * @return baseDn
     */
    public String getBaseDn() {
        return baseDn;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public CreateLdapConfigRequestBody withUserDn(String userDn) {
        this.userDn = userDn;
        return this;
    }

    /**
     * 用户区别名
     * @return userDn
     */
    public String getUserDn() {
        return userDn;
    }

    public void setUserDn(String userDn) {
        this.userDn = userDn;
    }

    public CreateLdapConfigRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * ldap认证密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateLdapConfigRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 一般不涉及。仅在SFSTurbo支持多VPC的场景下，需要指定LDAP服务器可连通的VPC的id。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateLdapConfigRequestBody withFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }

    /**
     * 过滤条件。保留字段，暂不支持
     * @return filterCondition
     */
    public String getFilterCondition() {
        return filterCondition;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public CreateLdapConfigRequestBody withBackupUrl(String backupUrl) {
        this.backupUrl = backupUrl;
        return this;
    }

    /**
     * ldap备节点的url，固定格式为 ldap://{ip_address}:{port_number} 或 ldaps://{ip_address}:{port_number}，例如ldap://192.168.xx.xx:60000
     * @return backupUrl
     */
    public String getBackupUrl() {
        return backupUrl;
    }

    public void setBackupUrl(String backupUrl) {
        this.backupUrl = backupUrl;
    }

    public CreateLdapConfigRequestBody withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * ldap的schema，不填写则默认为RFC2307
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public CreateLdapConfigRequestBody withSearchTimeout(Integer searchTimeout) {
        this.searchTimeout = searchTimeout;
        return this;
    }

    /**
     * ldap搜索的超时时间，单位为秒。不填写则默认为3秒
     * @return searchTimeout
     */
    public Integer getSearchTimeout() {
        return searchTimeout;
    }

    public void setSearchTimeout(Integer searchTimeout) {
        this.searchTimeout = searchTimeout;
    }

    public CreateLdapConfigRequestBody withAllowLocalUser(AllowLocalUserEnum allowLocalUser) {
        this.allowLocalUser = allowLocalUser;
        return this;
    }

    /**
     * 访问ldap服务器失败后是否允许使用本地用户鉴权
     * @return allowLocalUser
     */
    public AllowLocalUserEnum getAllowLocalUser() {
        return allowLocalUser;
    }

    public void setAllowLocalUser(AllowLocalUserEnum allowLocalUser) {
        this.allowLocalUser = allowLocalUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLdapConfigRequestBody that = (CreateLdapConfigRequestBody) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.baseDn, that.baseDn)
            && Objects.equals(this.userDn, that.userDn) && Objects.equals(this.password, that.password)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.filterCondition, that.filterCondition)
            && Objects.equals(this.backupUrl, that.backupUrl) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.searchTimeout, that.searchTimeout)
            && Objects.equals(this.allowLocalUser, that.allowLocalUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            baseDn,
            userDn,
            password,
            vpcId,
            filterCondition,
            backupUrl,
            schema,
            searchTimeout,
            allowLocalUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLdapConfigRequestBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
        sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    filterCondition: ").append(toIndentedString(filterCondition)).append("\n");
        sb.append("    backupUrl: ").append(toIndentedString(backupUrl)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    searchTimeout: ").append(toIndentedString(searchTimeout)).append("\n");
        sb.append("    allowLocalUser: ").append(toIndentedString(allowLocalUser)).append("\n");
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
