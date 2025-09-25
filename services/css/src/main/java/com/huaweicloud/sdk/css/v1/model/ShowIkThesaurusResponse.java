package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowIkThesaurusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mainObj")

    private String mainObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopObj")

    private String stopObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synonymObj")

    private String synonymObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "staticMainObj")

    private String staticMainObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "staticStopObj")

    private String staticStopObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extraMainObj")

    private String extraMainObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extraStopObj")

    private String extraStopObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateDetails")

    private String updateDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ShowIkThesaurusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 加载状态。  - Loaded表示加载成功。 - Loading表示正在加载中。 - Failed表示加载失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowIkThesaurusResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 存放词库文件的OBS桶。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowIkThesaurusResponse withMainObj(String mainObj) {
        this.mainObj = mainObj;
        return this;
    }

    /**
     * 主词库文件对象。
     * @return mainObj
     */
    public String getMainObj() {
        return mainObj;
    }

    public void setMainObj(String mainObj) {
        this.mainObj = mainObj;
    }

    public ShowIkThesaurusResponse withStopObj(String stopObj) {
        this.stopObj = stopObj;
        return this;
    }

    /**
     * 停词词库文件对象。
     * @return stopObj
     */
    public String getStopObj() {
        return stopObj;
    }

    public void setStopObj(String stopObj) {
        this.stopObj = stopObj;
    }

    public ShowIkThesaurusResponse withSynonymObj(String synonymObj) {
        this.synonymObj = synonymObj;
        return this;
    }

    /**
     * 同义词词库文件对象。
     * @return synonymObj
     */
    public String getSynonymObj() {
        return synonymObj;
    }

    public void setSynonymObj(String synonymObj) {
        this.synonymObj = synonymObj;
    }

    public ShowIkThesaurusResponse withStaticMainObj(String staticMainObj) {
        this.staticMainObj = staticMainObj;
        return this;
    }

    /**
     * 静态主词词库文件对象。
     * @return staticMainObj
     */
    public String getStaticMainObj() {
        return staticMainObj;
    }

    public void setStaticMainObj(String staticMainObj) {
        this.staticMainObj = staticMainObj;
    }

    public ShowIkThesaurusResponse withStaticStopObj(String staticStopObj) {
        this.staticStopObj = staticStopObj;
        return this;
    }

    /**
     * 静态主词词库文件对象。
     * @return staticStopObj
     */
    public String getStaticStopObj() {
        return staticStopObj;
    }

    public void setStaticStopObj(String staticStopObj) {
        this.staticStopObj = staticStopObj;
    }

    public ShowIkThesaurusResponse withExtraMainObj(String extraMainObj) {
        this.extraMainObj = extraMainObj;
        return this;
    }

    /**
     * Extra主词词库库文件对象。
     * @return extraMainObj
     */
    public String getExtraMainObj() {
        return extraMainObj;
    }

    public void setExtraMainObj(String extraMainObj) {
        this.extraMainObj = extraMainObj;
    }

    public ShowIkThesaurusResponse withExtraStopObj(String extraStopObj) {
        this.extraStopObj = extraStopObj;
        return this;
    }

    /**
     * Extra停词词库对象。
     * @return extraStopObj
     */
    public String getExtraStopObj() {
        return extraStopObj;
    }

    public void setExtraStopObj(String extraStopObj) {
        this.extraStopObj = extraStopObj;
    }

    public ShowIkThesaurusResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 词库最近更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowIkThesaurusResponse withUpdateDetails(String updateDetails) {
        this.updateDetails = updateDetails;
        return this;
    }

    /**
     * 更新详情。
     * @return updateDetails
     */
    public String getUpdateDetails() {
        return updateDetails;
    }

    public void setUpdateDetails(String updateDetails) {
        this.updateDetails = updateDetails;
    }

    public ShowIkThesaurusResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定配置自定义词库的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowIkThesaurusResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 词库的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIkThesaurusResponse that = (ShowIkThesaurusResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.mainObj, that.mainObj) && Objects.equals(this.stopObj, that.stopObj)
            && Objects.equals(this.synonymObj, that.synonymObj)
            && Objects.equals(this.staticMainObj, that.staticMainObj)
            && Objects.equals(this.staticStopObj, that.staticStopObj)
            && Objects.equals(this.extraMainObj, that.extraMainObj)
            && Objects.equals(this.extraStopObj, that.extraStopObj) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateDetails, that.updateDetails) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            bucket,
            mainObj,
            stopObj,
            synonymObj,
            staticMainObj,
            staticStopObj,
            extraMainObj,
            extraStopObj,
            updateTime,
            updateDetails,
            clusterId,
            id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIkThesaurusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    mainObj: ").append(toIndentedString(mainObj)).append("\n");
        sb.append("    stopObj: ").append(toIndentedString(stopObj)).append("\n");
        sb.append("    synonymObj: ").append(toIndentedString(synonymObj)).append("\n");
        sb.append("    staticMainObj: ").append(toIndentedString(staticMainObj)).append("\n");
        sb.append("    staticStopObj: ").append(toIndentedString(staticStopObj)).append("\n");
        sb.append("    extraMainObj: ").append(toIndentedString(extraMainObj)).append("\n");
        sb.append("    extraStopObj: ").append(toIndentedString(extraStopObj)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateDetails: ").append(toIndentedString(updateDetails)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
