package com.huaweicloud.sdk.aom.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppByNameResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aom_id")
    
    
    private String aomId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    
    private String appId;


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
    @JsonProperty(value="display_name")
    
    
    private String displayName;


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
    @JsonProperty(value="name")
    
    
    private String name;
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

    public ShowAppByNameResponse withAomId(String aomId) {
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

    

    public ShowAppByNameResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ShowAppByNameResponse withCreateTime(String createTime) {
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

    

    public ShowAppByNameResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    

    public ShowAppByNameResponse withDescription(String description) {
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

    

    public ShowAppByNameResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 应用名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public ShowAppByNameResponse withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    

    public ShowAppByNameResponse withModifiedTime(String modifiedTime) {
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

    

    public ShowAppByNameResponse withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    


    /**
     * 修改人
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    

    public ShowAppByNameResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 唯一标识
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowAppByNameResponse withRegisterType(RegisterTypeEnum registerType) {
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
        ShowAppByNameResponse showAppByNameResponse = (ShowAppByNameResponse) o;
        return Objects.equals(this.aomId, showAppByNameResponse.aomId) &&
            Objects.equals(this.appId, showAppByNameResponse.appId) &&
            Objects.equals(this.createTime, showAppByNameResponse.createTime) &&
            Objects.equals(this.creator, showAppByNameResponse.creator) &&
            Objects.equals(this.description, showAppByNameResponse.description) &&
            Objects.equals(this.displayName, showAppByNameResponse.displayName) &&
            Objects.equals(this.epsId, showAppByNameResponse.epsId) &&
            Objects.equals(this.modifiedTime, showAppByNameResponse.modifiedTime) &&
            Objects.equals(this.modifier, showAppByNameResponse.modifier) &&
            Objects.equals(this.name, showAppByNameResponse.name) &&
            Objects.equals(this.registerType, showAppByNameResponse.registerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aomId, appId, createTime, creator, description, displayName, epsId, modifiedTime, modifier, name, registerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppByNameResponse {\n");
        sb.append("    aomId: ").append(toIndentedString(aomId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

