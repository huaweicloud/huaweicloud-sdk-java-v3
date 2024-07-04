package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListVideoSourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_name")

    private String scopeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_id")

    private List<String> videoGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private String sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_paged")

    private Boolean isPaged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private List<String> accessType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_name")

    private String platformName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ListVideoSourcesRequest withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 模糊查找参数，可选，根据名称查找
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ListVideoSourcesRequest withScopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    /**
     * 模糊查找参数字段名，可选，名称(取值source_name)或分组名称(取值group_name)
     * @return scopeName
     */
    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public ListVideoSourcesRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListVideoSourcesRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListVideoSourcesRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 视频源状态，可选，取值为1 2 9，分别代表在线、离线、异常
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListVideoSourcesRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListVideoSourcesRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListVideoSourcesRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * [类型:obs、vcn、url、restful、camera、ivm](tag:hc)[类型:obs、vcn、url、restful、camera、VIDEO_PLATFORM、VIDEO_IMAGE_DB、RTSP_STREAM](tag:hcs)
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListVideoSourcesRequest withVideoGroupId(List<String> videoGroupId) {
        this.videoGroupId = videoGroupId;
        return this;
    }

    public ListVideoSourcesRequest addVideoGroupIdItem(String videoGroupIdItem) {
        if (this.videoGroupId == null) {
            this.videoGroupId = new ArrayList<>();
        }
        this.videoGroupId.add(videoGroupIdItem);
        return this;
    }

    public ListVideoSourcesRequest withVideoGroupId(Consumer<List<String>> videoGroupIdSetter) {
        if (this.videoGroupId == null) {
            this.videoGroupId = new ArrayList<>();
        }
        videoGroupIdSetter.accept(this.videoGroupId);
        return this;
    }

    /**
     * 视频源分组，可选。若传入则需要符合正则表达式^[0-9a-zA-Z-_]{1,36}$
     * @return videoGroupId
     */
    public List<String> getVideoGroupId() {
        return videoGroupId;
    }

    public void setVideoGroupId(List<String> videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    public ListVideoSourcesRequest withSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序项。可选，值范围（create_at，num_task，num_template）
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public ListVideoSourcesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序顺序，可选，默认倒序
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListVideoSourcesRequest withIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
        return this;
    }

    /**
     * 是否分页
     * @return isPaged
     */
    public Boolean getIsPaged() {
        return isPaged;
    }

    public void setIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
    }

    public ListVideoSourcesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页每页显示的条目
     * minimum: 5
     * maximum: 200
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListVideoSourcesRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 第几页
     * minimum: 1
     * maximum: 100000
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListVideoSourcesRequest withAccessType(List<String> accessType) {
        this.accessType = accessType;
        return this;
    }

    public ListVideoSourcesRequest addAccessTypeItem(String accessTypeItem) {
        if (this.accessType == null) {
            this.accessType = new ArrayList<>();
        }
        this.accessType.add(accessTypeItem);
        return this;
    }

    public ListVideoSourcesRequest withAccessType(Consumer<List<String>> accessTypeSetter) {
        if (this.accessType == null) {
            this.accessType = new ArrayList<>();
        }
        accessTypeSetter.accept(this.accessType);
        return this;
    }

    /**
     * 接入方式
     * @return accessType
     */
    public List<String> getAccessType() {
        return accessType;
    }

    public void setAccessType(List<String> accessType) {
        this.accessType = accessType;
    }

    public ListVideoSourcesRequest withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * 平台名称
     * @return platformName
     */
    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public ListVideoSourcesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVideoSourcesRequest that = (ListVideoSourcesRequest) obj;
        return Objects.equals(this.scope, that.scope) && Objects.equals(this.scopeName, that.scopeName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.videoGroupId, that.videoGroupId) && Objects.equals(this.sortName, that.sortName)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.isPaged, that.isPaged)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.accessType, that.accessType) && Objects.equals(this.platformName, that.platformName)
            && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope,
            scopeName,
            status,
            type,
            videoGroupId,
            sortName,
            orderBy,
            isPaged,
            pageSize,
            pageNum,
            accessType,
            platformName,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoSourcesRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    videoGroupId: ").append(toIndentedString(videoGroupId)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    isPaged: ").append(toIndentedString(isPaged)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
