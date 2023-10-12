package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通知屏蔽请求体
 */
public class UpdateNotificationMasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

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

    public UpdateNotificationMasksRequestBody withMaskName(String maskName) {
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

    public UpdateNotificationMasksRequestBody withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public UpdateNotificationMasksRequestBody addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public UpdateNotificationMasksRequestBody withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * 关联编号，relation_type为ALARM_RULE时填屏蔽的告警规则编号；relation_type为RESOURCE_POLICY_NOTIFICATION、RESOURCE_POLICY_ALARM时填屏蔽的告警策略编号；
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public UpdateNotificationMasksRequestBody withRelationType(RelationType relationType) {
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

    public UpdateNotificationMasksRequestBody withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public UpdateNotificationMasksRequestBody addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public UpdateNotificationMasksRequestBody withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 关联资源
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public UpdateNotificationMasksRequestBody withMaskType(MaskType maskType) {
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

    public UpdateNotificationMasksRequestBody withStartDate(LocalDate startDate) {
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

    public UpdateNotificationMasksRequestBody withStartTime(String startTime) {
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

    public UpdateNotificationMasksRequestBody withEndDate(LocalDate endDate) {
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

    public UpdateNotificationMasksRequestBody withEndTime(String endTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNotificationMasksRequestBody that = (UpdateNotificationMasksRequestBody) obj;
        return Objects.equals(this.maskName, that.maskName) && Objects.equals(this.relationIds, that.relationIds)
            && Objects.equals(this.relationType, that.relationType) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.maskType, that.maskType) && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(maskName, relationIds, relationType, resources, maskType, startDate, startTime, endDate, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationMasksRequestBody {\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    maskType: ").append(toIndentedString(maskType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
