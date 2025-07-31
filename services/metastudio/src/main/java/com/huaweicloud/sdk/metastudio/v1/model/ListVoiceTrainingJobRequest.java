package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVoiceTrainingJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_until")

    private String createUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_since")

    private String createSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_until")

    private String updateUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_since")

    private String updateSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_name")

    private String voiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ondemand_resource")

    private Boolean isOndemandResource;

    public ListVoiceTrainingJobRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVoiceTrainingJobRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVoiceTrainingJobRequest withCreateUntil(String createUntil) {
        this.createUntil = createUntil;
        return this;
    }

    /**
     * 过滤创建时间<=输入时间的记录。
     * @return createUntil
     */
    public String getCreateUntil() {
        return createUntil;
    }

    public void setCreateUntil(String createUntil) {
        this.createUntil = createUntil;
    }

    public ListVoiceTrainingJobRequest withCreateSince(String createSince) {
        this.createSince = createSince;
        return this;
    }

    /**
     * 过滤创建时间>=输入时间的记录。
     * @return createSince
     */
    public String getCreateSince() {
        return createSince;
    }

    public void setCreateSince(String createSince) {
        this.createSince = createSince;
    }

    public ListVoiceTrainingJobRequest withUpdateUntil(String updateUntil) {
        this.updateUntil = updateUntil;
        return this;
    }

    /**
     * 过滤更新时间<=输入时间的记录。
     * @return updateUntil
     */
    public String getUpdateUntil() {
        return updateUntil;
    }

    public void setUpdateUntil(String updateUntil) {
        this.updateUntil = updateUntil;
    }

    public ListVoiceTrainingJobRequest withUpdateSince(String updateSince) {
        this.updateSince = updateSince;
        return this;
    }

    /**
     * 过滤更新时间>=输入时间的记录。
     * @return updateSince
     */
    public String getUpdateSince() {
        return updateSince;
    }

    public void setUpdateSince(String updateSince) {
        this.updateSince = updateSince;
    }

    public ListVoiceTrainingJobRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 第三方用户ID。不允许输入中文。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public ListVoiceTrainingJobRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态，默认所有状态。 可多个状态查询，使用英文逗号分隔。 如state=FAILED,WAITING
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListVoiceTrainingJobRequest withJobId(String jobId) {
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

    public ListVoiceTrainingJobRequest withVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * 声音名称。
     * @return voiceName
     */
    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public ListVoiceTrainingJobRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 任务标签。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListVoiceTrainingJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 训练类型。 * BASIC: 基础版(20句话) * MIDDLE: 进阶版(100句话) * ADVANCE: 高级版 * THIRD_PARTY: 第三方出门问问训练版 * THIRD_PARTY_LJZN: 第三方逻辑智能训练版 * FLEXUS: Flexus版---用的是大模型特征提取
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListVoiceTrainingJobRequest withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 批次名称。
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public ListVoiceTrainingJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段，当前支持：ceate_time/update_time
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListVoiceTrainingJobRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则：desc(降序)/asc(升序)
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListVoiceTrainingJobRequest withIsOndemandResource(Boolean isOndemandResource) {
        this.isOndemandResource = isOndemandResource;
        return this;
    }

    /**
     * 是否是按需任务
     * @return isOndemandResource
     */
    public Boolean getIsOndemandResource() {
        return isOndemandResource;
    }

    public void setIsOndemandResource(Boolean isOndemandResource) {
        this.isOndemandResource = isOndemandResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVoiceTrainingJobRequest that = (ListVoiceTrainingJobRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.createUntil, that.createUntil) && Objects.equals(this.createSince, that.createSince)
            && Objects.equals(this.updateUntil, that.updateUntil) && Objects.equals(this.updateSince, that.updateSince)
            && Objects.equals(this.xAppUserId, that.xAppUserId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.voiceName, that.voiceName)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.batchName, that.batchName) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.isOndemandResource, that.isOndemandResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            createUntil,
            createSince,
            updateUntil,
            updateSince,
            xAppUserId,
            state,
            jobId,
            voiceName,
            tag,
            jobType,
            batchName,
            sortKey,
            sortDir,
            isOndemandResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVoiceTrainingJobRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    createUntil: ").append(toIndentedString(createUntil)).append("\n");
        sb.append("    createSince: ").append(toIndentedString(createSince)).append("\n");
        sb.append("    updateUntil: ").append(toIndentedString(updateUntil)).append("\n");
        sb.append("    updateSince: ").append(toIndentedString(updateSince)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    voiceName: ").append(toIndentedString(voiceName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    isOndemandResource: ").append(toIndentedString(isOndemandResource)).append("\n");
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
