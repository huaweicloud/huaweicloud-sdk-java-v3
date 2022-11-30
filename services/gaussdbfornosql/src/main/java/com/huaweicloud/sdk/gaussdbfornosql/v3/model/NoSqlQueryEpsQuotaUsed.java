package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NoSqlQueryEpsQuotaUsed
 */
public class NoSqlQueryEpsQuotaUsed {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private Integer instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    public NoSqlQueryEpsQuotaUsed withInstance(Integer instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 已使用实例配额。
     * @return instance
     */
    public Integer getInstance() {
        return instance;
    }

    public void setInstance(Integer instance) {
        this.instance = instance;
    }

    public NoSqlQueryEpsQuotaUsed withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 已使用vcpus配额。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public NoSqlQueryEpsQuotaUsed withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 已使用ram配额。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoSqlQueryEpsQuotaUsed noSqlQueryEpsQuotaUsed = (NoSqlQueryEpsQuotaUsed) o;
        return Objects.equals(this.instance, noSqlQueryEpsQuotaUsed.instance)
            && Objects.equals(this.vcpus, noSqlQueryEpsQuotaUsed.vcpus)
            && Objects.equals(this.ram, noSqlQueryEpsQuotaUsed.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, vcpus, ram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlQueryEpsQuotaUsed {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
