package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 更新弹性资源池请求
 */
public class UpdateElasticResourcePoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cu")

    @JacksonXmlProperty(localName = "max_cu")

    private Integer maxCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cu")

    @JacksonXmlProperty(localName = "min_cu")

    private Integer minCu;

    public UpdateElasticResourcePoolInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。长度限制：256个字符以内。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateElasticResourcePoolInfo withMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }

    /**
     * 弹性资源池的最大CU数
     * @return maxCu
     */
    public Integer getMaxCu() {
        return maxCu;
    }

    public void setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
    }

    public UpdateElasticResourcePoolInfo withMinCu(Integer minCu) {
        this.minCu = minCu;
        return this;
    }

    /**
     * 弹性资源池的最小CU数
     * @return minCu
     */
    public Integer getMinCu() {
        return minCu;
    }

    public void setMinCu(Integer minCu) {
        this.minCu = minCu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateElasticResourcePoolInfo updateElasticResourcePoolInfo = (UpdateElasticResourcePoolInfo) o;
        return Objects.equals(this.description, updateElasticResourcePoolInfo.description)
            && Objects.equals(this.maxCu, updateElasticResourcePoolInfo.maxCu)
            && Objects.equals(this.minCu, updateElasticResourcePoolInfo.minCu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, maxCu, minCu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateElasticResourcePoolInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
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
