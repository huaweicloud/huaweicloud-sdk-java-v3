package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowMessageDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 申请状态
     */
    public static final class ApiApplyStatusEnum {

        /**
         * Enum STATUS_TYPE_PENDING_APPROVAL for value: "STATUS_TYPE_PENDING_APPROVAL"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_PENDING_APPROVAL =
            new ApiApplyStatusEnum("STATUS_TYPE_PENDING_APPROVAL");

        /**
         * Enum STATUS_TYPE_REJECTED for value: "STATUS_TYPE_REJECTED"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_REJECTED = new ApiApplyStatusEnum("STATUS_TYPE_REJECTED");

        /**
         * Enum STATUS_TYPE_PENDING_CHECK for value: "STATUS_TYPE_PENDING_CHECK"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_PENDING_CHECK =
            new ApiApplyStatusEnum("STATUS_TYPE_PENDING_CHECK");

        /**
         * Enum STATUS_TYPE_PENDING_EXECUTE for value: "STATUS_TYPE_PENDING_EXECUTE"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_PENDING_EXECUTE =
            new ApiApplyStatusEnum("STATUS_TYPE_PENDING_EXECUTE");

        /**
         * Enum STATUS_TYPE_SYNCHRONOUS_EXECUTE for value: "STATUS_TYPE_SYNCHRONOUS_EXECUTE"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_SYNCHRONOUS_EXECUTE =
            new ApiApplyStatusEnum("STATUS_TYPE_SYNCHRONOUS_EXECUTE");

        /**
         * Enum STATUS_TYPE_FORCED_CANCEL for value: "STATUS_TYPE_FORCED_CANCEL"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_FORCED_CANCEL =
            new ApiApplyStatusEnum("STATUS_TYPE_FORCED_CANCEL");

        /**
         * Enum STATUS_TYPE_PASSED for value: "STATUS_TYPE_PASSED"
         */
        public static final ApiApplyStatusEnum STATUS_TYPE_PASSED = new ApiApplyStatusEnum("STATUS_TYPE_PASSED");

        private static final Map<String, ApiApplyStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiApplyStatusEnum> createStaticFields() {
            Map<String, ApiApplyStatusEnum> map = new HashMap<>();
            map.put("STATUS_TYPE_PENDING_APPROVAL", STATUS_TYPE_PENDING_APPROVAL);
            map.put("STATUS_TYPE_REJECTED", STATUS_TYPE_REJECTED);
            map.put("STATUS_TYPE_PENDING_CHECK", STATUS_TYPE_PENDING_CHECK);
            map.put("STATUS_TYPE_PENDING_EXECUTE", STATUS_TYPE_PENDING_EXECUTE);
            map.put("STATUS_TYPE_SYNCHRONOUS_EXECUTE", STATUS_TYPE_SYNCHRONOUS_EXECUTE);
            map.put("STATUS_TYPE_FORCED_CANCEL", STATUS_TYPE_FORCED_CANCEL);
            map.put("STATUS_TYPE_PASSED", STATUS_TYPE_PASSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiApplyStatusEnum(String value) {
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
        public static ApiApplyStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiApplyStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiApplyStatusEnum(value);
            }
            return result;
        }

        public static ApiApplyStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiApplyStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiApplyStatusEnum) {
                return this.value.equals(((ApiApplyStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_apply_status")

    private ApiApplyStatusEnum apiApplyStatus;

    /**
     * 申请类型
     */
    public static final class ApiApplyTypeEnum {

        /**
         * Enum APPLY_TYPE_PUBLISH for value: "APPLY_TYPE_PUBLISH"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_PUBLISH = new ApiApplyTypeEnum("APPLY_TYPE_PUBLISH");

        /**
         * Enum APPLY_TYPE_AUTHORIZE for value: "APPLY_TYPE_AUTHORIZE"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_AUTHORIZE = new ApiApplyTypeEnum("APPLY_TYPE_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_APPLY for value: "APPLY_TYPE_APPLY"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_APPLY = new ApiApplyTypeEnum("APPLY_TYPE_APPLY");

        /**
         * Enum APPLY_TYPE_RENEW for value: "APPLY_TYPE_RENEW"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_RENEW = new ApiApplyTypeEnum("APPLY_TYPE_RENEW");

        /**
         * Enum APPLY_TYPE_STOP for value: "APPLY_TYPE_STOP"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_STOP = new ApiApplyTypeEnum("APPLY_TYPE_STOP");

        /**
         * Enum APPLY_TYPE_RECOVER for value: "APPLY_TYPE_RECOVER"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_RECOVER = new ApiApplyTypeEnum("APPLY_TYPE_RECOVER");

        /**
         * Enum APPLY_TYPE_API_CANCEL_AUTHORIZE for value: "APPLY_TYPE_API_CANCEL_AUTHORIZE"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_API_CANCEL_AUTHORIZE =
            new ApiApplyTypeEnum("APPLY_TYPE_API_CANCEL_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_APP_CANCEL_AUTHORIZE for value: "APPLY_TYPE_APP_CANCEL_AUTHORIZE"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_APP_CANCEL_AUTHORIZE =
            new ApiApplyTypeEnum("APPLY_TYPE_APP_CANCEL_AUTHORIZE");

        /**
         * Enum APPLY_TYPE_OFFLINE for value: "APPLY_TYPE_OFFLINE"
         */
        public static final ApiApplyTypeEnum APPLY_TYPE_OFFLINE = new ApiApplyTypeEnum("APPLY_TYPE_OFFLINE");

        private static final Map<String, ApiApplyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiApplyTypeEnum> createStaticFields() {
            Map<String, ApiApplyTypeEnum> map = new HashMap<>();
            map.put("APPLY_TYPE_PUBLISH", APPLY_TYPE_PUBLISH);
            map.put("APPLY_TYPE_AUTHORIZE", APPLY_TYPE_AUTHORIZE);
            map.put("APPLY_TYPE_APPLY", APPLY_TYPE_APPLY);
            map.put("APPLY_TYPE_RENEW", APPLY_TYPE_RENEW);
            map.put("APPLY_TYPE_STOP", APPLY_TYPE_STOP);
            map.put("APPLY_TYPE_RECOVER", APPLY_TYPE_RECOVER);
            map.put("APPLY_TYPE_API_CANCEL_AUTHORIZE", APPLY_TYPE_API_CANCEL_AUTHORIZE);
            map.put("APPLY_TYPE_APP_CANCEL_AUTHORIZE", APPLY_TYPE_APP_CANCEL_AUTHORIZE);
            map.put("APPLY_TYPE_OFFLINE", APPLY_TYPE_OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiApplyTypeEnum(String value) {
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
        public static ApiApplyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiApplyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiApplyTypeEnum(value);
            }
            return result;
        }

        public static ApiApplyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiApplyTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiApplyTypeEnum) {
                return this.value.equals(((ApiApplyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_apply_type")

    private ApiApplyTypeEnum apiApplyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_using_time")

    private Long apiUsingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private Long applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private Long approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_name")

    private String approverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public ShowMessageDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 申请编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowMessageDetailResponse withApiApplyStatus(ApiApplyStatusEnum apiApplyStatus) {
        this.apiApplyStatus = apiApplyStatus;
        return this;
    }

    /**
     * 申请状态
     * @return apiApplyStatus
     */
    public ApiApplyStatusEnum getApiApplyStatus() {
        return apiApplyStatus;
    }

    public void setApiApplyStatus(ApiApplyStatusEnum apiApplyStatus) {
        this.apiApplyStatus = apiApplyStatus;
    }

    public ShowMessageDetailResponse withApiApplyType(ApiApplyTypeEnum apiApplyType) {
        this.apiApplyType = apiApplyType;
        return this;
    }

    /**
     * 申请类型
     * @return apiApplyType
     */
    public ApiApplyTypeEnum getApiApplyType() {
        return apiApplyType;
    }

    public void setApiApplyType(ApiApplyTypeEnum apiApplyType) {
        this.apiApplyType = apiApplyType;
    }

    public ShowMessageDetailResponse withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * api编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ShowMessageDetailResponse withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * api名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ShowMessageDetailResponse withApiUsingTime(Long apiUsingTime) {
        this.apiUsingTime = apiUsingTime;
        return this;
    }

    /**
     * 使用截止时间
     * @return apiUsingTime
     */
    public Long getApiUsingTime() {
        return apiUsingTime;
    }

    public void setApiUsingTime(Long apiUsingTime) {
        this.apiUsingTime = apiUsingTime;
    }

    public ShowMessageDetailResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * app编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowMessageDetailResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * app名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowMessageDetailResponse withApplyTime(Long applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 申请时间
     * @return applyTime
     */
    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    public ShowMessageDetailResponse withApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 授权时间
     * @return approvalTime
     */
    public Long getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ShowMessageDetailResponse withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审核人名称
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public ShowMessageDetailResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 审核评论
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ShowMessageDetailResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 申请人姓名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessageDetailResponse showMessageDetailResponse = (ShowMessageDetailResponse) o;
        return Objects.equals(this.id, showMessageDetailResponse.id)
            && Objects.equals(this.apiApplyStatus, showMessageDetailResponse.apiApplyStatus)
            && Objects.equals(this.apiApplyType, showMessageDetailResponse.apiApplyType)
            && Objects.equals(this.apiId, showMessageDetailResponse.apiId)
            && Objects.equals(this.apiName, showMessageDetailResponse.apiName)
            && Objects.equals(this.apiUsingTime, showMessageDetailResponse.apiUsingTime)
            && Objects.equals(this.appId, showMessageDetailResponse.appId)
            && Objects.equals(this.appName, showMessageDetailResponse.appName)
            && Objects.equals(this.applyTime, showMessageDetailResponse.applyTime)
            && Objects.equals(this.approvalTime, showMessageDetailResponse.approvalTime)
            && Objects.equals(this.approverName, showMessageDetailResponse.approverName)
            && Objects.equals(this.comment, showMessageDetailResponse.comment)
            && Objects.equals(this.userName, showMessageDetailResponse.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            apiApplyStatus,
            apiApplyType,
            apiId,
            apiName,
            apiUsingTime,
            appId,
            appName,
            applyTime,
            approvalTime,
            approverName,
            comment,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessageDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiApplyStatus: ").append(toIndentedString(apiApplyStatus)).append("\n");
        sb.append("    apiApplyType: ").append(toIndentedString(apiApplyType)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    apiUsingTime: ").append(toIndentedString(apiUsingTime)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
