package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流量回放源数据库配置返回体
 */
public class ReplaySourceConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint_type")

    private String sourceEndpointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_origin")

    private String sourceDbOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_source")

    private String trafficSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_traffic_types")

    private List<String> supportTrafficTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os_types")

    private List<String> supportOsTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_mirror_database_types")

    private List<String> supportMirrorDatabaseTypes = null;

    public ReplaySourceConfigResp withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 流量回放源数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ReplaySourceConfigResp withSourceEndpointType(String sourceEndpointType) {
        this.sourceEndpointType = sourceEndpointType;
        return this;
    }

    /**
     * 流量回放源数据库类型
     * @return sourceEndpointType
     */
    public String getSourceEndpointType() {
        return sourceEndpointType;
    }

    public void setSourceEndpointType(String sourceEndpointType) {
        this.sourceEndpointType = sourceEndpointType;
    }

    public ReplaySourceConfigResp withSourceDbOrigin(String sourceDbOrigin) {
        this.sourceDbOrigin = sourceDbOrigin;
        return this;
    }

    /**
     * 流量回放源数据库来源
     * @return sourceDbOrigin
     */
    public String getSourceDbOrigin() {
        return sourceDbOrigin;
    }

    public void setSourceDbOrigin(String sourceDbOrigin) {
        this.sourceDbOrigin = sourceDbOrigin;
    }

    public ReplaySourceConfigResp withTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
        return this;
    }

    /**
     * 流量回放流量文件来源
     * @return trafficSource
     */
    public String getTrafficSource() {
        return trafficSource;
    }

    public void setTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
    }

    public ReplaySourceConfigResp withSupportTrafficTypes(List<String> supportTrafficTypes) {
        this.supportTrafficTypes = supportTrafficTypes;
        return this;
    }

    public ReplaySourceConfigResp addSupportTrafficTypesItem(String supportTrafficTypesItem) {
        if (this.supportTrafficTypes == null) {
            this.supportTrafficTypes = new ArrayList<>();
        }
        this.supportTrafficTypes.add(supportTrafficTypesItem);
        return this;
    }

    public ReplaySourceConfigResp withSupportTrafficTypes(Consumer<List<String>> supportTrafficTypesSetter) {
        if (this.supportTrafficTypes == null) {
            this.supportTrafficTypes = new ArrayList<>();
        }
        supportTrafficTypesSetter.accept(this.supportTrafficTypes);
        return this;
    }

    /**
     * 流量回放流量类型
     * @return supportTrafficTypes
     */
    public List<String> getSupportTrafficTypes() {
        return supportTrafficTypes;
    }

    public void setSupportTrafficTypes(List<String> supportTrafficTypes) {
        this.supportTrafficTypes = supportTrafficTypes;
    }

    public ReplaySourceConfigResp withSupportOsTypes(List<String> supportOsTypes) {
        this.supportOsTypes = supportOsTypes;
        return this;
    }

    public ReplaySourceConfigResp addSupportOsTypesItem(String supportOsTypesItem) {
        if (this.supportOsTypes == null) {
            this.supportOsTypes = new ArrayList<>();
        }
        this.supportOsTypes.add(supportOsTypesItem);
        return this;
    }

    public ReplaySourceConfigResp withSupportOsTypes(Consumer<List<String>> supportOsTypesSetter) {
        if (this.supportOsTypes == null) {
            this.supportOsTypes = new ArrayList<>();
        }
        supportOsTypesSetter.accept(this.supportOsTypes);
        return this;
    }

    /**
     * 流量回放agent支持的操作系统
     * @return supportOsTypes
     */
    public List<String> getSupportOsTypes() {
        return supportOsTypes;
    }

    public void setSupportOsTypes(List<String> supportOsTypes) {
        this.supportOsTypes = supportOsTypes;
    }

    public ReplaySourceConfigResp withSupportMirrorDatabaseTypes(List<String> supportMirrorDatabaseTypes) {
        this.supportMirrorDatabaseTypes = supportMirrorDatabaseTypes;
        return this;
    }

    public ReplaySourceConfigResp addSupportMirrorDatabaseTypesItem(String supportMirrorDatabaseTypesItem) {
        if (this.supportMirrorDatabaseTypes == null) {
            this.supportMirrorDatabaseTypes = new ArrayList<>();
        }
        this.supportMirrorDatabaseTypes.add(supportMirrorDatabaseTypesItem);
        return this;
    }

    public ReplaySourceConfigResp withSupportMirrorDatabaseTypes(
        Consumer<List<String>> supportMirrorDatabaseTypesSetter) {
        if (this.supportMirrorDatabaseTypes == null) {
            this.supportMirrorDatabaseTypes = new ArrayList<>();
        }
        supportMirrorDatabaseTypesSetter.accept(this.supportMirrorDatabaseTypes);
        return this;
    }

    /**
     * 流量回放引擎支持的镜像库
     * @return supportMirrorDatabaseTypes
     */
    public List<String> getSupportMirrorDatabaseTypes() {
        return supportMirrorDatabaseTypes;
    }

    public void setSupportMirrorDatabaseTypes(List<String> supportMirrorDatabaseTypes) {
        this.supportMirrorDatabaseTypes = supportMirrorDatabaseTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplaySourceConfigResp that = (ReplaySourceConfigResp) obj;
        return Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.sourceEndpointType, that.sourceEndpointType)
            && Objects.equals(this.sourceDbOrigin, that.sourceDbOrigin)
            && Objects.equals(this.trafficSource, that.trafficSource)
            && Objects.equals(this.supportTrafficTypes, that.supportTrafficTypes)
            && Objects.equals(this.supportOsTypes, that.supportOsTypes)
            && Objects.equals(this.supportMirrorDatabaseTypes, that.supportMirrorDatabaseTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType,
            sourceEndpointType,
            sourceDbOrigin,
            trafficSource,
            supportTrafficTypes,
            supportOsTypes,
            supportMirrorDatabaseTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaySourceConfigResp {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    sourceEndpointType: ").append(toIndentedString(sourceEndpointType)).append("\n");
        sb.append("    sourceDbOrigin: ").append(toIndentedString(sourceDbOrigin)).append("\n");
        sb.append("    trafficSource: ").append(toIndentedString(trafficSource)).append("\n");
        sb.append("    supportTrafficTypes: ").append(toIndentedString(supportTrafficTypes)).append("\n");
        sb.append("    supportOsTypes: ").append(toIndentedString(supportOsTypes)).append("\n");
        sb.append("    supportMirrorDatabaseTypes: ").append(toIndentedString(supportMirrorDatabaseTypes)).append("\n");
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
