package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ColumnMapping;
import com.huaweicloud.sdk.iotda.v5.model.NetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InfluxDB配置信息
 */
public class InfluxDBForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private NetAddress address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measurement")
    
    private String measurement;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="column_mappings")
    
    private List<ColumnMapping> columnMappings = null;
    
    public InfluxDBForwarding withAddress(NetAddress address) {
        this.address = address;
        return this;
    }

    public InfluxDBForwarding withAddress(Consumer<NetAddress> addressSetter) {
        if(this.address == null ){
            this.address = new NetAddress();
            addressSetter.accept(this.address);
        }
        
        return this;
    }


    /**
     * Get address
     * @return address
     */
    public NetAddress getAddress() {
        return address;
    }

    public void setAddress(NetAddress address) {
        this.address = address;
    }

    

    public InfluxDBForwarding withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 连接InfluxDB数据库的库名,不存在会自动创建
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public InfluxDBForwarding withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 连接InfluxDB数据库的用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public InfluxDBForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 连接InfluxDB数据库的密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public InfluxDBForwarding withMeasurement(String measurement) {
        this.measurement = measurement;
        return this;
    }

    


    /**
     * InfluxDB数据库的measurement,不存在会自动创建
     * @return measurement
     */
    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    

    public InfluxDBForwarding withColumnMappings(List<ColumnMapping> columnMappings) {
        this.columnMappings = columnMappings;
        return this;
    }

    
    public InfluxDBForwarding addColumnMappingsItem(ColumnMapping columnMappingsItem) {
        this.columnMappings.add(columnMappingsItem);
        return this;
    }

    public InfluxDBForwarding withColumnMappings(Consumer<List<ColumnMapping>> columnMappingsSetter) {
        if(this.columnMappings == null ){
            this.columnMappings = new ArrayList<>();
        }
        columnMappingsSetter.accept(this.columnMappings);
        return this;
    }

    /**
     * InfluxDB数据库和流转数据的对应关系列表。
     * @return columnMappings
     */
    public List<ColumnMapping> getColumnMappings() {
        return columnMappings;
    }

    public void setColumnMappings(List<ColumnMapping> columnMappings) {
        this.columnMappings = columnMappings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InfluxDBForwarding influxDBForwarding = (InfluxDBForwarding) o;
        return Objects.equals(this.address, influxDBForwarding.address) &&
            Objects.equals(this.dbName, influxDBForwarding.dbName) &&
            Objects.equals(this.username, influxDBForwarding.username) &&
            Objects.equals(this.password, influxDBForwarding.password) &&
            Objects.equals(this.measurement, influxDBForwarding.measurement) &&
            Objects.equals(this.columnMappings, influxDBForwarding.columnMappings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, dbName, username, password, measurement, columnMappings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InfluxDBForwarding {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString("******")).append("\n");
        sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
        sb.append("    columnMappings: ").append(toIndentedString(columnMappings)).append("\n");
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

