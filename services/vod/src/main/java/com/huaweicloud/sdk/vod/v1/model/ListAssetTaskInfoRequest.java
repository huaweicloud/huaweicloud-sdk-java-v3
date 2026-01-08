package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAssetTaskInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_after")

    private String createTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_before")

    private String createTimeBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_after")

    private String endTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_before")

    private String endTimeBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAssetTaskInfoRequest withXSdkDate(String xSdkDate) {
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

    public ListAssetTaskInfoRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListAssetTaskInfoRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资Id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ListAssetTaskInfoRequest withCreateTimeAfter(String createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }

    /**
     * 根据任务创建时间匹配该时间之后的，包含该时间点，格式按照RFC3339，UTC时间，如2020-09-01T18:50:20Z
     * @return createTimeAfter
     */
    public String getCreateTimeAfter() {
        return createTimeAfter;
    }

    public void setCreateTimeAfter(String createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }

    public ListAssetTaskInfoRequest withCreateTimeBefore(String createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }

    /**
     * 根据任务创建时间匹配该时间之前的，不包含该时间点，格式按照RFC3339，UTC时间，如2020-09-01T18:50:20Z
     * @return createTimeBefore
     */
    public String getCreateTimeBefore() {
        return createTimeBefore;
    }

    public void setCreateTimeBefore(String createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }

    public ListAssetTaskInfoRequest withEndTimeAfter(String endTimeAfter) {
        this.endTimeAfter = endTimeAfter;
        return this;
    }

    /**
     * 根据任务结束时间匹配该时间之后的，包含该时间点，格式按照RFC3339，UTC时间，如2020-09-01T18:50:20Z
     * @return endTimeAfter
     */
    public String getEndTimeAfter() {
        return endTimeAfter;
    }

    public void setEndTimeAfter(String endTimeAfter) {
        this.endTimeAfter = endTimeAfter;
    }

    public ListAssetTaskInfoRequest withEndTimeBefore(String endTimeBefore) {
        this.endTimeBefore = endTimeBefore;
        return this;
    }

    /**
     * 根据任务结束时间匹配该时间之前的，不包含该时间点，格式按照RFC3339，UTC时间，如2020-09-01T18:50:20Z
     * @return endTimeBefore
     */
    public String getEndTimeBefore() {
        return endTimeBefore;
    }

    public void setEndTimeBefore(String endTimeBefore) {
        this.endTimeBefore = endTimeBefore;
    }

    public ListAssetTaskInfoRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListAssetTaskInfoRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListAssetTaskInfoRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListAssetTaskInfoRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 标志位，不传默认表示从第一条开始
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAssetTaskInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的每页个数，默认10，最大100，最小1
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetTaskInfoRequest that = (ListAssetTaskInfoRequest) obj;
        return Objects.equals(this.xSdkDate, that.xSdkDate) && Objects.equals(this.type, that.type)
            && Objects.equals(this.assetId, that.assetId) && Objects.equals(this.createTimeAfter, that.createTimeAfter)
            && Objects.equals(this.createTimeBefore, that.createTimeBefore)
            && Objects.equals(this.endTimeAfter, that.endTimeAfter)
            && Objects.equals(this.endTimeBefore, that.endTimeBefore) && Objects.equals(this.status, that.status)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate,
            type,
            assetId,
            createTimeAfter,
            createTimeBefore,
            endTimeAfter,
            endTimeBefore,
            status,
            marker,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetTaskInfoRequest {\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
        sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
        sb.append("    endTimeAfter: ").append(toIndentedString(endTimeAfter)).append("\n");
        sb.append("    endTimeBefore: ").append(toIndentedString(endTimeBefore)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
