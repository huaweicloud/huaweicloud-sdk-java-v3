package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * hypervisor信息。
 */
public class Hypervisor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hypervisor_type")

    private String hypervisorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csd_hypervisor")

    private String csdHypervisor;

    public Hypervisor withHypervisorType(String hypervisorType) {
        this.hypervisorType = hypervisorType;
        return this;
    }

    /**
     * hypervisor类型
     * @return hypervisorType
     */
    public String getHypervisorType() {
        return hypervisorType;
    }

    public void setHypervisorType(String hypervisorType) {
        this.hypervisorType = hypervisorType;
    }

    public Hypervisor withCsdHypervisor(String csdHypervisor) {
        this.csdHypervisor = csdHypervisor;
        return this;
    }

    /**
     * hypervisor csd信息
     * @return csdHypervisor
     */
    public String getCsdHypervisor() {
        return csdHypervisor;
    }

    public void setCsdHypervisor(String csdHypervisor) {
        this.csdHypervisor = csdHypervisor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hypervisor that = (Hypervisor) obj;
        return Objects.equals(this.hypervisorType, that.hypervisorType)
            && Objects.equals(this.csdHypervisor, that.csdHypervisor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hypervisorType, csdHypervisor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hypervisor {\n");
        sb.append("    hypervisorType: ").append(toIndentedString(hypervisorType)).append("\n");
        sb.append("    csdHypervisor: ").append(toIndentedString(csdHypervisor)).append("\n");
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
