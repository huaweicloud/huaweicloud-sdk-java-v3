package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.IncidentDetailExtInfoV2;
import com.huaweicloud.sdk.osm.v2.model.IncidentMessageV2;
import com.huaweicloud.sdk.osm.v2.model.IncidentSatisfactionV2Do;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IncidentDetailInfoV2
 */
public class IncidentDetailInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xcustomer_id")
    
    private String xcustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xcustomer_name")
    
    private String xcustomerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="judgement")
    
    private String judgement;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_id")
    
    private String incidentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_name")
    
    private String businessTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_type_name")
    
    private String incidentTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dc_name")
    
    private String dcName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="simple_description")
    
    private String simpleDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_name")
    
    private String sourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_list")
    
    private List<IncidentMessageV2> messageList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_satisfaction")
    
    private List<IncidentSatisfactionV2Do> incidentSatisfaction = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_authorized")
    
    private Integer isAuthorized;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity_name")
    
    private String severityName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_ownership")
    
    private Integer businessOwnership;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolve_time")
    
    private Long resolveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ext_info")
    
    private IncidentDetailExtInfoV2 extInfo;

    public IncidentDetailInfoV2 withXcustomerId(String xcustomerId) {
        this.xcustomerId = xcustomerId;
        return this;
    }

    


    /**
     * 子用户id
     * @return xcustomerId
     */
    public String getXcustomerId() {
        return xcustomerId;
    }

    public void setXcustomerId(String xcustomerId) {
        this.xcustomerId = xcustomerId;
    }

    

    public IncidentDetailInfoV2 withXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
        return this;
    }

    


    /**
     * 子用户名称
     * @return xcustomerName
     */
    public String getXcustomerName() {
        return xcustomerName;
    }

    public void setXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
    }

    

    public IncidentDetailInfoV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态 0：待受理 1：处理中 2：待确认结果 3：已完成 4：已撤销 12：无效 17： 待反馈
     * minimum: 0
     * maximum: 20
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public IncidentDetailInfoV2 withJudgement(String judgement) {
        this.judgement = judgement;
        return this;
    }

    


    /**
     * 评价内容
     * @return judgement
     */
    public String getJudgement() {
        return judgement;
    }

    public void setJudgement(String judgement) {
        this.judgement = judgement;
    }

    

    public IncidentDetailInfoV2 withIncidentId(String incidentId) {
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

    

    public IncidentDetailInfoV2 withBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }

    


    /**
     * 问题类型名称
     * @return businessTypeName
     */
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    

    public IncidentDetailInfoV2 withIncidentTypeName(String incidentTypeName) {
        this.incidentTypeName = incidentTypeName;
        return this;
    }

    


    /**
     * 工单类型名称
     * @return incidentTypeName
     */
    public String getIncidentTypeName() {
        return incidentTypeName;
    }

    public void setIncidentTypeName(String incidentTypeName) {
        this.incidentTypeName = incidentTypeName;
    }

    

    public IncidentDetailInfoV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * 客户id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public IncidentDetailInfoV2 withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    


    /**
     * 区域名称
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    

    public IncidentDetailInfoV2 withSimpleDescription(String simpleDescription) {
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

    

    public IncidentDetailInfoV2 withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    


    /**
     * 来源名称
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    

    public IncidentDetailInfoV2 withCreateTime(OffsetDateTime createTime) {
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

    

    public IncidentDetailInfoV2 withMessageList(List<IncidentMessageV2> messageList) {
        this.messageList = messageList;
        return this;
    }

    
    public IncidentDetailInfoV2 addMessageListItem(IncidentMessageV2 messageListItem) {
        this.messageList.add(messageListItem);
        return this;
    }

    public IncidentDetailInfoV2 withMessageList(Consumer<List<IncidentMessageV2>> messageListSetter) {
        if(this.messageList == null ){
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * 留言列表
     * @return messageList
     */
    public List<IncidentMessageV2> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<IncidentMessageV2> messageList) {
        this.messageList = messageList;
    }

    

    public IncidentDetailInfoV2 withIncidentSatisfaction(List<IncidentSatisfactionV2Do> incidentSatisfaction) {
        this.incidentSatisfaction = incidentSatisfaction;
        return this;
    }

    
    public IncidentDetailInfoV2 addIncidentSatisfactionItem(IncidentSatisfactionV2Do incidentSatisfactionItem) {
        this.incidentSatisfaction.add(incidentSatisfactionItem);
        return this;
    }

    public IncidentDetailInfoV2 withIncidentSatisfaction(Consumer<List<IncidentSatisfactionV2Do>> incidentSatisfactionSetter) {
        if(this.incidentSatisfaction == null ){
            this.incidentSatisfaction = new ArrayList<>();
        }
        incidentSatisfactionSetter.accept(this.incidentSatisfaction);
        return this;
    }

    /**
     * 满意度列表
     * @return incidentSatisfaction
     */
    public List<IncidentSatisfactionV2Do> getIncidentSatisfaction() {
        return incidentSatisfaction;
    }

    public void setIncidentSatisfaction(List<IncidentSatisfactionV2Do> incidentSatisfaction) {
        this.incidentSatisfaction = incidentSatisfaction;
    }

    

    public IncidentDetailInfoV2 withIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    


    /**
     * 是否授权
     * minimum: 0
     * maximum: 1
     * @return isAuthorized
     */
    public Integer getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    

    public IncidentDetailInfoV2 withSeverityName(String severityName) {
        this.severityName = severityName;
        return this;
    }

    


    /**
     * 严重性名称
     * @return severityName
     */
    public String getSeverityName() {
        return severityName;
    }

    public void setSeverityName(String severityName) {
        this.severityName = severityName;
    }

    

    public IncidentDetailInfoV2 withBusinessOwnership(Integer businessOwnership) {
        this.businessOwnership = businessOwnership;
        return this;
    }

    


    /**
     * 业务归属 0华为云 1BP伙伴 2ISV
     * minimum: 0
     * maximum: 2
     * @return businessOwnership
     */
    public Integer getBusinessOwnership() {
        return businessOwnership;
    }

    public void setBusinessOwnership(Integer businessOwnership) {
        this.businessOwnership = businessOwnership;
    }

    

    public IncidentDetailInfoV2 withResolveTime(Long resolveTime) {
        this.resolveTime = resolveTime;
        return this;
    }

    


    /**
     * 解决时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return resolveTime
     */
    public Long getResolveTime() {
        return resolveTime;
    }

    public void setResolveTime(Long resolveTime) {
        this.resolveTime = resolveTime;
    }

    

    public IncidentDetailInfoV2 withExtInfo(IncidentDetailExtInfoV2 extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public IncidentDetailInfoV2 withExtInfo(Consumer<IncidentDetailExtInfoV2> extInfoSetter) {
        if(this.extInfo == null ){
            this.extInfo = new IncidentDetailExtInfoV2();
            extInfoSetter.accept(this.extInfo);
        }
        
        return this;
    }


    /**
     * Get extInfo
     * @return extInfo
     */
    public IncidentDetailExtInfoV2 getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(IncidentDetailExtInfoV2 extInfo) {
        this.extInfo = extInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentDetailInfoV2 incidentDetailInfoV2 = (IncidentDetailInfoV2) o;
        return Objects.equals(this.xcustomerId, incidentDetailInfoV2.xcustomerId) &&
            Objects.equals(this.xcustomerName, incidentDetailInfoV2.xcustomerName) &&
            Objects.equals(this.status, incidentDetailInfoV2.status) &&
            Objects.equals(this.judgement, incidentDetailInfoV2.judgement) &&
            Objects.equals(this.incidentId, incidentDetailInfoV2.incidentId) &&
            Objects.equals(this.businessTypeName, incidentDetailInfoV2.businessTypeName) &&
            Objects.equals(this.incidentTypeName, incidentDetailInfoV2.incidentTypeName) &&
            Objects.equals(this.customerId, incidentDetailInfoV2.customerId) &&
            Objects.equals(this.dcName, incidentDetailInfoV2.dcName) &&
            Objects.equals(this.simpleDescription, incidentDetailInfoV2.simpleDescription) &&
            Objects.equals(this.sourceName, incidentDetailInfoV2.sourceName) &&
            Objects.equals(this.createTime, incidentDetailInfoV2.createTime) &&
            Objects.equals(this.messageList, incidentDetailInfoV2.messageList) &&
            Objects.equals(this.incidentSatisfaction, incidentDetailInfoV2.incidentSatisfaction) &&
            Objects.equals(this.isAuthorized, incidentDetailInfoV2.isAuthorized) &&
            Objects.equals(this.severityName, incidentDetailInfoV2.severityName) &&
            Objects.equals(this.businessOwnership, incidentDetailInfoV2.businessOwnership) &&
            Objects.equals(this.resolveTime, incidentDetailInfoV2.resolveTime) &&
            Objects.equals(this.extInfo, incidentDetailInfoV2.extInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xcustomerId, xcustomerName, status, judgement, incidentId, businessTypeName, incidentTypeName, customerId, dcName, simpleDescription, sourceName, createTime, messageList, incidentSatisfaction, isAuthorized, severityName, businessOwnership, resolveTime, extInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentDetailInfoV2 {\n");
        sb.append("    xcustomerId: ").append(toIndentedString(xcustomerId)).append("\n");
        sb.append("    xcustomerName: ").append(toIndentedString(xcustomerName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    judgement: ").append(toIndentedString(judgement)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    businessTypeName: ").append(toIndentedString(businessTypeName)).append("\n");
        sb.append("    incidentTypeName: ").append(toIndentedString(incidentTypeName)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
        sb.append("    incidentSatisfaction: ").append(toIndentedString(incidentSatisfaction)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    severityName: ").append(toIndentedString(severityName)).append("\n");
        sb.append("    businessOwnership: ").append(toIndentedString(businessOwnership)).append("\n");
        sb.append("    resolveTime: ").append(toIndentedString(resolveTime)).append("\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
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

