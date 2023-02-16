package com.huaweicloud.sdk.aom.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v3.model.TagNameAndIdVo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEnvByNameResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aom_id")
    
    
    private String aomId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    
    private String componentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    
    private String creator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_tags")
    
    
    private List<TagNameAndIdVo> envTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_type")
    
    
    private String envType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eps_id")
    
    
    private String epsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modified_time")
    
    
    private String modifiedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modifier")
    
    
    private String modifier;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    
    private String region;
    /**
     * 注册方式
     */
    public static final class RegisterTypeEnum {

        
        /**
         * Enum API for value: "API"
         */
        public static final RegisterTypeEnum API = new RegisterTypeEnum("API");
        
        /**
         * Enum CONSOLE for value: "CONSOLE"
         */
        public static final RegisterTypeEnum CONSOLE = new RegisterTypeEnum("CONSOLE");
        
        /**
         * Enum SERVICE_DISCOVERY for value: "SERVICE_DISCOVERY"
         */
        public static final RegisterTypeEnum SERVICE_DISCOVERY = new RegisterTypeEnum("SERVICE_DISCOVERY");
        

        private static final Map<String, RegisterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegisterTypeEnum> createStaticFields() {
            Map<String, RegisterTypeEnum> map = new HashMap<>();
            map.put("API", API);
            map.put("CONSOLE", CONSOLE);
            map.put("SERVICE_DISCOVERY", SERVICE_DISCOVERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegisterTypeEnum(String value) {
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
        public static RegisterTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RegisterTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RegisterTypeEnum(value);
            }
            return result;
        }

        public static RegisterTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RegisterTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegisterTypeEnum) {
                return this.value.equals(((RegisterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_type")
    
    
    private RegisterTypeEnum registerType;

    public ShowEnvByNameResponse withAomId(String aomId) {
        this.aomId = aomId;
        return this;
    }

    


    /**
     * aomId
     * @return aomId
     */
    public String getAomId() {
        return aomId;
    }

    public void setAomId(String aomId) {
        this.aomId = aomId;
    }

    

    public ShowEnvByNameResponse withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * 组件Id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    

    public ShowEnvByNameResponse withCreateTime(String createTime) {
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

    

    public ShowEnvByNameResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    

    public ShowEnvByNameResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowEnvByNameResponse withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * 环境Id
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public ShowEnvByNameResponse withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * 环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    

    public ShowEnvByNameResponse withEnvTags(List<TagNameAndIdVo> envTags) {
        this.envTags = envTags;
        return this;
    }

    
    public ShowEnvByNameResponse addEnvTagsItem(TagNameAndIdVo envTagsItem) {
        if(this.envTags == null) {
            this.envTags = new ArrayList<>();
        }
        this.envTags.add(envTagsItem);
        return this;
    }

    public ShowEnvByNameResponse withEnvTags(Consumer<List<TagNameAndIdVo>> envTagsSetter) {
        if(this.envTags == null) {
            this.envTags = new ArrayList<>();
        }
        envTagsSetter.accept(this.envTags);
        return this;
    }

    /**
     * 环境标签
     * @return envTags
     */
    public List<TagNameAndIdVo> getEnvTags() {
        return envTags;
    }

    public void setEnvTags(List<TagNameAndIdVo> envTags) {
        this.envTags = envTags;
    }

    

    public ShowEnvByNameResponse withEnvType(String envType) {
        this.envType = envType;
        return this;
    }

    


    /**
     * 环境类型
     * @return envType
     */
    public String getEnvType() {
        return envType;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    

    public ShowEnvByNameResponse withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    


    /**
     * 企业项目Id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    

    public ShowEnvByNameResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    


    /**
     * 修改时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    

    public ShowEnvByNameResponse withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    


    /**
     * 修改者
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    

    public ShowEnvByNameResponse withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * os类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    

    public ShowEnvByNameResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ShowEnvByNameResponse withRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
        return this;
    }

    


    /**
     * 注册方式
     * @return registerType
     */
    public RegisterTypeEnum getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvByNameResponse showEnvByNameResponse = (ShowEnvByNameResponse) o;
        return Objects.equals(this.aomId, showEnvByNameResponse.aomId) &&
            Objects.equals(this.componentId, showEnvByNameResponse.componentId) &&
            Objects.equals(this.createTime, showEnvByNameResponse.createTime) &&
            Objects.equals(this.creator, showEnvByNameResponse.creator) &&
            Objects.equals(this.description, showEnvByNameResponse.description) &&
            Objects.equals(this.envId, showEnvByNameResponse.envId) &&
            Objects.equals(this.envName, showEnvByNameResponse.envName) &&
            Objects.equals(this.envTags, showEnvByNameResponse.envTags) &&
            Objects.equals(this.envType, showEnvByNameResponse.envType) &&
            Objects.equals(this.epsId, showEnvByNameResponse.epsId) &&
            Objects.equals(this.modifiedTime, showEnvByNameResponse.modifiedTime) &&
            Objects.equals(this.modifier, showEnvByNameResponse.modifier) &&
            Objects.equals(this.osType, showEnvByNameResponse.osType) &&
            Objects.equals(this.region, showEnvByNameResponse.region) &&
            Objects.equals(this.registerType, showEnvByNameResponse.registerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aomId, componentId, createTime, creator, description, envId, envName, envTags, envType, epsId, modifiedTime, modifier, osType, region, registerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvByNameResponse {\n");
        sb.append("    aomId: ").append(toIndentedString(aomId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envTags: ").append(toIndentedString(envTags)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    registerType: ").append(toIndentedString(registerType)).append("\n");
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

