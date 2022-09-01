package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DIS数据源配置内容
 */
public class DisContentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamName")

    @JacksonXmlProperty(localName = "streamName")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    @JacksonXmlProperty(localName = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    @JacksonXmlProperty(localName = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    @JacksonXmlProperty(localName = "projectId")

    private String projectId;

    public DisContentRsp withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public DisContentRsp withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 租户的AK
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public DisContentRsp withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 租户的SK
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public DisContentRsp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisContentRsp disContentRsp = (DisContentRsp) o;
        return Objects.equals(this.streamName, disContentRsp.streamName) && Objects.equals(this.ak, disContentRsp.ak)
            && Objects.equals(this.sk, disContentRsp.sk) && Objects.equals(this.projectId, disContentRsp.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, ak, sk, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisContentRsp {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
