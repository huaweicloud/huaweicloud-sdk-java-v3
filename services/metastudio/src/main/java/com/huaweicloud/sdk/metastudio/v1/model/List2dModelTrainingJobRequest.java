package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class List2dModelTrainingJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_until")

    private String createUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_since")

    private String createSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_project_id")

    private String queryProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_since")

    private String updateSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_until")

    private String updateUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_resolution")

    private String modelResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_flexus")

    private Boolean isFlexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_live_copy")

    private Boolean isLiveCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_location")

    private String trainLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ondemand_resource")

    private Boolean isOndemandResource;

    public List2dModelTrainingJobRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public List2dModelTrainingJobRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。  格式为(YYYYMMDD'T'HHMMSS'Z')。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public List2dModelTrainingJobRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public List2dModelTrainingJobRequest withXAppUserId(String xAppUserId) {
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

    public List2dModelTrainingJobRequest withOffset(Integer offset) {
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

    public List2dModelTrainingJobRequest withLimit(Integer limit) {
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

    public List2dModelTrainingJobRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态，默认所有状态。  可多个状态查询，使用英文逗号分隔。  如state=CREATING,PUBLISHED
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List2dModelTrainingJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段，支持的排序方式有： - 按创建时间排序：create_time - 按更新时间排序：update_time - 按资产排序：asset_order
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public List2dModelTrainingJobRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式。 * asc：升序 * desc：降序  默认asc升序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public List2dModelTrainingJobRequest withCreateUntil(String createUntil) {
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

    public List2dModelTrainingJobRequest withCreateSince(String createSince) {
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

    public List2dModelTrainingJobRequest withQueryProjectId(String queryProjectId) {
        this.queryProjectId = queryProjectId;
        return this;
    }

    /**
     * 查询租户id。
     * @return queryProjectId
     */
    public String getQueryProjectId() {
        return queryProjectId;
    }

    public void setQueryProjectId(String queryProjectId) {
        this.queryProjectId = queryProjectId;
    }

    public List2dModelTrainingJobRequest withUpdateSince(String updateSince) {
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

    public List2dModelTrainingJobRequest withUpdateUntil(String updateUntil) {
        this.updateUntil = updateUntil;
        return this;
    }

    /**
     * 过滤更新时间>=输入时间的记录。
     * @return updateUntil
     */
    public String getUpdateUntil() {
        return updateUntil;
    }

    public void setUpdateUntil(String updateUntil) {
        this.updateUntil = updateUntil;
    }

    public List2dModelTrainingJobRequest withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 任务批次名称。
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public List2dModelTrainingJobRequest withTag(String tag) {
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

    public List2dModelTrainingJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public List2dModelTrainingJobRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分身数字人模型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List2dModelTrainingJobRequest withModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
        return this;
    }

    /**
     * 模型分辨率
     * @return modelResolution
     */
    public String getModelResolution() {
        return modelResolution;
    }

    public void setModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
    }

    public List2dModelTrainingJobRequest withIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
        return this;
    }

    /**
     * 是否是flexus任务
     * @return isFlexus
     */
    public Boolean getIsFlexus() {
        return isFlexus;
    }

    public void setIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
    }

    public List2dModelTrainingJobRequest withIsLiveCopy(Boolean isLiveCopy) {
        this.isLiveCopy = isLiveCopy;
        return this;
    }

    /**
     * 是否是直播间复刻任务
     * @return isLiveCopy
     */
    public Boolean getIsLiveCopy() {
        return isLiveCopy;
    }

    public void setIsLiveCopy(Boolean isLiveCopy) {
        this.isLiveCopy = isLiveCopy;
    }

    public List2dModelTrainingJobRequest withTrainLocation(String trainLocation) {
        this.trainLocation = trainLocation;
        return this;
    }

    /**
     * 训练region
     * @return trainLocation
     */
    public String getTrainLocation() {
        return trainLocation;
    }

    public void setTrainLocation(String trainLocation) {
        this.trainLocation = trainLocation;
    }

    public List2dModelTrainingJobRequest withIsOndemandResource(Boolean isOndemandResource) {
        this.isOndemandResource = isOndemandResource;
        return this;
    }

    /**
     * 是否测试版
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
        List2dModelTrainingJobRequest that = (List2dModelTrainingJobRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xAppUserId, that.xAppUserId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.state, that.state) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.createUntil, that.createUntil)
            && Objects.equals(this.createSince, that.createSince)
            && Objects.equals(this.queryProjectId, that.queryProjectId)
            && Objects.equals(this.updateSince, that.updateSince) && Objects.equals(this.updateUntil, that.updateUntil)
            && Objects.equals(this.batchName, that.batchName) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.modelResolution, that.modelResolution)
            && Objects.equals(this.isFlexus, that.isFlexus) && Objects.equals(this.isLiveCopy, that.isLiveCopy)
            && Objects.equals(this.trainLocation, that.trainLocation)
            && Objects.equals(this.isOndemandResource, that.isOndemandResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            xProjectId,
            xAppUserId,
            offset,
            limit,
            state,
            sortKey,
            sortDir,
            createUntil,
            createSince,
            queryProjectId,
            updateSince,
            updateUntil,
            batchName,
            tag,
            jobId,
            name,
            modelResolution,
            isFlexus,
            isLiveCopy,
            trainLocation,
            isOndemandResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class List2dModelTrainingJobRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    createUntil: ").append(toIndentedString(createUntil)).append("\n");
        sb.append("    createSince: ").append(toIndentedString(createSince)).append("\n");
        sb.append("    queryProjectId: ").append(toIndentedString(queryProjectId)).append("\n");
        sb.append("    updateSince: ").append(toIndentedString(updateSince)).append("\n");
        sb.append("    updateUntil: ").append(toIndentedString(updateUntil)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    modelResolution: ").append(toIndentedString(modelResolution)).append("\n");
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
        sb.append("    isLiveCopy: ").append(toIndentedString(isLiveCopy)).append("\n");
        sb.append("    trainLocation: ").append(toIndentedString(trainLocation)).append("\n");
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
