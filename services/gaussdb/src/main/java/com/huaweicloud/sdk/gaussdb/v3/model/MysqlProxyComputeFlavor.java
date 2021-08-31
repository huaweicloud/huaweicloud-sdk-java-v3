package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyComputeFlavor
 */
public class MysqlProxyComputeFlavor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_type")
    
    
    private String dbType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    
    private Object azStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_status")
    
    
    private String regionStatus;

    public MysqlProxyComputeFlavor withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Proxy规格id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlProxyComputeFlavor withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * Proxy规格码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    public MysqlProxyComputeFlavor withVcpus(String vcpus) {
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

    

    public MysqlProxyComputeFlavor withRam(String ram) {
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

    

    public MysqlProxyComputeFlavor withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    


    /**
     * 数据库类型。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    

    public MysqlProxyComputeFlavor withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    


    /**
     * 其中key是可用区编号，value是规格所在az的状态。
     * @return azStatus
     */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    

    public MysqlProxyComputeFlavor withRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
        return this;
    }

    


    /**
     * Region状态。
     * @return regionStatus
     */
    public String getRegionStatus() {
        return regionStatus;
    }

    public void setRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxyComputeFlavor mysqlProxyComputeFlavor = (MysqlProxyComputeFlavor) o;
        return Objects.equals(this.id, mysqlProxyComputeFlavor.id) &&
            Objects.equals(this.specCode, mysqlProxyComputeFlavor.specCode) &&
            Objects.equals(this.vcpus, mysqlProxyComputeFlavor.vcpus) &&
            Objects.equals(this.ram, mysqlProxyComputeFlavor.ram) &&
            Objects.equals(this.dbType, mysqlProxyComputeFlavor.dbType) &&
            Objects.equals(this.azStatus, mysqlProxyComputeFlavor.azStatus) &&
            Objects.equals(this.regionStatus, mysqlProxyComputeFlavor.regionStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, specCode, vcpus, ram, dbType, azStatus, regionStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyComputeFlavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    regionStatus: ").append(toIndentedString(regionStatus)).append("\n");
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

