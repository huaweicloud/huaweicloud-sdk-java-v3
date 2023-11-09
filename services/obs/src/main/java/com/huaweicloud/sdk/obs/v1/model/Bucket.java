package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * 具体的桶信息。 
 */
@JacksonXmlRootElement(localName = "Bucket")
public class Bucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Name")

    @JacksonXmlProperty(localName = "Name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CreationDate")

    @JacksonXmlProperty(localName = "CreationDate")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Location")

    @JacksonXmlProperty(localName = "Location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ClusterType")

    @JacksonXmlProperty(localName = "ClusterType")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IESLocation")

    @JacksonXmlProperty(localName = "IESLocation")

    private String ieSLocation;

    public Bucket withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 桶名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bucket withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 桶的创建时间。 
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Bucket withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 桶的位置信息。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bucket withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 桶所在的集群类型，当桶创建在专属集群上时，会返回此字段。其他场景不返回。 
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public Bucket withIeSLocation(String ieSLocation) {
        this.ieSLocation = ieSLocation;
        return this;
    }

    /**
     * 如果桶创建在IES站点集群中，返回IES站点ID。如果桶创建在IES站点集群中，返回IES站点ID。其他场景下不返回此头域。 
     * @return ieSLocation
     */
    public String getIeSLocation() {
        return ieSLocation;
    }

    public void setIeSLocation(String ieSLocation) {
        this.ieSLocation = ieSLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bucket that = (Bucket) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.location, that.location) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.ieSLocation, that.ieSLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationDate, location, clusterType, ieSLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bucket {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    ieSLocation: ").append(toIndentedString(ieSLocation)).append("\n");
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
