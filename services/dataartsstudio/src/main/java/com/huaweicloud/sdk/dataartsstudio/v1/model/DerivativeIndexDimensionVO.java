package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 维度分组(颗粒度)。
 */
public class DerivativeIndexDimensionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private Long dimensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hierarchies_id")

    private Long hierarchiesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_code")

    private String groupCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hierarchies")

    private List<DimensionHierarchiesVO> hierarchies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private String l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private String l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private String l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_id")

    private Long l1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private Long l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    public DerivativeIndexDimensionVO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 维度分组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DerivativeIndexDimensionVO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 维度角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DerivativeIndexDimensionVO withDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 维度ID。
     * @return dimensionId
     */
    public Long getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
    }

    public DerivativeIndexDimensionVO withHierarchiesId(Long hierarchiesId) {
        this.hierarchiesId = hierarchiesId;
        return this;
    }

    /**
     * 维度层级ID。
     * @return hierarchiesId
     */
    public Long getHierarchiesId() {
        return hierarchiesId;
    }

    public void setHierarchiesId(Long hierarchiesId) {
        this.hierarchiesId = hierarchiesId;
    }

    public DerivativeIndexDimensionVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序号。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public DerivativeIndexDimensionVO withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 维度分组名称。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DerivativeIndexDimensionVO withGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * 维度分组编码。
     * @return groupCode
     */
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public DerivativeIndexDimensionVO withBizType(BizTypeEnum bizType) {
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

    public DerivativeIndexDimensionVO withHierarchies(List<DimensionHierarchiesVO> hierarchies) {
        this.hierarchies = hierarchies;
        return this;
    }

    public DerivativeIndexDimensionVO addHierarchiesItem(DimensionHierarchiesVO hierarchiesItem) {
        if (this.hierarchies == null) {
            this.hierarchies = new ArrayList<>();
        }
        this.hierarchies.add(hierarchiesItem);
        return this;
    }

    public DerivativeIndexDimensionVO withHierarchies(Consumer<List<DimensionHierarchiesVO>> hierarchiesSetter) {
        if (this.hierarchies == null) {
            this.hierarchies = new ArrayList<>();
        }
        hierarchiesSetter.accept(this.hierarchies);
        return this;
    }

    /**
     * 层级属性。
     * @return hierarchies
     */
    public List<DimensionHierarchiesVO> getHierarchies() {
        return hierarchies;
    }

    public void setHierarchies(List<DimensionHierarchiesVO> hierarchies) {
        this.hierarchies = hierarchies;
    }

    public DerivativeIndexDimensionVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名，只读，创建和更新时无需填写。
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public DerivativeIndexDimensionVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名，只读，创建和更新时无需填写。
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public DerivativeIndexDimensionVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名，只读，创建和更新时无需填写。
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public DerivativeIndexDimensionVO withL1Id(Long l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组ID。
     * @return l1Id
     */
    public Long getL1Id() {
        return l1Id;
    }

    public void setL1Id(Long l1Id) {
        this.l1Id = l1Id;
    }

    public DerivativeIndexDimensionVO withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域ID，只读，创建和更新时无需填写。
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public DerivativeIndexDimensionVO withL3Id(Long l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象ID。
     * @return l3Id
     */
    public Long getL3Id() {
        return l3Id;
    }

    public void setL3Id(Long l3Id) {
        this.l3Id = l3Id;
    }

    public DerivativeIndexDimensionVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public DerivativeIndexDimensionVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DerivativeIndexDimensionVO that = (DerivativeIndexDimensionVO) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.role, that.role)
            && Objects.equals(this.dimensionId, that.dimensionId)
            && Objects.equals(this.hierarchiesId, that.hierarchiesId) && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupCode, that.groupCode)
            && Objects.equals(this.bizType, that.bizType) && Objects.equals(this.hierarchies, that.hierarchies)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.l1Id, that.l1Id) && Objects.equals(this.l2Id, that.l2Id)
            && Objects.equals(this.l3Id, that.l3Id) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            role,
            dimensionId,
            hierarchiesId,
            ordinal,
            groupName,
            groupCode,
            bizType,
            hierarchies,
            l1,
            l2,
            l3,
            l1Id,
            l2Id,
            l3Id,
            dwType,
            id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DerivativeIndexDimensionVO {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    hierarchiesId: ").append(toIndentedString(hierarchiesId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    hierarchies: ").append(toIndentedString(hierarchies)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
