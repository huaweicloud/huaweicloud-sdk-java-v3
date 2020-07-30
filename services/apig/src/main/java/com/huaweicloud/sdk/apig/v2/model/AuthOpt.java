package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 认证方式参数
 */
public class AuthOpt  {

    /**
     * AppCode简易认证类型，仅在auth_type为APP时生效，默认为DISABLE： - DISABLE：不开启简易认证 - HEADER：开启简易认证且AppCode位置在HEADER
     */
    public static class AppCodeAuthTypeEnum {

        
        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final AppCodeAuthTypeEnum DISABLE = new AppCodeAuthTypeEnum("DISABLE");
        
        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final AppCodeAuthTypeEnum HEADER = new AppCodeAuthTypeEnum("HEADER");
        

        public static final Map<String, AppCodeAuthTypeEnum> staticFields = new HashMap<String, AppCodeAuthTypeEnum>() {
            { 
                put("DISABLE", DISABLE);
                put("HEADER", HEADER);
            }
        };

        private String value;

        AppCodeAuthTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppCodeAuthTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AppCodeAuthTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new AppCodeAuthTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static AppCodeAuthTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AppCodeAuthTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AppCodeAuthTypeEnum) {
                return this.value.equals(((AppCodeAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_code_auth_type")
    
    private AppCodeAuthTypeEnum appCodeAuthType = AppCodeAuthTypeEnum.DISABLE;

    public AuthOpt withAppCodeAuthType(AppCodeAuthTypeEnum appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }

    


    /**
     * AppCode简易认证类型，仅在auth_type为APP时生效，默认为DISABLE： - DISABLE：不开启简易认证 - HEADER：开启简易认证且AppCode位置在HEADER
     * @return appCodeAuthType
     */
    public AppCodeAuthTypeEnum getAppCodeAuthType() {
        return appCodeAuthType;
    }

    public void setAppCodeAuthType(AppCodeAuthTypeEnum appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthOpt authOpt = (AuthOpt) o;
        return Objects.equals(this.appCodeAuthType, authOpt.appCodeAuthType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appCodeAuthType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthOpt {\n");
        sb.append("    appCodeAuthType: ").append(toIndentedString(appCodeAuthType)).append("\n");
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

