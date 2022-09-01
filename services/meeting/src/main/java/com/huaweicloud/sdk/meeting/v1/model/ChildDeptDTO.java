package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 子部门详情
 */
public class ChildDeptDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    @JacksonXmlProperty(localName = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    @JacksonXmlProperty(localName = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLeafNodes")

    @JacksonXmlProperty(localName = "isLeafNodes")

    private Boolean isLeafNodes;

    public ChildDeptDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编码
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ChildDeptDTO withDeptName(String deptName) {
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

    public ChildDeptDTO withIsLeafNodes(Boolean isLeafNodes) {
        this.isLeafNodes = isLeafNodes;
        return this;
    }

    /**
     * 是否为叶子节点（没有子部门的称为叶子节点）
     * @return isLeafNodes
     */
    public Boolean getIsLeafNodes() {
        return isLeafNodes;
    }

    public void setIsLeafNodes(Boolean isLeafNodes) {
        this.isLeafNodes = isLeafNodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChildDeptDTO childDeptDTO = (ChildDeptDTO) o;
        return Objects.equals(this.deptCode, childDeptDTO.deptCode)
            && Objects.equals(this.deptName, childDeptDTO.deptName)
            && Objects.equals(this.isLeafNodes, childDeptDTO.isLeafNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptCode, deptName, isLeafNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChildDeptDTO {\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    isLeafNodes: ").append(toIndentedString(isLeafNodes)).append("\n");
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
