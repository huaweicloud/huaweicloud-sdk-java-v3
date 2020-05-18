package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 转储桶信息。
 */
public class ObsInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_prefix_name")
    
    private String filePrefixName;

    public ObsInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    


    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsInfo withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    


    /**
     * 标识需要存储于OBS的日志文件前缀，0-9，a-z，A-Z，'-'，'.'，'_'长度为0～64字符。
     * @return filePrefixName
     */
    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsInfo obsInfo = (ObsInfo) o;
        return Objects.equals(this.bucketName, obsInfo.bucketName) &&
            Objects.equals(this.filePrefixName, obsInfo.filePrefixName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucketName, filePrefixName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsInfo {\n");
            sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
            sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
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

