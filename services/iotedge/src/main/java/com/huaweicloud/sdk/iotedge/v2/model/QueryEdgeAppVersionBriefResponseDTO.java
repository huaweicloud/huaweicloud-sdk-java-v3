package com.huaweicloud.sdk.iotedge.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryEdgeAppVersionBriefResponseDTO
 */
public class QueryEdgeAppVersionBriefResponseDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdk_version")
    
    
    private String sdkVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    
    
    private String deployType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_multi_instance")
    
    
    private Boolean deployMultiInstance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private String updateTime;
    /**
     * 应用版本状态
     */
    public static final class StateEnum {

        
        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StateEnum DRAFT = new StateEnum("DRAFT");
        
        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StateEnum PUBLISHED = new StateEnum("PUBLISHED");
        
        /**
         * Enum OFF_SHELF for value: "OFF_SHELF"
         */
        public static final StateEnum OFF_SHELF = new StateEnum("OFF_SHELF");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFF_SHELF", OFF_SHELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private List<String> arch = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_time")
    
    
    private String publishTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="off_shelf_time")
    
    
    private String offShelfTime;

    public QueryEdgeAppVersionBriefResponseDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用名称
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    


    /**
     * 应用集成的边缘升得快版本
     * @return sdkVersion
     */
    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    


    /**
     * 部署类型docker|process
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withDeployMultiInstance(Boolean deployMultiInstance) {
        this.deployMultiInstance = deployMultiInstance;
        return this;
    }

    


    /**
     * 是否允许部署多实例
     * @return deployMultiInstance
     */
    public Boolean getDeployMultiInstance() {
        return deployMultiInstance;
    }

    public void setDeployMultiInstance(Boolean deployMultiInstance) {
        this.deployMultiInstance = deployMultiInstance;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 应用版本状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withArch(List<String> arch) {
        this.arch = arch;
        return this;
    }

    
    public QueryEdgeAppVersionBriefResponseDTO addArchItem(String archItem) {
        if(this.arch == null) {
            this.arch = new ArrayList<>();
        }
        this.arch.add(archItem);
        return this;
    }

    public QueryEdgeAppVersionBriefResponseDTO withArch(Consumer<List<String>> archSetter) {
        if(this.arch == null) {
            this.arch = new ArrayList<>();
        }
        archSetter.accept(this.arch);
        return this;
    }

    /**
     * 架构
     * @return arch
     */
    public List<String> getArch() {
        return arch;
    }

    public void setArch(List<String> arch) {
        this.arch = arch;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    


    /**
     * 发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    

    public QueryEdgeAppVersionBriefResponseDTO withOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
        return this;
    }

    


    /**
     * 下线时间
     * @return offShelfTime
     */
    public String getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryEdgeAppVersionBriefResponseDTO queryEdgeAppVersionBriefResponseDTO = (QueryEdgeAppVersionBriefResponseDTO) o;
        return Objects.equals(this.edgeAppId, queryEdgeAppVersionBriefResponseDTO.edgeAppId) &&
            Objects.equals(this.name, queryEdgeAppVersionBriefResponseDTO.name) &&
            Objects.equals(this.version, queryEdgeAppVersionBriefResponseDTO.version) &&
            Objects.equals(this.sdkVersion, queryEdgeAppVersionBriefResponseDTO.sdkVersion) &&
            Objects.equals(this.description, queryEdgeAppVersionBriefResponseDTO.description) &&
            Objects.equals(this.deployType, queryEdgeAppVersionBriefResponseDTO.deployType) &&
            Objects.equals(this.deployMultiInstance, queryEdgeAppVersionBriefResponseDTO.deployMultiInstance) &&
            Objects.equals(this.createTime, queryEdgeAppVersionBriefResponseDTO.createTime) &&
            Objects.equals(this.updateTime, queryEdgeAppVersionBriefResponseDTO.updateTime) &&
            Objects.equals(this.state, queryEdgeAppVersionBriefResponseDTO.state) &&
            Objects.equals(this.arch, queryEdgeAppVersionBriefResponseDTO.arch) &&
            Objects.equals(this.publishTime, queryEdgeAppVersionBriefResponseDTO.publishTime) &&
            Objects.equals(this.offShelfTime, queryEdgeAppVersionBriefResponseDTO.offShelfTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, name, version, sdkVersion, description, deployType, deployMultiInstance, createTime, updateTime, state, arch, publishTime, offShelfTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryEdgeAppVersionBriefResponseDTO {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deployMultiInstance: ").append(toIndentedString(deployMultiInstance)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    offShelfTime: ").append(toIndentedString(offShelfTime)).append("\n");
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

