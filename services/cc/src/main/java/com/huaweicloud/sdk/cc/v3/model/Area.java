package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 支持的大区。
 */
public class Area {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es_name")

    private String esName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pt_name")

    private String ptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "station")

    private String station;

    public Area withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 大区ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Area withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 大区英文名称。
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Area withEsName(String esName) {
        this.esName = esName;
        return this;
    }

    /**
     * 大区西语名称。
     * @return esName
     */
    public String getEsName() {
        return esName;
    }

    public void setEsName(String esName) {
        this.esName = esName;
    }

    public Area withPtName(String ptName) {
        this.ptName = ptName;
        return this;
    }

    /**
     * 大区葡语名称。
     * @return ptName
     */
    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public Area withStation(String station) {
        this.station = station;
        return this;
    }

    /**
     * 站点。
     * @return station
     */
    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Area that = (Area) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.enName, that.enName) && Objects.equals(this.esName, that.esName)
            && Objects.equals(this.ptName, that.ptName) && Objects.equals(this.station, that.station);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, enName, esName, ptName, station);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Area {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    esName: ").append(toIndentedString(esName)).append("\n");
        sb.append("    ptName: ").append(toIndentedString(ptName)).append("\n");
        sb.append("    station: ").append(toIndentedString(station)).append("\n");
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
