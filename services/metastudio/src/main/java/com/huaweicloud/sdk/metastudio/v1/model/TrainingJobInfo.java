package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务信息
 */
public class TrainingJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobType jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_user_id")

    private String appUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_name")

    private String voiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private JobState state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reject_times")

    private Integer rejectTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_failed_code")

    private String jobFailedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_failed_reason")

    private String jobFailedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastupdate_time")

    private Long lastupdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_authorization_url")

    private String voiceAuthorizationUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_type")

    private CreateType createType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private JobTag tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    public TrainingJobInfo withJobType(JobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public TrainingJobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TrainingJobInfo withAppUserId(String appUserId) {
        this.appUserId = appUserId;
        return this;
    }

    /**
     * 用户id。
     * @return appUserId
     */
    public String getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(String appUserId) {
        this.appUserId = appUserId;
    }

    public TrainingJobInfo withVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * 音色名称。该名称会作为资产库中音色模型资产名称。
     * @return voiceName
     */
    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public TrainingJobInfo withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。 * FEMALE: 女性 * MALE: 是男性
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public TrainingJobInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TrainingJobInfo withState(JobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public JobState getState() {
        return state;
    }

    public void setState(JobState state) {
        this.state = state;
    }

    public TrainingJobInfo withRejectTimes(Integer rejectTimes) {
        this.rejectTimes = rejectTimes;
        return this;
    }

    /**
     * 本次任务中该状态出现的次数
     * minimum: 1
     * maximum: 10
     * @return rejectTimes
     */
    public Integer getRejectTimes() {
        return rejectTimes;
    }

    public void setRejectTimes(Integer rejectTimes) {
        this.rejectTimes = rejectTimes;
    }

    public TrainingJobInfo withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 当任务状态为成功时呈现,音色模型在资产库中的id。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public TrainingJobInfo withJobFailedCode(String jobFailedCode) {
        this.jobFailedCode = jobFailedCode;
        return this;
    }

    /**
     * 当任务失败时呈现,失败错误码。
     * @return jobFailedCode
     */
    public String getJobFailedCode() {
        return jobFailedCode;
    }

    public void setJobFailedCode(String jobFailedCode) {
        this.jobFailedCode = jobFailedCode;
    }

    public TrainingJobInfo withJobFailedReason(String jobFailedReason) {
        this.jobFailedReason = jobFailedReason;
        return this;
    }

    /**
     * 当任务失败时呈现,失败原因。
     * @return jobFailedReason
     */
    public String getJobFailedReason() {
        return jobFailedReason;
    }

    public void setJobFailedReason(String jobFailedReason) {
        this.jobFailedReason = jobFailedReason;
    }

    public TrainingJobInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * minimum: 1
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TrainingJobInfo withLastupdateTime(Long lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
        return this;
    }

    /**
     * 任务状态更新时间。
     * minimum: 1
     * maximum: 2147483647
     * @return lastupdateTime
     */
    public Long getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(Long lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public TrainingJobInfo withVoiceAuthorizationUrl(String voiceAuthorizationUrl) {
        this.voiceAuthorizationUrl = voiceAuthorizationUrl;
        return this;
    }

    /**
     * 用户授权书连接。
     * @return voiceAuthorizationUrl
     */
    public String getVoiceAuthorizationUrl() {
        return voiceAuthorizationUrl;
    }

    public void setVoiceAuthorizationUrl(String voiceAuthorizationUrl) {
        this.voiceAuthorizationUrl = voiceAuthorizationUrl;
    }

    public TrainingJobInfo withCreateType(CreateType createType) {
        this.createType = createType;
        return this;
    }

    /**
     * Get createType
     * @return createType
     */
    public CreateType getCreateType() {
        return createType;
    }

    public void setCreateType(CreateType createType) {
        this.createType = createType;
    }

    public TrainingJobInfo withTag(JobTag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public JobTag getTag() {
        return tag;
    }

    public void setTag(JobTag tag) {
        this.tag = tag;
    }

    public TrainingJobInfo withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrainingJobInfo that = (TrainingJobInfo) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.appUserId, that.appUserId) && Objects.equals(this.voiceName, that.voiceName)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.language, that.language)
            && Objects.equals(this.state, that.state) && Objects.equals(this.rejectTimes, that.rejectTimes)
            && Objects.equals(this.assetId, that.assetId) && Objects.equals(this.jobFailedCode, that.jobFailedCode)
            && Objects.equals(this.jobFailedReason, that.jobFailedReason)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastupdateTime, that.lastupdateTime)
            && Objects.equals(this.voiceAuthorizationUrl, that.voiceAuthorizationUrl)
            && Objects.equals(this.createType, that.createType) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            jobId,
            appUserId,
            voiceName,
            sex,
            language,
            state,
            rejectTimes,
            assetId,
            jobFailedCode,
            jobFailedReason,
            createTime,
            lastupdateTime,
            voiceAuthorizationUrl,
            createType,
            tag,
            phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrainingJobInfo {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    appUserId: ").append(toIndentedString(appUserId)).append("\n");
        sb.append("    voiceName: ").append(toIndentedString(voiceName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    rejectTimes: ").append(toIndentedString(rejectTimes)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    jobFailedCode: ").append(toIndentedString(jobFailedCode)).append("\n");
        sb.append("    jobFailedReason: ").append(toIndentedString(jobFailedReason)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastupdateTime: ").append(toIndentedString(lastupdateTime)).append("\n");
        sb.append("    voiceAuthorizationUrl: ").append(toIndentedString(voiceAuthorizationUrl)).append("\n");
        sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
