package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFunctionTemplateRequest {

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
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    public ListFunctionTemplateRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 本次查询起始位置，默认值0
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFunctionTemplateRequest withMaxitems(String maxitems) {
        this.maxitems = maxitems;
        return this;
    }

    /**
     * 每次查询获取的最大模板数量。
     * @return maxitems
     */
    public String getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(String maxitems) {
        this.maxitems = maxitems;
    }

    public ListFunctionTemplateRequest withIspublic(String ispublic) {
        this.ispublic = ispublic;
        return this;
    }

    /**
     * 是否为公开模板
     * @return ispublic
     */
    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public ListFunctionTemplateRequest withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 指定运行时模板
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ListFunctionTemplateRequest withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 指定场景模板
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public ListFunctionTemplateRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 指定云服务模板
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFunctionTemplateRequest that = (ListFunctionTemplateRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.maxitems, that.maxitems)
            && Objects.equals(this.ispublic, that.ispublic) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, maxitems, ispublic, runtime, scene, service);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionTemplateRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxitems: ").append(toIndentedString(maxitems)).append("\n");
        sb.append("    ispublic: ").append(toIndentedString(ispublic)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
