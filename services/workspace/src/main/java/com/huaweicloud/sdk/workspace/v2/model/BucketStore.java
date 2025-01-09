package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OBS桶存储。
 */
public class BucketStore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_file_path")

    private String bucketFilePath;

    public BucketStore withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称固定格式:wks-appcenter-{project_id}; 需先调用桶授权接口进行授权。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BucketStore withBucketFilePath(String bucketFilePath) {
        this.bucketFilePath = bucketFilePath;
        return this;
    }

    /**
     * OBS对象路径。 注: bucket_file_path是对象在obs中的完整路径,不能以/开头。 例如桶存在如下目录结构的数据。   Bucket:     ├─dir1     | ├─object1.txt     | └─object2.txt     └─object3.txt Object1的路径: dir1/object1.txt Object2的路径: dir1/object2.txt Object3的路径: object3.txt
     * @return bucketFilePath
     */
    public String getBucketFilePath() {
        return bucketFilePath;
    }

    public void setBucketFilePath(String bucketFilePath) {
        this.bucketFilePath = bucketFilePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BucketStore that = (BucketStore) obj;
        return Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.bucketFilePath, that.bucketFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, bucketFilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketStore {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketFilePath: ").append(toIndentedString(bucketFilePath)).append("\n");
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
