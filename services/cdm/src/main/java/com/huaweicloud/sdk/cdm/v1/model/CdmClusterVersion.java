package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 版本信息。
 */
public class CdmClusterVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private String active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packages")

    private String packages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private String datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<ClusterLinks> links = null;

    public CdmClusterVersion withActive(String active) {
        this.active = active;
        return this;
    }

    /**
     * 版本状态。
     * @return active
     */
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public CdmClusterVersion withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CdmClusterVersion withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 版本镜像。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CdmClusterVersion withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 版本名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CdmClusterVersion withPackages(String packages) {
        this.packages = packages;
        return this;
    }

    /**
     * 版本的包。
     * @return packages
     */
    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public CdmClusterVersion withDatastore(String datastore) {
        this.datastore = datastore;
        return this;
    }

    /**
     * 服务ID，用于区分不同服务。
     * @return datastore
     */
    public String getDatastore() {
        return datastore;
    }

    public void setDatastore(String datastore) {
        this.datastore = datastore;
    }

    public CdmClusterVersion withLinks(List<ClusterLinks> links) {
        this.links = links;
        return this;
    }

    public CdmClusterVersion addLinksItem(ClusterLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public CdmClusterVersion withLinks(Consumer<List<ClusterLinks>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 链接信息。
     * @return links
     */
    public List<ClusterLinks> getLinks() {
        return links;
    }

    public void setLinks(List<ClusterLinks> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmClusterVersion that = (CdmClusterVersion) obj;
        return Objects.equals(this.active, that.active) && Objects.equals(this.id, that.id)
            && Objects.equals(this.image, that.image) && Objects.equals(this.name, that.name)
            && Objects.equals(this.packages, that.packages) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, id, image, name, packages, datastore, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmClusterVersion {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
