package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LoadCustomThesaurusReq
 */
public class LoadCustomThesaurusReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_object")

    private String mainObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_object")

    private String stopObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synonym_object")

    private String synonymObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_main_object")

    private String staticMainObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_stop_object")

    private String staticStopObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_main_object")

    private String extraMainObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_stop_object")

    private String extraStopObject;

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
     * 主词库文件对象，必须为UTF-8无BOM编码的文本文件，一行一个分词，文件大小最大支持100M。 main_object, stop_object, synonym_object三个参数至少要填写一个。  >一次只能加载一个主词库，不支持同时加载多个主词库。
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
     * 停词词库文件对象，必须为UTF-8无BOM编码的文本文件，一行一个分词，文件大小最大支持100M。  main_object, stop_object, synonym_object三个参数至少要填写一个。
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
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持100M。  main_object, stop_object, synonym_object三个参数至少要填写一个。
     * @return synonymObject
     */
    public String getSynonymObject() {
        return synonymObject;
    }

    public void setSynonymObject(String synonymObject) {
        this.synonymObject = synonymObject;
    }

    public LoadCustomThesaurusReq withStaticMainObject(String staticMainObject) {
        this.staticMainObject = staticMainObject;
        return this;
    }

    /**
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持100M。
     * @return staticMainObject
     */
    public String getStaticMainObject() {
        return staticMainObject;
    }

    public void setStaticMainObject(String staticMainObject) {
        this.staticMainObject = staticMainObject;
    }

    public LoadCustomThesaurusReq withStaticStopObject(String staticStopObject) {
        this.staticStopObject = staticStopObject;
        return this;
    }

    /**
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持100M。
     * @return staticStopObject
     */
    public String getStaticStopObject() {
        return staticStopObject;
    }

    public void setStaticStopObject(String staticStopObject) {
        this.staticStopObject = staticStopObject;
    }

    public LoadCustomThesaurusReq withExtraMainObject(String extraMainObject) {
        this.extraMainObject = extraMainObject;
        return this;
    }

    /**
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持100M。
     * @return extraMainObject
     */
    public String getExtraMainObject() {
        return extraMainObject;
    }

    public void setExtraMainObject(String extraMainObject) {
        this.extraMainObject = extraMainObject;
    }

    public LoadCustomThesaurusReq withExtraStopObject(String extraStopObject) {
        this.extraStopObject = extraStopObject;
        return this;
    }

    /**
     * 同义词词库文件，必须为UTF-8无BOM编码的文本文件，一行一组分词，文件大小最大支持100M。
     * @return extraStopObject
     */
    public String getExtraStopObject() {
        return extraStopObject;
    }

    public void setExtraStopObject(String extraStopObject) {
        this.extraStopObject = extraStopObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadCustomThesaurusReq that = (LoadCustomThesaurusReq) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.mainObject, that.mainObject)
            && Objects.equals(this.stopObject, that.stopObject)
            && Objects.equals(this.synonymObject, that.synonymObject)
            && Objects.equals(this.staticMainObject, that.staticMainObject)
            && Objects.equals(this.staticStopObject, that.staticStopObject)
            && Objects.equals(this.extraMainObject, that.extraMainObject)
            && Objects.equals(this.extraStopObject, that.extraStopObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName,
            mainObject,
            stopObject,
            synonymObject,
            staticMainObject,
            staticStopObject,
            extraMainObject,
            extraStopObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadCustomThesaurusReq {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    mainObject: ").append(toIndentedString(mainObject)).append("\n");
        sb.append("    stopObject: ").append(toIndentedString(stopObject)).append("\n");
        sb.append("    synonymObject: ").append(toIndentedString(synonymObject)).append("\n");
        sb.append("    staticMainObject: ").append(toIndentedString(staticMainObject)).append("\n");
        sb.append("    staticStopObject: ").append(toIndentedString(staticStopObject)).append("\n");
        sb.append("    extraMainObject: ").append(toIndentedString(extraMainObject)).append("\n");
        sb.append("    extraStopObject: ").append(toIndentedString(extraStopObject)).append("\n");
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
