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
public class ShowDepartmentResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childDepts")

    @JacksonXmlProperty(localName = "childDepts")

    private List<ChildDeptDTO> childDepts = null;

    public ShowDepartmentResponse withDeptCode(String deptCode) {
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

    public ShowDepartmentResponse withDeptName(String deptName) {
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

    public ShowDepartmentResponse withIsLeafNodes(Boolean isLeafNodes) {
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

    public ShowDepartmentResponse withChildDepts(List<ChildDeptDTO> childDepts) {
        this.childDepts = childDepts;
        return this;
    }

    public ShowDepartmentResponse addChildDeptsItem(ChildDeptDTO childDeptsItem) {
        if (this.childDepts == null) {
            this.childDepts = new ArrayList<>();
        }
        this.childDepts.add(childDeptsItem);
        return this;
    }

    public ShowDepartmentResponse withChildDepts(Consumer<List<ChildDeptDTO>> childDeptsSetter) {
        if (this.childDepts == null) {
            this.childDepts = new ArrayList<>();
        }
        childDeptsSetter.accept(this.childDepts);
        return this;
    }

    /**
     * 子部门详情
     * @return childDepts
     */
    public List<ChildDeptDTO> getChildDepts() {
        return childDepts;
    }

    public void setChildDepts(List<ChildDeptDTO> childDepts) {
        this.childDepts = childDepts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDepartmentResponse showDepartmentResponse = (ShowDepartmentResponse) o;
        return Objects.equals(this.deptCode, showDepartmentResponse.deptCode)
            && Objects.equals(this.deptName, showDepartmentResponse.deptName)
            && Objects.equals(this.isLeafNodes, showDepartmentResponse.isLeafNodes)
            && Objects.equals(this.childDepts, showDepartmentResponse.childDepts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptCode, deptName, isLeafNodes, childDepts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDepartmentResponse {\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    isLeafNodes: ").append(toIndentedString(isLeafNodes)).append("\n");
        sb.append("    childDepts: ").append(toIndentedString(childDepts)).append("\n");
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
