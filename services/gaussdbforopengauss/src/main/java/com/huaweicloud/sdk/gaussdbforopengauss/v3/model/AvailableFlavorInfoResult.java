package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例可变更规格信息。
 */
public class AvailableFlavorInfoResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_cpde")
    
    
    private String specCpde;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    
    private Map<String, String> azStatus = null;
    
    public AvailableFlavorInfoResult withSpecCpde(String specCpde) {
        this.specCpde = specCpde;
        return this;
    }

    


    /**
     * 资源规格编码。
     * @return specCpde
     */
    public String getSpecCpde() {
        return specCpde;
    }

    public void setSpecCpde(String specCpde) {
        this.specCpde = specCpde;
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
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public AvailableFlavorInfoResult withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if(this.azStatus == null) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableFlavorInfoResult availableFlavorInfoResult = (AvailableFlavorInfoResult) o;
        return Objects.equals(this.specCpde, availableFlavorInfoResult.specCpde) &&
            Objects.equals(this.vcpus, availableFlavorInfoResult.vcpus) &&
            Objects.equals(this.ram, availableFlavorInfoResult.ram) &&
            Objects.equals(this.azStatus, availableFlavorInfoResult.azStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specCpde, vcpus, ram, azStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableFlavorInfoResult {\n");
        sb.append("    specCpde: ").append(toIndentedString(specCpde)).append("\n");
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

