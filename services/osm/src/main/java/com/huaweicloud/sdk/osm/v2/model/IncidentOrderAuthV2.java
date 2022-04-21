package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * IncidentOrderAuthV2
 */
public class IncidentOrderAuthV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_description")

    private String simpleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visit_type_name")

    private String visitTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_effective_time")

    private OffsetDateTime authEffectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_expire_time")

    private OffsetDateTime authExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reject_reason")

    private String rejectReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_id")

    private String xCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_name")

    private String xCustomerName;

    public IncidentOrderAuthV2 withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 授权id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IncidentOrderAuthV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 授权状态
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public IncidentOrderAuthV2 withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * 工单id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public IncidentOrderAuthV2 withSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
        return this;
    }

    /**
     * 简要描述
     * @return simpleDescription
     */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public IncidentOrderAuthV2 withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 授权资源类型名称
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public IncidentOrderAuthV2 withVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
        return this;
    }

    /**
     * 授权访问类型名称
     * @return visitTypeName
     */
    public String getVisitTypeName() {
        return visitTypeName;
    }

    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
    }

    public IncidentOrderAuthV2 withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public IncidentOrderAuthV2 withAuthEffectiveTime(OffsetDateTime authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
        return this;
    }

    /**
     * 授权生效时间
     * @return authEffectiveTime
     */
    public OffsetDateTime getAuthEffectiveTime() {
        return authEffectiveTime;
    }

    public void setAuthEffectiveTime(OffsetDateTime authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
    }

    public IncidentOrderAuthV2 withAuthExpireTime(OffsetDateTime authExpireTime) {
        this.authExpireTime = authExpireTime;
        return this;
    }

    /**
     * 授权到期时间
     * @return authExpireTime
     */
    public OffsetDateTime getAuthExpireTime() {
        return authExpireTime;
    }

    public void setAuthExpireTime(OffsetDateTime authExpireTime) {
        this.authExpireTime = authExpireTime;
    }

    public IncidentOrderAuthV2 withRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    /**
     * 拒绝原因
     * @return rejectReason
     */
    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public IncidentOrderAuthV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 主账号id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public IncidentOrderAuthV2 withXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
        return this;
    }

    /**
     * 子用户id
     * @return xCustomerId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_id")
    public String getXCustomerId() {
        return xCustomerId;
    }

    public void setXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
    }

    public IncidentOrderAuthV2 withXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
        return this;
    }

    /**
     * 子用户名称
     * @return xCustomerName
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_name")
    public String getXCustomerName() {
        return xCustomerName;
    }

    public void setXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentOrderAuthV2 incidentOrderAuthV2 = (IncidentOrderAuthV2) o;
        return Objects.equals(this.id, incidentOrderAuthV2.id)
            && Objects.equals(this.status, incidentOrderAuthV2.status)
            && Objects.equals(this.incidentId, incidentOrderAuthV2.incidentId)
            && Objects.equals(this.simpleDescription, incidentOrderAuthV2.simpleDescription)
            && Objects.equals(this.resourceTypeName, incidentOrderAuthV2.resourceTypeName)
            && Objects.equals(this.visitTypeName, incidentOrderAuthV2.visitTypeName)
            && Objects.equals(this.createTime, incidentOrderAuthV2.createTime)
            && Objects.equals(this.authEffectiveTime, incidentOrderAuthV2.authEffectiveTime)
            && Objects.equals(this.authExpireTime, incidentOrderAuthV2.authExpireTime)
            && Objects.equals(this.rejectReason, incidentOrderAuthV2.rejectReason)
            && Objects.equals(this.customerId, incidentOrderAuthV2.customerId)
            && Objects.equals(this.xCustomerId, incidentOrderAuthV2.xCustomerId)
            && Objects.equals(this.xCustomerName, incidentOrderAuthV2.xCustomerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            incidentId,
            simpleDescription,
            resourceTypeName,
            visitTypeName,
            createTime,
            authEffectiveTime,
            authExpireTime,
            rejectReason,
            customerId,
            xCustomerId,
            xCustomerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentOrderAuthV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    visitTypeName: ").append(toIndentedString(visitTypeName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    authEffectiveTime: ").append(toIndentedString(authEffectiveTime)).append("\n");
        sb.append("    authExpireTime: ").append(toIndentedString(authExpireTime)).append("\n");
        sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    xCustomerId: ").append(toIndentedString(xCustomerId)).append("\n");
        sb.append("    xCustomerName: ").append(toIndentedString(xCustomerName)).append("\n");
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
