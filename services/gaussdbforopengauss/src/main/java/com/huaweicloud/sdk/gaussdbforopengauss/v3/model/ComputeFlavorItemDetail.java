package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComputeFlavorItemDetail
 */
public class ComputeFlavorItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iaas_code")

    private String iaasCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_ipv6")

    private Boolean supportedIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    public ComputeFlavorItemDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 规格ID。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComputeFlavorItemDetail withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**: 规格编码。 **取值范围**: 不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ComputeFlavorItemDetail withIaasCode(String iaasCode) {
        this.iaasCode = iaasCode;
        return this;
    }

    /**
     * **参数解释**: IaaS规格编码。 **取值范围**: 不涉及。
     * @return iaasCode
     */
    public String getIaasCode() {
        return iaasCode;
    }

    public void setIaasCode(String iaasCode) {
        this.iaasCode = iaasCode;
    }

    public ComputeFlavorItemDetail withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释**: CPU核数。 **取值范围**: 不涉及。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ComputeFlavorItemDetail withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * **参数解释**: 内存大小，单位GB。 **取值范围**: 不涉及。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ComputeFlavorItemDetail withSupportedIpv6(Boolean supportedIpv6) {
        this.supportedIpv6 = supportedIpv6;
        return this;
    }

    /**
     * **参数解释**: 是否支持IPv6。 **取值范围**: - true：支持 - false：不支持
     * @return supportedIpv6
     */
    public Boolean getSupportedIpv6() {
        return supportedIpv6;
    }

    public void setSupportedIpv6(Boolean supportedIpv6) {
        this.supportedIpv6 = supportedIpv6;
    }

    public ComputeFlavorItemDetail withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public ComputeFlavorItemDetail putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public ComputeFlavorItemDetail withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * **参数解释**: 规格在各个可用区的状态。 **取值范围**: - normal：正常。 - sellout：已售罄。 - unknown：状态未知。 - unsupported：不支持。 - abandon：已废弃。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputeFlavorItemDetail that = (ComputeFlavorItemDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.iaasCode, that.iaasCode) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.supportedIpv6, that.supportedIpv6)
            && Objects.equals(this.azStatus, that.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, specCode, iaasCode, vcpus, ram, supportedIpv6, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeFlavorItemDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    iaasCode: ").append(toIndentedString(iaasCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    supportedIpv6: ").append(toIndentedString(supportedIpv6)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
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
