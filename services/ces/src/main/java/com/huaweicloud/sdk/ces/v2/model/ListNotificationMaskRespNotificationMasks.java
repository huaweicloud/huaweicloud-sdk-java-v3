package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListNotificationMaskRespNotificationMasks
 */
public class ListNotificationMaskRespNotificationMasks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_id")

    private String notificationMaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceCategory> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_status")

    private MaskStatus maskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_type")

    private MaskType maskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private LocalDate startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private LocalDate endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<PoliciesInListResp> policies = null;

    public ListNotificationMaskRespNotificationMasks withNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
        return this;
    }

    /**
     * 屏蔽规则ID
     * @return notificationMaskId
     */
    public String getNotificationMaskId() {
        return notificationMaskId;
    }

    public void setNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
    }

    public ListNotificationMaskRespNotificationMasks withMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }

    /**
     * 屏蔽规则名称，只能为字母、数字、汉字、-、_，最大长度为64
     * @return maskName
     */
    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }

    public ListNotificationMaskRespNotificationMasks withRelationType(RelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get relationType
     * @return relationType
     */
    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
    }

    public ListNotificationMaskRespNotificationMasks withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 关联编号
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public ListNotificationMaskRespNotificationMasks withResources(List<ResourceCategory> resources) {
        this.resources = resources;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addResourcesItem(ResourceCategory resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withResources(Consumer<List<ResourceCategory>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 关联资源类型，relation_type为RESOURCE时存在该字段,只需要查询出资源的namespace+维度名即可
     * @return resources
     */
    public List<ResourceCategory> getResources() {
        return resources;
    }

    public void setResources(List<ResourceCategory> resources) {
        this.resources = resources;
    }

    public ListNotificationMaskRespNotificationMasks withMaskStatus(MaskStatus maskStatus) {
        this.maskStatus = maskStatus;
        return this;
    }

    /**
     * Get maskStatus
     * @return maskStatus
     */
    public MaskStatus getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(MaskStatus maskStatus) {
        this.maskStatus = maskStatus;
    }

    public ListNotificationMaskRespNotificationMasks withMaskType(MaskType maskType) {
        this.maskType = maskType;
        return this;
    }

    /**
     * Get maskType
     * @return maskType
     */
    public MaskType getMaskType() {
        return maskType;
    }

    public void setMaskType(MaskType maskType) {
        this.maskType = maskType;
    }

    public ListNotificationMaskRespNotificationMasks withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 屏蔽起始日期，yyyy-MM-dd。
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ListNotificationMaskRespNotificationMasks withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 屏蔽起始时间，HH:mm:ss。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListNotificationMaskRespNotificationMasks withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 屏蔽截止日期，yyyy-MM-dd。
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ListNotificationMaskRespNotificationMasks withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 屏蔽截止时间，HH:mm:ss。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListNotificationMaskRespNotificationMasks withPolicies(List<PoliciesInListResp> policies) {
        this.policies = policies;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addPoliciesItem(PoliciesInListResp policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withPolicies(Consumer<List<PoliciesInListResp>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 告警策略列表。
     * @return policies
     */
    public List<PoliciesInListResp> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PoliciesInListResp> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMaskRespNotificationMasks that = (ListNotificationMaskRespNotificationMasks) obj;
        return Objects.equals(this.notificationMaskId, that.notificationMaskId)
            && Objects.equals(this.maskName, that.maskName) && Objects.equals(this.relationType, that.relationType)
            && Objects.equals(this.relationId, that.relationId) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.maskStatus, that.maskStatus) && Objects.equals(this.maskType, that.maskType)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endDate, that.endDate) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskId,
            maskName,
            relationType,
            relationId,
            resources,
            maskStatus,
            maskType,
            startDate,
            startTime,
            endDate,
            endTime,
            policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMaskRespNotificationMasks {\n");
        sb.append("    notificationMaskId: ").append(toIndentedString(notificationMaskId)).append("\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    maskStatus: ").append(toIndentedString(maskStatus)).append("\n");
        sb.append("    maskType: ").append(toIndentedString(maskType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
