package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NoSqlEpsQuotaTotal
 */
public class NoSqlEpsQuotaTotal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private Integer instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    public NoSqlEpsQuotaTotal withInstance(Integer instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 实例配额。
     * @return instance
     */
    public Integer getInstance() {
        return instance;
    }

    public void setInstance(Integer instance) {
        this.instance = instance;
    }

    public NoSqlEpsQuotaTotal withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * vcpus配额。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public NoSqlEpsQuotaTotal withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * ram配额。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoSqlEpsQuotaTotal that = (NoSqlEpsQuotaTotal) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, vcpus, ram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlEpsQuotaTotal {\n");
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
