package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 最终租户css集群详情
 */
public class TermTenantCssClusterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_id")

    private String cssId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_active")

    private Boolean isActive;

    public TermTenantCssClusterDto withCssId(String cssId) {
        this.cssId = cssId;
        return this;
    }

    /**
     * css集群id
     * @return cssId
     */
    public String getCssId() {
        return cssId;
    }

    public void setCssId(String cssId) {
        this.cssId = cssId;
    }

    public TermTenantCssClusterDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * css集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TermTenantCssClusterDto withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * 集群是否可用
     * @return isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TermTenantCssClusterDto that = (TermTenantCssClusterDto) obj;
        return Objects.equals(this.cssId, that.cssId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cssId, name, isActive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TermTenantCssClusterDto {\n");
        sb.append("    cssId: ").append(toIndentedString(cssId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
