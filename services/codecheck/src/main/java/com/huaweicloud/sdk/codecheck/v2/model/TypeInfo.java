package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 对于java类的信息描述 */
public class TypeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generics")

    private List<String> generics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    public TypeInfo withGenerics(List<String> generics) {
        this.generics = generics;
        return this;
    }

    public TypeInfo addGenericsItem(String genericsItem) {
        if (this.generics == null) {
            this.generics = new ArrayList<>();
        }
        this.generics.add(genericsItem);
        return this;
    }

    public TypeInfo withGenerics(Consumer<List<String>> genericsSetter) {
        if (this.generics == null) {
            this.generics = new ArrayList<>();
        }
        genericsSetter.accept(this.generics);
        return this;
    }

    /** 类的泛型类型
     * 
     * @return generics */
    public List<String> getGenerics() {
        return generics;
    }

    public void setGenerics(List<String> generics) {
        this.generics = generics;
    }

    public TypeInfo withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /** 类的名字（全称）
     * 
     * @return qualifiedName */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) o;
        return Objects.equals(this.generics, typeInfo.generics)
            && Objects.equals(this.qualifiedName, typeInfo.qualifiedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generics, qualifiedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeInfo {\n");
        sb.append("    generics: ").append(toIndentedString(generics)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
