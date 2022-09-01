package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为obs类型时的配置信息
 */
public class TaskOutputObs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    @JacksonXmlProperty(localName = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputObs withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TaskOutputObs withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * OBS的路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TaskOutputObs withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputObs addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputObs withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /**
     * 作业输出数据类别的列表，当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据，部分服务需要
     * @return dataCategory
     */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskOutputObs taskOutputObs = (TaskOutputObs) o;
        return Objects.equals(this.bucket, taskOutputObs.bucket) && Objects.equals(this.path, taskOutputObs.path)
            && Objects.equals(this.dataCategory, taskOutputObs.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, path, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputObs {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
