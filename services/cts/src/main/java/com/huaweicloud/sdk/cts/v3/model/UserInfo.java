package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户信息。
 */
public class UserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private BaseUser domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_urn")

    private String principalUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_id")

    private String principalId;

    /**
     * 是否是根用户。 - 值为“true”时，表示操作者是根用户。 - 值为“false”时，表示操作者是委托会话身份、联邦身份或非根用户的 IAM 用户。
     */
    public static final class PrincipalIsRootUserEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final PrincipalIsRootUserEnum TRUE = new PrincipalIsRootUserEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final PrincipalIsRootUserEnum FALSE = new PrincipalIsRootUserEnum("false");

        private static final Map<String, PrincipalIsRootUserEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalIsRootUserEnum> createStaticFields() {
            Map<String, PrincipalIsRootUserEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalIsRootUserEnum(String value) {
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
        public static PrincipalIsRootUserEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrincipalIsRootUserEnum(value));
        }

        public static PrincipalIsRootUserEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalIsRootUserEnum) {
                return this.value.equals(((PrincipalIsRootUserEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_is_root_user")

    private PrincipalIsRootUserEnum principalIsRootUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoked_by")

    private List<String> invokedBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private SessionContext sessionContext;

    public UserInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID，参见《云审计服务API参考》“获取账号ID和项目ID”章节。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfo withDomain(BaseUser domain) {
        this.domain = domain;
        return this;
    }

    public UserInfo withDomain(Consumer<BaseUser> domainSetter) {
        if (this.domain == null) {
            this.domain = new BaseUser();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public BaseUser getDomain() {
        return domain;
    }

    public void setDomain(BaseUser domain) {
        this.domain = domain;
    }

    public UserInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账号ID，参见《云审计服务API参考》“获取账号ID和项目ID”章节。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public UserInfo withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 访问密钥ID。
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public UserInfo withPrincipalUrn(String principalUrn) {
        this.principalUrn = principalUrn;
        return this;
    }

    /**
     * 操作用户身份的 URN。 如果是 IAM 用户身份，格式如 iam::<account-id>:user:<user-name>。 如果是 IAM 委托会话 身份，格式如 sts::<account-id>:assumed-agency:<agency-name>/<agency-session-name>。 如果是 IAM 联邦身份，格式如 sts::<account-id>:external-user:<idp_id>/<user-session-name>。
     * @return principalUrn
     */
    public String getPrincipalUrn() {
        return principalUrn;
    }

    public void setPrincipalUrn(String principalUrn) {
        this.principalUrn = principalUrn;
    }

    public UserInfo withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * 操作用户身份Id。 - 如果是 IAM 用户身份，格式为 <user-id>。 - 如果是 IAM 委托会话身份，格式为 <agency-id>:<agency-session-name>。 - 如果是 IAM 联邦身份，格式为 <idp_id>:<user-session-name>
     * @return principalId
     */
    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public UserInfo withPrincipalIsRootUser(PrincipalIsRootUserEnum principalIsRootUser) {
        this.principalIsRootUser = principalIsRootUser;
        return this;
    }

    /**
     * 是否是根用户。 - 值为“true”时，表示操作者是根用户。 - 值为“false”时，表示操作者是委托会话身份、联邦身份或非根用户的 IAM 用户。
     * @return principalIsRootUser
     */
    public PrincipalIsRootUserEnum getPrincipalIsRootUser() {
        return principalIsRootUser;
    }

    public void setPrincipalIsRootUser(PrincipalIsRootUserEnum principalIsRootUser) {
        this.principalIsRootUser = principalIsRootUser;
    }

    public UserInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 操作者身份类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserInfo withInvokedBy(List<String> invokedBy) {
        this.invokedBy = invokedBy;
        return this;
    }

    public UserInfo addInvokedByItem(String invokedByItem) {
        if (this.invokedBy == null) {
            this.invokedBy = new ArrayList<>();
        }
        this.invokedBy.add(invokedByItem);
        return this;
    }

    public UserInfo withInvokedBy(Consumer<List<String>> invokedBySetter) {
        if (this.invokedBy == null) {
            this.invokedBy = new ArrayList<>();
        }
        invokedBySetter.accept(this.invokedBy);
        return this;
    }

    /**
     * 发出请求的服务的名称。控制台操作时为[\"service.console\" ]
     * @return invokedBy
     */
    public List<String> getInvokedBy() {
        return invokedBy;
    }

    public void setInvokedBy(List<String> invokedBy) {
        this.invokedBy = invokedBy;
    }

    public UserInfo withSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    public UserInfo withSessionContext(Consumer<SessionContext> sessionContextSetter) {
        if (this.sessionContext == null) {
            this.sessionContext = new SessionContext();
            sessionContextSetter.accept(this.sessionContext);
        }

        return this;
    }

    /**
     * Get sessionContext
     * @return sessionContext
     */
    public SessionContext getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserInfo that = (UserInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.principalUrn, that.principalUrn)
            && Objects.equals(this.principalId, that.principalId)
            && Objects.equals(this.principalIsRootUser, that.principalIsRootUser)
            && Objects.equals(this.type, that.type) && Objects.equals(this.invokedBy, that.invokedBy)
            && Objects.equals(this.sessionContext, that.sessionContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            userName,
            domain,
            accountId,
            accessKeyId,
            principalUrn,
            principalId,
            principalIsRootUser,
            type,
            invokedBy,
            sessionContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    principalUrn: ").append(toIndentedString(principalUrn)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
        sb.append("    principalIsRootUser: ").append(toIndentedString(principalIsRootUser)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    invokedBy: ").append(toIndentedString(invokedBy)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
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
