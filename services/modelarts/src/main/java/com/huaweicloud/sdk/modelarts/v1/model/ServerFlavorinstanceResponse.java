package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Lite Server规格详情。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及
 */
public class ServerFlavorinstanceResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roce_num")

    private Integer roceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_code")

    private String skuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sold_out")

    private Boolean isSoldOut;

    public ServerFlavorinstanceResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：CPU架构。 **约束限制**：不涉及。 **取值范围**： - X86：CPU架构为X86 - ARM：CPU架构为ARM  **默认取值**：不涉及。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ServerFlavorinstanceResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：分区名。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ServerFlavorinstanceResponse withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**：计费模式。 **约束限制**：不涉及。 **取值范围**： - PRE_PAID：计费模式为包年/包月 - POST_PAID：计费模式为按需计费 **默认取值**：不涉及。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ServerFlavorinstanceResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：数量。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ServerFlavorinstanceResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：规格名称。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ServerFlavorinstanceResponse withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * **参数解释**：规格类型。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public ServerFlavorinstanceResponse withRoceNum(Integer roceNum) {
        this.roceNum = roceNum;
        return this;
    }

    /**
     * **参数解释**：roce数量。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return roceNum
     */
    public Integer getRoceNum() {
        return roceNum;
    }

    public void setRoceNum(Integer roceNum) {
        this.roceNum = roceNum;
    }

    public ServerFlavorinstanceResponse withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * **参数解释**：服务类型。 **约束限制**：不涉及。 **取值范围**： - BMS：资源类型为裸金属服务器 - ECS：资源类型为弹性云服务器 - HPS：资源类型为超节点服务器  **默认取值**：不涉及。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ServerFlavorinstanceResponse withSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    /**
     * **参数解释**：计费码。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * @return skuCode
     */
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public ServerFlavorinstanceResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * **参数解释**：规格详情。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ServerFlavorinstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：状态。 **约束限制**：不涉及。 **默认取值**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerFlavorinstanceResponse withIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
        return this;
    }

    /**
     * **参数解释**：是否售罄。 **约束限制**：不涉及。 **取值范围**： - true：已售罄 - false：未售罄  **默认取值**：false。
     * @return isSoldOut
     */
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerFlavorinstanceResponse that = (ServerFlavorinstanceResponse) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.count, that.count)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.roceNum, that.roceNum) && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.skuCode, that.skuCode) && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.status, that.status) && Objects.equals(this.isSoldOut, that.isSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            availabilityZone,
            chargingMode,
            count,
            flavor,
            flavorType,
            roceNum,
            serverType,
            skuCode,
            specification,
            status,
            isSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerFlavorinstanceResponse {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    roceNum: ").append(toIndentedString(roceNum)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
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
