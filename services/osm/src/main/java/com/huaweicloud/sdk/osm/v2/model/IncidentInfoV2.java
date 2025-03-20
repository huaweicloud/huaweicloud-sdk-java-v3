package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentInfoV2
 */
public class IncidentInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xcustomer_id")

    private String xcustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xcustomer_name")

    private String xcustomerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type_name")

    private String businessTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type_name")

    private String incidentTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_category_name")

    private String productCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_service_type")

    private String incidentServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_name")

    private String dcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_description")

    private String simpleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause")

    private String rootCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirmed_time")

    private OffsetDateTime confirmedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

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

    public IncidentInfoV2 withProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
        return this;
    }

    /**
     * 产品类型名称
     * @return productCategoryName
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public IncidentInfoV2 withIncidentServiceType(String incidentServiceType) {
        this.incidentServiceType = incidentServiceType;
        return this;
    }

    /**
     * 服务类型
     * @return incidentServiceType
     */
    public String getIncidentServiceType() {
        return incidentServiceType;
    }

    public void setIncidentServiceType(String incidentServiceType) {
        this.incidentServiceType = incidentServiceType;
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

    public IncidentInfoV2 withRootCause(String rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    /**
     * 问题归属方
     * @return rootCause
     */
    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public IncidentInfoV2 withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 解决方案
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
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

    public IncidentInfoV2 withConfirmedTime(OffsetDateTime confirmedTime) {
        this.confirmedTime = confirmedTime;
        return this;
    }

    /**
     * 解决时间
     * @return confirmedTime
     */
    public OffsetDateTime getConfirmedTime() {
        return confirmedTime;
    }

    public void setConfirmedTime(OffsetDateTime confirmedTime) {
        this.confirmedTime = confirmedTime;
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
        if (this.labelList == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentInfoV2 that = (IncidentInfoV2) obj;
        return Objects.equals(this.xcustomerId, that.xcustomerId)
            && Objects.equals(this.xcustomerName, that.xcustomerName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.incidentId, that.incidentId)
            && Objects.equals(this.businessTypeName, that.businessTypeName)
            && Objects.equals(this.incidentTypeName, that.incidentTypeName)
            && Objects.equals(this.productCategoryName, that.productCategoryName)
            && Objects.equals(this.incidentServiceType, that.incidentServiceType)
            && Objects.equals(this.customerId, that.customerId) && Objects.equals(this.dcName, that.dcName)
            && Objects.equals(this.simpleDescription, that.simpleDescription)
            && Objects.equals(this.rootCause, that.rootCause) && Objects.equals(this.resolution, that.resolution)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.confirmedTime, that.confirmedTime) && Objects.equals(this.labelList, that.labelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xcustomerId,
            xcustomerName,
            status,
            incidentId,
            businessTypeName,
            incidentTypeName,
            productCategoryName,
            incidentServiceType,
            customerId,
            dcName,
            simpleDescription,
            rootCause,
            resolution,
            createTime,
            confirmedTime,
            labelList);
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
        sb.append("    productCategoryName: ").append(toIndentedString(productCategoryName)).append("\n");
        sb.append("    incidentServiceType: ").append(toIndentedString(incidentServiceType)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    confirmedTime: ").append(toIndentedString(confirmedTime)).append("\n");
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
