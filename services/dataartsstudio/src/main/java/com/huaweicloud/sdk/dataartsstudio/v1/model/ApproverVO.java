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
 * ApproverVO
 */
public class ApproverVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_name")

    private String approverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    /**
     * 用户类型。 枚举值：   - BIZ_METRIC_OWNER: 业务指标责任人   - APPROVER: 审批人   - BIZ_METRIC_OWNER_AND_APPROVER: 业务指标责任人是审核人 
     */
    public static final class UserTypeEnum {

        /**
         * Enum BIZ_METRIC_OWNER for value: "BIZ_METRIC_OWNER"
         */
        public static final UserTypeEnum BIZ_METRIC_OWNER = new UserTypeEnum("BIZ_METRIC_OWNER");

        /**
         * Enum APPROVER for value: "APPROVER"
         */
        public static final UserTypeEnum APPROVER = new UserTypeEnum("APPROVER");

        /**
         * Enum BIZ_METRIC_OWNER_AND_APPROVER for value: "BIZ_METRIC_OWNER_AND_APPROVER"
         */
        public static final UserTypeEnum BIZ_METRIC_OWNER_AND_APPROVER =
            new UserTypeEnum("BIZ_METRIC_OWNER_AND_APPROVER");

        private static final Map<String, UserTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UserTypeEnum> createStaticFields() {
            Map<String, UserTypeEnum> map = new HashMap<>();
            map.put("BIZ_METRIC_OWNER", BIZ_METRIC_OWNER);
            map.put("APPROVER", APPROVER);
            map.put("BIZ_METRIC_OWNER_AND_APPROVER", BIZ_METRIC_OWNER_AND_APPROVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UserTypeEnum(String value) {
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
        public static UserTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UserTypeEnum(value));
        }

        public static UserTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UserTypeEnum) {
                return this.value.equals(((UserTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private UserTypeEnum userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ApproverVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 审批单ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApproverVO withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审批人姓名。
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public ApproverVO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 审批人ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApproverVO withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 审批人名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApproverVO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * email信息。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ApproverVO withUserType(UserTypeEnum userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 用户类型。 枚举值：   - BIZ_METRIC_OWNER: 业务指标责任人   - APPROVER: 审批人   - BIZ_METRIC_OWNER_AND_APPROVER: 业务指标责任人是审核人 
     * @return userType
     */
    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public ApproverVO withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * 电话号码。
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ApproverVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ApproverVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ApproverVO withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 业务系统名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ApproverVO withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * smn主题urn。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ApproverVO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApproverVO that = (ApproverVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.approverName, that.approverName)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.email, that.email) && Objects.equals(this.userType, that.userType)
            && Objects.equals(this.phoneNumber, that.phoneNumber) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            approverName,
            userId,
            userName,
            email,
            userType,
            phoneNumber,
            createBy,
            createTime,
            appName,
            topicUrn,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproverVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
