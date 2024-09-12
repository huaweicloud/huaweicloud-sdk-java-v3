package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class Execute2dModelTrainingCommandByUserResponse extends SdkResponse {

    /**
     * 命令执行结果。 * EXCUTE_SUCCESS: 命令提交成功 * EXCUTE_FAILED: 命令提交失败
     */
    public static final class CommondResultEnum {

        /**
         * Enum EXCUTE_SUCCESS for value: "EXCUTE_SUCCESS"
         */
        public static final CommondResultEnum EXCUTE_SUCCESS = new CommondResultEnum("EXCUTE_SUCCESS");

        /**
         * Enum EXCUTE_FAILED for value: "EXCUTE_FAILED"
         */
        public static final CommondResultEnum EXCUTE_FAILED = new CommondResultEnum("EXCUTE_FAILED");

        private static final Map<String, CommondResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommondResultEnum> createStaticFields() {
            Map<String, CommondResultEnum> map = new HashMap<>();
            map.put("EXCUTE_SUCCESS", EXCUTE_SUCCESS);
            map.put("EXCUTE_FAILED", EXCUTE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommondResultEnum(String value) {
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
        public static CommondResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommondResultEnum(value));
        }

        public static CommondResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommondResultEnum) {
                return this.value.equals(((CommondResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commond_result")

    private CommondResultEnum commondResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_upload_url")

    private List<String> attachmentUploadUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multipart_data")

    private List<MultipartUploadInfo> multipartData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excute_failed_msg")

    private String excuteFailedMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public Execute2dModelTrainingCommandByUserResponse withCommondResult(CommondResultEnum commondResult) {
        this.commondResult = commondResult;
        return this;
    }

    /**
     * 命令执行结果。 * EXCUTE_SUCCESS: 命令提交成功 * EXCUTE_FAILED: 命令提交失败
     * @return commondResult
     */
    public CommondResultEnum getCommondResult() {
        return commondResult;
    }

    public void setCommondResult(CommondResultEnum commondResult) {
        this.commondResult = commondResult;
    }

    public Execute2dModelTrainingCommandByUserResponse withAttachmentUploadUrl(List<String> attachmentUploadUrl) {
        this.attachmentUploadUrl = attachmentUploadUrl;
        return this;
    }

    public Execute2dModelTrainingCommandByUserResponse addAttachmentUploadUrlItem(String attachmentUploadUrlItem) {
        if (this.attachmentUploadUrl == null) {
            this.attachmentUploadUrl = new ArrayList<>();
        }
        this.attachmentUploadUrl.add(attachmentUploadUrlItem);
        return this;
    }

    public Execute2dModelTrainingCommandByUserResponse withAttachmentUploadUrl(
        Consumer<List<String>> attachmentUploadUrlSetter) {
        if (this.attachmentUploadUrl == null) {
            this.attachmentUploadUrl = new ArrayList<>();
        }
        attachmentUploadUrlSetter.accept(this.attachmentUploadUrl);
        return this;
    }

    /**
     * 附件上传地址
     * @return attachmentUploadUrl
     */
    public List<String> getAttachmentUploadUrl() {
        return attachmentUploadUrl;
    }

    public void setAttachmentUploadUrl(List<String> attachmentUploadUrl) {
        this.attachmentUploadUrl = attachmentUploadUrl;
    }

    public Execute2dModelTrainingCommandByUserResponse withMultipartData(List<MultipartUploadInfo> multipartData) {
        this.multipartData = multipartData;
        return this;
    }

    public Execute2dModelTrainingCommandByUserResponse addMultipartDataItem(MultipartUploadInfo multipartDataItem) {
        if (this.multipartData == null) {
            this.multipartData = new ArrayList<>();
        }
        this.multipartData.add(multipartDataItem);
        return this;
    }

    public Execute2dModelTrainingCommandByUserResponse withMultipartData(
        Consumer<List<MultipartUploadInfo>> multipartDataSetter) {
        if (this.multipartData == null) {
            this.multipartData = new ArrayList<>();
        }
        multipartDataSetter.accept(this.multipartData);
        return this;
    }

    /**
     * 训练视频已上传分片信息
     * @return multipartData
     */
    public List<MultipartUploadInfo> getMultipartData() {
        return multipartData;
    }

    public void setMultipartData(List<MultipartUploadInfo> multipartData) {
        this.multipartData = multipartData;
    }

    public Execute2dModelTrainingCommandByUserResponse withExcuteFailedMsg(String excuteFailedMsg) {
        this.excuteFailedMsg = excuteFailedMsg;
        return this;
    }

    /**
     * 命令执行失败原因描述
     * @return excuteFailedMsg
     */
    public String getExcuteFailedMsg() {
        return excuteFailedMsg;
    }

    public void setExcuteFailedMsg(String excuteFailedMsg) {
        this.excuteFailedMsg = excuteFailedMsg;
    }

    public Execute2dModelTrainingCommandByUserResponse withXRequestId(String xRequestId) {
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
        Execute2dModelTrainingCommandByUserResponse that = (Execute2dModelTrainingCommandByUserResponse) obj;
        return Objects.equals(this.commondResult, that.commondResult)
            && Objects.equals(this.attachmentUploadUrl, that.attachmentUploadUrl)
            && Objects.equals(this.multipartData, that.multipartData)
            && Objects.equals(this.excuteFailedMsg, that.excuteFailedMsg)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commondResult, attachmentUploadUrl, multipartData, excuteFailedMsg, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Execute2dModelTrainingCommandByUserResponse {\n");
        sb.append("    commondResult: ").append(toIndentedString(commondResult)).append("\n");
        sb.append("    attachmentUploadUrl: ").append(toIndentedString(attachmentUploadUrl)).append("\n");
        sb.append("    multipartData: ").append(toIndentedString(multipartData)).append("\n");
        sb.append("    excuteFailedMsg: ").append(toIndentedString(excuteFailedMsg)).append("\n");
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
