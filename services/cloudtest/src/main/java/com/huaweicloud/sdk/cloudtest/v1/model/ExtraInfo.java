package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtraInfo
 */
public class ExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childImportPackage")

    private List<String> childImportPackage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_link")

    private String documentLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_method")

    private String httpMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url")

    private String httpUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "importPackage")

    private List<String> importPackage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock")

    private MockInfo mock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputParam")

    private List<AwVariable> outputParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_dependent")

    private String paramDependent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    public ExtraInfo withChildImportPackage(List<String> childImportPackage) {
        this.childImportPackage = childImportPackage;
        return this;
    }

    public ExtraInfo addChildImportPackageItem(String childImportPackageItem) {
        if (this.childImportPackage == null) {
            this.childImportPackage = new ArrayList<>();
        }
        this.childImportPackage.add(childImportPackageItem);
        return this;
    }

    public ExtraInfo withChildImportPackage(Consumer<List<String>> childImportPackageSetter) {
        if (this.childImportPackage == null) {
            this.childImportPackage = new ArrayList<>();
        }
        childImportPackageSetter.accept(this.childImportPackage);
        return this;
    }

    /**
     * 子级导入的包
     * @return childImportPackage
     */
    public List<String> getChildImportPackage() {
        return childImportPackage;
    }

    public void setChildImportPackage(List<String> childImportPackage) {
        this.childImportPackage = childImportPackage;
    }

    public ExtraInfo withDocumentLink(String documentLink) {
        this.documentLink = documentLink;
        return this;
    }

    /**
     * 文档链接
     * @return documentLink
     */
    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }

    public ExtraInfo withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * http请求方法
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ExtraInfo withHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    /**
     * HTTP请求的URL
     * @return httpUrl
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public ExtraInfo withImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
        return this;
    }

    public ExtraInfo addImportPackageItem(String importPackageItem) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        this.importPackage.add(importPackageItem);
        return this;
    }

    public ExtraInfo withImportPackage(Consumer<List<String>> importPackageSetter) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        importPackageSetter.accept(this.importPackage);
        return this;
    }

    /**
     * 导入的包
     * @return importPackage
     */
    public List<String> getImportPackage() {
        return importPackage;
    }

    public void setImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
    }

    public ExtraInfo withMock(MockInfo mock) {
        this.mock = mock;
        return this;
    }

    public ExtraInfo withMock(Consumer<MockInfo> mockSetter) {
        if (this.mock == null) {
            this.mock = new MockInfo();
            mockSetter.accept(this.mock);
        }

        return this;
    }

    /**
     * Get mock
     * @return mock
     */
    public MockInfo getMock() {
        return mock;
    }

    public void setMock(MockInfo mock) {
        this.mock = mock;
    }

    public ExtraInfo withOutputParam(List<AwVariable> outputParam) {
        this.outputParam = outputParam;
        return this;
    }

    public ExtraInfo addOutputParamItem(AwVariable outputParamItem) {
        if (this.outputParam == null) {
            this.outputParam = new ArrayList<>();
        }
        this.outputParam.add(outputParamItem);
        return this;
    }

    public ExtraInfo withOutputParam(Consumer<List<AwVariable>> outputParamSetter) {
        if (this.outputParam == null) {
            this.outputParam = new ArrayList<>();
        }
        outputParamSetter.accept(this.outputParam);
        return this;
    }

    /**
     * 输出参数
     * @return outputParam
     */
    public List<AwVariable> getOutputParam() {
        return outputParam;
    }

    public void setOutputParam(List<AwVariable> outputParam) {
        this.outputParam = outputParam;
    }

    public ExtraInfo withParamDependent(String paramDependent) {
        this.paramDependent = paramDependent;
        return this;
    }

    /**
     * 参数依赖
     * @return paramDependent
     */
    public String getParamDependent() {
        return paramDependent;
    }

    public void setParamDependent(String paramDependent) {
        this.paramDependent = paramDependent;
    }

    public ExtraInfo withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 摘要
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtraInfo that = (ExtraInfo) obj;
        return Objects.equals(this.childImportPackage, that.childImportPackage)
            && Objects.equals(this.documentLink, that.documentLink) && Objects.equals(this.httpMethod, that.httpMethod)
            && Objects.equals(this.httpUrl, that.httpUrl) && Objects.equals(this.importPackage, that.importPackage)
            && Objects.equals(this.mock, that.mock) && Objects.equals(this.outputParam, that.outputParam)
            && Objects.equals(this.paramDependent, that.paramDependent) && Objects.equals(this.summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childImportPackage,
            documentLink,
            httpMethod,
            httpUrl,
            importPackage,
            mock,
            outputParam,
            paramDependent,
            summary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraInfo {\n");
        sb.append("    childImportPackage: ").append(toIndentedString(childImportPackage)).append("\n");
        sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    httpUrl: ").append(toIndentedString(httpUrl)).append("\n");
        sb.append("    importPackage: ").append(toIndentedString(importPackage)).append("\n");
        sb.append("    mock: ").append(toIndentedString(mock)).append("\n");
        sb.append("    outputParam: ").append(toIndentedString(outputParam)).append("\n");
        sb.append("    paramDependent: ").append(toIndentedString(paramDependent)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
