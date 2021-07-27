package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppInfoWithBindNum
 */
public class AppInfoWithBindNum  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;
    /**
     * APP的创建者 - USER：用户自行创建 - MARKET：云市场分配  暂不支持MARKET
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
    @JsonProperty(value="app_secret")
    
    private String appSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private OffsetDateTime registerTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;
    /**
     * APP的类型： - apig：存量apig应用，不推荐使用 - roma：roma集成应用
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_type")
    
    private Object romaAppType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;

    public AppInfoWithBindNum withId(String id) {
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

    

    public AppInfoWithBindNum withName(String name) {
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

    

    public AppInfoWithBindNum withRemark(String remark) {
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

    

    public AppInfoWithBindNum withCreator(CreatorEnum creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * APP的创建者 - USER：用户自行创建 - MARKET：云市场分配  暂不支持MARKET
     * @return creator
     */
    public CreatorEnum getCreator() {
        return creator;
    }

    public void setCreator(CreatorEnum creator) {
        this.creator = creator;
    }

    

    public AppInfoWithBindNum withUpdateTime(OffsetDateTime updateTime) {
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

    

    public AppInfoWithBindNum withAppKey(String appKey) {
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

    

    public AppInfoWithBindNum withAppSecret(String appSecret) {
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

    

    public AppInfoWithBindNum withRegisterTime(OffsetDateTime registerTime) {
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

    

    public AppInfoWithBindNum withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态   - 1： 有效
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public AppInfoWithBindNum withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * APP的类型： - apig：存量apig应用，不推荐使用 - roma：roma集成应用
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    

    public AppInfoWithBindNum withRomaAppType(Object romaAppType) {
        this.romaAppType = romaAppType;
        return this;
    }

    


    /**
     * ROMA_APP的类型： - subscription：订阅应用 - integration：集成应用
     * @return romaAppType
     */
    public Object getRomaAppType() {
        return romaAppType;
    }

    public void setRomaAppType(Object romaAppType) {
        this.romaAppType = romaAppType;
    }

    

    public AppInfoWithBindNum withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    


    /**
     * 绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppInfoWithBindNum appInfoWithBindNum = (AppInfoWithBindNum) o;
        return Objects.equals(this.id, appInfoWithBindNum.id) &&
            Objects.equals(this.name, appInfoWithBindNum.name) &&
            Objects.equals(this.remark, appInfoWithBindNum.remark) &&
            Objects.equals(this.creator, appInfoWithBindNum.creator) &&
            Objects.equals(this.updateTime, appInfoWithBindNum.updateTime) &&
            Objects.equals(this.appKey, appInfoWithBindNum.appKey) &&
            Objects.equals(this.appSecret, appInfoWithBindNum.appSecret) &&
            Objects.equals(this.registerTime, appInfoWithBindNum.registerTime) &&
            Objects.equals(this.status, appInfoWithBindNum.status) &&
            Objects.equals(this.appType, appInfoWithBindNum.appType) &&
            Objects.equals(this.romaAppType, appInfoWithBindNum.romaAppType) &&
            Objects.equals(this.bindNum, appInfoWithBindNum.bindNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, remark, creator, updateTime, appKey, appSecret, registerTime, status, appType, romaAppType, bindNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInfoWithBindNum {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    romaAppType: ").append(toIndentedString(romaAppType)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
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

