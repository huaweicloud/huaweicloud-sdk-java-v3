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
 * 对于java类中字段的描述
 */
public class FieldInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessibility")
    
    private String accessibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="init_value")
    
    private String initValue;


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
    @JsonProperty(value="type")
    
    private TypeInfo type;

    public FieldInfo withAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    


    /**
     * 访问等级：public protected \"\" priate null
     * @return accessibility
     */
    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    

    public FieldInfo withInitValue(String initValue) {
        this.initValue = initValue;
        return this;
    }

    


    /**
     * 初始化值，可以直接置为null
     * @return initValue
     */
    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    

    public FieldInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * field的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public FieldInfo withOwnerClasses(List<String> ownerClasses) {
        this.ownerClasses = ownerClasses;
        return this;
    }

    
    public FieldInfo addOwnerClassesItem(String ownerClassesItem) {
        if(this.ownerClasses == null) {
            this.ownerClasses = new ArrayList<>();
        }
        this.ownerClasses.add(ownerClassesItem);
        return this;
    }

    public FieldInfo withOwnerClasses(Consumer<List<String>> ownerClassesSetter) {
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

    

    public FieldInfo withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    


    /**
     * filed的package路径名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    

    public FieldInfo withType(TypeInfo type) {
        this.type = type;
        return this;
    }

    public FieldInfo withType(Consumer<TypeInfo> typeSetter) {
        if(this.type == null ){
            this.type = new TypeInfo();
            typeSetter.accept(this.type);
        }
        
        return this;
    }


    /**
     * Get type
     * @return type
     */
    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FieldInfo fieldInfo = (FieldInfo) o;
        return Objects.equals(this.accessibility, fieldInfo.accessibility) &&
            Objects.equals(this.initValue, fieldInfo.initValue) &&
            Objects.equals(this.name, fieldInfo.name) &&
            Objects.equals(this.ownerClasses, fieldInfo.ownerClasses) &&
            Objects.equals(this.packageName, fieldInfo.packageName) &&
            Objects.equals(this.type, fieldInfo.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessibility, initValue, name, ownerClasses, packageName, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldInfo {\n");
        sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
        sb.append("    initValue: ").append(toIndentedString(initValue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerClasses: ").append(toIndentedString(ownerClasses)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

