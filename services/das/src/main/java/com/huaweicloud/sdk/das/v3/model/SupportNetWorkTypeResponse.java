package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupportNetWorkTypeResponse
 */
public class SupportNetWorkTypeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_work")

    private String netWork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_types")

    private List<String> engineTypes = null;

    public SupportNetWorkTypeResponse withNetWork(String netWork) {
        this.netWork = netWork;
        return this;
    }

    /**
     * 网络类型
     * @return netWork
     */
    public String getNetWork() {
        return netWork;
    }

    public void setNetWork(String netWork) {
        this.netWork = netWork;
    }

    public SupportNetWorkTypeResponse withEngineTypes(List<String> engineTypes) {
        this.engineTypes = engineTypes;
        return this;
    }

    public SupportNetWorkTypeResponse addEngineTypesItem(String engineTypesItem) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        this.engineTypes.add(engineTypesItem);
        return this;
    }

    public SupportNetWorkTypeResponse withEngineTypes(Consumer<List<String>> engineTypesSetter) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        engineTypesSetter.accept(this.engineTypes);
        return this;
    }

    /**
     * 引擎类型
     * @return engineTypes
     */
    public List<String> getEngineTypes() {
        return engineTypes;
    }

    public void setEngineTypes(List<String> engineTypes) {
        this.engineTypes = engineTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportNetWorkTypeResponse that = (SupportNetWorkTypeResponse) obj;
        return Objects.equals(this.netWork, that.netWork) && Objects.equals(this.engineTypes, that.engineTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(netWork, engineTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportNetWorkTypeResponse {\n");
        sb.append("    netWork: ").append(toIndentedString(netWork)).append("\n");
        sb.append("    engineTypes: ").append(toIndentedString(engineTypes)).append("\n");
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
