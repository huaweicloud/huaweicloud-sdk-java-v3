package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.JavaLibBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * java依赖列表的包装请求
 */
public class ListJavaLibUpdateSuggestionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="libs")
    
    private List<JavaLibBean> libs = null;
    
    public ListJavaLibUpdateSuggestionRequestBody withLibs(List<JavaLibBean> libs) {
        this.libs = libs;
        return this;
    }

    
    public ListJavaLibUpdateSuggestionRequestBody addLibsItem(JavaLibBean libsItem) {
        if(this.libs == null) {
            this.libs = new ArrayList<>();
        }
        this.libs.add(libsItem);
        return this;
    }

    public ListJavaLibUpdateSuggestionRequestBody withLibs(Consumer<List<JavaLibBean>> libsSetter) {
        if(this.libs == null) {
            this.libs = new ArrayList<>();
        }
        libsSetter.accept(this.libs);
        return this;
    }

    /**
     * 依赖列表里的java库
     * @return libs
     */
    public List<JavaLibBean> getLibs() {
        return libs;
    }

    public void setLibs(List<JavaLibBean> libs) {
        this.libs = libs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJavaLibUpdateSuggestionRequestBody listJavaLibUpdateSuggestionRequestBody = (ListJavaLibUpdateSuggestionRequestBody) o;
        return Objects.equals(this.libs, listJavaLibUpdateSuggestionRequestBody.libs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(libs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJavaLibUpdateSuggestionRequestBody {\n");
        sb.append("    libs: ").append(toIndentedString(libs)).append("\n");
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

