package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置serverless配置策略请求体。
 */
public class UpdateServerlessPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_vcpus")

    private Integer minVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vcpus")

    private Integer maxVcpus;

    public UpdateServerlessPolicy withMinVcpus(Integer minVcpus) {
        this.minVcpus = minVcpus;
        return this;
    }

    /**
     * 单节点VCPUs伸缩下限，取值范围可根据[查询数据库规格](https://support.huaweicloud.com/api-gaussdb/ShowGaussMySqlFlavors.html)接口获取。
     * @return minVcpus
     */
    public Integer getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(Integer minVcpus) {
        this.minVcpus = minVcpus;
    }

    public UpdateServerlessPolicy withMaxVcpus(Integer maxVcpus) {
        this.maxVcpus = maxVcpus;
        return this;
    }

    /**
     * 单节点VCPUs伸缩上限，取值范围可根据[查询数据库规格](https://support.huaweicloud.com/api-gaussdb/ShowGaussMySqlFlavors.html)接口获取。
     * @return maxVcpus
     */
    public Integer getMaxVcpus() {
        return maxVcpus;
    }

    public void setMaxVcpus(Integer maxVcpus) {
        this.maxVcpus = maxVcpus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerlessPolicy that = (UpdateServerlessPolicy) obj;
        return Objects.equals(this.minVcpus, that.minVcpus) && Objects.equals(this.maxVcpus, that.maxVcpus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minVcpus, maxVcpus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerlessPolicy {\n");
        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
        sb.append("    maxVcpus: ").append(toIndentedString(maxVcpus)).append("\n");
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
