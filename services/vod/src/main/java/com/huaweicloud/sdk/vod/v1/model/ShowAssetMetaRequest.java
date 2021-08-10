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

/** Request Object */
public class ShowAssetMetaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private List<String> assetId = null;

    /** Gets or Sets status */
    public static final class StatusEnum {

        /** Enum UNCREATED for value: "UNCREATED" */
        public static final StatusEnum UNCREATED = new StatusEnum("UNCREATED");

        /** Enum DELETED for value: "DELETED" */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /** Enum CANCELLED for value: "CANCELLED" */
        public static final StatusEnum CANCELLED = new StatusEnum("CANCELLED");

        /** Enum SERVER_ERROR for value: "SERVER_ERROR" */
        public static final StatusEnum SERVER_ERROR = new StatusEnum("SERVER_ERROR");

        /** Enum UPLOAD_FAILED for value: "UPLOAD_FAILED" */
        public static final StatusEnum UPLOAD_FAILED = new StatusEnum("UPLOAD_FAILED");

        /** Enum CREATING for value: "CREATING" */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /** Enum PUBLISHED for value: "PUBLISHED" */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /** Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE" */
        public static final StatusEnum WAITING_TRANSCODE = new StatusEnum("WAITING_TRANSCODE");

        /** Enum TRANSCODING for value: "TRANSCODING" */
        public static final StatusEnum TRANSCODING = new StatusEnum("TRANSCODING");

        /** Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED" */
        public static final StatusEnum TRANSCODE_FAILED = new StatusEnum("TRANSCODE_FAILED");

        /** Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED" */
        public static final StatusEnum TRANSCODE_SUCCEED = new StatusEnum("TRANSCODE_SUCCEED");

        /** Enum CREATED for value: "CREATED" */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("UNCREATED", UNCREATED);
            map.put("DELETED", DELETED);
            map.put("CANCELLED", CANCELLED);
            map.put("SERVER_ERROR", SERVER_ERROR);
            map.put("UPLOAD_FAILED", UPLOAD_FAILED);
            map.put("CREATING", CREATING);
            map.put("PUBLISHED", PUBLISHED);
            map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
            map.put("TRANSCODING", TRANSCODING);
            map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
            map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
            map.put("CREATED", CREATED);
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

    /** Gets or Sets transcodeStatus */
    public static final class TranscodeStatusEnum {

        /** Enum TRANSCODING for value: "TRANSCODING" */
        public static final TranscodeStatusEnum TRANSCODING = new TranscodeStatusEnum("TRANSCODING");

        /** Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED" */
        public static final TranscodeStatusEnum TRANSCODE_FAILED = new TranscodeStatusEnum("TRANSCODE_FAILED");

        /** Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED" */
        public static final TranscodeStatusEnum TRANSCODE_SUCCEED = new TranscodeStatusEnum("TRANSCODE_SUCCEED");

        /** Enum UN_TRANSCODE for value: "UN_TRANSCODE" */
        public static final TranscodeStatusEnum UN_TRANSCODE = new TranscodeStatusEnum("UN_TRANSCODE");

        /** Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE" */
        public static final TranscodeStatusEnum WAITING_TRANSCODE = new TranscodeStatusEnum("WAITING_TRANSCODE");

        private static final Map<String, TranscodeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TranscodeStatusEnum> createStaticFields() {
            Map<String, TranscodeStatusEnum> map = new HashMap<>();
            map.put("TRANSCODING", TRANSCODING);
            map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
            map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
            map.put("UN_TRANSCODE", UN_TRANSCODE);
            map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TranscodeStatusEnum(String value) {
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
        public static TranscodeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TranscodeStatusEnum(value);
            }
            return result;
        }

        public static TranscodeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TranscodeStatusEnum) {
                return this.value.equals(((TranscodeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcodeStatus")

    private List<TranscodeStatusEnum> transcodeStatus = null;

    /** Gets or Sets assetStatus */
    public static final class AssetStatusEnum {

        /** Enum PUBLISHED for value: "PUBLISHED" */
        public static final AssetStatusEnum PUBLISHED = new AssetStatusEnum("PUBLISHED");

        /** Enum CREATED for value: "CREATED" */
        public static final AssetStatusEnum CREATED = new AssetStatusEnum("CREATED");

        private static final Map<String, AssetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetStatusEnum> createStaticFields() {
            Map<String, AssetStatusEnum> map = new HashMap<>();
            map.put("PUBLISHED", PUBLISHED);
            map.put("CREATED", CREATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetStatusEnum(String value) {
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
        public static AssetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssetStatusEnum(value);
            }
            return result;
        }

        public static AssetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetStatusEnum) {
                return this.value.equals(((AssetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assetStatus")

    private List<AssetStatusEnum> assetStatus = null;

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
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ShowAssetMetaRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /** 使用AK/SK方式认证时必选，携带的鉴权信息。
     * 
     * @return authorization */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ShowAssetMetaRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /** 使用AK/SK方式认证时必选，请求的发生时间。
     * 
     * @return xSdkDate */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ShowAssetMetaRequest withAssetId(List<String> assetId) {
        this.assetId = assetId;
        return this;
    }

    public ShowAssetMetaRequest addAssetIdItem(String assetIdItem) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        this.assetId.add(assetIdItem);
        return this;
    }

    public ShowAssetMetaRequest withAssetId(Consumer<List<String>> assetIdSetter) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        assetIdSetter.accept(this.assetId);
        return this;
    }

    /** 媒资id，最多同时查询10个媒资。
     * 
     * @return assetId */
    public List<String> getAssetId() {
        return assetId;
    }

    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    public ShowAssetMetaRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ShowAssetMetaRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ShowAssetMetaRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /** 媒资状态。 取值如下： - UNCREATED：未创建（媒资ID不存在 ） - DELETED：已删除 - CANCELLED：上传取消 - SERVER_ERROR：上传失败（点播服务端故障） -
     * UPLOAD_FAILED：上传失败（向OBS上传失败） - CREATING：创建中 - PUBLISHED：已发布 - TRANSCODING：待发布（转码中） - TRANSCODE_FAILED：待发布（转码失败） -
     * TRANSCODE_SUCCEED：待发布（转码成功） - CREATED：待发布（未转码）
     * 
     * @return status */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ShowAssetMetaRequest withTranscodeStatus(List<TranscodeStatusEnum> transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
        return this;
    }

    public ShowAssetMetaRequest addTranscodeStatusItem(TranscodeStatusEnum transcodeStatusItem) {
        if (this.transcodeStatus == null) {
            this.transcodeStatus = new ArrayList<>();
        }
        this.transcodeStatus.add(transcodeStatusItem);
        return this;
    }

    public ShowAssetMetaRequest withTranscodeStatus(Consumer<List<TranscodeStatusEnum>> transcodeStatusSetter) {
        if (this.transcodeStatus == null) {
            this.transcodeStatus = new ArrayList<>();
        }
        transcodeStatusSetter.accept(this.transcodeStatus);
        return this;
    }

    /** 转码状态 取值如下： - TRANSCODING：转码中 - TRANSCODE_FAILED：转码失败 - TRANSCODE_SUCCEED：转码成功 - UN_TRANSCODE：未转码 -
     * WAITING_TRANSCODE：等待转码
     * 
     * @return transcodeStatus */
    public List<TranscodeStatusEnum> getTranscodeStatus() {
        return transcodeStatus;
    }

    public void setTranscodeStatus(List<TranscodeStatusEnum> transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }

    public ShowAssetMetaRequest withAssetStatus(List<AssetStatusEnum> assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }

    public ShowAssetMetaRequest addAssetStatusItem(AssetStatusEnum assetStatusItem) {
        if (this.assetStatus == null) {
            this.assetStatus = new ArrayList<>();
        }
        this.assetStatus.add(assetStatusItem);
        return this;
    }

    public ShowAssetMetaRequest withAssetStatus(Consumer<List<AssetStatusEnum>> assetStatusSetter) {
        if (this.assetStatus == null) {
            this.assetStatus = new ArrayList<>();
        }
        assetStatusSetter.accept(this.assetStatus);
        return this;
    }

    /** 媒资状态。 取值如下： - PUBLISHED：已发布 - CREATED：未发布
     * 
     * @return assetStatus */
    public List<AssetStatusEnum> getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(List<AssetStatusEnum> assetStatus) {
        this.assetStatus = assetStatus;
    }

    public ShowAssetMetaRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 起始时间，查询指定“**asset_id**”时，该参数无效。 格式为yyyymmddhhmmss。必须是与时区无关的UTC时间。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowAssetMetaRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间，查询指定“**asset_id**”时，该参数无效。 格式为yyyymmddhhmmss。必须是与时区无关的UTC时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowAssetMetaRequest withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /** 分类ID。
     * 
     * @return categoryId */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ShowAssetMetaRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 媒资标签。 单个标签不超过16个字节，最多不超过16个标签。 多个用逗号分隔，UTF8编码。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ShowAssetMetaRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /** 在媒资标题、描述中模糊查询的字符串。
     * 
     * @return queryString */
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public ShowAssetMetaRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 分页编号，查询指定“asset_id”时，该参数无效。 默认值：0。 minimum: 0
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ShowAssetMetaRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 每页记录数，查询指定“**asset_id**”时，该参数无效。 取值范围：[1,100]。 默认值：10。 minimum: 1 maximum: 100
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetMetaRequest showAssetMetaRequest = (ShowAssetMetaRequest) o;
        return Objects.equals(this.authorization, showAssetMetaRequest.authorization)
            && Objects.equals(this.xSdkDate, showAssetMetaRequest.xSdkDate)
            && Objects.equals(this.assetId, showAssetMetaRequest.assetId)
            && Objects.equals(this.status, showAssetMetaRequest.status)
            && Objects.equals(this.transcodeStatus, showAssetMetaRequest.transcodeStatus)
            && Objects.equals(this.assetStatus, showAssetMetaRequest.assetStatus)
            && Objects.equals(this.startTime, showAssetMetaRequest.startTime)
            && Objects.equals(this.endTime, showAssetMetaRequest.endTime)
            && Objects.equals(this.categoryId, showAssetMetaRequest.categoryId)
            && Objects.equals(this.tags, showAssetMetaRequest.tags)
            && Objects.equals(this.queryString, showAssetMetaRequest.queryString)
            && Objects.equals(this.page, showAssetMetaRequest.page)
            && Objects.equals(this.size, showAssetMetaRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            assetId,
            status,
            transcodeStatus,
            assetStatus,
            startTime,
            endTime,
            categoryId,
            tags,
            queryString,
            page,
            size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetMetaRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    transcodeStatus: ").append(toIndentedString(transcodeStatus)).append("\n");
        sb.append("    assetStatus: ").append(toIndentedString(assetStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
