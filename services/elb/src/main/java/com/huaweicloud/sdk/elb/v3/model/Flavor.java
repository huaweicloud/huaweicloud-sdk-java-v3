package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 负载均衡器规格信息。
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private FlavorInfo info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_sold_out")

    private Boolean flavorSoldOut;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withInfo(FlavorInfo info) {
        this.info = info;
        return this;
    }

    public Flavor withInfo(Consumer<FlavorInfo> infoSetter) {
        if (this.info == null) {
            this.info = new FlavorInfo();
            infoSetter.accept(this.info);
        }

        return this;
    }

    /**
     * Get info
     * @return info
     */
    public FlavorInfo getInfo() {
        return info;
    }

    public void setInfo(FlavorInfo info) {
        this.info = info;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 共享。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Flavor withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Flavor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * L4和L7 分别表示四层和七层flavor。查询支持按type过滤。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flavor withFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
        return this;
    }

    /**
     * 是否售罄。
     * @return flavorSoldOut
     */
    public Boolean getFlavorSoldOut() {
        return flavorSoldOut;
    }

    public void setFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flavor flavor = (Flavor) o;
        return Objects.equals(this.id, flavor.id) && Objects.equals(this.info, flavor.info)
            && Objects.equals(this.name, flavor.name) && Objects.equals(this.shared, flavor.shared)
            && Objects.equals(this.projectId, flavor.projectId) && Objects.equals(this.type, flavor.type)
            && Objects.equals(this.flavorSoldOut, flavor.flavorSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info, name, shared, projectId, type, flavorSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavorSoldOut: ").append(toIndentedString(flavorSoldOut)).append("\n");
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
