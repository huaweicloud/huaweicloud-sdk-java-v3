package com.huaweicloud.sdk.codecheck.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.ClassInfo;
import com.huaweicloud.sdk.codecheck.v2.model.FieldInfo;
import com.huaweicloud.sdk.codecheck.v2.model.MethodInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DownloadLibCodeAnalysisReportResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="class_infos")
    
    private List<ClassInfo> classInfos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="field_infos")
    
    private List<FieldInfo> fieldInfos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method_infos")
    
    private List<MethodInfo> methodInfos = null;
    
    public DownloadLibCodeAnalysisReportResponse withClassInfos(List<ClassInfo> classInfos) {
        this.classInfos = classInfos;
        return this;
    }

    
    public DownloadLibCodeAnalysisReportResponse addClassInfosItem(ClassInfo classInfosItem) {
        if(this.classInfos == null) {
            this.classInfos = new ArrayList<>();
        }
        this.classInfos.add(classInfosItem);
        return this;
    }

    public DownloadLibCodeAnalysisReportResponse withClassInfos(Consumer<List<ClassInfo>> classInfosSetter) {
        if(this.classInfos == null) {
            this.classInfos = new ArrayList<>();
        }
        classInfosSetter.accept(this.classInfos);
        return this;
    }

    /**
     * 类信息
     * @return classInfos
     */
    public List<ClassInfo> getClassInfos() {
        return classInfos;
    }

    public void setClassInfos(List<ClassInfo> classInfos) {
        this.classInfos = classInfos;
    }

    

    public DownloadLibCodeAnalysisReportResponse withFieldInfos(List<FieldInfo> fieldInfos) {
        this.fieldInfos = fieldInfos;
        return this;
    }

    
    public DownloadLibCodeAnalysisReportResponse addFieldInfosItem(FieldInfo fieldInfosItem) {
        if(this.fieldInfos == null) {
            this.fieldInfos = new ArrayList<>();
        }
        this.fieldInfos.add(fieldInfosItem);
        return this;
    }

    public DownloadLibCodeAnalysisReportResponse withFieldInfos(Consumer<List<FieldInfo>> fieldInfosSetter) {
        if(this.fieldInfos == null) {
            this.fieldInfos = new ArrayList<>();
        }
        fieldInfosSetter.accept(this.fieldInfos);
        return this;
    }

    /**
     * 字段信息
     * @return fieldInfos
     */
    public List<FieldInfo> getFieldInfos() {
        return fieldInfos;
    }

    public void setFieldInfos(List<FieldInfo> fieldInfos) {
        this.fieldInfos = fieldInfos;
    }

    

    public DownloadLibCodeAnalysisReportResponse withMethodInfos(List<MethodInfo> methodInfos) {
        this.methodInfos = methodInfos;
        return this;
    }

    
    public DownloadLibCodeAnalysisReportResponse addMethodInfosItem(MethodInfo methodInfosItem) {
        if(this.methodInfos == null) {
            this.methodInfos = new ArrayList<>();
        }
        this.methodInfos.add(methodInfosItem);
        return this;
    }

    public DownloadLibCodeAnalysisReportResponse withMethodInfos(Consumer<List<MethodInfo>> methodInfosSetter) {
        if(this.methodInfos == null) {
            this.methodInfos = new ArrayList<>();
        }
        methodInfosSetter.accept(this.methodInfos);
        return this;
    }

    /**
     * 方法信息
     * @return methodInfos
     */
    public List<MethodInfo> getMethodInfos() {
        return methodInfos;
    }

    public void setMethodInfos(List<MethodInfo> methodInfos) {
        this.methodInfos = methodInfos;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadLibCodeAnalysisReportResponse downloadLibCodeAnalysisReportResponse = (DownloadLibCodeAnalysisReportResponse) o;
        return Objects.equals(this.classInfos, downloadLibCodeAnalysisReportResponse.classInfos) &&
            Objects.equals(this.fieldInfos, downloadLibCodeAnalysisReportResponse.fieldInfos) &&
            Objects.equals(this.methodInfos, downloadLibCodeAnalysisReportResponse.methodInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(classInfos, fieldInfos, methodInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadLibCodeAnalysisReportResponse {\n");
        sb.append("    classInfos: ").append(toIndentedString(classInfos)).append("\n");
        sb.append("    fieldInfos: ").append(toIndentedString(fieldInfos)).append("\n");
        sb.append("    methodInfos: ").append(toIndentedString(methodInfos)).append("\n");
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

