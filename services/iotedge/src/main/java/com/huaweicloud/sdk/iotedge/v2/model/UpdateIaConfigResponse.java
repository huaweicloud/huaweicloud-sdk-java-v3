package com.huaweicloud.sdk.iotedge.v2.model;




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
public class UpdateIaConfigResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private Long version;
    /**
     * 下发状态
     */
    public static final class StateEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");
        
        /**
         * Enum SENDING for value: "SENDING"
         */
        public static final StateEnum SENDING = new StateEnum("SENDING");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("SENDING", SENDING);
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
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private String updateTime;

    public UpdateIaConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UpdateIaConfigResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 配置项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateIaConfigResponse withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 配置项详情
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public UpdateIaConfigResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 配置项描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateIaConfigResponse withVersion(Long version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本号
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    

    public UpdateIaConfigResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 下发状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    public UpdateIaConfigResponse withCreateTime(String createTime) {
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

    

    public UpdateIaConfigResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIaConfigResponse updateIaConfigResponse = (UpdateIaConfigResponse) o;
        return Objects.equals(this.id, updateIaConfigResponse.id) &&
            Objects.equals(this.name, updateIaConfigResponse.name) &&
            Objects.equals(this.value, updateIaConfigResponse.value) &&
            Objects.equals(this.description, updateIaConfigResponse.description) &&
            Objects.equals(this.version, updateIaConfigResponse.version) &&
            Objects.equals(this.state, updateIaConfigResponse.state) &&
            Objects.equals(this.createTime, updateIaConfigResponse.createTime) &&
            Objects.equals(this.updateTime, updateIaConfigResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, value, description, version, state, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIaConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

