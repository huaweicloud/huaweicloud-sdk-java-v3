package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CI/CD配置信息
 */
public class CicdConfigurationsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id")

    private String cicdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_images_num")

    private Integer associatedImagesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_config_num")

    private Integer associatedConfigNum;

    public CicdConfigurationsResponseInfo withCicdId(String cicdId) {
        this.cicdId = cicdId;
        return this;
    }

    /**
     * **参数解释** CI/CD标识 **约束限制** 不涉及 **取值范围** 字符长度0-128位  **默认取值** 不涉及
     * @return cicdId
     */
    public String getCicdId() {
        return cicdId;
    }

    public void setCicdId(String cicdId) {
        this.cicdId = cicdId;
    }

    public CicdConfigurationsResponseInfo withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * **参数解释** CI/CD名称 **约束限制** 不涉及 **取值范围** 字符长度0-128位  **默认取值** 不涉及
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    public CicdConfigurationsResponseInfo withAssociatedImagesNum(Integer associatedImagesNum) {
        this.associatedImagesNum = associatedImagesNum;
        return this;
    }

    /**
     * **参数解释** 关联镜像扫描数量 **约束限制** 不涉及 **取值范围** 最小值0，最大值2147483647  **默认取值** 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return associatedImagesNum
     */
    public Integer getAssociatedImagesNum() {
        return associatedImagesNum;
    }

    public void setAssociatedImagesNum(Integer associatedImagesNum) {
        this.associatedImagesNum = associatedImagesNum;
    }

    public CicdConfigurationsResponseInfo withAssociatedConfigNum(Integer associatedConfigNum) {
        this.associatedConfigNum = associatedConfigNum;
        return this;
    }

    /**
     * **参数解释** 关联配置扫描数量 **约束限制** 不涉及 **取值范围** 最小值0，最大值2147483647  **默认取值** 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return associatedConfigNum
     */
    public Integer getAssociatedConfigNum() {
        return associatedConfigNum;
    }

    public void setAssociatedConfigNum(Integer associatedConfigNum) {
        this.associatedConfigNum = associatedConfigNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CicdConfigurationsResponseInfo that = (CicdConfigurationsResponseInfo) obj;
        return Objects.equals(this.cicdId, that.cicdId) && Objects.equals(this.cicdName, that.cicdName)
            && Objects.equals(this.associatedImagesNum, that.associatedImagesNum)
            && Objects.equals(this.associatedConfigNum, that.associatedConfigNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cicdId, cicdName, associatedImagesNum, associatedConfigNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CicdConfigurationsResponseInfo {\n");
        sb.append("    cicdId: ").append(toIndentedString(cicdId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    associatedImagesNum: ").append(toIndentedString(associatedImagesNum)).append("\n");
        sb.append("    associatedConfigNum: ").append(toIndentedString(associatedConfigNum)).append("\n");
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
