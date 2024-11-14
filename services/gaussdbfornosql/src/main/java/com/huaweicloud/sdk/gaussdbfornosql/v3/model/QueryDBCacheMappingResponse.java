package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内存加速映射信息。
 */
public class QueryDBCacheMappingResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_name")

    private String sourceInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_name")

    private String targetInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_count")

    private Integer ruleCount;

    public QueryDBCacheMappingResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 内存加速映射ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryDBCacheMappingResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 内存加速映射名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryDBCacheMappingResponse withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 源实例ID。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public QueryDBCacheMappingResponse withSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
        return this;
    }

    /**
     * 源实例名称。
     * @return sourceInstanceName
     */
    public String getSourceInstanceName() {
        return sourceInstanceName;
    }

    public void setSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
    }

    public QueryDBCacheMappingResponse withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 目标实例ID。
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public QueryDBCacheMappingResponse withTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }

    /**
     * 目标实例名称。
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return targetInstanceName;
    }

    public void setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
    }

    public QueryDBCacheMappingResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 内存加速映射关系。  - normal： 表示内存加速映射正常。  - creating： 表示内存加速映射创建中。  - createfail： 表示内存加速映射创建失败。  - deleting： 表示内存加速映射解除中。  - stopped： 表示内存加速映射停止。  - deleted： 表示内存加速映射已解除。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryDBCacheMappingResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 内存加速映射创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public QueryDBCacheMappingResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 内存加速映射最新变更的时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public QueryDBCacheMappingResponse withRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    /**
     * 该内存加速映射下的规则数量。
     * @return ruleCount
     */
    public Integer getRuleCount() {
        return ruleCount;
    }

    public void setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDBCacheMappingResponse that = (QueryDBCacheMappingResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceInstanceName, that.sourceInstanceName)
            && Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.targetInstanceName, that.targetInstanceName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.ruleCount, that.ruleCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            sourceInstanceId,
            sourceInstanceName,
            targetInstanceId,
            targetInstanceName,
            status,
            created,
            updated,
            ruleCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDBCacheMappingResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceInstanceName: ").append(toIndentedString(sourceInstanceName)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    targetInstanceName: ").append(toIndentedString(targetInstanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    ruleCount: ").append(toIndentedString(ruleCount)).append("\n");
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
