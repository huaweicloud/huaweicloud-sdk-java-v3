package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 根据源数据的时间戳和已配置的\&quot;partition_format\&quot;生成对应的转储时间目录。将源数据的时间戳使用“yyyy/MM/dd/HH/mm”格式生成分区字符串，用来定义写到OBS的Object文件所在的目录层次结构。
 */
public class ProcessingSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_name")

    private String timestampName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_type")

    private String timestampType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    private String timestampFormat;

    public ProcessingSchema withTimestampName(String timestampName) {
        this.timestampName = timestampName;
        return this;
    }

    /**
     * 源数据时间戳的属性名称。
     * @return timestampName
     */
    public String getTimestampName() {
        return timestampName;
    }

    public void setTimestampName(String timestampName) {
        this.timestampName = timestampName;
    }

    public ProcessingSchema withTimestampType(String timestampType) {
        this.timestampType = timestampType;
        return this;
    }

    /**
     * 源数据时间戳的类型。  - String - Timestamp：Long类型的13位时间戳
     * @return timestampType
     */
    public String getTimestampType() {
        return timestampType;
    }

    public void setTimestampType(String timestampType) {
        this.timestampType = timestampType;
    }

    public ProcessingSchema withTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * 源数据时间戳的类型为String时必选，用于根据时间戳格式生成OBS的时间目录。
     * @return timestampFormat
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessingSchema that = (ProcessingSchema) obj;
        return Objects.equals(this.timestampName, that.timestampName)
            && Objects.equals(this.timestampType, that.timestampType)
            && Objects.equals(this.timestampFormat, that.timestampFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestampName, timestampType, timestampFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessingSchema {\n");
        sb.append("    timestampName: ").append(toIndentedString(timestampName)).append("\n");
        sb.append("    timestampType: ").append(toIndentedString(timestampType)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
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
