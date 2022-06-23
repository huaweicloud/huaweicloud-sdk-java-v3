package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LoadCustomThesaurusReq
 */
public class LoadCustomThesaurusReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketName")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mainObject")

    private String mainObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopObject")

    private String stopObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synonymObject")

    private String synonymObject;

    public LoadCustomThesaurusReq withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 词库文件存放的OBS桶（桶类型必须为标准存储或者低频存储，不支持归档存储）。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public LoadCustomThesaurusReq withMainObject(String mainObject) {
        this.mainObject = mainObject;
        return this;
    }

    /**
     * 主词库文件对象，必须为UTF-8无BOM编码的文本文件，一行一个分词，文件大小最大支持100M。 mainObject, stopObject, synonymObject三个参数至少要填写一个。  >一次只能加载一个主词库，不支持同时加载多个主词库。
     * @return mainObject
     */
    public String getMainObject() {
        return mainObject;
    }

    public void setMainObject(String mainObject) {
        this.mainObject = mainObject;
    }

    public LoadCustomThesaurusReq withStopObject(String stopObject) {
        this.stopObject = stopObject;
        return this;
    }

    /**
     * 停词词库文件对象，必须为UTF-8无BOM编码的文本文件，一行一个分词，文件大小最大支持20M。  mainObject, stopObject, synonymObject三个参数至少要填写一个。
     * @return stopObject
     */
    public String getStopObject() {
        return stopObject;
    }

    public void setStopObject(String stopObject) {
        this.stopObject = stopObject;
    }

    public LoadCustomThesaurusReq withSynonymObject(String synonymObject) {
        this.synonymObject = synonymObject;
        return this;
    }

    /**
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持20M。  mainObject, stopObject, synonymObject三个参数至少要填写一个。
     * @return synonymObject
     */
    public String getSynonymObject() {
        return synonymObject;
    }

    public void setSynonymObject(String synonymObject) {
        this.synonymObject = synonymObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadCustomThesaurusReq loadCustomThesaurusReq = (LoadCustomThesaurusReq) o;
        return Objects.equals(this.bucketName, loadCustomThesaurusReq.bucketName)
            && Objects.equals(this.mainObject, loadCustomThesaurusReq.mainObject)
            && Objects.equals(this.stopObject, loadCustomThesaurusReq.stopObject)
            && Objects.equals(this.synonymObject, loadCustomThesaurusReq.synonymObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, mainObject, stopObject, synonymObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadCustomThesaurusReq {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    mainObject: ").append(toIndentedString(mainObject)).append("\n");
        sb.append("    stopObject: ").append(toIndentedString(stopObject)).append("\n");
        sb.append("    synonymObject: ").append(toIndentedString(synonymObject)).append("\n");
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
