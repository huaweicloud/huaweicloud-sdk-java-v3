package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IpRegionResponseBodyData
 */
public class IpRegionResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_cn")

    private String descriptionCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_type")

    private String regionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "superior_region_id")

    private Integer superiorRegionId;

    public IpRegionResponseBodyData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释**： 区域ID，用于明确规则引用地域，可通过[获取账号、IAM用户、项目、用户组、区域、委托的名称和ID](cfw_02_0030.xml)获取。 **取值范围**： 不涉及 
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public IpRegionResponseBodyData withDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
        return this;
    }

    /**
     * **参数解释**： 区域中文描述，仅当区域为中国区域时使用，可通过[地域信息表](cfw_02_0031.xml)获取 **取值范围**： 不涉及 
     * @return descriptionCn
     */
    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public IpRegionResponseBodyData withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * **参数解释**： 区域英文描述，仅当区域为非中国区域时使用，可通过[地域信息表](cfw_02_0031.xml)获取。 **取值范围**： 不涉及 
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public IpRegionResponseBodyData withRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }

    /**
     * **参数解释**： 区域类型 **取值范围**： - 0：国家 - 1：省份 - 2：大洲 
     * @return regionType
     */
    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public IpRegionResponseBodyData withSuperiorRegionId(Integer superiorRegionId) {
        this.superiorRegionId = superiorRegionId;
        return this;
    }

    /**
     * **参数解释**： 上级区域ID **取值范围**： 不涉及 
     * @return superiorRegionId
     */
    public Integer getSuperiorRegionId() {
        return superiorRegionId;
    }

    public void setSuperiorRegionId(Integer superiorRegionId) {
        this.superiorRegionId = superiorRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpRegionResponseBodyData that = (IpRegionResponseBodyData) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.descriptionCn, that.descriptionCn)
            && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.regionType, that.regionType)
            && Objects.equals(this.superiorRegionId, that.superiorRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, descriptionCn, descriptionEn, regionType, superiorRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpRegionResponseBodyData {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
        sb.append("    superiorRegionId: ").append(toIndentedString(superiorRegionId)).append("\n");
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
