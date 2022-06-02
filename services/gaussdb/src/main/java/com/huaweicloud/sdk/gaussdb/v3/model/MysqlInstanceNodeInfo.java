package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceNodeVolumeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点信息。
 */
public class MysqlInstanceNodeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_read_ips")
    
    
    private List<String> privateReadIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    
    private MysqlInstanceNodeVolumeInfo volume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    
    
    private String azCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_connections")
    
    
    private String maxConnections;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="need_restart")
    
    
    private Boolean needRestart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    
    private Integer priority;

    public MysqlInstanceNodeInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlInstanceNodeInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public MysqlInstanceNodeInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 节点类型，master或slave。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public MysqlInstanceNodeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MysqlInstanceNodeInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public MysqlInstanceNodeInfo withPrivateReadIps(List<String> privateReadIps) {
        this.privateReadIps = privateReadIps;
        return this;
    }

    
    public MysqlInstanceNodeInfo addPrivateReadIpsItem(String privateReadIpsItem) {
        if(this.privateReadIps == null) {
            this.privateReadIps = new ArrayList<>();
        }
        this.privateReadIps.add(privateReadIpsItem);
        return this;
    }

    public MysqlInstanceNodeInfo withPrivateReadIps(Consumer<List<String>> privateReadIpsSetter) {
        if(this.privateReadIps == null) {
            this.privateReadIps = new ArrayList<>();
        }
        privateReadIpsSetter.accept(this.privateReadIps);
        return this;
    }

    /**
     * 节点的读内网地址。
     * @return privateReadIps
     */
    public List<String> getPrivateReadIps() {
        return privateReadIps;
    }

    public void setPrivateReadIps(List<String> privateReadIps) {
        this.privateReadIps = privateReadIps;
    }

    

    public MysqlInstanceNodeInfo withVolume(MysqlInstanceNodeVolumeInfo volume) {
        this.volume = volume;
        return this;
    }

    public MysqlInstanceNodeInfo withVolume(Consumer<MysqlInstanceNodeVolumeInfo> volumeSetter) {
        if(this.volume == null ){
            this.volume = new MysqlInstanceNodeVolumeInfo();
            volumeSetter.accept(this.volume);
        }
        
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public MysqlInstanceNodeVolumeInfo getVolume() {
        return volume;
    }

    public void setVolume(MysqlInstanceNodeVolumeInfo volume) {
        this.volume = volume;
    }

    

    public MysqlInstanceNodeInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    public MysqlInstanceNodeInfo withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * 实例所在的区域。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    

    public MysqlInstanceNodeInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public MysqlInstanceNodeInfo withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式与\"created\"字段对应格式完全相同。说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public MysqlInstanceNodeInfo withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public MysqlInstanceNodeInfo withMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    


    /**
     * 允许的最大连接数。
     * @return maxConnections
     */
    public String getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
    }

    

    public MysqlInstanceNodeInfo withVcpus(String vcpus) {
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

    

    public MysqlInstanceNodeInfo withRam(String ram) {
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

    

    public MysqlInstanceNodeInfo withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    


    /**
     * 是否需要重启使修改的参数生效。
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    

    public MysqlInstanceNodeInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 主备倒换优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlInstanceNodeInfo mysqlInstanceNodeInfo = (MysqlInstanceNodeInfo) o;
        return Objects.equals(this.id, mysqlInstanceNodeInfo.id) &&
            Objects.equals(this.name, mysqlInstanceNodeInfo.name) &&
            Objects.equals(this.type, mysqlInstanceNodeInfo.type) &&
            Objects.equals(this.status, mysqlInstanceNodeInfo.status) &&
            Objects.equals(this.port, mysqlInstanceNodeInfo.port) &&
            Objects.equals(this.privateReadIps, mysqlInstanceNodeInfo.privateReadIps) &&
            Objects.equals(this.volume, mysqlInstanceNodeInfo.volume) &&
            Objects.equals(this.azCode, mysqlInstanceNodeInfo.azCode) &&
            Objects.equals(this.regionCode, mysqlInstanceNodeInfo.regionCode) &&
            Objects.equals(this.created, mysqlInstanceNodeInfo.created) &&
            Objects.equals(this.updated, mysqlInstanceNodeInfo.updated) &&
            Objects.equals(this.flavorRef, mysqlInstanceNodeInfo.flavorRef) &&
            Objects.equals(this.maxConnections, mysqlInstanceNodeInfo.maxConnections) &&
            Objects.equals(this.vcpus, mysqlInstanceNodeInfo.vcpus) &&
            Objects.equals(this.ram, mysqlInstanceNodeInfo.ram) &&
            Objects.equals(this.needRestart, mysqlInstanceNodeInfo.needRestart) &&
            Objects.equals(this.priority, mysqlInstanceNodeInfo.priority);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, status, port, privateReadIps, volume, azCode, regionCode, created, updated, flavorRef, maxConnections, vcpus, ram, needRestart, priority);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceNodeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    privateReadIps: ").append(toIndentedString(privateReadIps)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

