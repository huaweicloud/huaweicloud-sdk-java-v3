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
 * 服务目录API
 */
public class AdvancedMallApiDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 认证类型。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum APP for value: "APP"
         */
        public static final AuthTypeEnum APP = new AuthTypeEnum("APP");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("IAM", IAM);
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
    @JsonProperty(value = "application_num")

    private Integer applicationNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_num")

    private Integer callNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_owner")

    private Boolean isOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized")

    private Boolean isAuthorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_recently")

    private Boolean isUpdateRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_release_recently")

    private Boolean isReleaseRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_hot_recently")

    private Boolean isHotRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private String successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_rate")

    private String failureRate;

    public AdvancedMallApiDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AdvancedMallApiDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdvancedMallApiDTO withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public AdvancedMallApiDTO withApplicationNum(Integer applicationNum) {
        this.applicationNum = applicationNum;
        return this;
    }

    /**
     * 授权使用的应用数量。
     * @return applicationNum
     */
    public Integer getApplicationNum() {
        return applicationNum;
    }

    public void setApplicationNum(Integer applicationNum) {
        this.applicationNum = applicationNum;
    }

    public AdvancedMallApiDTO withCallNum(Integer callNum) {
        this.callNum = callNum;
        return this;
    }

    /**
     * 被调用量。
     * @return callNum
     */
    public Integer getCallNum() {
        return callNum;
    }

    public void setCallNum(Integer callNum) {
        this.callNum = callNum;
    }

    public AdvancedMallApiDTO withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 创建者。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AdvancedMallApiDTO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AdvancedMallApiDTO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AdvancedMallApiDTO withIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * 是否当前空间的API。
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public AdvancedMallApiDTO withIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    /**
     * 是否已被授权。
     * @return isAuthorized
     */
    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public AdvancedMallApiDTO withIsUpdateRecently(Boolean isUpdateRecently) {
        this.isUpdateRecently = isUpdateRecently;
        return this;
    }

    /**
     * 是否最近更新（三天内更新过该API）。
     * @return isUpdateRecently
     */
    public Boolean getIsUpdateRecently() {
        return isUpdateRecently;
    }

    public void setIsUpdateRecently(Boolean isUpdateRecently) {
        this.isUpdateRecently = isUpdateRecently;
    }

    public AdvancedMallApiDTO withIsReleaseRecently(Boolean isReleaseRecently) {
        this.isReleaseRecently = isReleaseRecently;
        return this;
    }

    /**
     * 是否新品上市（三天内新发布的API）。
     * @return isReleaseRecently
     */
    public Boolean getIsReleaseRecently() {
        return isReleaseRecently;
    }

    public void setIsReleaseRecently(Boolean isReleaseRecently) {
        this.isReleaseRecently = isReleaseRecently;
    }

    public AdvancedMallApiDTO withIsHotRecently(Boolean isHotRecently) {
        this.isHotRecently = isHotRecently;
        return this;
    }

    /**
     * 是否热销产品（三天内有其他空间用户申请该API）。
     * @return isHotRecently
     */
    public Boolean getIsHotRecently() {
        return isHotRecently;
    }

    public void setIsHotRecently(Boolean isHotRecently) {
        this.isHotRecently = isHotRecently;
    }

    public AdvancedMallApiDTO withSuccessRate(String successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 7天内调用成功率。
     * @return successRate
     */
    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public AdvancedMallApiDTO withFailureRate(String failureRate) {
        this.failureRate = failureRate;
        return this;
    }

    /**
     * 7天内调用失败率。
     * @return failureRate
     */
    public String getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(String failureRate) {
        this.failureRate = failureRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvancedMallApiDTO that = (AdvancedMallApiDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.applicationNum, that.applicationNum)
            && Objects.equals(this.callNum, that.callNum) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.isOwner, that.isOwner) && Objects.equals(this.isAuthorized, that.isAuthorized)
            && Objects.equals(this.isUpdateRecently, that.isUpdateRecently)
            && Objects.equals(this.isReleaseRecently, that.isReleaseRecently)
            && Objects.equals(this.isHotRecently, that.isHotRecently)
            && Objects.equals(this.successRate, that.successRate) && Objects.equals(this.failureRate, that.failureRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            authType,
            applicationNum,
            callNum,
            userName,
            createTime,
            updateTime,
            isOwner,
            isAuthorized,
            isUpdateRecently,
            isReleaseRecently,
            isHotRecently,
            successRate,
            failureRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedMallApiDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    applicationNum: ").append(toIndentedString(applicationNum)).append("\n");
        sb.append("    callNum: ").append(toIndentedString(callNum)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    isUpdateRecently: ").append(toIndentedString(isUpdateRecently)).append("\n");
        sb.append("    isReleaseRecently: ").append(toIndentedString(isReleaseRecently)).append("\n");
        sb.append("    isHotRecently: ").append(toIndentedString(isHotRecently)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    failureRate: ").append(toIndentedString(failureRate)).append("\n");
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
