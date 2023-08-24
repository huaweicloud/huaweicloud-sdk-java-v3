package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListAimMsgSignatureDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    private String signatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_id")

    private String signatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private String signatureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_desc")

    private String applyDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_num")

    private String channelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    /**
     * 状态。
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING_REVIEW_ for value: "PENDING_REVIEW：待审核"
         */
        public static final StatusEnum PENDING_REVIEW_ = new StatusEnum("PENDING_REVIEW：待审核");

        /**
         * Enum PROCESSING_ for value: "PROCESSING：内容审核通过签名在处理中"
         */
        public static final StatusEnum PROCESSING_ = new StatusEnum("PROCESSING：内容审核通过签名在处理中");

        /**
         * Enum REVIEW_PASSED_ for value: "REVIEW_PASSED：处理完毕"
         */
        public static final StatusEnum REVIEW_PASSED_ = new StatusEnum("REVIEW_PASSED：处理完毕");

        /**
         * Enum REVIEW_NOT_PASS_ for value: "REVIEW_NOT_PASS：审核不通过"
         */
        public static final StatusEnum REVIEW_NOT_PASS_ = new StatusEnum("REVIEW_NOT_PASS：审核不通过");

        /**
         * Enum TO_BE_ACTIVATED_ for value: "TO_BE_ACTIVATED：待激活"
         */
        public static final StatusEnum TO_BE_ACTIVATED_ = new StatusEnum("TO_BE_ACTIVATED：待激活");

        /**
         * Enum PENDING_ACTIVATE_ for value: "PENDING_ACTIVATE：激活审核中"
         */
        public static final StatusEnum PENDING_ACTIVATE_ = new StatusEnum("PENDING_ACTIVATE：激活审核中");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_REVIEW：待审核", PENDING_REVIEW_);
            map.put("PROCESSING：内容审核通过签名在处理中", PROCESSING_);
            map.put("REVIEW_PASSED：处理完毕", REVIEW_PASSED_);
            map.put("REVIEW_NOT_PASS：审核不通过", REVIEW_NOT_PASS_);
            map.put("TO_BE_ACTIVATED：待激活", TO_BE_ACTIVATED_);
            map.put("PENDING_ACTIVATE：激活审核中", PENDING_ACTIVATE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_source")

    private Integer signatureSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_involved_third")

    private String isInvolvedThird;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_attorney_file_id")

    private String powerAttorneyFileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_status")

    private String urgeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_time")

    private String urgeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_desc")

    private String urgeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_desc")

    private String reviewDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_title_content")

    private String sourceTitleContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ListAimMsgSignatureDetailResponse withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称。
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public ListAimMsgSignatureDetailResponse withSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * 签名ID。
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public ListAimMsgSignatureDetailResponse withSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名类型。
     * @return signatureType
     */
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public ListAimMsgSignatureDetailResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListAimMsgSignatureDetailResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListAimMsgSignatureDetailResponse withApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
        return this;
    }

    /**
     * 申请说明。
     * @return applyDesc
     */
    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public ListAimMsgSignatureDetailResponse withChannelNum(String channelNum) {
        this.channelNum = channelNum;
        return this;
    }

    /**
     * 国内短信通道号，仅当签名审核成功，运营人员配置完成后返回。
     * @return channelNum
     */
    public String getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(String channelNum) {
        this.channelNum = channelNum;
    }

    public ListAimMsgSignatureDetailResponse withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 营业执照文件ID。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ListAimMsgSignatureDetailResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListAimMsgSignatureDetailResponse withSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
        return this;
    }

    /**
     * 签名来源。
     * minimum: 0
     * maximum: 20
     * @return signatureSource
     */
    public Integer getSignatureSource() {
        return signatureSource;
    }

    public void setSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
    }

    public ListAimMsgSignatureDetailResponse withIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
        return this;
    }

    /**
     * 是否涉及第三方权益。
     * @return isInvolvedThird
     */
    public String getIsInvolvedThird() {
        return isInvolvedThird;
    }

    public void setIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
    }

    public ListAimMsgSignatureDetailResponse withPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
        return this;
    }

    /**
     * 授权委托书文件ID。
     * @return powerAttorneyFileId
     */
    public String getPowerAttorneyFileId() {
        return powerAttorneyFileId;
    }

    public void setPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
    }

    public ListAimMsgSignatureDetailResponse withUrgeStatus(String urgeStatus) {
        this.urgeStatus = urgeStatus;
        return this;
    }

    /**
     * 催审状态。
     * @return urgeStatus
     */
    public String getUrgeStatus() {
        return urgeStatus;
    }

    public void setUrgeStatus(String urgeStatus) {
        this.urgeStatus = urgeStatus;
    }

    public ListAimMsgSignatureDetailResponse withUrgeTime(String urgeTime) {
        this.urgeTime = urgeTime;
        return this;
    }

    /**
     * 催审时间。
     * @return urgeTime
     */
    public String getUrgeTime() {
        return urgeTime;
    }

    public void setUrgeTime(String urgeTime) {
        this.urgeTime = urgeTime;
    }

    public ListAimMsgSignatureDetailResponse withUrgeDesc(String urgeDesc) {
        this.urgeDesc = urgeDesc;
        return this;
    }

    /**
     * 催审描述。
     * @return urgeDesc
     */
    public String getUrgeDesc() {
        return urgeDesc;
    }

    public void setUrgeDesc(String urgeDesc) {
        this.urgeDesc = urgeDesc;
    }

    public ListAimMsgSignatureDetailResponse withReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
        return this;
    }

    /**
     * 审核意见。
     * @return reviewDesc
     */
    public String getReviewDesc() {
        return reviewDesc;
    }

    public void setReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
    }

    public ListAimMsgSignatureDetailResponse withSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
        return this;
    }

    /**
     * 标题内容。
     * @return sourceTitleContent
     */
    public String getSourceTitleContent() {
        return sourceTitleContent;
    }

    public void setSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
    }

    public ListAimMsgSignatureDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAimMsgSignatureDetailResponse that = (ListAimMsgSignatureDetailResponse) obj;
        return Objects.equals(this.signatureName, that.signatureName)
            && Objects.equals(this.signatureId, that.signatureId)
            && Objects.equals(this.signatureType, that.signatureType) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.applyDesc, that.applyDesc)
            && Objects.equals(this.channelNum, that.channelNum) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.signatureSource, that.signatureSource)
            && Objects.equals(this.isInvolvedThird, that.isInvolvedThird)
            && Objects.equals(this.powerAttorneyFileId, that.powerAttorneyFileId)
            && Objects.equals(this.urgeStatus, that.urgeStatus) && Objects.equals(this.urgeTime, that.urgeTime)
            && Objects.equals(this.urgeDesc, that.urgeDesc) && Objects.equals(this.reviewDesc, that.reviewDesc)
            && Objects.equals(this.sourceTitleContent, that.sourceTitleContent)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureName,
            signatureId,
            signatureType,
            appName,
            appId,
            applyDesc,
            channelNum,
            fileId,
            status,
            signatureSource,
            isInvolvedThird,
            powerAttorneyFileId,
            urgeStatus,
            urgeTime,
            urgeDesc,
            reviewDesc,
            sourceTitleContent,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimMsgSignatureDetailResponse {\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    applyDesc: ").append(toIndentedString(applyDesc)).append("\n");
        sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    signatureSource: ").append(toIndentedString(signatureSource)).append("\n");
        sb.append("    isInvolvedThird: ").append(toIndentedString(isInvolvedThird)).append("\n");
        sb.append("    powerAttorneyFileId: ").append(toIndentedString(powerAttorneyFileId)).append("\n");
        sb.append("    urgeStatus: ").append(toIndentedString(urgeStatus)).append("\n");
        sb.append("    urgeTime: ").append(toIndentedString(urgeTime)).append("\n");
        sb.append("    urgeDesc: ").append(toIndentedString(urgeDesc)).append("\n");
        sb.append("    reviewDesc: ").append(toIndentedString(reviewDesc)).append("\n");
        sb.append("    sourceTitleContent: ").append(toIndentedString(sourceTitleContent)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
