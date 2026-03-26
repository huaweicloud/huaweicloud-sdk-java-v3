package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源配置。 **约束限制**：不涉及。 
 */
public class ResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_resource")

    private Integer cpuResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_resource")

    private Integer memoryResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_resource")

    private Integer npuResource;

    public ResourceSpec withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格，从规格列表查询获取。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResourceSpec withCpuResource(Integer cpuResource) {
        this.cpuResource = cpuResource;
        return this;
    }

    /**
     * **参数解释**：cpu核数量。 **约束限制**：不涉及。 **取值范围**：[0,192]。 **默认取值**：null。
     * minimum: 0
     * maximum: 192
     * @return cpuResource
     */
    public Integer getCpuResource() {
        return cpuResource;
    }

    public void setCpuResource(Integer cpuResource) {
        this.cpuResource = cpuResource;
    }

    public ResourceSpec withMemoryResource(Integer memoryResource) {
        this.memoryResource = memoryResource;
        return this;
    }

    /**
     * **参数解释**：内存大小。 **约束限制**：不涉及。 **取值范围**：[0,1536]。 **默认取值**：null。
     * minimum: 0
     * maximum: 1536
     * @return memoryResource
     */
    public Integer getMemoryResource() {
        return memoryResource;
    }

    public void setMemoryResource(Integer memoryResource) {
        this.memoryResource = memoryResource;
    }

    public ResourceSpec withNpuResource(Integer npuResource) {
        this.npuResource = npuResource;
        return this;
    }

    /**
     * **参数解释**：昇腾卡数量。 **约束限制**：不涉及。 **取值范围**：[0,8]。 **默认取值**：null。
     * minimum: 0
     * maximum: 8
     * @return npuResource
     */
    public Integer getNpuResource() {
        return npuResource;
    }

    public void setNpuResource(Integer npuResource) {
        this.npuResource = npuResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSpec that = (ResourceSpec) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.cpuResource, that.cpuResource)
            && Objects.equals(this.memoryResource, that.memoryResource)
            && Objects.equals(this.npuResource, that.npuResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, cpuResource, memoryResource, npuResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpec {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    cpuResource: ").append(toIndentedString(cpuResource)).append("\n");
        sb.append("    memoryResource: ").append(toIndentedString(memoryResource)).append("\n");
        sb.append("    npuResource: ").append(toIndentedString(npuResource)).append("\n");
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
