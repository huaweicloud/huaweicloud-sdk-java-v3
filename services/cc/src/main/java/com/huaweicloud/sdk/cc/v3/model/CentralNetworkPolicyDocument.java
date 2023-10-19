package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络策略文档。
 */
public class CentralNetworkPolicyDocument {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_plane")

    private String defaultPlane;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planes")

    private List<CentralNetworkPlaneDocument> planes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_instances")

    private List<AssociateErInstanceDocument> erInstances = null;

    public CentralNetworkPolicyDocument withDefaultPlane(String defaultPlane) {
        this.defaultPlane = defaultPlane;
        return this;
    }

    /**
     * 中心网络默认平面的名字。
     * @return defaultPlane
     */
    public String getDefaultPlane() {
        return defaultPlane;
    }

    public void setDefaultPlane(String defaultPlane) {
        this.defaultPlane = defaultPlane;
    }

    public CentralNetworkPolicyDocument withPlanes(List<CentralNetworkPlaneDocument> planes) {
        this.planes = planes;
        return this;
    }

    public CentralNetworkPolicyDocument addPlanesItem(CentralNetworkPlaneDocument planesItem) {
        if (this.planes == null) {
            this.planes = new ArrayList<>();
        }
        this.planes.add(planesItem);
        return this;
    }

    public CentralNetworkPolicyDocument withPlanes(Consumer<List<CentralNetworkPlaneDocument>> planesSetter) {
        if (this.planes == null) {
            this.planes = new ArrayList<>();
        }
        planesSetter.accept(this.planes);
        return this;
    }

    /**
     * 中心网络平面列表。
     * @return planes
     */
    public List<CentralNetworkPlaneDocument> getPlanes() {
        return planes;
    }

    public void setPlanes(List<CentralNetworkPlaneDocument> planes) {
        this.planes = planes;
    }

    public CentralNetworkPolicyDocument withErInstances(List<AssociateErInstanceDocument> erInstances) {
        this.erInstances = erInstances;
        return this;
    }

    public CentralNetworkPolicyDocument addErInstancesItem(AssociateErInstanceDocument erInstancesItem) {
        if (this.erInstances == null) {
            this.erInstances = new ArrayList<>();
        }
        this.erInstances.add(erInstancesItem);
        return this;
    }

    public CentralNetworkPolicyDocument withErInstances(Consumer<List<AssociateErInstanceDocument>> erInstancesSetter) {
        if (this.erInstances == null) {
            this.erInstances = new ArrayList<>();
        }
        erInstancesSetter.accept(this.erInstances);
        return this;
    }

    /**
     * 中心网络ER实例列表。
     * @return erInstances
     */
    public List<AssociateErInstanceDocument> getErInstances() {
        return erInstances;
    }

    public void setErInstances(List<AssociateErInstanceDocument> erInstances) {
        this.erInstances = erInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkPolicyDocument that = (CentralNetworkPolicyDocument) obj;
        return Objects.equals(this.defaultPlane, that.defaultPlane) && Objects.equals(this.planes, that.planes)
            && Objects.equals(this.erInstances, that.erInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultPlane, planes, erInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkPolicyDocument {\n");
        sb.append("    defaultPlane: ").append(toIndentedString(defaultPlane)).append("\n");
        sb.append("    planes: ").append(toIndentedString(planes)).append("\n");
        sb.append("    erInstances: ").append(toIndentedString(erInstances)).append("\n");
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
