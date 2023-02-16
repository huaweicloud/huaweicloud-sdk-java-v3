package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DedicatedComputeInfo
 */
public class DedicatedComputeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus_total")
    
    
    private Integer vcpusTotal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus_used")
    
    
    private Integer vcpusUsed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram_total")
    
    
    private Integer ramTotal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram_used")
    
    
    private Integer ramUsed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_num")
    
    
    private Integer hostNum;

    public DedicatedComputeInfo withVcpusTotal(Integer vcpusTotal) {
        this.vcpusTotal = vcpusTotal;
        return this;
    }

    


    /**
     * 专属资源池中cpu总数。
     * @return vcpusTotal
     */
    public Integer getVcpusTotal() {
        return vcpusTotal;
    }

    public void setVcpusTotal(Integer vcpusTotal) {
        this.vcpusTotal = vcpusTotal;
    }

    

    public DedicatedComputeInfo withVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
        return this;
    }

    


    /**
     * 专属资源池已使用的cpu数。
     * @return vcpusUsed
     */
    public Integer getVcpusUsed() {
        return vcpusUsed;
    }

    public void setVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
    }

    

    public DedicatedComputeInfo withRamTotal(Integer ramTotal) {
        this.ramTotal = ramTotal;
        return this;
    }

    


    /**
     * 专属资源池计算内存大小, 单位GB。
     * @return ramTotal
     */
    public Integer getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(Integer ramTotal) {
        this.ramTotal = ramTotal;
    }

    

    public DedicatedComputeInfo withRamUsed(Integer ramUsed) {
        this.ramUsed = ramUsed;
        return this;
    }

    


    /**
     * 专属资源池已使用的计算内存大小，单位GB。
     * @return ramUsed
     */
    public Integer getRamUsed() {
        return ramUsed;
    }

    public void setRamUsed(Integer ramUsed) {
        this.ramUsed = ramUsed;
    }

    

    public DedicatedComputeInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 专属资源池计算资源规格码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    public DedicatedComputeInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    


    /**
     * 专属资源池计算主机数量。
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DedicatedComputeInfo dedicatedComputeInfo = (DedicatedComputeInfo) o;
        return Objects.equals(this.vcpusTotal, dedicatedComputeInfo.vcpusTotal) &&
            Objects.equals(this.vcpusUsed, dedicatedComputeInfo.vcpusUsed) &&
            Objects.equals(this.ramTotal, dedicatedComputeInfo.ramTotal) &&
            Objects.equals(this.ramUsed, dedicatedComputeInfo.ramUsed) &&
            Objects.equals(this.specCode, dedicatedComputeInfo.specCode) &&
            Objects.equals(this.hostNum, dedicatedComputeInfo.hostNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vcpusTotal, vcpusUsed, ramTotal, ramUsed, specCode, hostNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DedicatedComputeInfo {\n");
        sb.append("    vcpusTotal: ").append(toIndentedString(vcpusTotal)).append("\n");
        sb.append("    vcpusUsed: ").append(toIndentedString(vcpusUsed)).append("\n");
        sb.append("    ramTotal: ").append(toIndentedString(ramTotal)).append("\n");
        sb.append("    ramUsed: ").append(toIndentedString(ramUsed)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
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

