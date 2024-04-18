package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新合规规则包的请求体。
 */
public class UpdateConformancePackRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    public UpdateConformancePackRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 合规规则包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConformancePackRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public UpdateConformancePackRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public UpdateConformancePackRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConformancePackRequestBody that = (UpdateConformancePackRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.varsStructure, that.varsStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, varsStructure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConformancePackRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
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
