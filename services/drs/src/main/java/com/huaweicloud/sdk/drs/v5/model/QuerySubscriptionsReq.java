package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询订阅任务列表请求体
 */
public class QuerySubscriptionsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_type")

    private String netType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ip")

    private String instanceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_billing")

    private Boolean isBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_at")

    private String beginAt;

    public QuerySubscriptionsReq withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务场景
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public QuerySubscriptionsReq withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型。
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public QuerySubscriptionsReq withNetType(String netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。
     * @return netType
     */
    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public QuerySubscriptionsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务ID或名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuerySubscriptionsReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuerySubscriptionsReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 缺省值：\"\"，表示查询所有企业项目任务。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QuerySubscriptionsReq withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 返回结果按该关键字排序，默认为“create_time”。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public QuerySubscriptionsReq withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 降序或升序（分别对应desc和asc，默认为“desc”）。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public QuerySubscriptionsReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public QuerySubscriptionsReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public QuerySubscriptionsReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 数据库实例ID列表，最多支持10个。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public QuerySubscriptionsReq withInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }

    /**
     * 数据库实例IP
     * @return instanceIp
     */
    public String getInstanceIp() {
        return instanceIp;
    }

    public void setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
    }

    public QuerySubscriptionsReq withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public QuerySubscriptionsReq putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public QuerySubscriptionsReq withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public QuerySubscriptionsReq withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public QuerySubscriptionsReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuerySubscriptionsReq withIsBilling(Boolean isBilling) {
        this.isBilling = isBilling;
        return this;
    }

    /**
     * 计费模式，包括是、否以及全部三种情况，不填默认为全部
     * @return isBilling
     */
    public Boolean getIsBilling() {
        return isBilling;
    }

    public void setIsBilling(Boolean isBilling) {
        this.isBilling = isBilling;
    }

    public QuerySubscriptionsReq withBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }

    /**
     * 消费时间
     * @return beginAt
     */
    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuerySubscriptionsReq that = (QuerySubscriptionsReq) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.netType, that.netType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.instanceIp, that.instanceIp)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isBilling, that.isBilling)
            && Objects.equals(this.beginAt, that.beginAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            engineType,
            netType,
            name,
            status,
            enterpriseProjectId,
            sortKey,
            sortDir,
            instanceIds,
            instanceIp,
            tags,
            serviceName,
            description,
            isBilling,
            beginAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySubscriptionsReq {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    instanceIp: ").append(toIndentedString(instanceIp)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isBilling: ").append(toIndentedString(isBilling)).append("\n");
        sb.append("    beginAt: ").append(toIndentedString(beginAt)).append("\n");
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
