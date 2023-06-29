package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * QualityInfoVO
 */
public class QualityInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private Long tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_id")

    private Long attrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_quality_id")

    private Long dataQualityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_control")

    private Integer showControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_quality_name")

    private String dataQualityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_conf")

    private String alertConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private String extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_standard")

    private Boolean fromStandard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_description")

    private String resultDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public QualityInfoVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 编码
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QualityInfoVO withTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表id
     * @return tableId
     */
    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public QualityInfoVO withAttrId(Long attrId) {
        this.attrId = attrId;
        return this;
    }

    /**
     * 属性id
     * @return attrId
     */
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public QualityInfoVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public QualityInfoVO withDataQualityId(Long dataQualityId) {
        this.dataQualityId = dataQualityId;
        return this;
    }

    /**
     * 质量id
     * @return dataQualityId
     */
    public Long getDataQualityId() {
        return dataQualityId;
    }

    public void setDataQualityId(Long dataQualityId) {
        this.dataQualityId = dataQualityId;
    }

    public QualityInfoVO withShowControl(Integer showControl) {
        this.showControl = showControl;
        return this;
    }

    /**
     * 是否要显示  正则表达式
     * @return showControl
     */
    public Integer getShowControl() {
        return showControl;
    }

    public void setShowControl(Integer showControl) {
        this.showControl = showControl;
    }

    public QualityInfoVO withDataQualityName(String dataQualityName) {
        this.dataQualityName = dataQualityName;
        return this;
    }

    /**
     * 质量名称
     * @return dataQualityName
     */
    public String getDataQualityName() {
        return dataQualityName;
    }

    public void setDataQualityName(String dataQualityName) {
        this.dataQualityName = dataQualityName;
    }

    public QualityInfoVO withAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }

    /**
     * 告警配置
     * @return alertConf
     */
    public String getAlertConf() {
        return alertConf;
    }

    public void setAlertConf(String alertConf) {
        this.alertConf = alertConf;
    }

    public QualityInfoVO withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 正则相关校验规则中正则配置
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public QualityInfoVO withExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    /**
     * 扩展信息
     * @return extendInfo
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public QualityInfoVO withFromStandard(Boolean fromStandard) {
        this.fromStandard = fromStandard;
        return this;
    }

    /**
     * 是否来源于数据标准质量配置
     * @return fromStandard
     */
    public Boolean getFromStandard() {
        return fromStandard;
    }

    public void setFromStandard(Boolean fromStandard) {
        this.fromStandard = fromStandard;
    }

    public QualityInfoVO withResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }

    /**
     * 结果说明
     * @return resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public QualityInfoVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public QualityInfoVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public QualityInfoVO withCreateTime(OffsetDateTime createTime) {
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

    public QualityInfoVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QualityInfoVO that = (QualityInfoVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.attrId, that.attrId) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.dataQualityId, that.dataQualityId)
            && Objects.equals(this.showControl, that.showControl)
            && Objects.equals(this.dataQualityName, that.dataQualityName)
            && Objects.equals(this.alertConf, that.alertConf) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.extendInfo, that.extendInfo) && Objects.equals(this.fromStandard, that.fromStandard)
            && Objects.equals(this.resultDescription, that.resultDescription)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tableId,
            attrId,
            bizType,
            dataQualityId,
            showControl,
            dataQualityName,
            alertConf,
            expression,
            extendInfo,
            fromStandard,
            resultDescription,
            createBy,
            updateBy,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityInfoVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    dataQualityId: ").append(toIndentedString(dataQualityId)).append("\n");
        sb.append("    showControl: ").append(toIndentedString(showControl)).append("\n");
        sb.append("    dataQualityName: ").append(toIndentedString(dataQualityName)).append("\n");
        sb.append("    alertConf: ").append(toIndentedString(alertConf)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    fromStandard: ").append(toIndentedString(fromStandard)).append("\n");
        sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
