package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CodeCheck任务语言参数 */
public class ParamTypeLimits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private String disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayname")

    private String displayname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public ParamTypeLimits withDisable(String disable) {
        this.disable = disable;
        return this;
    }

    /** 是否废弃
     * 
     * @return disable */
    public String getDisable() {
        return disable;
    }

    public void setDisable(String disable) {
        this.disable = disable;
    }

    public ParamTypeLimits withName(String name) {
        this.name = name;
        return this;
    }

    /** 语言名字
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParamTypeLimits withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    /** 语言展示名字
     * 
     * @return displayname */
    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public ParamTypeLimits withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则集ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParamTypeLimits withLanguage(String language) {
        this.language = language;
        return this;
    }

    /** 扫描语言
     * 
     * @return language */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamTypeLimits paramTypeLimits = (ParamTypeLimits) o;
        return Objects.equals(this.disable, paramTypeLimits.disable) && Objects.equals(this.name, paramTypeLimits.name)
            && Objects.equals(this.displayname, paramTypeLimits.displayname)
            && Objects.equals(this.id, paramTypeLimits.id) && Objects.equals(this.language, paramTypeLimits.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disable, name, displayname, id, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamTypeLimits {\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
