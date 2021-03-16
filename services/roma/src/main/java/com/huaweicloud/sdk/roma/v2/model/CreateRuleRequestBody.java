package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

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
 * CreateRuleRequestBody
 */
public class CreateRuleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 规则状态 0-启用 1-停用，不填写时默认为0-启用
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * 数据解析状态，0-启用 1-停用，不填写时默认为1-禁用
     */
    public static final class DataParsingStatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DataParsingStatusEnum NUMBER_0 = new DataParsingStatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DataParsingStatusEnum NUMBER_1 = new DataParsingStatusEnum(1);
        

        private static final Map<Integer, DataParsingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DataParsingStatusEnum> createStaticFields() {
            Map<Integer, DataParsingStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DataParsingStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataParsingStatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            DataParsingStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataParsingStatusEnum(value);
            }
            return result;
        }

        public static DataParsingStatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            DataParsingStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DataParsingStatusEnum) {
                return this.value.equals(((DataParsingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_parsing_status")
    
    private DataParsingStatusEnum dataParsingStatus;

    public CreateRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称，支持英文大小写，数字，下划线和中划线,长度1-64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateRuleRequestBody withAppId(String appId) {
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

    

    public CreateRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateRuleRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 规则状态 0-启用 1-停用，不填写时默认为0-启用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public CreateRuleRequestBody withDataParsingStatus(DataParsingStatusEnum dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
        return this;
    }

    


    /**
     * 数据解析状态，0-启用 1-停用，不填写时默认为1-禁用
     * @return dataParsingStatus
     */
    public DataParsingStatusEnum getDataParsingStatus() {
        return dataParsingStatus;
    }

    public void setDataParsingStatus(DataParsingStatusEnum dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRuleRequestBody createRuleRequestBody = (CreateRuleRequestBody) o;
        return Objects.equals(this.name, createRuleRequestBody.name) &&
            Objects.equals(this.appId, createRuleRequestBody.appId) &&
            Objects.equals(this.description, createRuleRequestBody.description) &&
            Objects.equals(this.status, createRuleRequestBody.status) &&
            Objects.equals(this.dataParsingStatus, createRuleRequestBody.dataParsingStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, appId, description, status, dataParsingStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataParsingStatus: ").append(toIndentedString(dataParsingStatus)).append("\n");
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

