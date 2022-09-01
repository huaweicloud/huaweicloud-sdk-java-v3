package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlFlavorsInfo
 */
public class MysqlFlavorsInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    @JacksonXmlProperty(localName = "vcpus")
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    @JacksonXmlProperty(localName = "ram")
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    @JacksonXmlProperty(localName = "id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    @JacksonXmlProperty(localName = "spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_name")
    
    @JacksonXmlProperty(localName = "version_name")
    
    private String versionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_mode")
    
    @JacksonXmlProperty(localName = "instance_mode")
    
    private String instanceMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    @JacksonXmlProperty(localName = "az_status")
    
    private Map<String, String> azStatus = null;
    
    public MysqlFlavorsInfo withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    


    /**
     * CPU大小。例如：1表示1U。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    

    public MysqlFlavorsInfo withRam(String ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 内存大小，单位为GB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    

    public MysqlFlavorsInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规格类型，取值为arm和x86。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public MysqlFlavorsInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规格ID，该字段唯一
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlFlavorsInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码，同创建指定的flavor_ref。例如：gaussdb.mysql.xlarge.x86.4。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    public MysqlFlavorsInfo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    


    /**
     * 数据库版本号。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    

    public MysqlFlavorsInfo withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    


    /**
     * 实例类型。目前仅支持Cluster。
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    

    public MysqlFlavorsInfo withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    

    public MysqlFlavorsInfo putAzStatusItem(String key, String azStatusItem) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public MysqlFlavorsInfo withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }
    /**
     * 规格所在az的状态，包含以下状态： - normal，在售 - unsupported，暂不支持该规格 - sellout，售罄。
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
        MysqlFlavorsInfo mysqlFlavorsInfo = (MysqlFlavorsInfo) o;
        return Objects.equals(this.vcpus, mysqlFlavorsInfo.vcpus) &&
            Objects.equals(this.ram, mysqlFlavorsInfo.ram) &&
            Objects.equals(this.type, mysqlFlavorsInfo.type) &&
            Objects.equals(this.id, mysqlFlavorsInfo.id) &&
            Objects.equals(this.specCode, mysqlFlavorsInfo.specCode) &&
            Objects.equals(this.versionName, mysqlFlavorsInfo.versionName) &&
            Objects.equals(this.instanceMode, mysqlFlavorsInfo.instanceMode) &&
            Objects.equals(this.azStatus, mysqlFlavorsInfo.azStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vcpus, ram, type, id, specCode, versionName, instanceMode, azStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlFlavorsInfo {\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
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

