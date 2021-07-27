package com.huaweicloud.sdk.apig.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ApiConditionBase;
import com.huaweicloud.sdk.apig.v2.model.BackendParamBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiPolicyReqBase
 */
public class ApiPolicyReqBase  {

    /**
     * 关联的策略组合模式： - ALL：满足全部条件 - ANY：满足任一条件
     */
    public static final class EffectModeEnum {

        
        /**
         * Enum ALL for value: "ALL"
         */
        public static final EffectModeEnum ALL = new EffectModeEnum("ALL");
        
        /**
         * Enum ANY for value: "ANY"
         */
        public static final EffectModeEnum ANY = new EffectModeEnum("ANY");
        

        private static final Map<String, EffectModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectModeEnum> createStaticFields() {
            Map<String, EffectModeEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectModeEnum(String value) {
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
        public static EffectModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EffectModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EffectModeEnum(value);
            }
            return result;
        }

        public static EffectModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EffectModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectModeEnum) {
                return this.value.equals(((EffectModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effect_mode")
    
    private EffectModeEnum effectMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backend_params")
    
    private List<BackendParamBase> backendParams = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conditions")
    
    private List<ApiConditionBase> conditions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizer_id")
    
    private String authorizerId;

    public ApiPolicyReqBase withEffectMode(EffectModeEnum effectMode) {
        this.effectMode = effectMode;
        return this;
    }

    


    /**
     * 关联的策略组合模式： - ALL：满足全部条件 - ANY：满足任一条件
     * @return effectMode
     */
    public EffectModeEnum getEffectMode() {
        return effectMode;
    }

    public void setEffectMode(EffectModeEnum effectMode) {
        this.effectMode = effectMode;
    }

    

    public ApiPolicyReqBase withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 策略后端名称。字符串由中文、英文字母、数字、下划线组成，且只能以中文或英文开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ApiPolicyReqBase withBackendParams(List<BackendParamBase> backendParams) {
        this.backendParams = backendParams;
        return this;
    }

    
    public ApiPolicyReqBase addBackendParamsItem(BackendParamBase backendParamsItem) {
        if(this.backendParams == null) {
            this.backendParams = new ArrayList<>();
        }
        this.backendParams.add(backendParamsItem);
        return this;
    }

    public ApiPolicyReqBase withBackendParams(Consumer<List<BackendParamBase>> backendParamsSetter) {
        if(this.backendParams == null) {
            this.backendParams = new ArrayList<>();
        }
        backendParamsSetter.accept(this.backendParams);
        return this;
    }

    /**
     * 后端参数列表
     * @return backendParams
     */
    public List<BackendParamBase> getBackendParams() {
        return backendParams;
    }

    public void setBackendParams(List<BackendParamBase> backendParams) {
        this.backendParams = backendParams;
    }

    

    public ApiPolicyReqBase withConditions(List<ApiConditionBase> conditions) {
        this.conditions = conditions;
        return this;
    }

    
    public ApiPolicyReqBase addConditionsItem(ApiConditionBase conditionsItem) {
        if(this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ApiPolicyReqBase withConditions(Consumer<List<ApiConditionBase>> conditionsSetter) {
        if(this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 策略条件列表
     * @return conditions
     */
    public List<ApiConditionBase> getConditions() {
        return conditions;
    }

    public void setConditions(List<ApiConditionBase> conditions) {
        this.conditions = conditions;
    }

    

    public ApiPolicyReqBase withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    


    /**
     * 后端自定义认证对象的ID
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPolicyReqBase apiPolicyReqBase = (ApiPolicyReqBase) o;
        return Objects.equals(this.effectMode, apiPolicyReqBase.effectMode) &&
            Objects.equals(this.name, apiPolicyReqBase.name) &&
            Objects.equals(this.backendParams, apiPolicyReqBase.backendParams) &&
            Objects.equals(this.conditions, apiPolicyReqBase.conditions) &&
            Objects.equals(this.authorizerId, apiPolicyReqBase.authorizerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(effectMode, name, backendParams, conditions, authorizerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPolicyReqBase {\n");
        sb.append("    effectMode: ").append(toIndentedString(effectMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    backendParams: ").append(toIndentedString(backendParams)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
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

