package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_links")

    @JacksonXmlProperty(localName = "volumes_links")

    private List<Link> volumesLinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    @JacksonXmlProperty(localName = "volumes")

    private List<VolumeDetail> volumes = null;

    public ListVolumesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询到的云硬盘总数量，不受分页影响。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVolumesResponse withVolumesLinks(List<Link> volumesLinks) {
        this.volumesLinks = volumesLinks;
        return this;
    }

    public ListVolumesResponse addVolumesLinksItem(Link volumesLinksItem) {
        if (this.volumesLinks == null) {
            this.volumesLinks = new ArrayList<>();
        }
        this.volumesLinks.add(volumesLinksItem);
        return this;
    }

    public ListVolumesResponse withVolumesLinks(Consumer<List<Link>> volumesLinksSetter) {
        if (this.volumesLinks == null) {
            this.volumesLinks = new ArrayList<>();
        }
        volumesLinksSetter.accept(this.volumesLinks);
        return this;
    }

    /**
     * 云硬盘列表查询位置标记。如果本次查询只返回部分列表信息时，会返回查询到的当前磁盘mark标记的url，可以继续使用这个url查询剩余列表信息。
     * @return volumesLinks
     */
    public List<Link> getVolumesLinks() {
        return volumesLinks;
    }

    public void setVolumesLinks(List<Link> volumesLinks) {
        this.volumesLinks = volumesLinks;
    }

    public ListVolumesResponse withVolumes(List<VolumeDetail> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ListVolumesResponse addVolumesItem(VolumeDetail volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ListVolumesResponse withVolumes(Consumer<List<VolumeDetail>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 查询请求返回的云硬盘列表。
     * @return volumes
     */
    public List<VolumeDetail> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeDetail> volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVolumesResponse listVolumesResponse = (ListVolumesResponse) o;
        return Objects.equals(this.count, listVolumesResponse.count)
            && Objects.equals(this.volumesLinks, listVolumesResponse.volumesLinks)
            && Objects.equals(this.volumes, listVolumesResponse.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, volumesLinks, volumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    volumesLinks: ").append(toIndentedString(volumesLinks)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
