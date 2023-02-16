package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





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
 * Request Object
 */
public class ShowDeploymentFormRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;
    /**
     * 解决方案模板名称。
     */
    public static final class SolutionEnum {

        
        /**
         * Enum TRISET for value: "triset"
         */
        public static final SolutionEnum TRISET = new SolutionEnum("triset");
        
        /**
         * Enum SINGLE for value: "single"
         */
        public static final SolutionEnum SINGLE = new SolutionEnum("single");
        

        private static final Map<String, SolutionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SolutionEnum> createStaticFields() {
            Map<String, SolutionEnum> map = new HashMap<>();
            map.put("triset", TRISET);
            map.put("single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SolutionEnum(String value) {
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
        public static SolutionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SolutionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SolutionEnum(value);
            }
            return result;
        }

        public static SolutionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SolutionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SolutionEnum) {
                return this.value.equals(((SolutionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="solution")
    
    
    private SolutionEnum solution;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;

    public ShowDeploymentFormRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ShowDeploymentFormRequest withSolution(SolutionEnum solution) {
        this.solution = solution;
        return this;
    }

    


    /**
     * 解决方案模板名称。
     * @return solution
     */
    public SolutionEnum getSolution() {
        return solution;
    }

    public void setSolution(SolutionEnum solution) {
        this.solution = solution;
    }

    

    public ShowDeploymentFormRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeploymentFormRequest showDeploymentFormRequest = (ShowDeploymentFormRequest) o;
        return Objects.equals(this.xLanguage, showDeploymentFormRequest.xLanguage) &&
            Objects.equals(this.solution, showDeploymentFormRequest.solution) &&
            Objects.equals(this.instanceId, showDeploymentFormRequest.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, solution, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentFormRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

