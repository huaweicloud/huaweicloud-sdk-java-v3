package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息。
 */
public class MysqlDatastoreWithKernelVersion  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kernel_version")
    
    
    private String kernelVersion;

    public MysqlDatastoreWithKernelVersion withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据库引擎，现在只支持gaussdb-mysql
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public MysqlDatastoreWithKernelVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据库版本。  数据库支持的详细版本信息，可调用查询数据库引擎的版本接口获取。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public MysqlDatastoreWithKernelVersion withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    


    /**
     * 数据库内核版本
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlDatastoreWithKernelVersion mysqlDatastoreWithKernelVersion = (MysqlDatastoreWithKernelVersion) o;
        return Objects.equals(this.type, mysqlDatastoreWithKernelVersion.type) &&
            Objects.equals(this.version, mysqlDatastoreWithKernelVersion.version) &&
            Objects.equals(this.kernelVersion, mysqlDatastoreWithKernelVersion.kernelVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, version, kernelVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlDatastoreWithKernelVersion {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
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

