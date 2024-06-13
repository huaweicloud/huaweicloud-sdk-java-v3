package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAllConfigItemByTypeRequestBody
 */
public class ListAllConfigItemByTypeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configType")

    private String configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<String> types = null;

    public ListAllConfigItemByTypeRequestBody withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /**
     * 系统配置，服务自己配置{system、service}
     * @return configType
     */
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public ListAllConfigItemByTypeRequestBody withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public ListAllConfigItemByTypeRequestBody addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public ListAllConfigItemByTypeRequestBody withTypes(Consumer<List<String>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 配置类型集合
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllConfigItemByTypeRequestBody that = (ListAllConfigItemByTypeRequestBody) obj;
        return Objects.equals(this.configType, that.configType) && Objects.equals(this.types, that.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configType, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllConfigItemByTypeRequestBody {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
