package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTtscVocabularyConfigsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tts_service_name")

    private String ttsServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_vocabulary_config_enable")

    private String isVocabularyConfigEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_key")

    private String searchKey;

    public ListTtscVocabularyConfigsRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ListTtscVocabularyConfigsRequest withAuthorization(String authorization) {
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

    public ListTtscVocabularyConfigsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。
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

    public ListTtscVocabularyConfigsRequest withXProjectId(String xProjectId) {
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

    public ListTtscVocabularyConfigsRequest withXAppUserId(String xAppUserId) {
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

    public ListTtscVocabularyConfigsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义读法类型。 - CHINESE_G2P：拼音 - PHONETIC_SYMBOL：音标 - CONTINUUM：连读 - ALIAS：别名 - SAY_AS：数字英文读法
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListTtscVocabularyConfigsRequest withTtsServiceName(String ttsServiceName) {
        this.ttsServiceName = ttsServiceName;
        return this;
    }

    /**
     * 声音模型名称
     * @return ttsServiceName
     */
    public String getTtsServiceName() {
        return ttsServiceName;
    }

    public void setTtsServiceName(String ttsServiceName) {
        this.ttsServiceName = ttsServiceName;
    }

    public ListTtscVocabularyConfigsRequest withIsVocabularyConfigEnable(String isVocabularyConfigEnable) {
        this.isVocabularyConfigEnable = isVocabularyConfigEnable;
        return this;
    }

    /**
     * 是否应用词表配置，从周边服务传递
     * @return isVocabularyConfigEnable
     */
    public String getIsVocabularyConfigEnable() {
        return isVocabularyConfigEnable;
    }

    public void setIsVocabularyConfigEnable(String isVocabularyConfigEnable) {
        this.isVocabularyConfigEnable = isVocabularyConfigEnable;
    }

    public ListTtscVocabularyConfigsRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListTtscVocabularyConfigsRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ListTtscVocabularyConfigsRequest withLimit(Integer limit) {
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

    public ListTtscVocabularyConfigsRequest withOffset(Integer offset) {
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

    public ListTtscVocabularyConfigsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTtscVocabularyConfigsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式遵循：RFC 3339 如\"2021-01-10T10:43:17Z\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTtscVocabularyConfigsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 搜索条件
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTtscVocabularyConfigsRequest that = (ListTtscVocabularyConfigsRequest) obj;
        return Objects.equals(this.xRequestId, that.xRequestId)
            && Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xAppUserId, that.xAppUserId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.ttsServiceName, that.ttsServiceName)
            && Objects.equals(this.isVocabularyConfigEnable, that.isVocabularyConfigEnable)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.searchKey, that.searchKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId,
            authorization,
            xSdkDate,
            xProjectId,
            xAppUserId,
            type,
            ttsServiceName,
            isVocabularyConfigEnable,
            groupId,
            assetId,
            limit,
            offset,
            startTime,
            endTime,
            searchKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTtscVocabularyConfigsRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttsServiceName: ").append(toIndentedString(ttsServiceName)).append("\n");
        sb.append("    isVocabularyConfigEnable: ").append(toIndentedString(isVocabularyConfigEnable)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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
