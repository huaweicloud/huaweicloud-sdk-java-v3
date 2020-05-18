package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 规格信息。
 */
public class ListFlavorsResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_name")
    
    private String engineName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    private Map<String, String> azStatus = null;
    
    public ListFlavorsResult withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    


    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListFlavorsResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 节点类型。文档数据库包含以下几种节点类型： - mongos - shard - config - replica - single
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListFlavorsResult withVcpus(String vcpus) {
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

    public ListFlavorsResult withRam(String ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 内存大小，单位为兆字节。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ListFlavorsResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。例如：dds.c3.xlarge.2.shard。 - “dds”表示文档数据库服务产品。 - “c3.xlarge.2”表示节点性能规格，为高内存类型。 - “shard”表示节点类型。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListFlavorsResult withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    

    public ListFlavorsResult putAzStatusItem(String key, String azStatusItem) {
         if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
         }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public ListFlavorsResult withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if(this.azStatus == null ){
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }
    /**
     * 其中key是可用区编号，value是规格所在az的状态，包含以下状态： - normal，在售。 - unsupported，暂不支持该规格。 - sellout，售罄。
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
        ListFlavorsResult listFlavorsResult = (ListFlavorsResult) o;
        return Objects.equals(this.engineName, listFlavorsResult.engineName) &&
            Objects.equals(this.type, listFlavorsResult.type) &&
            Objects.equals(this.vcpus, listFlavorsResult.vcpus) &&
            Objects.equals(this.ram, listFlavorsResult.ram) &&
            Objects.equals(this.specCode, listFlavorsResult.specCode) &&
            Objects.equals(this.azStatus, listFlavorsResult.azStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(engineName, type, vcpus, ram, specCode, azStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResult {\n");
            sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
            sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
            sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

