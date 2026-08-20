package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项关联请求数据对象
 */
public class IssueAssociateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_ids")

    private String associatedIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_flag")

    private Integer operationFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_issue_type")

    private String associateIssueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_issue_type")

    private String sourceIssueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_replace")

    private Boolean isReplace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_field_code")

    private String linkFieldCode;

    public IssueAssociateVO withAssociatedIds(String associatedIds) {
        this.associatedIds = associatedIds;
        return this;
    }

    /**
     * 关联的工作项ID，多个ID使用逗号分割。可以通过查询工作项列表或者查询树状工作项接口获取，响应消息体中的id字段的值就是工作项ID。 当link_field_code=link时，最多支持关联500个工作项ID，其他场景最多支持50个工作项ID。
     * @return associatedIds
     */
    public String getAssociatedIds() {
        return associatedIds;
    }

    public void setAssociatedIds(String associatedIds) {
        this.associatedIds = associatedIds;
    }

    public IssueAssociateVO withOperationFlag(Integer operationFlag) {
        this.operationFlag = operationFlag;
        return this;
    }

    /**
     * 操作类型标记位。
     * @return operationFlag
     */
    public Integer getOperationFlag() {
        return operationFlag;
    }

    public void setOperationFlag(Integer operationFlag) {
        this.operationFlag = operationFlag;
    }

    public IssueAssociateVO withAssociateIssueType(String associateIssueType) {
        this.associateIssueType = associateIssueType;
        return this;
    }

    /**
     * 关联项类型编码。
     * @return associateIssueType
     */
    public String getAssociateIssueType() {
        return associateIssueType;
    }

    public void setAssociateIssueType(String associateIssueType) {
        this.associateIssueType = associateIssueType;
    }

    public IssueAssociateVO withSourceIssueType(String sourceIssueType) {
        this.sourceIssueType = sourceIssueType;
        return this;
    }

    /**
     * 当前工作项类型编码。
     * @return sourceIssueType
     */
    public String getSourceIssueType() {
        return sourceIssueType;
    }

    public void setSourceIssueType(String sourceIssueType) {
        this.sourceIssueType = sourceIssueType;
    }

    public IssueAssociateVO withIsReplace(Boolean isReplace) {
        this.isReplace = isReplace;
        return this;
    }

    /**
     * 是否使用替换模式。默认为false，追加关联项。如果为true，则会删除原有的关联项，替换为本次关联的工作项。
     * @return isReplace
     */
    public Boolean getIsReplace() {
        return isReplace;
    }

    public void setIsReplace(Boolean isReplace) {
        this.isReplace = isReplace;
    }

    public IssueAssociateVO withLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
        return this;
    }

    /**
     * 关联字段的字段编码。
     * @return linkFieldCode
     */
    public String getLinkFieldCode() {
        return linkFieldCode;
    }

    public void setLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueAssociateVO that = (IssueAssociateVO) obj;
        return Objects.equals(this.associatedIds, that.associatedIds)
            && Objects.equals(this.operationFlag, that.operationFlag)
            && Objects.equals(this.associateIssueType, that.associateIssueType)
            && Objects.equals(this.sourceIssueType, that.sourceIssueType)
            && Objects.equals(this.isReplace, that.isReplace) && Objects.equals(this.linkFieldCode, that.linkFieldCode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(associatedIds, operationFlag, associateIssueType, sourceIssueType, isReplace, linkFieldCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueAssociateVO {\n");
        sb.append("    associatedIds: ").append(toIndentedString(associatedIds)).append("\n");
        sb.append("    operationFlag: ").append(toIndentedString(operationFlag)).append("\n");
        sb.append("    associateIssueType: ").append(toIndentedString(associateIssueType)).append("\n");
        sb.append("    sourceIssueType: ").append(toIndentedString(sourceIssueType)).append("\n");
        sb.append("    isReplace: ").append(toIndentedString(isReplace)).append("\n");
        sb.append("    linkFieldCode: ").append(toIndentedString(linkFieldCode)).append("\n");
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
