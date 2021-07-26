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
 * 离线分析里对于一个java class的描述
 */
public class ClassInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="generics")
    
    private List<String> generics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interfaces")
    
    private List<TypeInfo> interfaces = null;
    

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
    @JsonProperty(value="super_class")
    
    private TypeInfo superClass;

    public ClassInfo withGenerics(List<String> generics) {
        this.generics = generics;
        return this;
    }

    
    public ClassInfo addGenericsItem(String genericsItem) {
        if(this.generics == null) {
            this.generics = new ArrayList<>();
        }
        this.generics.add(genericsItem);
        return this;
    }

    public ClassInfo withGenerics(Consumer<List<String>> genericsSetter) {
        if(this.generics == null) {
            this.generics = new ArrayList<>();
        }
        genericsSetter.accept(this.generics);
        return this;
    }

    /**
     * 可以自动变更的类
     * @return generics
     */
    public List<String> getGenerics() {
        return generics;
    }

    public void setGenerics(List<String> generics) {
        this.generics = generics;
    }

    

    public ClassInfo withInterfaces(List<TypeInfo> interfaces) {
        this.interfaces = interfaces;
        return this;
    }

    
    public ClassInfo addInterfacesItem(TypeInfo interfacesItem) {
        if(this.interfaces == null) {
            this.interfaces = new ArrayList<>();
        }
        this.interfaces.add(interfacesItem);
        return this;
    }

    public ClassInfo withInterfaces(Consumer<List<TypeInfo>> interfacesSetter) {
        if(this.interfaces == null) {
            this.interfaces = new ArrayList<>();
        }
        interfacesSetter.accept(this.interfaces);
        return this;
    }

    /**
     * 实现的接口
     * @return interfaces
     */
    public List<TypeInfo> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<TypeInfo> interfaces) {
        this.interfaces = interfaces;
    }

    

    public ClassInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 类名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ClassInfo withOwnerClasses(List<String> ownerClasses) {
        this.ownerClasses = ownerClasses;
        return this;
    }

    
    public ClassInfo addOwnerClassesItem(String ownerClassesItem) {
        if(this.ownerClasses == null) {
            this.ownerClasses = new ArrayList<>();
        }
        this.ownerClasses.add(ownerClassesItem);
        return this;
    }

    public ClassInfo withOwnerClasses(Consumer<List<String>> ownerClassesSetter) {
        if(this.ownerClasses == null) {
            this.ownerClasses = new ArrayList<>();
        }
        ownerClassesSetter.accept(this.ownerClasses);
        return this;
    }

    /**
     * 外层类（如果这个事内部类）
     * @return ownerClasses
     */
    public List<String> getOwnerClasses() {
        return ownerClasses;
    }

    public void setOwnerClasses(List<String> ownerClasses) {
        this.ownerClasses = ownerClasses;
    }

    

    public ClassInfo withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    


    /**
     * 包名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    

    public ClassInfo withSuperClass(TypeInfo superClass) {
        this.superClass = superClass;
        return this;
    }

    public ClassInfo withSuperClass(Consumer<TypeInfo> superClassSetter) {
        if(this.superClass == null ){
            this.superClass = new TypeInfo();
            superClassSetter.accept(this.superClass);
        }
        
        return this;
    }


    /**
     * Get superClass
     * @return superClass
     */
    public TypeInfo getSuperClass() {
        return superClass;
    }

    public void setSuperClass(TypeInfo superClass) {
        this.superClass = superClass;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassInfo classInfo = (ClassInfo) o;
        return Objects.equals(this.generics, classInfo.generics) &&
            Objects.equals(this.interfaces, classInfo.interfaces) &&
            Objects.equals(this.name, classInfo.name) &&
            Objects.equals(this.ownerClasses, classInfo.ownerClasses) &&
            Objects.equals(this.packageName, classInfo.packageName) &&
            Objects.equals(this.superClass, classInfo.superClass);
    }
    @Override
    public int hashCode() {
        return Objects.hash(generics, interfaces, name, ownerClasses, packageName, superClass);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassInfo {\n");
        sb.append("    generics: ").append(toIndentedString(generics)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerClasses: ").append(toIndentedString(ownerClasses)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    superClass: ").append(toIndentedString(superClass)).append("\n");
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

