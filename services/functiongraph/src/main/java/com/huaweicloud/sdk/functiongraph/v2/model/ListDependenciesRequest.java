package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDependenciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxitems")

    private String maxitems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ispublic")

    private String ispublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_type")

    private String dependencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListDependenciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一次查询依赖包的最后记录位置，默认为\"0\"。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDependenciesRequest withMaxitems(String maxitems) {
        this.maxitems = maxitems;
        return this;
    }

    /**
     * 单次查询最大条数
     * @return maxitems
     */
    public String getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(String maxitems) {
        this.maxitems = maxitems;
    }

    public ListDependenciesRequest withIspublic(String ispublic) {
        this.ispublic = ispublic;
        return this;
    }

    /**
     * 是否为公共依赖包
     * @return ispublic
     */
    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public ListDependenciesRequest withDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /**
     * 依赖包类型public：公开,private:私有，all：全部。缺省时查询全量
     * @return dependencyType
     */
    public String getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    public ListDependenciesRequest withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * FunctionGraph函数的执行环境 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Python3.9: Python语言3.9版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Java8: Java语言8版本。 Java11: Java语言11版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13: Nodejs语言12.13版本。 Node.js14.18: Nodejs语言14.18版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 http: HTTP函数。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ListDependenciesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 依赖包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDependenciesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 本次查询可获取的依赖包的最大数目，默认为\"400\"。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDependenciesRequest that = (ListDependenciesRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.maxitems, that.maxitems)
            && Objects.equals(this.ispublic, that.ispublic) && Objects.equals(this.dependencyType, that.dependencyType)
            && Objects.equals(this.runtime, that.runtime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, maxitems, ispublic, dependencyType, runtime, name, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDependenciesRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxitems: ").append(toIndentedString(maxitems)).append("\n");
        sb.append("    ispublic: ").append(toIndentedString(ispublic)).append("\n");
        sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
