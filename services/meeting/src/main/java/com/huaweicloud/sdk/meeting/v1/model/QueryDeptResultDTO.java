package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryDeptResultDTO
 */
public class QueryDeptResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptLevel")

    private Integer deptLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptNamePath")

    private String deptNamePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLeafNode")

    private Boolean isLeafNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentDeptCode")

    private String parentDeptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCodePath")

    private String deptCodePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inPermission")

    private String inPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outPermission")

    private String outPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designatedOutDeptCodes")

    private List<IdMarkDTO> designatedOutDeptCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    private Integer sortLevel;

    public QueryDeptResultDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编码，企业内唯一。
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public QueryDeptResultDTO withDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
        return this;
    }

    /**
     * 部门层级。
     * @return deptLevel
     */
    public Integer getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
    }

    public QueryDeptResultDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public QueryDeptResultDTO withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    /**
     * 部门名路径。
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public QueryDeptResultDTO withIsLeafNode(Boolean isLeafNode) {
        this.isLeafNode = isLeafNode;
        return this;
    }

    /**
     * 是否叶子节点。
     * @return isLeafNode
     */
    public Boolean getIsLeafNode() {
        return isLeafNode;
    }

    public void setIsLeafNode(Boolean isLeafNode) {
        this.isLeafNode = isLeafNode;
    }

    public QueryDeptResultDTO withParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
        return this;
    }

    /**
     * 父部门编码。
     * @return parentDeptCode
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }

    public QueryDeptResultDTO withDeptCodePath(String deptCodePath) {
        this.deptCodePath = deptCodePath;
        return this;
    }

    /**
     * 部门编码路径。
     * @return deptCodePath
     */
    public String getDeptCodePath() {
        return deptCodePath;
    }

    public void setDeptCodePath(String deptCodePath) {
        this.deptCodePath = deptCodePath;
    }

    public QueryDeptResultDTO withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 备注。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public QueryDeptResultDTO withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业ID。
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public QueryDeptResultDTO withInPermission(String inPermission) {
        this.inPermission = inPermission;
        return this;
    }

    /**
     * 其他用户对该部门下用户的访问权限。
     * @return inPermission
     */
    public String getInPermission() {
        return inPermission;
    }

    public void setInPermission(String inPermission) {
        this.inPermission = inPermission;
    }

    public QueryDeptResultDTO withOutPermission(String outPermission) {
        this.outPermission = outPermission;
        return this;
    }

    /**
     * 该部门下用户访问权限控制。
     * @return outPermission
     */
    public String getOutPermission() {
        return outPermission;
    }

    public void setOutPermission(String outPermission) {
        this.outPermission = outPermission;
    }

    public QueryDeptResultDTO withDesignatedOutDeptCodes(List<IdMarkDTO> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
        return this;
    }

    public QueryDeptResultDTO addDesignatedOutDeptCodesItem(IdMarkDTO designatedOutDeptCodesItem) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        this.designatedOutDeptCodes.add(designatedOutDeptCodesItem);
        return this;
    }

    public QueryDeptResultDTO withDesignatedOutDeptCodes(Consumer<List<IdMarkDTO>> designatedOutDeptCodesSetter) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        designatedOutDeptCodesSetter.accept(this.designatedOutDeptCodes);
        return this;
    }

    /**
     * 允许访问的部门列表。
     * @return designatedOutDeptCodes
     */
    public List<IdMarkDTO> getDesignatedOutDeptCodes() {
        return designatedOutDeptCodes;
    }

    public void setDesignatedOutDeptCodes(List<IdMarkDTO> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
    }

    public QueryDeptResultDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 部门排序号。
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDeptResultDTO that = (QueryDeptResultDTO) obj;
        return Objects.equals(this.deptCode, that.deptCode) && Objects.equals(this.deptLevel, that.deptLevel)
            && Objects.equals(this.deptName, that.deptName) && Objects.equals(this.deptNamePath, that.deptNamePath)
            && Objects.equals(this.isLeafNode, that.isLeafNode)
            && Objects.equals(this.parentDeptCode, that.parentDeptCode)
            && Objects.equals(this.deptCodePath, that.deptCodePath) && Objects.equals(this.note, that.note)
            && Objects.equals(this.corpId, that.corpId) && Objects.equals(this.inPermission, that.inPermission)
            && Objects.equals(this.outPermission, that.outPermission)
            && Objects.equals(this.designatedOutDeptCodes, that.designatedOutDeptCodes)
            && Objects.equals(this.sortLevel, that.sortLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptCode,
            deptLevel,
            deptName,
            deptNamePath,
            isLeafNode,
            parentDeptCode,
            deptCodePath,
            note,
            corpId,
            inPermission,
            outPermission,
            designatedOutDeptCodes,
            sortLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeptResultDTO {\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptLevel: ").append(toIndentedString(deptLevel)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    isLeafNode: ").append(toIndentedString(isLeafNode)).append("\n");
        sb.append("    parentDeptCode: ").append(toIndentedString(parentDeptCode)).append("\n");
        sb.append("    deptCodePath: ").append(toIndentedString(deptCodePath)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    inPermission: ").append(toIndentedString(inPermission)).append("\n");
        sb.append("    outPermission: ").append(toIndentedString(outPermission)).append("\n");
        sb.append("    designatedOutDeptCodes: ").append(toIndentedString(designatedOutDeptCodes)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
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
