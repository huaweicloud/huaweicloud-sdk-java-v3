package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

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
 * 批量操作弹性伸缩策略
 */
public class BatchPauseScalingPoliciesOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private List<String> scalingPolicyId = null;
        /**
     * 是否强制删除伸缩策略。默认为no，可选值为yes或no。只有action为delete时，该字段才生效。
     */
    public static final class ForceDeleteEnum {

        
        /**
         * Enum NO for value: "no"
         */
        public static final ForceDeleteEnum NO = new ForceDeleteEnum("no");
        
        /**
         * Enum YES for value: "yes"
         */
        public static final ForceDeleteEnum YES = new ForceDeleteEnum("yes");
        

        private static final Map<String, ForceDeleteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ForceDeleteEnum> createStaticFields() {
            Map<String, ForceDeleteEnum> map = new HashMap<>();
            map.put("no", NO);
            map.put("yes", YES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ForceDeleteEnum(String value) {
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
        public static ForceDeleteEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ForceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ForceDeleteEnum(value);
            }
            return result;
        }

        public static ForceDeleteEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ForceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ForceDeleteEnum) {
                return this.value.equals(((ForceDeleteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force_delete")
    
    private ForceDeleteEnum forceDelete;
    /**
     * 批量操作伸缩策略action标识：删除：delete。启用：resume。停止：pause。
     */
    public static final class ActionEnum {

        
        /**
         * Enum PAUSE for value: "pause"
         */
        public static final ActionEnum PAUSE = new ActionEnum("pause");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("pause", PAUSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_alarm")
    
    private String deleteAlarm;

    public BatchPauseScalingPoliciesOption withScalingPolicyId(List<String> scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    
    public BatchPauseScalingPoliciesOption addScalingPolicyIdItem(String scalingPolicyIdItem) {
        if(this.scalingPolicyId == null) {
            this.scalingPolicyId = new ArrayList<>();
        }
        this.scalingPolicyId.add(scalingPolicyIdItem);
        return this;
    }

    public BatchPauseScalingPoliciesOption withScalingPolicyId(Consumer<List<String>> scalingPolicyIdSetter) {
        if(this.scalingPolicyId == null) {
            this.scalingPolicyId = new ArrayList<>();
        }
        scalingPolicyIdSetter.accept(this.scalingPolicyId);
        return this;
    }

    /**
     * 伸缩策略ID。
     * @return scalingPolicyId
     */
    public List<String> getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(List<String> scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    

    public BatchPauseScalingPoliciesOption withForceDelete(ForceDeleteEnum forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    


    /**
     * 是否强制删除伸缩策略。默认为no，可选值为yes或no。只有action为delete时，该字段才生效。
     * @return forceDelete
     */
    public ForceDeleteEnum getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(ForceDeleteEnum forceDelete) {
        this.forceDelete = forceDelete;
    }

    

    public BatchPauseScalingPoliciesOption withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 批量操作伸缩策略action标识：删除：delete。启用：resume。停止：pause。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public BatchPauseScalingPoliciesOption withDeleteAlarm(String deleteAlarm) {
        this.deleteAlarm = deleteAlarm;
        return this;
    }

    


    /**
     * 是否删除告警策略使用的告警规则。可选值为yes或no，默认为no。  只有action为delete时，该字段才生效。
     * @return deleteAlarm
     */
    public String getDeleteAlarm() {
        return deleteAlarm;
    }

    public void setDeleteAlarm(String deleteAlarm) {
        this.deleteAlarm = deleteAlarm;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchPauseScalingPoliciesOption batchPauseScalingPoliciesOption = (BatchPauseScalingPoliciesOption) o;
        return Objects.equals(this.scalingPolicyId, batchPauseScalingPoliciesOption.scalingPolicyId) &&
            Objects.equals(this.forceDelete, batchPauseScalingPoliciesOption.forceDelete) &&
            Objects.equals(this.action, batchPauseScalingPoliciesOption.action) &&
            Objects.equals(this.deleteAlarm, batchPauseScalingPoliciesOption.deleteAlarm);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId, forceDelete, action, deleteAlarm);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPauseScalingPoliciesOption {\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
        sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    deleteAlarm: ").append(toIndentedString(deleteAlarm)).append("\n");
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

