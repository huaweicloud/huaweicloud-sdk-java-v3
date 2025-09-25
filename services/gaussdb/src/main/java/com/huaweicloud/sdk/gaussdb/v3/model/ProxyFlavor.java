package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProxyFlavor
 */
public class ProxyFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Object azStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_ipv6")

    private Boolean supportedIpv6;

    public ProxyFlavor withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：  规格码。  **取值范围**：  不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ProxyFlavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释**：  cpu核数。  **取值范围**：  不涉及。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ProxyFlavor withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * **参数解释**：  内存。  **取值范围**：  不涉及。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ProxyFlavor withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * **参数解释**：  数据库类型。  **取值范围**：  不涉及。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ProxyFlavor withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /**
     * **参数解释**：  az状态。
     * @return azStatus
     */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    public ProxyFlavor withSupportedIpv6(Boolean supportedIpv6) {
        this.supportedIpv6 = supportedIpv6;
        return this;
    }

    /**
     * **参数解释**：  是否支持ipv6。  **取值范围**：  - true: 支持ipv6。 - false: 不支持ipv6。
     * @return supportedIpv6
     */
    public Boolean getSupportedIpv6() {
        return supportedIpv6;
    }

    public void setSupportedIpv6(Boolean supportedIpv6) {
        this.supportedIpv6 = supportedIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyFlavor that = (ProxyFlavor) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.azStatus, that.azStatus) && Objects.equals(this.supportedIpv6, that.supportedIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, vcpus, ram, dbType, azStatus, supportedIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyFlavor {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    supportedIpv6: ").append(toIndentedString(supportedIpv6)).append("\n");
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
