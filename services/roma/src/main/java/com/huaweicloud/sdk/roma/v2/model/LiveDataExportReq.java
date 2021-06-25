package com.huaweicloud.sdk.roma.v2.model;




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
 * LiveDataExportReq
 */
public class LiveDataExportReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;
    /**
     * 导出的API定义的格式
     */
    public static final class FormatEnum {

        
        /**
         * Enum JSON for value: "json"
         */
        public static final FormatEnum JSON = new FormatEnum("json");
        
        /**
         * Enum YAML for value: "yaml"
         */
        public static final FormatEnum YAML = new FormatEnum("yaml");
        
        /**
         * Enum YML for value: "yml"
         */
        public static final FormatEnum YML = new FormatEnum("yml");
        

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("yaml", YAML);
            map.put("yml", YML);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FormatEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="format")
    
    private FormatEnum format;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apis")
    
    private List<String> apis = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public LiveDataExportReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * API所属的应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public LiveDataExportReq withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    


    /**
     * 导出的API定义的格式
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    

    public LiveDataExportReq withApis(List<String> apis) {
        this.apis = apis;
        return this;
    }

    
    public LiveDataExportReq addApisItem(String apisItem) {
        if(this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public LiveDataExportReq withApis(Consumer<List<String>> apisSetter) {
        if(this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 导出的自定义后端API ID列表
     * @return apis
     */
    public List<String> getApis() {
        return apis;
    }

    public void setApis(List<String> apis) {
        this.apis = apis;
    }

    

    public LiveDataExportReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 导出的后端API状态： - 1：待开发 - 3：开发中 - 4：已部署
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDataExportReq liveDataExportReq = (LiveDataExportReq) o;
        return Objects.equals(this.appId, liveDataExportReq.appId) &&
            Objects.equals(this.format, liveDataExportReq.format) &&
            Objects.equals(this.apis, liveDataExportReq.apis) &&
            Objects.equals(this.status, liveDataExportReq.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, format, apis, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDataExportReq {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

