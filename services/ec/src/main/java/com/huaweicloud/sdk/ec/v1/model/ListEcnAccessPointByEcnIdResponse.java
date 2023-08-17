package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEcnAccessPointByEcnIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_points")

    private List<AccessPoint> accessPoints = null;

    public ListEcnAccessPointByEcnIdResponse withAccessPoints(List<AccessPoint> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }

    public ListEcnAccessPointByEcnIdResponse addAccessPointsItem(AccessPoint accessPointsItem) {
        if (this.accessPoints == null) {
            this.accessPoints = new ArrayList<>();
        }
        this.accessPoints.add(accessPointsItem);
        return this;
    }

    public ListEcnAccessPointByEcnIdResponse withAccessPoints(Consumer<List<AccessPoint>> accessPointsSetter) {
        if (this.accessPoints == null) {
            this.accessPoints = new ArrayList<>();
        }
        accessPointsSetter.accept(this.accessPoints);
        return this;
    }

    /**
     * Get accessPoints
     * @return accessPoints
     */
    public List<AccessPoint> getAccessPoints() {
        return accessPoints;
    }

    public void setAccessPoints(List<AccessPoint> accessPoints) {
        this.accessPoints = accessPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcnAccessPointByEcnIdResponse that = (ListEcnAccessPointByEcnIdResponse) obj;
        return Objects.equals(this.accessPoints, that.accessPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcnAccessPointByEcnIdResponse {\n");
        sb.append("    accessPoints: ").append(toIndentedString(accessPoints)).append("\n");
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
