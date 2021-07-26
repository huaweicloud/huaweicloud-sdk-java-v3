package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.TypeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 对于java类的信息描述
 */
public class MethodInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessibility")
    
    private String accessibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner_classes")
    
    private List<String> ownerClasses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="package_name")
    
    private String packageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_types")
    
    private List<TypeInfo> paramTypes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_type")
    
    private TypeInfo returnType;

    public MethodInfo withAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    


    /**
     * 访问等级 public protected private null
     * @return accessibility
     */
    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    

    public MethodInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 方法的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public MethodInfo withOwnerClasses(List<String> ownerClasses) {
        this.ownerClasses = ownerClasses;
        return this;
    }

    
    public MethodInfo addOwnerClassesItem(String ownerClassesItem) {
        if(this.ownerClasses == null) {
            this.ownerClasses = new ArrayList<>();
        }
        this.ownerClasses.add(ownerClassesItem);
        return this;
    }

    public MethodInfo withOwnerClasses(Consumer<List<String>> ownerClassesSetter) {
        if(this.ownerClasses == null) {
            this.ownerClasses = new ArrayList<>();
        }
        ownerClassesSetter.accept(this.ownerClasses);
        return this;
    }

    /**
     * 该类的包含的所有类的名称，从内部类往外部类排序（0是内部类）
     * @return ownerClasses
     */
    public List<String> getOwnerClasses() {
        return ownerClasses;
    }

    public void setOwnerClasses(List<String> ownerClasses) {
        this.ownerClasses = ownerClasses;
    }

    

    public MethodInfo withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    


    /**
     * 该field的package路径名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    

    public MethodInfo withParamTypes(List<TypeInfo> paramTypes) {
        this.paramTypes = paramTypes;
        return this;
    }

    
    public MethodInfo addParamTypesItem(TypeInfo paramTypesItem) {
        if(this.paramTypes == null) {
            this.paramTypes = new ArrayList<>();
        }
        this.paramTypes.add(paramTypesItem);
        return this;
    }

    public MethodInfo withParamTypes(Consumer<List<TypeInfo>> paramTypesSetter) {
        if(this.paramTypes == null) {
            this.paramTypes = new ArrayList<>();
        }
        paramTypesSetter.accept(this.paramTypes);
        return this;
    }

    /**
     * 入参的类型
     * @return paramTypes
     */
    public List<TypeInfo> getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(List<TypeInfo> paramTypes) {
        this.paramTypes = paramTypes;
    }

    

    public MethodInfo withReturnType(TypeInfo returnType) {
        this.returnType = returnType;
        return this;
    }

    public MethodInfo withReturnType(Consumer<TypeInfo> returnTypeSetter) {
        if(this.returnType == null ){
            this.returnType = new TypeInfo();
            returnTypeSetter.accept(this.returnType);
        }
        
        return this;
    }


    /**
     * Get returnType
     * @return returnType
     */
    public TypeInfo getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeInfo returnType) {
        this.returnType = returnType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MethodInfo methodInfo = (MethodInfo) o;
        return Objects.equals(this.accessibility, methodInfo.accessibility) &&
            Objects.equals(this.name, methodInfo.name) &&
            Objects.equals(this.ownerClasses, methodInfo.ownerClasses) &&
            Objects.equals(this.packageName, methodInfo.packageName) &&
            Objects.equals(this.paramTypes, methodInfo.paramTypes) &&
            Objects.equals(this.returnType, methodInfo.returnType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessibility, name, ownerClasses, packageName, paramTypes, returnType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MethodInfo {\n");
        sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerClasses: ").append(toIndentedString(ownerClasses)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    paramTypes: ").append(toIndentedString(paramTypes)).append("\n");
        sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
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

