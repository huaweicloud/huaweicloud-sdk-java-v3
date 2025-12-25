package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表格列树节点数据传输对象
 */
public class IsapTableColumnTreeNodeTableColumnDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own_name")

    private String ownName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private Integer depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private IsapTableColumnDto source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<IsapTableColumnTreeNodeTableColumnDto> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_name")

    private String previousName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_sequence_number")

    private Integer columnSequenceNumber;

    public IsapTableColumnTreeNodeTableColumnDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IsapTableColumnTreeNodeTableColumnDto withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * 父级名称
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public IsapTableColumnTreeNodeTableColumnDto withOwnName(String ownName) {
        this.ownName = ownName;
        return this;
    }

    /**
     * 所属名称
     * @return ownName
     */
    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public IsapTableColumnTreeNodeTableColumnDto withDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 深度
     * minimum: 0
     * maximum: 4
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public IsapTableColumnTreeNodeTableColumnDto withSource(IsapTableColumnDto source) {
        this.source = source;
        return this;
    }

    public IsapTableColumnTreeNodeTableColumnDto withSource(Consumer<IsapTableColumnDto> sourceSetter) {
        if (this.source == null) {
            this.source = new IsapTableColumnDto();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public IsapTableColumnDto getSource() {
        return source;
    }

    public void setSource(IsapTableColumnDto source) {
        this.source = source;
    }

    public IsapTableColumnTreeNodeTableColumnDto withChildren(List<IsapTableColumnTreeNodeTableColumnDto> children) {
        this.children = children;
        return this;
    }

    public IsapTableColumnTreeNodeTableColumnDto addChildrenItem(IsapTableColumnTreeNodeTableColumnDto childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public IsapTableColumnTreeNodeTableColumnDto withChildren(
        Consumer<List<IsapTableColumnTreeNodeTableColumnDto>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子节点数组
     * @return children
     */
    public List<IsapTableColumnTreeNodeTableColumnDto> getChildren() {
        return children;
    }

    public void setChildren(List<IsapTableColumnTreeNodeTableColumnDto> children) {
        this.children = children;
    }

    public IsapTableColumnTreeNodeTableColumnDto withPreviousName(String previousName) {
        this.previousName = previousName;
        return this;
    }

    /**
     * 父级名称
     * @return previousName
     */
    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public IsapTableColumnTreeNodeTableColumnDto withColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
        return this;
    }

    /**
     * 列序号
     * minimum: 0
     * maximum: 100
     * @return columnSequenceNumber
     */
    public Integer getColumnSequenceNumber() {
        return columnSequenceNumber;
    }

    public void setColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapTableColumnTreeNodeTableColumnDto that = (IsapTableColumnTreeNodeTableColumnDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parentName, that.parentName)
            && Objects.equals(this.ownName, that.ownName) && Objects.equals(this.depth, that.depth)
            && Objects.equals(this.source, that.source) && Objects.equals(this.children, that.children)
            && Objects.equals(this.previousName, that.previousName)
            && Objects.equals(this.columnSequenceNumber, that.columnSequenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentName, ownName, depth, source, children, previousName, columnSequenceNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapTableColumnTreeNodeTableColumnDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    ownName: ").append(toIndentedString(ownName)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    previousName: ").append(toIndentedString(previousName)).append("\n");
        sb.append("    columnSequenceNumber: ").append(toIndentedString(columnSequenceNumber)).append("\n");
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
