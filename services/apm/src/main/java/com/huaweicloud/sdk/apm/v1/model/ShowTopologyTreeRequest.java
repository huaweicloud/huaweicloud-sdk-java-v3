package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTopologyTreeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_tag_id")

    private Long envTagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_keyword")

    private String envKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    private Long xBusinessId;

    public ShowTopologyTreeRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowTopologyTreeRequest withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public ShowTopologyTreeRequest withEnvTagId(Long envTagId) {
        this.envTagId = envTagId;
        return this;
    }

    /**
     * 环境标签id
     * @return envTagId
     */
    public Long getEnvTagId() {
        return envTagId;
    }

    public void setEnvTagId(Long envTagId) {
        this.envTagId = envTagId;
    }

    public ShowTopologyTreeRequest withEnvKeyword(String envKeyword) {
        this.envKeyword = envKeyword;
        return this;
    }

    /**
     * 环境关键字
     * @return envKeyword
     */
    public String getEnvKeyword() {
        return envKeyword;
    }

    public void setEnvKeyword(String envKeyword) {
        this.envKeyword = envKeyword;
    }

    public ShowTopologyTreeRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopologyTreeRequest showTopologyTreeRequest = (ShowTopologyTreeRequest) o;
        return Objects.equals(this.regionId, showTopologyTreeRequest.regionId)
            && Objects.equals(this.businessId, showTopologyTreeRequest.businessId)
            && Objects.equals(this.envTagId, showTopologyTreeRequest.envTagId)
            && Objects.equals(this.envKeyword, showTopologyTreeRequest.envKeyword)
            && Objects.equals(this.xBusinessId, showTopologyTreeRequest.xBusinessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, businessId, envTagId, envKeyword, xBusinessId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopologyTreeRequest {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    envTagId: ").append(toIndentedString(envTagId)).append("\n");
        sb.append("    envKeyword: ").append(toIndentedString(envKeyword)).append("\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
