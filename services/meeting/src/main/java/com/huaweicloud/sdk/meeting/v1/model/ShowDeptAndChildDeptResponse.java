package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDeptAndChildDeptResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    @JacksonXmlProperty(localName = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    @JacksonXmlProperty(localName = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptLevel")

    @JacksonXmlProperty(localName = "deptLevel")

    private Integer deptLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    @JacksonXmlProperty(localName = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptNamePath")

    @JacksonXmlProperty(localName = "deptNamePath")

    private String deptNamePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLeafNode")

    @JacksonXmlProperty(localName = "isLeafNode")

    private Boolean isLeafNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentDeptCode")

    @JacksonXmlProperty(localName = "parentDeptCode")

    private String parentDeptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCodePath")

    @JacksonXmlProperty(localName = "deptCodePath")

    private String deptCodePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    @JacksonXmlProperty(localName = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inPermission")

    @JacksonXmlProperty(localName = "inPermission")

    private String inPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outPermission")

    @JacksonXmlProperty(localName = "outPermission")

    private String outPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designatedOutDeptCodes")

    @JacksonXmlProperty(localName = "designatedOutDeptCodes")

    private List<IdMarkDTO> designatedOutDeptCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childDepts")

    @JacksonXmlProperty(localName = "childDepts")

    private List<QueryDeptResultDTO> childDepts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    @JacksonXmlProperty(localName = "sortLevel")

    private Integer sortLevel;

    public ShowDeptAndChildDeptResponse withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业id
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public ShowDeptAndChildDeptResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门id
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ShowDeptAndChildDeptResponse withDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
        return this;
    }

    /**
     * 部门层级
     * @return deptLevel
     */
    public Integer getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
    }

    public ShowDeptAndChildDeptResponse withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ShowDeptAndChildDeptResponse withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    /**
     * 根部门名路径
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public ShowDeptAndChildDeptResponse withIsLeafNode(Boolean isLeafNode) {
        this.isLeafNode = isLeafNode;
        return this;
    }

    /**
     * 是否叶子
     * @return isLeafNode
     */
    public Boolean getIsLeafNode() {
        return isLeafNode;
    }

    public void setIsLeafNode(Boolean isLeafNode) {
        this.isLeafNode = isLeafNode;
    }

    public ShowDeptAndChildDeptResponse withParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
        return this;
    }

    /**
     * 父部门编号
     * @return parentDeptCode
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }

    public ShowDeptAndChildDeptResponse withDeptCodePath(String deptCodePath) {
        this.deptCodePath = deptCodePath;
        return this;
    }

    /**
     * 部门编码路径
     * @return deptCodePath
     */
    public String getDeptCodePath() {
        return deptCodePath;
    }

    public void setDeptCodePath(String deptCodePath) {
        this.deptCodePath = deptCodePath;
    }

    public ShowDeptAndChildDeptResponse withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 备注
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ShowDeptAndChildDeptResponse withInPermission(String inPermission) {
        this.inPermission = inPermission;
        return this;
    }

    /**
     * 其他用户对该部门下用户的访问权限
     * @return inPermission
     */
    public String getInPermission() {
        return inPermission;
    }

    public void setInPermission(String inPermission) {
        this.inPermission = inPermission;
    }

    public ShowDeptAndChildDeptResponse withOutPermission(String outPermission) {
        this.outPermission = outPermission;
        return this;
    }

    /**
     * 该部门下用户访问权限控制
     * @return outPermission
     */
    public String getOutPermission() {
        return outPermission;
    }

    public void setOutPermission(String outPermission) {
        this.outPermission = outPermission;
    }

    public ShowDeptAndChildDeptResponse withDesignatedOutDeptCodes(List<IdMarkDTO> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
        return this;
    }

    public ShowDeptAndChildDeptResponse addDesignatedOutDeptCodesItem(IdMarkDTO designatedOutDeptCodesItem) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        this.designatedOutDeptCodes.add(designatedOutDeptCodesItem);
        return this;
    }

    public ShowDeptAndChildDeptResponse withDesignatedOutDeptCodes(
        Consumer<List<IdMarkDTO>> designatedOutDeptCodesSetter) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        designatedOutDeptCodesSetter.accept(this.designatedOutDeptCodes);
        return this;
    }

    /**
     * 许访问的部门列表,前台回显DTO，id为deptCode,mark为部门名称
     * @return designatedOutDeptCodes
     */
    public List<IdMarkDTO> getDesignatedOutDeptCodes() {
        return designatedOutDeptCodes;
    }

    public void setDesignatedOutDeptCodes(List<IdMarkDTO> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
    }

    public ShowDeptAndChildDeptResponse withChildDepts(List<QueryDeptResultDTO> childDepts) {
        this.childDepts = childDepts;
        return this;
    }

    public ShowDeptAndChildDeptResponse addChildDeptsItem(QueryDeptResultDTO childDeptsItem) {
        if (this.childDepts == null) {
            this.childDepts = new ArrayList<>();
        }
        this.childDepts.add(childDeptsItem);
        return this;
    }

    public ShowDeptAndChildDeptResponse withChildDepts(Consumer<List<QueryDeptResultDTO>> childDeptsSetter) {
        if (this.childDepts == null) {
            this.childDepts = new ArrayList<>();
        }
        childDeptsSetter.accept(this.childDepts);
        return this;
    }

    /**
     * 子部门列表
     * @return childDepts
     */
    public List<QueryDeptResultDTO> getChildDepts() {
        return childDepts;
    }

    public void setChildDepts(List<QueryDeptResultDTO> childDepts) {
        this.childDepts = childDepts;
    }

    public ShowDeptAndChildDeptResponse withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 部门排序号
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeptAndChildDeptResponse showDeptAndChildDeptResponse = (ShowDeptAndChildDeptResponse) o;
        return Objects.equals(this.corpId, showDeptAndChildDeptResponse.corpId)
            && Objects.equals(this.deptCode, showDeptAndChildDeptResponse.deptCode)
            && Objects.equals(this.deptLevel, showDeptAndChildDeptResponse.deptLevel)
            && Objects.equals(this.deptName, showDeptAndChildDeptResponse.deptName)
            && Objects.equals(this.deptNamePath, showDeptAndChildDeptResponse.deptNamePath)
            && Objects.equals(this.isLeafNode, showDeptAndChildDeptResponse.isLeafNode)
            && Objects.equals(this.parentDeptCode, showDeptAndChildDeptResponse.parentDeptCode)
            && Objects.equals(this.deptCodePath, showDeptAndChildDeptResponse.deptCodePath)
            && Objects.equals(this.note, showDeptAndChildDeptResponse.note)
            && Objects.equals(this.inPermission, showDeptAndChildDeptResponse.inPermission)
            && Objects.equals(this.outPermission, showDeptAndChildDeptResponse.outPermission)
            && Objects.equals(this.designatedOutDeptCodes, showDeptAndChildDeptResponse.designatedOutDeptCodes)
            && Objects.equals(this.childDepts, showDeptAndChildDeptResponse.childDepts)
            && Objects.equals(this.sortLevel, showDeptAndChildDeptResponse.sortLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corpId,
            deptCode,
            deptLevel,
            deptName,
            deptNamePath,
            isLeafNode,
            parentDeptCode,
            deptCodePath,
            note,
            inPermission,
            outPermission,
            designatedOutDeptCodes,
            childDepts,
            sortLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeptAndChildDeptResponse {\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptLevel: ").append(toIndentedString(deptLevel)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    isLeafNode: ").append(toIndentedString(isLeafNode)).append("\n");
        sb.append("    parentDeptCode: ").append(toIndentedString(parentDeptCode)).append("\n");
        sb.append("    deptCodePath: ").append(toIndentedString(deptCodePath)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    inPermission: ").append(toIndentedString(inPermission)).append("\n");
        sb.append("    outPermission: ").append(toIndentedString(outPermission)).append("\n");
        sb.append("    designatedOutDeptCodes: ").append(toIndentedString(designatedOutDeptCodes)).append("\n");
        sb.append("    childDepts: ").append(toIndentedString(childDepts)).append("\n");
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
