package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DIS通道配置。
 */
public class OutputDis {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    @JacksonXmlProperty(localName = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    @JacksonXmlProperty(localName = "data_category")

    private String dataCategory;

    public OutputDis withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * DIS通道名。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public OutputDis withDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    /**
     * 作业输出数据类别的列表，默认值为[]。有这个列表时，表示希望这个输出结果中存放dataCategory列表内的数据。 取值范围为[FaceImage,OriginImage]。 - FaceImage：表示发送人脸图。 - OriginImage：表示发送原始图。
     * @return dataCategory
     */
    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
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
        OutputDis outputDis = (OutputDis) o;
        return Objects.equals(this.streamName, outputDis.streamName)
            && Objects.equals(this.dataCategory, outputDis.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputDis {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
