package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ParamsReqBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改数据库参数请求体
 */
public class ModifyTargetParamsReq  {

    /**
     * 参数分组
     */
    public static final class GroupEnum {

        
        /**
         * Enum COMMON for value: "common"
         */
        public static final GroupEnum COMMON = new GroupEnum("common");
        
        /**
         * Enum PERFORMANCE for value: "performance"
         */
        public static final GroupEnum PERFORMANCE = new GroupEnum("performance");
        

        private static final Map<String, GroupEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupEnum> createStaticFields() {
            Map<String, GroupEnum> map = new HashMap<>();
            map.put("common", COMMON);
            map.put("performance", PERFORMANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupEnum(String value) {
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
        public static GroupEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            GroupEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new GroupEnum(value);
            }
            return result;
        }

        public static GroupEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            GroupEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof GroupEnum) {
                return this.value.equals(((GroupEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private GroupEnum group;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private List<ParamsReqBean> params = null;
    
    public ModifyTargetParamsReq withGroup(GroupEnum group) {
        this.group = group;
        return this;
    }

    


    /**
     * 参数分组
     * @return group
     */
    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    

    public ModifyTargetParamsReq withParams(List<ParamsReqBean> params) {
        this.params = params;
        return this;
    }

    
    public ModifyTargetParamsReq addParamsItem(ParamsReqBean paramsItem) {
        this.params.add(paramsItem);
        return this;
    }

    public ModifyTargetParamsReq withParams(Consumer<List<ParamsReqBean>> paramsSetter) {
        if(this.params == null ){
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 修改的参数信息
     * @return params
     */
    public List<ParamsReqBean> getParams() {
        return params;
    }

    public void setParams(List<ParamsReqBean> params) {
        this.params = params;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyTargetParamsReq modifyTargetParamsReq = (ModifyTargetParamsReq) o;
        return Objects.equals(this.group, modifyTargetParamsReq.group) &&
            Objects.equals(this.params, modifyTargetParamsReq.params);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group, params);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTargetParamsReq {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

