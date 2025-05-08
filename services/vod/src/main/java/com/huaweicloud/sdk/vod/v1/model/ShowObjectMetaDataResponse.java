package com.huaweicloud.sdk.vod.v1.model;

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
public class ShowObjectMetaDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_list")

    private List<ObjectList> objectList = null;

    public ShowObjectMetaDataResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 桶名 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowObjectMetaDataResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次列举对象请求的起始位置。 
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ShowObjectMetaDataResponse withObjectList(List<ObjectList> objectList) {
        this.objectList = objectList;
        return this;
    }

    public ShowObjectMetaDataResponse addObjectListItem(ObjectList objectListItem) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        this.objectList.add(objectListItem);
        return this;
    }

    public ShowObjectMetaDataResponse withObjectList(Consumer<List<ObjectList>> objectListSetter) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        objectListSetter.accept(this.objectList);
        return this;
    }

    /**
     * 媒体元数据列表 
     * @return objectList
     */
    public List<ObjectList> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<ObjectList> objectList) {
        this.objectList = objectList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowObjectMetaDataResponse that = (ShowObjectMetaDataResponse) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.objectList, that.objectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, nextMarker, objectList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObjectMetaDataResponse {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    objectList: ").append(toIndentedString(objectList)).append("\n");
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
