package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TrafficMirrorFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_rules")

    private List<TrafficMirrorFilterRule> ingressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_rules")

    private List<TrafficMirrorFilterRule> egressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public TrafficMirrorFilter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：流量镜像筛选条件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrafficMirrorFilter withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TrafficMirrorFilter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：流量镜像筛选条件的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TrafficMirrorFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：流量镜像筛选条件的名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrafficMirrorFilter withIngressRules(List<TrafficMirrorFilterRule> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }

    public TrafficMirrorFilter addIngressRulesItem(TrafficMirrorFilterRule ingressRulesItem) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        this.ingressRules.add(ingressRulesItem);
        return this;
    }

    public TrafficMirrorFilter withIngressRules(Consumer<List<TrafficMirrorFilterRule>> ingressRulesSetter) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        ingressRulesSetter.accept(this.ingressRules);
        return this;
    }

    /**
     * 功能说明：入方向筛选规则列表
     * @return ingressRules
     */
    public List<TrafficMirrorFilterRule> getIngressRules() {
        return ingressRules;
    }

    public void setIngressRules(List<TrafficMirrorFilterRule> ingressRules) {
        this.ingressRules = ingressRules;
    }

    public TrafficMirrorFilter withEgressRules(List<TrafficMirrorFilterRule> egressRules) {
        this.egressRules = egressRules;
        return this;
    }

    public TrafficMirrorFilter addEgressRulesItem(TrafficMirrorFilterRule egressRulesItem) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        this.egressRules.add(egressRulesItem);
        return this;
    }

    public TrafficMirrorFilter withEgressRules(Consumer<List<TrafficMirrorFilterRule>> egressRulesSetter) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        egressRulesSetter.accept(this.egressRules);
        return this;
    }

    /**
     * 功能说明：出方向筛选规则列表
     * @return egressRules
     */
    public List<TrafficMirrorFilterRule> getEgressRules() {
        return egressRules;
    }

    public void setEgressRules(List<TrafficMirrorFilterRule> egressRules) {
        this.egressRules = egressRules;
    }

    public TrafficMirrorFilter withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间戳
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TrafficMirrorFilter withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间戳
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrafficMirrorFilter that = (TrafficMirrorFilter) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ingressRules, that.ingressRules)
            && Objects.equals(this.egressRules, that.egressRules) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, description, name, ingressRules, egressRules, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficMirrorFilter {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ingressRules: ").append(toIndentedString(ingressRules)).append("\n");
        sb.append("    egressRules: ").append(toIndentedString(egressRules)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
