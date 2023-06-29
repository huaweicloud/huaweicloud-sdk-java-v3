package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DiagnoseRecordVo
 */
public class DiagnoseRecordVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, String> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_items")

    private List<String> abnormalItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "red_count")

    private Integer redCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public DiagnoseRecordVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiagnoseRecordVo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiagnoseRecordVo withParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public DiagnoseRecordVo putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public DiagnoseRecordVo withParams(Consumer<Map<String, String>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 不同诊断定独有的属性
     * @return params
     */
    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public DiagnoseRecordVo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 创建人
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DiagnoseRecordVo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳
     * minimum: 0
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DiagnoseRecordVo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DiagnoseRecordVo withAbnormalItems(List<String> abnormalItems) {
        this.abnormalItems = abnormalItems;
        return this;
    }

    public DiagnoseRecordVo addAbnormalItemsItem(String abnormalItemsItem) {
        if (this.abnormalItems == null) {
            this.abnormalItems = new ArrayList<>();
        }
        this.abnormalItems.add(abnormalItemsItem);
        return this;
    }

    public DiagnoseRecordVo withAbnormalItems(Consumer<List<String>> abnormalItemsSetter) {
        if (this.abnormalItems == null) {
            this.abnormalItems = new ArrayList<>();
        }
        abnormalItemsSetter.accept(this.abnormalItems);
        return this;
    }

    /**
     * 异常项id列表
     * @return abnormalItems
     */
    public List<String> getAbnormalItems() {
        return abnormalItems;
    }

    public void setAbnormalItems(List<String> abnormalItems) {
        this.abnormalItems = abnormalItems;
    }

    public DiagnoseRecordVo withRedCount(Integer redCount) {
        this.redCount = redCount;
        return this;
    }

    /**
     * 异常项数量
     * minimum: 0
     * maximum: 2147483647
     * @return redCount
     */
    public Integer getRedCount() {
        return redCount;
    }

    public void setRedCount(Integer redCount) {
        this.redCount = redCount;
    }

    public DiagnoseRecordVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnoseRecordVo that = (DiagnoseRecordVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.params, that.params) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.abnormalItems, that.abnormalItems) && Objects.equals(this.redCount, that.redCount)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, params, domainId, createTime, jobId, abnormalItems, redCount, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnoseRecordVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    abnormalItems: ").append(toIndentedString(abnormalItems)).append("\n");
        sb.append("    redCount: ").append(toIndentedString(redCount)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
