package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentInfo
 */
public class IncidentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incidentId")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "businessTypeName")

    private String businessTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incidentTypeName")

    private String incidentTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customerId")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xcustomerId")

    private String xcustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xcustomerName")

    private String xcustomerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcName")

    private String dcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simpleDescribe")

    private String simpleDescribe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray")

    private Boolean gray;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelList")

    private List<CaseQueryLabel> labelList = null;

    public IncidentInfo withIncidentId(String incidentId) {
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

    public IncidentInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * minimum: 0
     * maximum: 65535
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public IncidentInfo withBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }

    /**
     * 业务分类名称
     * @return businessTypeName
     */
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public IncidentInfo withIncidentTypeName(String incidentTypeName) {
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

    public IncidentInfo withCustomerId(String customerId) {
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

    public IncidentInfo withXcustomerId(String xcustomerId) {
        this.xcustomerId = xcustomerId;
        return this;
    }

    /**
     * 客户id
     * @return xcustomerId
     */
    public String getXcustomerId() {
        return xcustomerId;
    }

    public void setXcustomerId(String xcustomerId) {
        this.xcustomerId = xcustomerId;
    }

    public IncidentInfo withXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
        return this;
    }

    /**
     * 客户名称
     * @return xcustomerName
     */
    public String getXcustomerName() {
        return xcustomerName;
    }

    public void setXcustomerName(String xcustomerName) {
        this.xcustomerName = xcustomerName;
    }

    public IncidentInfo withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    /**
     * dc名称
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public IncidentInfo withSimpleDescribe(String simpleDescribe) {
        this.simpleDescribe = simpleDescribe;
        return this;
    }

    /**
     * 简单说明
     * @return simpleDescribe
     */
    public String getSimpleDescribe() {
        return simpleDescribe;
    }

    public void setSimpleDescribe(String simpleDescribe) {
        this.simpleDescribe = simpleDescribe;
    }

    public IncidentInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态
     * minimum: 0
     * maximum: 65535
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public IncidentInfo withCreateTime(OffsetDateTime createTime) {
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

    public IncidentInfo withGray(Boolean gray) {
        this.gray = gray;
        return this;
    }

    /**
     * 是否灰度
     * @return gray
     */
    public Boolean getGray() {
        return gray;
    }

    public void setGray(Boolean gray) {
        this.gray = gray;
    }

    public IncidentInfo withLabelList(List<CaseQueryLabel> labelList) {
        this.labelList = labelList;
        return this;
    }

    public IncidentInfo addLabelListItem(CaseQueryLabel labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public IncidentInfo withLabelList(Consumer<List<CaseQueryLabel>> labelListSetter) {
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
    public List<CaseQueryLabel> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<CaseQueryLabel> labelList) {
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
        IncidentInfo incidentInfo = (IncidentInfo) o;
        return Objects.equals(this.incidentId, incidentInfo.incidentId) && Objects.equals(this.type, incidentInfo.type)
            && Objects.equals(this.businessTypeName, incidentInfo.businessTypeName)
            && Objects.equals(this.incidentTypeName, incidentInfo.incidentTypeName)
            && Objects.equals(this.customerId, incidentInfo.customerId)
            && Objects.equals(this.xcustomerId, incidentInfo.xcustomerId)
            && Objects.equals(this.xcustomerName, incidentInfo.xcustomerName)
            && Objects.equals(this.dcName, incidentInfo.dcName)
            && Objects.equals(this.simpleDescribe, incidentInfo.simpleDescribe)
            && Objects.equals(this.status, incidentInfo.status)
            && Objects.equals(this.createTime, incidentInfo.createTime) && Objects.equals(this.gray, incidentInfo.gray)
            && Objects.equals(this.labelList, incidentInfo.labelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentId,
            type,
            businessTypeName,
            incidentTypeName,
            customerId,
            xcustomerId,
            xcustomerName,
            dcName,
            simpleDescribe,
            status,
            createTime,
            gray,
            labelList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentInfo {\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    businessTypeName: ").append(toIndentedString(businessTypeName)).append("\n");
        sb.append("    incidentTypeName: ").append(toIndentedString(incidentTypeName)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    xcustomerId: ").append(toIndentedString(xcustomerId)).append("\n");
        sb.append("    xcustomerName: ").append(toIndentedString(xcustomerName)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    simpleDescribe: ").append(toIndentedString(simpleDescribe)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    gray: ").append(toIndentedString(gray)).append("\n");
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
