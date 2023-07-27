package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联缺陷信息
 */
public class AssociateDefectInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate")

    private Boolean associate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_count")

    private Integer associateCount;

    public AssociateDefectInfoVo withAssociate(Boolean associate) {
        this.associate = associate;
        return this;
    }

    /**
     * 是否已关联
     * @return associate
     */
    public Boolean getAssociate() {
        return associate;
    }

    public void setAssociate(Boolean associate) {
        this.associate = associate;
    }

    public AssociateDefectInfoVo withAssociateCount(Integer associateCount) {
        this.associateCount = associateCount;
        return this;
    }

    /**
     * 关联缺陷数
     * @return associateCount
     */
    public Integer getAssociateCount() {
        return associateCount;
    }

    public void setAssociateCount(Integer associateCount) {
        this.associateCount = associateCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateDefectInfoVo that = (AssociateDefectInfoVo) obj;
        return Objects.equals(this.associate, that.associate)
            && Objects.equals(this.associateCount, that.associateCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associate, associateCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateDefectInfoVo {\n");
        sb.append("    associate: ").append(toIndentedString(associate)).append("\n");
        sb.append("    associateCount: ").append(toIndentedString(associateCount)).append("\n");
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
