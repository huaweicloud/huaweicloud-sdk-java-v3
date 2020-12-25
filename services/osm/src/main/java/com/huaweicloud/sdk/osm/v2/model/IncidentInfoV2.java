package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.LabelInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IncidentInfoV2
 */
public class IncidentInfoV2  {



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
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_list")
    
    private List<LabelInfo> labelList = null;
    
    public IncidentInfoV2 withXcustomerId(String xcustomerId) {
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

    public IncidentInfoV2 withXcustomerName(String xcustomerName) {
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

    public IncidentInfoV2 withStatus(Integer status) {
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

    public IncidentInfoV2 withIncidentId(String incidentId) {
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

    public IncidentInfoV2 withBusinessTypeName(String businessTypeName) {
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

    public IncidentInfoV2 withIncidentTypeName(String incidentTypeName) {
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

    public IncidentInfoV2 withCustomerId(String customerId) {
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

    public IncidentInfoV2 withDcName(String dcName) {
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

    public IncidentInfoV2 withSimpleDescription(String simpleDescription) {
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

    public IncidentInfoV2 withCreateTime(OffsetDateTime createTime) {
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

    public IncidentInfoV2 withLabelList(List<LabelInfo> labelList) {
        this.labelList = labelList;
        return this;
    }

    
    public IncidentInfoV2 addLabelListItem(LabelInfo labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public IncidentInfoV2 withLabelList(Consumer<List<LabelInfo>> labelListSetter) {
        if(this.labelList == null ){
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 标签列表
     * @return labelList
     */
    public List<LabelInfo> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<LabelInfo> labelList) {
        this.labelList = labelList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentInfoV2 incidentInfoV2 = (IncidentInfoV2) o;
        return Objects.equals(this.xcustomerId, incidentInfoV2.xcustomerId) &&
            Objects.equals(this.xcustomerName, incidentInfoV2.xcustomerName) &&
            Objects.equals(this.status, incidentInfoV2.status) &&
            Objects.equals(this.incidentId, incidentInfoV2.incidentId) &&
            Objects.equals(this.businessTypeName, incidentInfoV2.businessTypeName) &&
            Objects.equals(this.incidentTypeName, incidentInfoV2.incidentTypeName) &&
            Objects.equals(this.customerId, incidentInfoV2.customerId) &&
            Objects.equals(this.dcName, incidentInfoV2.dcName) &&
            Objects.equals(this.simpleDescription, incidentInfoV2.simpleDescription) &&
            Objects.equals(this.createTime, incidentInfoV2.createTime) &&
            Objects.equals(this.labelList, incidentInfoV2.labelList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xcustomerId, xcustomerName, status, incidentId, businessTypeName, incidentTypeName, customerId, dcName, simpleDescription, createTime, labelList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentInfoV2 {\n");
        sb.append("    xcustomerId: ").append(toIndentedString(xcustomerId)).append("\n");
        sb.append("    xcustomerName: ").append(toIndentedString(xcustomerName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    businessTypeName: ").append(toIndentedString(businessTypeName)).append("\n");
        sb.append("    incidentTypeName: ").append(toIndentedString(incidentTypeName)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
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

