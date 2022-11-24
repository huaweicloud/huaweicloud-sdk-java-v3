package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 专属主机的配额。
 */
public class RespQuotaSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hard_limit")

    private Integer hardLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public RespQuotaSet withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 配额类别。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public RespQuotaSet withHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }

    /**
     * 配额最大限制。  “-1”表示资源配额不受限制。
     * @return hardLimit
     */
    public Integer getHardLimit() {
        return hardLimit;
    }

    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }

    public RespQuotaSet withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用配额数量。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespQuotaSet respQuotaSet = (RespQuotaSet) o;
        return Objects.equals(this.resource, respQuotaSet.resource)
            && Objects.equals(this.hardLimit, respQuotaSet.hardLimit) && Objects.equals(this.used, respQuotaSet.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, hardLimit, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespQuotaSet {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    hardLimit: ").append(toIndentedString(hardLimit)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
