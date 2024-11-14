package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBeautyPreviewJobResponse extends SdkResponse {

    /**
     * 任务的状态。 * WAIT_IMAGE_UPLOAD：待上传美白前图片 * WAITING：等待生成美白预览图 * PROCESSING：美白预览图生成中 * SUCCESS：美白预览图生成成功 * FAILED：美白预览图生成失败
     */
    public static final class StateEnum {

        /**
         * Enum WAIT_IMAGE_UPLOAD for value: "WAIT_IMAGE_UPLOAD"
         */
        public static final StateEnum WAIT_IMAGE_UPLOAD = new StateEnum("WAIT_IMAGE_UPLOAD");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StateEnum WAITING = new StateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StateEnum PROCESSING = new StateEnum("PROCESSING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAIT_IMAGE_UPLOAD", WAIT_IMAGE_UPLOAD);
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_beauty_image_download_url")

    private String postBeautyImageDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowBeautyPreviewJobResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。 * WAIT_IMAGE_UPLOAD：待上传美白前图片 * WAITING：等待生成美白预览图 * PROCESSING：美白预览图生成中 * SUCCESS：美白预览图生成成功 * FAILED：美白预览图生成失败
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowBeautyPreviewJobResponse withPostBeautyImageDownloadUrl(String postBeautyImageDownloadUrl) {
        this.postBeautyImageDownloadUrl = postBeautyImageDownloadUrl;
        return this;
    }

    /**
     * 美白后图片下载url。
     * @return postBeautyImageDownloadUrl
     */
    public String getPostBeautyImageDownloadUrl() {
        return postBeautyImageDownloadUrl;
    }

    public void setPostBeautyImageDownloadUrl(String postBeautyImageDownloadUrl) {
        this.postBeautyImageDownloadUrl = postBeautyImageDownloadUrl;
    }

    public ShowBeautyPreviewJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBeautyPreviewJobResponse that = (ShowBeautyPreviewJobResponse) obj;
        return Objects.equals(this.state, that.state)
            && Objects.equals(this.postBeautyImageDownloadUrl, that.postBeautyImageDownloadUrl)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, postBeautyImageDownloadUrl, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBeautyPreviewJobResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    postBeautyImageDownloadUrl: ").append(toIndentedString(postBeautyImageDownloadUrl)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
