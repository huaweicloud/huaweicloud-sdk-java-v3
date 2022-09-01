package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SMN数据源配置内容
 */
public class SmnContentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    @JacksonXmlProperty(localName = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    @JacksonXmlProperty(localName = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    @JacksonXmlProperty(localName = "sk")

    private String sk;

    public SmnContentRsp withProjectId(String projectId) {
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

    public SmnContentRsp withAk(String ak) {
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

    public SmnContentRsp withSk(String sk) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnContentRsp smnContentRsp = (SmnContentRsp) o;
        return Objects.equals(this.projectId, smnContentRsp.projectId) && Objects.equals(this.ak, smnContentRsp.ak)
            && Objects.equals(this.sk, smnContentRsp.sk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, ak, sk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnContentRsp {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
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
