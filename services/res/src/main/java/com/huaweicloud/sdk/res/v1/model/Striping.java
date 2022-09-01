package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class Striping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearest_neighborhood")

    @JacksonXmlProperty(localName = "nearest_neighborhood")

    private Integer nearestNeighborhood;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band")

    @JacksonXmlProperty(localName = "band")

    private Integer band;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row")

    @JacksonXmlProperty(localName = "row")

    private Integer row;

    public Striping withNearestNeighborhood(Integer nearestNeighborhood) {
        this.nearestNeighborhood = nearestNeighborhood;
        return this;
    }

    /**
     * 最近领域个数。
     * @return nearestNeighborhood
     */
    public Integer getNearestNeighborhood() {
        return nearestNeighborhood;
    }

    public void setNearestNeighborhood(Integer nearestNeighborhood) {
        this.nearestNeighborhood = nearestNeighborhood;
    }

    public Striping withBand(Integer band) {
        this.band = band;
        return this;
    }

    /**
     * 相似程度。
     * minimum: 1
     * maximum: 20
     * @return band
     */
    public Integer getBand() {
        return band;
    }

    public void setBand(Integer band) {
        this.band = band;
    }

    public Striping withRow(Integer row) {
        this.row = row;
        return this;
    }

    /**
     * 相似距离。
     * minimum: 1
     * maximum: 10
     * @return row
     */
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Striping striping = (Striping) o;
        return Objects.equals(this.nearestNeighborhood, striping.nearestNeighborhood)
            && Objects.equals(this.band, striping.band) && Objects.equals(this.row, striping.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nearestNeighborhood, band, row);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Striping {\n");
        sb.append("    nearestNeighborhood: ").append(toIndentedString(nearestNeighborhood)).append("\n");
        sb.append("    band: ").append(toIndentedString(band)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
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
