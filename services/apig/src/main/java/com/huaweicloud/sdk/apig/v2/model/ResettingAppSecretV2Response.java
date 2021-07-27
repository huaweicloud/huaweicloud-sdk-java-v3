package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ResettingAppSecretV2Response extends SdkResponse {

    /**
     * APP的创建者 - USER：用户自行创建 - MARKET：云市场分配
     */
    public static final class CreatorEnum {

        
        /**
         * Enum USER for value: "USER"
         */
        public static final CreatorEnum USER = new CreatorEnum("USER");
        
        /**
         * Enum MARKET for value: "MARKET"
         */
        public static final CreatorEnum MARKET = new CreatorEnum("MARKET");
        

        private static final Map<String, CreatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreatorEnum> createStaticFields() {
            Map<String, CreatorEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("MARKET", MARKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreatorEnum(String value) {
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
        public static CreatorEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CreatorEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CreatorEnum(value);
            }
            return result;
        }

        public static CreatorEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CreatorEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreatorEnum) {
                return this.value.equals(((CreatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private CreatorEnum creator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_secret")
    
    private String appSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private OffsetDateTime registerTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;
    /**
     * APP的类型  默认为apig，暂不支持其他类型
     */
    public static final class AppTypeEnum {

        
        /**
         * Enum APIG for value: "apig"
         */
        public static final AppTypeEnum APIG = new AppTypeEnum("apig");
        
        /**
         * Enum ROMA for value: "roma"
         */
        public static final AppTypeEnum ROMA = new AppTypeEnum("roma");
        

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("apig", APIG);
            map.put("roma", ROMA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppTypeEnum(value);
            }
            return result;
        }

        public static AppTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    
    private AppTypeEnum appType;

    public ResettingAppSecretV2Response withCreator(CreatorEnum creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * APP的创建者 - USER：用户自行创建 - MARKET：云市场分配
     * @return creator
     */
    public CreatorEnum getCreator() {
        return creator;
    }

    public void setCreator(CreatorEnum creator) {
        this.creator = creator;
    }

    

    public ResettingAppSecretV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    

    public ResettingAppSecretV2Response withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * APP的key
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    

    public ResettingAppSecretV2Response withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ResettingAppSecretV2Response withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ResettingAppSecretV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ResettingAppSecretV2Response withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    


    /**
     * 密钥
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    

    public ResettingAppSecretV2Response withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    


    /**
     * 注册时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    

    public ResettingAppSecretV2Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ResettingAppSecretV2Response withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * APP的类型  默认为apig，暂不支持其他类型
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResettingAppSecretV2Response resettingAppSecretV2Response = (ResettingAppSecretV2Response) o;
        return Objects.equals(this.creator, resettingAppSecretV2Response.creator) &&
            Objects.equals(this.updateTime, resettingAppSecretV2Response.updateTime) &&
            Objects.equals(this.appKey, resettingAppSecretV2Response.appKey) &&
            Objects.equals(this.name, resettingAppSecretV2Response.name) &&
            Objects.equals(this.remark, resettingAppSecretV2Response.remark) &&
            Objects.equals(this.id, resettingAppSecretV2Response.id) &&
            Objects.equals(this.appSecret, resettingAppSecretV2Response.appSecret) &&
            Objects.equals(this.registerTime, resettingAppSecretV2Response.registerTime) &&
            Objects.equals(this.status, resettingAppSecretV2Response.status) &&
            Objects.equals(this.appType, resettingAppSecretV2Response.appType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, updateTime, appKey, name, remark, id, appSecret, registerTime, status, appType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResettingAppSecretV2Response {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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

