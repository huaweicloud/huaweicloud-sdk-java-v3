package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * obs桶复制请求消息
 */
public class CreateObjectReplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_info")

    private ObsInfo srcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_info")

    private ObsInfo destInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Object categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    public CreateObjectReplicationRequestBody withSrcInfo(ObsInfo srcInfo) {
        this.srcInfo = srcInfo;
        return this;
    }

    public CreateObjectReplicationRequestBody withSrcInfo(Consumer<ObsInfo> srcInfoSetter) {
        if (this.srcInfo == null) {
            this.srcInfo = new ObsInfo();
            srcInfoSetter.accept(this.srcInfo);
        }

        return this;
    }

    /**
     * Get srcInfo
     * @return srcInfo
     */
    public ObsInfo getSrcInfo() {
        return srcInfo;
    }

    public void setSrcInfo(ObsInfo srcInfo) {
        this.srcInfo = srcInfo;
    }

    public CreateObjectReplicationRequestBody withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 源文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public CreateObjectReplicationRequestBody withDestInfo(ObsInfo destInfo) {
        this.destInfo = destInfo;
        return this;
    }

    public CreateObjectReplicationRequestBody withDestInfo(Consumer<ObsInfo> destInfoSetter) {
        if (this.destInfo == null) {
            this.destInfo = new ObsInfo();
            destInfoSetter.accept(this.destInfo);
        }

        return this;
    }

    /**
     * Get destInfo
     * @return destInfo
     */
    public ObsInfo getDestInfo() {
        return destInfo;
    }

    public void setDestInfo(ObsInfo destInfo) {
        this.destInfo = destInfo;
    }

    public CreateObjectReplicationRequestBody withCategoryId(Object categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 媒资分类id
     * @return categoryId
     */
    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public CreateObjectReplicationRequestBody withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址，为空则不回调
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public CreateObjectReplicationRequestBody withSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    /**
     * 自定义上下文，回调时会回调给用户，透传信息
     * @return sessionContext
     */
    public String getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateObjectReplicationRequestBody that = (CreateObjectReplicationRequestBody) obj;
        return Objects.equals(this.srcInfo, that.srcInfo) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.destInfo, that.destInfo) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.sessionContext, that.sessionContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcInfo, fileType, destInfo, categoryId, callbackUrl, sessionContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateObjectReplicationRequestBody {\n");
        sb.append("    srcInfo: ").append(toIndentedString(srcInfo)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    destInfo: ").append(toIndentedString(destInfo)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
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
