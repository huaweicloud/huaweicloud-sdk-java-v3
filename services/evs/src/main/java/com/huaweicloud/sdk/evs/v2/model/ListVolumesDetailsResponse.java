package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.Link;
import com.huaweicloud.sdk.evs.v2.model.VolumeDetail;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListVolumesDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_links")
    
    private List<Link> volumesLinks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes")
    
    private List<VolumeDetail> volumes = null;
    
    public ListVolumesDetailsResponse withCount(Integer count) {
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

    public ListVolumesDetailsResponse withVolumesLinks(List<Link> volumesLinks) {
        this.volumesLinks = volumesLinks;
        return this;
    }

    
    public ListVolumesDetailsResponse addVolumesLinksItem(Link volumesLinksItem) {
        if (this.volumesLinks == null) {
            this.volumesLinks = new ArrayList<>();
        }
        this.volumesLinks.add(volumesLinksItem);
        return this;
    }

    public ListVolumesDetailsResponse withVolumesLinks(Consumer<List<Link>> volumesLinksSetter) {
        if(this.volumesLinks == null ){
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

    public ListVolumesDetailsResponse withVolumes(List<VolumeDetail> volumes) {
        this.volumes = volumes;
        return this;
    }

    
    public ListVolumesDetailsResponse addVolumesItem(VolumeDetail volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ListVolumesDetailsResponse withVolumes(Consumer<List<VolumeDetail>> volumesSetter) {
        if(this.volumes == null ){
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
        ListVolumesDetailsResponse listVolumesDetailsResponse = (ListVolumesDetailsResponse) o;
        return Objects.equals(this.count, listVolumesDetailsResponse.count) &&
            Objects.equals(this.volumesLinks, listVolumesDetailsResponse.volumesLinks) &&
            Objects.equals(this.volumes, listVolumesDetailsResponse.volumes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, volumesLinks, volumes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesDetailsResponse {\n");
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

