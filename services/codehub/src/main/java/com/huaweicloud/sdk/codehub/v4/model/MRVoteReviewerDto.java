package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 合并请求检视用户详细信息
 */
public class MRVoteReviewerDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    /**
     * **参数解释：** 用户状态。 **取值范围：** - active: 可用账户。 - blocked: 被锁定用户。 - error: 未查询到该用户。
     */
    public static final class StateEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StateEnum ACTIVE = new StateEnum("active");

        /**
         * Enum BLOCKED for value: "blocked"
         */
        public static final StateEnum BLOCKED = new StateEnum("blocked");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StateEnum ERROR = new StateEnum("error");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("blocked", BLOCKED);
            map.put("error", ERROR);
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
    @JsonProperty(value = "service_license_status")

    private Integer serviceLicenseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_path")

    private String avatarPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_committer")

    private Boolean isCommitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_verified")

    private Boolean isVerified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_permission")

    private Boolean hasPermission;

    public MRVoteReviewerDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MRVoteReviewerDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MRVoteReviewerDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MRVoteReviewerDto withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 用户状态。 **取值范围：** - active: 可用账户。 - blocked: 被锁定用户。 - error: 未查询到该用户。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public MRVoteReviewerDto withServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
        return this;
    }

    /**
     * 服务级权限状态 0：停用 1：启用
     * @return serviceLicenseStatus
     */
    public Integer getServiceLicenseStatus() {
        return serviceLicenseStatus;
    }

    public void setServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
    }

    public MRVoteReviewerDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * 用户头像url
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public MRVoteReviewerDto withAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
        return this;
    }

    /**
     * 用户头像路径
     * @return avatarPath
     */
    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public MRVoteReviewerDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 用户邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MRVoteReviewerDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 用户中文名称
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public MRVoteReviewerDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 用户个人首页
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public MRVoteReviewerDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public MRVoteReviewerDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public MRVoteReviewerDto withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释：** 部分查询接口校验到传参里的用户权限不足或不存在时，返回该用户但该字段不为空用于提示。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public MRVoteReviewerDto withIsCommitter(Boolean isCommitter) {
        this.isCommitter = isCommitter;
        return this;
    }

    /**
     * **参数解释：** 是否为committer。
     * @return isCommitter
     */
    public Boolean getIsCommitter() {
        return isCommitter;
    }

    public void setIsCommitter(Boolean isCommitter) {
        this.isCommitter = isCommitter;
    }

    public MRVoteReviewerDto withIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * **参数解释：** 是否为认证committer。
     * @return isVerified
     */
    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public MRVoteReviewerDto withHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
        return this;
    }

    /**
     * **参数解释：** 是否有相关权限。
     * @return hasPermission
     */
    public Boolean getHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MRVoteReviewerDto that = (MRVoteReviewerDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.username, that.username) && Objects.equals(this.state, that.state)
            && Objects.equals(this.serviceLicenseStatus, that.serviceLicenseStatus)
            && Objects.equals(this.avatarUrl, that.avatarUrl) && Objects.equals(this.avatarPath, that.avatarPath)
            && Objects.equals(this.email, that.email) && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.isCommitter, that.isCommitter) && Objects.equals(this.isVerified, that.isVerified)
            && Objects.equals(this.hasPermission, that.hasPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            username,
            state,
            serviceLicenseStatus,
            avatarUrl,
            avatarPath,
            email,
            nameCn,
            webUrl,
            nickName,
            tenantName,
            errorMessage,
            isCommitter,
            isVerified,
            hasPermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MRVoteReviewerDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    serviceLicenseStatus: ").append(toIndentedString(serviceLicenseStatus)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    avatarPath: ").append(toIndentedString(avatarPath)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    isCommitter: ").append(toIndentedString(isCommitter)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    hasPermission: ").append(toIndentedString(hasPermission)).append("\n");
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
