package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityRiskResponseImageRiskRiskList
 */
public class SecurityRiskResponseImageRiskRiskList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    public SecurityRiskResponseImageRiskRiskList withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**: 字符长度0-32位 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityRiskResponseImageRiskRiskList withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**： 镜像数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityRiskResponseImageRiskRiskList that = (SecurityRiskResponseImageRiskRiskList) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.imageNum, that.imageNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, imageNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseImageRiskRiskList {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
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
