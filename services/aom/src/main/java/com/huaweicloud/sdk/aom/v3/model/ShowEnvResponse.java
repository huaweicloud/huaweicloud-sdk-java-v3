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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "ShowEnvResponse")
public class ShowEnvResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aom_id")
    
    @JacksonXmlProperty(localName = "aom_id")

    private String aomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    @JacksonXmlProperty(localName = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    @JacksonXmlProperty(localName = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    @JacksonXmlProperty(localName = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_tags")
    
    @JacksonXmlProperty(localName = "env_tags")
    private List<TagNameAndIdVo> envTags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_type")
    
    @JacksonXmlProperty(localName = "env_type")

    private String envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eps_id")
    
    @JacksonXmlProperty(localName = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modified_time")
    
    @JacksonXmlProperty(localName = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modifier")
    
    @JacksonXmlProperty(localName = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    @JacksonXmlProperty(localName = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    @JacksonXmlProperty(localName = "region")

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
    
    @JacksonXmlProperty(localName = "register_type")

    private RegisterTypeEnum registerType;

    public ShowEnvResponse withAomId(String aomId) {
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

    

    public ShowEnvResponse withComponentId(String componentId) {
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

    

    public ShowEnvResponse withCreateTime(String createTime) {
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

    

    public ShowEnvResponse withCreator(String creator) {
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

    

    public ShowEnvResponse withDescription(String description) {
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

    

    public ShowEnvResponse withEnvId(String envId) {
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

    

    public ShowEnvResponse withEnvName(String envName) {
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

    

    public ShowEnvResponse withEnvTags(List<TagNameAndIdVo> envTags) {
        this.envTags = envTags;
        return this;
    }

    
    public ShowEnvResponse addEnvTagsItem(TagNameAndIdVo envTagsItem) {
        if(this.envTags == null) {
            this.envTags = new ArrayList<>();
        }
        this.envTags.add(envTagsItem);
        return this;
    }

    public ShowEnvResponse withEnvTags(Consumer<List<TagNameAndIdVo>> envTagsSetter) {
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

    

    public ShowEnvResponse withEnvType(String envType) {
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

    

    public ShowEnvResponse withEpsId(String epsId) {
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

    

    public ShowEnvResponse withModifiedTime(String modifiedTime) {
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

    

    public ShowEnvResponse withModifier(String modifier) {
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

    

    public ShowEnvResponse withOsType(String osType) {
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

    

    public ShowEnvResponse withRegion(String region) {
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

    

    public ShowEnvResponse withRegisterType(RegisterTypeEnum registerType) {
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
        ShowEnvResponse showEnvResponse = (ShowEnvResponse) o;
        return Objects.equals(this.aomId, showEnvResponse.aomId) &&
            Objects.equals(this.componentId, showEnvResponse.componentId) &&
            Objects.equals(this.createTime, showEnvResponse.createTime) &&
            Objects.equals(this.creator, showEnvResponse.creator) &&
            Objects.equals(this.description, showEnvResponse.description) &&
            Objects.equals(this.envId, showEnvResponse.envId) &&
            Objects.equals(this.envName, showEnvResponse.envName) &&
            Objects.equals(this.envTags, showEnvResponse.envTags) &&
            Objects.equals(this.envType, showEnvResponse.envType) &&
            Objects.equals(this.epsId, showEnvResponse.epsId) &&
            Objects.equals(this.modifiedTime, showEnvResponse.modifiedTime) &&
            Objects.equals(this.modifier, showEnvResponse.modifier) &&
            Objects.equals(this.osType, showEnvResponse.osType) &&
            Objects.equals(this.region, showEnvResponse.region) &&
            Objects.equals(this.registerType, showEnvResponse.registerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aomId, componentId, createTime, creator, description, envId, envName, envTags, envType, epsId, modifiedTime, modifier, osType, region, registerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvResponse {\n");
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

