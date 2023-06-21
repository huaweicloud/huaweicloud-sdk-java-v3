package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.OfflineCacheConfigsDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BasePathDTO
 */
public class BasePathDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_base_path")
    

    private String logBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_base_path")
    

    private String configBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_base_path")
    

    private String dbBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offline_cache_configs")
    

    private OfflineCacheConfigsDTO offlineCacheConfigs;

    public BasePathDTO withLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
        return this;
    }

    


    /**
     * 节点日志根目录
     * @return logBasePath
     */
    public String getLogBasePath() {
        return logBasePath;
    }

    public void setLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
    }

    

    public BasePathDTO withConfigBasePath(String configBasePath) {
        this.configBasePath = configBasePath;
        return this;
    }

    


    /**
     * 节点配置根目录
     * @return configBasePath
     */
    public String getConfigBasePath() {
        return configBasePath;
    }

    public void setConfigBasePath(String configBasePath) {
        this.configBasePath = configBasePath;
    }

    

    public BasePathDTO withDbBasePath(String dbBasePath) {
        this.dbBasePath = dbBasePath;
        return this;
    }

    


    /**
     * 节点数据存储根目录
     * @return dbBasePath
     */
    public String getDbBasePath() {
        return dbBasePath;
    }

    public void setDbBasePath(String dbBasePath) {
        this.dbBasePath = dbBasePath;
    }

    

    public BasePathDTO withOfflineCacheConfigs(OfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
        return this;
    }

    public BasePathDTO withOfflineCacheConfigs(Consumer<OfflineCacheConfigsDTO> offlineCacheConfigsSetter) {
        if(this.offlineCacheConfigs == null ){
            this.offlineCacheConfigs = new OfflineCacheConfigsDTO();
            offlineCacheConfigsSetter.accept(this.offlineCacheConfigs);
        }
        
        return this;
    }


    /**
     * Get offlineCacheConfigs
     * @return offlineCacheConfigs
     */
    public OfflineCacheConfigsDTO getOfflineCacheConfigs() {
        return offlineCacheConfigs;
    }

    public void setOfflineCacheConfigs(OfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasePathDTO basePathDTO = (BasePathDTO) o;
        return Objects.equals(this.logBasePath, basePathDTO.logBasePath) &&
            Objects.equals(this.configBasePath, basePathDTO.configBasePath) &&
            Objects.equals(this.dbBasePath, basePathDTO.dbBasePath) &&
            Objects.equals(this.offlineCacheConfigs, basePathDTO.offlineCacheConfigs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logBasePath, configBasePath, dbBasePath, offlineCacheConfigs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePathDTO {\n");
        sb.append("    logBasePath: ").append(toIndentedString(logBasePath)).append("\n");
        sb.append("    configBasePath: ").append(toIndentedString(configBasePath)).append("\n");
        sb.append("    dbBasePath: ").append(toIndentedString(dbBasePath)).append("\n");
        sb.append("    offlineCacheConfigs: ").append(toIndentedString(offlineCacheConfigs)).append("\n");
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

