package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例可变更规格信息。
 */
public class AvailableFlavorInfoResult {

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
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    public AvailableFlavorInfoResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public AvailableFlavorInfoResult withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * CPU核数。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public AvailableFlavorInfoResult withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小，单位：GB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public AvailableFlavorInfoResult withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public AvailableFlavorInfoResult putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public AvailableFlavorInfoResult withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * 其中key是可用区编号，value是规格所在az的状态。
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
        AvailableFlavorInfoResult that = (AvailableFlavorInfoResult) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.azStatus, that.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, vcpus, ram, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableFlavorInfoResult {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
