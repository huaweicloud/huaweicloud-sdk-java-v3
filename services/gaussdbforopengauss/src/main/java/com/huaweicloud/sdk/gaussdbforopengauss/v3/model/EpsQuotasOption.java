package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EpsQuotasOption
 */
public class EpsQuotasOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_projects_id")
    
    
    private String enterpriseProjectsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_quota")
    
    
    private Integer instanceQuota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus_quota")
    
    
    private Integer vcpusQuota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram_quota")
    
    
    private Integer ramQuota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_quota")
    
    
    private Integer volumeQuota;

    public EpsQuotasOption withEnterpriseProjectsId(String enterpriseProjectsId) {
        this.enterpriseProjectsId = enterpriseProjectsId;
        return this;
    }

    


    /**
     * 企业项目Id。
     * @return enterpriseProjectsId
     */
    public String getEnterpriseProjectsId() {
        return enterpriseProjectsId;
    }

    public void setEnterpriseProjectsId(String enterpriseProjectsId) {
        this.enterpriseProjectsId = enterpriseProjectsId;
    }

    

    public EpsQuotasOption withInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    


    /**
     * 实例的配额。取值范围：实际创建的实例个数 ~ 100,000。
     * @return instanceQuota
     */
    public Integer getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    

    public EpsQuotasOption withVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
        return this;
    }

    


    /**
     * cpu的配额。取值范围：实际使用的cpu核数 ~ 2,147,483,646。
     * @return vcpusQuota
     */
    public Integer getVcpusQuota() {
        return vcpusQuota;
    }

    public void setVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
    }

    

    public EpsQuotasOption withRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
        return this;
    }

    


    /**
     * 内存的配额。单位GB。取值范围：实际使用的内存 ~ 2,147,483,646。
     * @return ramQuota
     */
    public Integer getRamQuota() {
        return ramQuota;
    }

    public void setRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
    }

    

    public EpsQuotasOption withVolumeQuota(Integer volumeQuota) {
        this.volumeQuota = volumeQuota;
        return this;
    }

    


    /**
     * 存储空间的配额。单位：GB。取值范围：实际使用的存储空间 ~ 2,147,483,646。
     * @return volumeQuota
     */
    public Integer getVolumeQuota() {
        return volumeQuota;
    }

    public void setVolumeQuota(Integer volumeQuota) {
        this.volumeQuota = volumeQuota;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EpsQuotasOption epsQuotasOption = (EpsQuotasOption) o;
        return Objects.equals(this.enterpriseProjectsId, epsQuotasOption.enterpriseProjectsId) &&
            Objects.equals(this.instanceQuota, epsQuotasOption.instanceQuota) &&
            Objects.equals(this.vcpusQuota, epsQuotasOption.vcpusQuota) &&
            Objects.equals(this.ramQuota, epsQuotasOption.ramQuota) &&
            Objects.equals(this.volumeQuota, epsQuotasOption.volumeQuota);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectsId, instanceQuota, vcpusQuota, ramQuota, volumeQuota);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EpsQuotasOption {\n");
        sb.append("    enterpriseProjectsId: ").append(toIndentedString(enterpriseProjectsId)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
        sb.append("    vcpusQuota: ").append(toIndentedString(vcpusQuota)).append("\n");
        sb.append("    ramQuota: ").append(toIndentedString(ramQuota)).append("\n");
        sb.append("    volumeQuota: ").append(toIndentedString(volumeQuota)).append("\n");
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

