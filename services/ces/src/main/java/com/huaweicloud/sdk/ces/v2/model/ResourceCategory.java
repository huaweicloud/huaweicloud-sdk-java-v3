package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceCategory
 */
public class ResourceCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_names")

    private List<String> dimensionNames = null;

    public ResourceCategory withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ResourceCategory withDimensionNames(List<String> dimensionNames) {
        this.dimensionNames = dimensionNames;
        return this;
    }

    public ResourceCategory addDimensionNamesItem(String dimensionNamesItem) {
        if (this.dimensionNames == null) {
            this.dimensionNames = new ArrayList<>();
        }
        this.dimensionNames.add(dimensionNamesItem);
        return this;
    }

    public ResourceCategory withDimensionNames(Consumer<List<String>> dimensionNamesSetter) {
        if (this.dimensionNames == null) {
            this.dimensionNames = new ArrayList<>();
        }
        dimensionNamesSetter.accept(this.dimensionNames);
        return this;
    }

    /**
     * 资源的维度信息，多个维度通过字母序排序后逗号拼接
     * @return dimensionNames
     */
    public List<String> getDimensionNames() {
        return dimensionNames;
    }

    public void setDimensionNames(List<String> dimensionNames) {
        this.dimensionNames = dimensionNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceCategory that = (ResourceCategory) obj;
        return Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.dimensionNames, that.dimensionNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensionNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceCategory {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionNames: ").append(toIndentedString(dimensionNames)).append("\n");
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
