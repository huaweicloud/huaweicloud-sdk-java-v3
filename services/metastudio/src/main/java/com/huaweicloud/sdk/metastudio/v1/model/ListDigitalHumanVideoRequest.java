package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListDigitalHumanVideoRequest {

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
    @JsonProperty(value = "fuzzy_query_field")

    private List<String> fuzzyQueryField = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    public ListDigitalHumanVideoRequest withAuthorization(String authorization) {
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

    public ListDigitalHumanVideoRequest withXSdkDate(String xSdkDate) {
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

    public ListDigitalHumanVideoRequest withXProjectId(String xProjectId) {
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

    public ListDigitalHumanVideoRequest withXAppUserId(String xAppUserId) {
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

    public ListDigitalHumanVideoRequest withOffset(Integer offset) {
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

    public ListDigitalHumanVideoRequest withLimit(Integer limit) {
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

    public ListDigitalHumanVideoRequest withState(String state) {
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

    public ListDigitalHumanVideoRequest withSortKey(String sortKey) {
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

    public ListDigitalHumanVideoRequest withSortDir(String sortDir) {
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

    public ListDigitalHumanVideoRequest withCreateUntil(String createUntil) {
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

    public ListDigitalHumanVideoRequest withCreateSince(String createSince) {
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

    public ListDigitalHumanVideoRequest withFuzzyQueryField(List<String> fuzzyQueryField) {
        this.fuzzyQueryField = fuzzyQueryField;
        return this;
    }

    public ListDigitalHumanVideoRequest addFuzzyQueryFieldItem(String fuzzyQueryFieldItem) {
        if (this.fuzzyQueryField == null) {
            this.fuzzyQueryField = new ArrayList<>();
        }
        this.fuzzyQueryField.add(fuzzyQueryFieldItem);
        return this;
    }

    public ListDigitalHumanVideoRequest withFuzzyQueryField(Consumer<List<String>> fuzzyQueryFieldSetter) {
        if (this.fuzzyQueryField == null) {
            this.fuzzyQueryField = new ArrayList<>();
        }
        fuzzyQueryFieldSetter.accept(this.fuzzyQueryField);
        return this;
    }

    /**
     * 使用模糊查询的字段
     * @return fuzzyQueryField
     */
    public List<String> getFuzzyQueryField() {
        return fuzzyQueryField;
    }

    public void setFuzzyQueryField(List<String> fuzzyQueryField) {
        this.fuzzyQueryField = fuzzyQueryField;
    }

    public ListDigitalHumanVideoRequest withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 剧本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ListDigitalHumanVideoRequest withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 输出视频资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ListDigitalHumanVideoRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型。 * 2D_DIGITAL_HUMAN_VIDEO: 分身数字人视频制作任务 * PHOTO_DIGITAL_HUMAN_VIDEO: 照片数字人视频制作任务
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListDigitalHumanVideoRequest withJobId(String jobId) {
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

    public ListDigitalHumanVideoRequest withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public ListDigitalHumanVideoRequest addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public ListDigitalHumanVideoRequest withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 批量查询的任务ID
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDigitalHumanVideoRequest that = (ListDigitalHumanVideoRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xAppUserId, that.xAppUserId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.state, that.state) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.createUntil, that.createUntil)
            && Objects.equals(this.createSince, that.createSince)
            && Objects.equals(this.fuzzyQueryField, that.fuzzyQueryField)
            && Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobIds, that.jobIds);
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
            fuzzyQueryField,
            scriptId,
            assetName,
            jobType,
            jobId,
            jobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDigitalHumanVideoRequest {\n");
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
        sb.append("    fuzzyQueryField: ").append(toIndentedString(fuzzyQueryField)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
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
