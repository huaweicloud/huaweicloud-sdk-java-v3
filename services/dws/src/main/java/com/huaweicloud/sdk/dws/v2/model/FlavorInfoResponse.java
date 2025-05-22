package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 规格详情。 **取值范围**： 不涉及。
 */
public class FlavorInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_current_flavor")

    private Boolean isCurrentFlavor;

    public FlavorInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规格ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规格编码。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorInfoResponse withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释**： CPU数。 **取值范围**： 不涉及。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorInfoResponse withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * **参数解释**： 内存数。 **取值范围**： 不涉及。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public FlavorInfoResponse withIsCurrentFlavor(Boolean isCurrentFlavor) {
        this.isCurrentFlavor = isCurrentFlavor;
        return this;
    }

    /**
     * **参数解释**： 是否是当前规格。 **取值范围**： 不涉及。
     * @return isCurrentFlavor
     */
    public Boolean getIsCurrentFlavor() {
        return isCurrentFlavor;
    }

    public void setIsCurrentFlavor(Boolean isCurrentFlavor) {
        this.isCurrentFlavor = isCurrentFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorInfoResponse that = (FlavorInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.isCurrentFlavor, that.isCurrentFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, vcpus, ram, isCurrentFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    isCurrentFlavor: ").append(toIndentedString(isCurrentFlavor)).append("\n");
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
