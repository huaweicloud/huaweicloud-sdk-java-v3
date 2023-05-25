package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAssetListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private List<String> assetId = null;

    /**
    * Gets or Sets status
    */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /**
         * Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE"
         */
        public static final StatusEnum WAITING_TRANSCODE = new StatusEnum("WAITING_TRANSCODE");

        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final StatusEnum TRANSCODING = new StatusEnum("TRANSCODING");

        /**
         * Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED"
         */
        public static final StatusEnum TRANSCODE_SUCCEED = new StatusEnum("TRANSCODE_SUCCEED");

        /**
         * Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED"
         */
        public static final StatusEnum TRANSCODE_FAILED = new StatusEnum("TRANSCODE_FAILED");

        /**
         * Enum THUMBNAILING for value: "THUMBNAILING"
         */
        public static final StatusEnum THUMBNAILING = new StatusEnum("THUMBNAILING");

        /**
         * Enum THUMBNAIL_SUCCEED for value: "THUMBNAIL_SUCCEED"
         */
        public static final StatusEnum THUMBNAIL_SUCCEED = new StatusEnum("THUMBNAIL_SUCCEED");

        /**
         * Enum THUMBNAIL_FAILED for value: "THUMBNAIL_FAILED"
         */
        public static final StatusEnum THUMBNAIL_FAILED = new StatusEnum("THUMBNAIL_FAILED");

        /**
         * Enum UN_REVIEW for value: "UN_REVIEW"
         */
        public static final StatusEnum UN_REVIEW = new StatusEnum("UN_REVIEW");

        /**
         * Enum REVIEWING for value: "REVIEWING"
         */
        public static final StatusEnum REVIEWING = new StatusEnum("REVIEWING");

        /**
         * Enum REVIEW_SUSPICIOUS for value: "REVIEW_SUSPICIOUS"
         */
        public static final StatusEnum REVIEW_SUSPICIOUS = new StatusEnum("REVIEW_SUSPICIOUS");

        /**
         * Enum REVIEW_PASSED for value: "REVIEW_PASSED"
         */
        public static final StatusEnum REVIEW_PASSED = new StatusEnum("REVIEW_PASSED");

        /**
         * Enum REVIEW_FAILED for value: "REVIEW_FAILED"
         */
        public static final StatusEnum REVIEW_FAILED = new StatusEnum("REVIEW_FAILED");

        /**
         * Enum REVIEW_BLOCKED for value: "REVIEW_BLOCKED"
         */
        public static final StatusEnum REVIEW_BLOCKED = new StatusEnum("REVIEW_BLOCKED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("FAILED", FAILED);
            map.put("CREATED", CREATED);
            map.put("PUBLISHED", PUBLISHED);
            map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
            map.put("TRANSCODING", TRANSCODING);
            map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
            map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
            map.put("THUMBNAILING", THUMBNAILING);
            map.put("THUMBNAIL_SUCCEED", THUMBNAIL_SUCCEED);
            map.put("THUMBNAIL_FAILED", THUMBNAIL_FAILED);
            map.put("UN_REVIEW", UN_REVIEW);
            map.put("REVIEWING", REVIEWING);
            map.put("REVIEW_SUSPICIOUS", REVIEW_SUSPICIOUS);
            map.put("REVIEW_PASSED", REVIEW_PASSED);
            map.put("REVIEW_FAILED", REVIEW_FAILED);
            map.put("REVIEW_BLOCKED", REVIEW_BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<StatusEnum> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Integer categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_string")

    private String queryString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private List<String> mediaType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 查询顺序，按createTime顺序还是倒序
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    public ListAssetListRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListAssetListRequest withAssetId(List<String> assetId) {
        this.assetId = assetId;
        return this;
    }

    public ListAssetListRequest addAssetIdItem(String assetIdItem) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        this.assetId.add(assetIdItem);
        return this;
    }

    public ListAssetListRequest withAssetId(Consumer<List<String>> assetIdSetter) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        assetIdSetter.accept(this.assetId);
        return this;
    }

    /**
     * 媒资ID，最多同时查询10个。
     * @return assetId
     */
    public List<String> getAssetId() {
        return assetId;
    }

    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    public ListAssetListRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListAssetListRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListAssetListRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 媒资状态，同时查询多个状态的媒资。  取值如下： - CREATING：上传中 - FAILED：上传失败 - CREATED：上传成功 - PUBLISHED：已发布 - TRANSCODING：转码中 - TRANSCODE_SUCCEED：转码成功 - TRANSCODE_FAILED：转码失败 - THUMBNAILING：截图中 - THUMBNAIL_SUCCEED：截图成功 - THUMBNAIL_FAILED：截图失败 - UN_REVIEW：未审核 - REVIEWING：审核中 - REVIEW_SUSPICIOUS ：审核不过，待人工复审 - REVIEW_PASSED：审核通过 - REVIEW_FAILED：审核任务失败 - REVIEW_BLOCKED：已屏蔽
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListAssetListRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。  格式为yyyymmddhhm mss。必须是与时区无关的UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListAssetListRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。  格式为yyyymmddhhm mss。必须是与时区无关的UTC时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAssetListRequest withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类ID。
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ListAssetListRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 媒资标签。 单个标签不超过16个字节， 最多不超过16 个标签。 多个用英文逗号分隔，UTF8编码。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListAssetListRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * 在媒资标题、 描述、分类名称中模糊查询的字符串。
     * @return queryString
     */
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public ListAssetListRequest withMediaType(List<String> mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public ListAssetListRequest addMediaTypeItem(String mediaTypeItem) {
        if (this.mediaType == null) {
            this.mediaType = new ArrayList<>();
        }
        this.mediaType.add(mediaTypeItem);
        return this;
    }

    public ListAssetListRequest withMediaType(Consumer<List<String>> mediaTypeSetter) {
        if (this.mediaType == null) {
            this.mediaType = new ArrayList<>();
        }
        mediaTypeSetter.accept(this.mediaType);
        return this;
    }

    /**
     * 音视频文件的格式，支持多格式查询，最多不超过20个。  取值如下： - 视频文件格式：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG - 音频文件格式：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2
     * @return mediaType
     */
    public List<String> getMediaType() {
        return mediaType;
    }

    public void setMediaType(List<String> mediaType) {
        this.mediaType = mediaType;
    }

    public ListAssetListRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页编号。  默认值：0。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListAssetListRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页记录数。  取值范围：[1,100]。  默认值：10。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAssetListRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 查询顺序，按createTime顺序还是倒序
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssetListRequest listAssetListRequest = (ListAssetListRequest) o;
        return Objects.equals(this.xSdkDate, listAssetListRequest.xSdkDate)
            && Objects.equals(this.assetId, listAssetListRequest.assetId)
            && Objects.equals(this.status, listAssetListRequest.status)
            && Objects.equals(this.startTime, listAssetListRequest.startTime)
            && Objects.equals(this.endTime, listAssetListRequest.endTime)
            && Objects.equals(this.categoryId, listAssetListRequest.categoryId)
            && Objects.equals(this.tags, listAssetListRequest.tags)
            && Objects.equals(this.queryString, listAssetListRequest.queryString)
            && Objects.equals(this.mediaType, listAssetListRequest.mediaType)
            && Objects.equals(this.page, listAssetListRequest.page)
            && Objects.equals(this.size, listAssetListRequest.size)
            && Objects.equals(this.order, listAssetListRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate,
            assetId,
            status,
            startTime,
            endTime,
            categoryId,
            tags,
            queryString,
            mediaType,
            page,
            size,
            order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetListRequest {\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
