package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowAuthorizationDetailResponse extends SdkResponse {

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
    @JsonProperty(value = "resource_type_id")

    private String resourceTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visit_type_id")

    private String visitTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visit_type_name")

    private String visitTypeName;

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
    @JsonProperty(value = "incident_auth_detail_list")

    private List<IncidentOrderAuthDetailInfoV2> incidentAuthDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xcustomer_name")

    private String xcustomerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_handler_name")

    private String authHandlerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_describe")

    private String authDescribe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type_id")

    private String contentTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type_name")

    private String contentTypeName;

    public ShowAuthorizationDetailResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /** 授权id minimum: 0 maximum: 9223372036854775807
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowAuthorizationDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 授权状态 minimum: 0 maximum: 10
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowAuthorizationDetailResponse withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /** 工单id
     * 
     * @return incidentId */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public ShowAuthorizationDetailResponse withSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
        return this;
    }

    /** 简要描述
     * 
     * @return simpleDescription */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public ShowAuthorizationDetailResponse withResourceTypeId(String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    /** 授权资源类型id
     * 
     * @return resourceTypeId */
    public String getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public ShowAuthorizationDetailResponse withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /** 授权资源类型名称
     * 
     * @return resourceTypeName */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public ShowAuthorizationDetailResponse withVisitTypeId(String visitTypeId) {
        this.visitTypeId = visitTypeId;
        return this;
    }

    /** 授权访问类型id
     * 
     * @return visitTypeId */
    public String getVisitTypeId() {
        return visitTypeId;
    }

    public void setVisitTypeId(String visitTypeId) {
        this.visitTypeId = visitTypeId;
    }

    public ShowAuthorizationDetailResponse withVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
        return this;
    }

    /** 授权访问类型名称
     * 
     * @return visitTypeName */
    public String getVisitTypeName() {
        return visitTypeName;
    }

    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
    }

    public ShowAuthorizationDetailResponse withAuthEffectiveTime(OffsetDateTime authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
        return this;
    }

    /** 授权生效时间
     * 
     * @return authEffectiveTime */
    public OffsetDateTime getAuthEffectiveTime() {
        return authEffectiveTime;
    }

    public void setAuthEffectiveTime(OffsetDateTime authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
    }

    public ShowAuthorizationDetailResponse withAuthExpireTime(OffsetDateTime authExpireTime) {
        this.authExpireTime = authExpireTime;
        return this;
    }

    /** 授权到期时间
     * 
     * @return authExpireTime */
    public OffsetDateTime getAuthExpireTime() {
        return authExpireTime;
    }

    public void setAuthExpireTime(OffsetDateTime authExpireTime) {
        this.authExpireTime = authExpireTime;
    }

    public ShowAuthorizationDetailResponse withRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    /** 拒绝原因
     * 
     * @return rejectReason */
    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public ShowAuthorizationDetailResponse withIncidentAuthDetailList(
        List<IncidentOrderAuthDetailInfoV2> incidentAuthDetailList) {
        this.incidentAuthDetailList = incidentAuthDetailList;
        return this;
    }

    public ShowAuthorizationDetailResponse addIncidentAuthDetailListItem(
        IncidentOrderAuthDetailInfoV2 incidentAuthDetailListItem) {
        if (this.incidentAuthDetailList == null) {
            this.incidentAuthDetailList = new ArrayList<>();
        }
        this.incidentAuthDetailList.add(incidentAuthDetailListItem);
        return this;
    }

    public ShowAuthorizationDetailResponse withIncidentAuthDetailList(
        Consumer<List<IncidentOrderAuthDetailInfoV2>> incidentAuthDetailListSetter) {
        if (this.incidentAuthDetailList == null) {
            this.incidentAuthDetailList = new ArrayList<>();
        }
        incidentAuthDetailListSetter.accept(this.incidentAuthDetailList);
        return this;
    }

    /** 授权详情列表
     * 
     * @return incidentAuthDetailList */
    public List<IncidentOrderAuthDetailInfoV2> getIncidentAuthDetailList() {
        return incidentAuthDetailList;
    }

    public void setIncidentAuthDetailList(List<IncidentOrderAuthDetailInfoV2> incidentAuthDetailList) {
        this.incidentAuthDetailList = incidentAuthDetailList;
    }

    public ShowAuthorizationDetailResponse withXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
        return this;
    }

    /** 子账号名称
     * 
     * @return xcustomerName */
    public String getXcustomerName() {
        return xcustomerName;
    }

    public void setXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
    }

    public ShowAuthorizationDetailResponse withAuthHandlerName(String authHandlerName) {
        this.authHandlerName = authHandlerName;
        return this;
    }

    /** 授权处理人名称
     * 
     * @return authHandlerName */
    public String getAuthHandlerName() {
        return authHandlerName;
    }

    public void setAuthHandlerName(String authHandlerName) {
        this.authHandlerName = authHandlerName;
    }

    public ShowAuthorizationDetailResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /** 委托名称
     * 
     * @return agencyName */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowAuthorizationDetailResponse withAuthDescribe(String authDescribe) {
        this.authDescribe = authDescribe;
        return this;
    }

    /** 授权描述
     * 
     * @return authDescribe */
    public String getAuthDescribe() {
        return authDescribe;
    }

    public void setAuthDescribe(String authDescribe) {
        this.authDescribe = authDescribe;
    }

    public ShowAuthorizationDetailResponse withContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
        return this;
    }

    /** 授权内容Id
     * 
     * @return contentTypeId */
    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public ShowAuthorizationDetailResponse withContentTypeName(String contentTypeName) {
        this.contentTypeName = contentTypeName;
        return this;
    }

    /** 授权内容名称
     * 
     * @return contentTypeName */
    public String getContentTypeName() {
        return contentTypeName;
    }

    public void setContentTypeName(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAuthorizationDetailResponse showAuthorizationDetailResponse = (ShowAuthorizationDetailResponse) o;
        return Objects.equals(this.id, showAuthorizationDetailResponse.id)
            && Objects.equals(this.status, showAuthorizationDetailResponse.status)
            && Objects.equals(this.incidentId, showAuthorizationDetailResponse.incidentId)
            && Objects.equals(this.simpleDescription, showAuthorizationDetailResponse.simpleDescription)
            && Objects.equals(this.resourceTypeId, showAuthorizationDetailResponse.resourceTypeId)
            && Objects.equals(this.resourceTypeName, showAuthorizationDetailResponse.resourceTypeName)
            && Objects.equals(this.visitTypeId, showAuthorizationDetailResponse.visitTypeId)
            && Objects.equals(this.visitTypeName, showAuthorizationDetailResponse.visitTypeName)
            && Objects.equals(this.authEffectiveTime, showAuthorizationDetailResponse.authEffectiveTime)
            && Objects.equals(this.authExpireTime, showAuthorizationDetailResponse.authExpireTime)
            && Objects.equals(this.rejectReason, showAuthorizationDetailResponse.rejectReason)
            && Objects.equals(this.incidentAuthDetailList, showAuthorizationDetailResponse.incidentAuthDetailList)
            && Objects.equals(this.xcustomerName, showAuthorizationDetailResponse.xcustomerName)
            && Objects.equals(this.authHandlerName, showAuthorizationDetailResponse.authHandlerName)
            && Objects.equals(this.agencyName, showAuthorizationDetailResponse.agencyName)
            && Objects.equals(this.authDescribe, showAuthorizationDetailResponse.authDescribe)
            && Objects.equals(this.contentTypeId, showAuthorizationDetailResponse.contentTypeId)
            && Objects.equals(this.contentTypeName, showAuthorizationDetailResponse.contentTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            incidentId,
            simpleDescription,
            resourceTypeId,
            resourceTypeName,
            visitTypeId,
            visitTypeName,
            authEffectiveTime,
            authExpireTime,
            rejectReason,
            incidentAuthDetailList,
            xcustomerName,
            authHandlerName,
            agencyName,
            authDescribe,
            contentTypeId,
            contentTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuthorizationDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    resourceTypeId: ").append(toIndentedString(resourceTypeId)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    visitTypeId: ").append(toIndentedString(visitTypeId)).append("\n");
        sb.append("    visitTypeName: ").append(toIndentedString(visitTypeName)).append("\n");
        sb.append("    authEffectiveTime: ").append(toIndentedString(authEffectiveTime)).append("\n");
        sb.append("    authExpireTime: ").append(toIndentedString(authExpireTime)).append("\n");
        sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
        sb.append("    incidentAuthDetailList: ").append(toIndentedString(incidentAuthDetailList)).append("\n");
        sb.append("    xcustomerName: ").append(toIndentedString(xcustomerName)).append("\n");
        sb.append("    authHandlerName: ").append(toIndentedString(authHandlerName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    authDescribe: ").append(toIndentedString(authDescribe)).append("\n");
        sb.append("    contentTypeId: ").append(toIndentedString(contentTypeId)).append("\n");
        sb.append("    contentTypeName: ").append(toIndentedString(contentTypeName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
