package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Kibana公网访问信息。
 */
public class KibanaElbWhiteListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWhiteList")

    @JacksonXmlProperty(localName = "enableWhiteList")

    private Boolean enableWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteList")

    @JacksonXmlProperty(localName = "whiteList")

    private String whiteList;

    public KibanaElbWhiteListResp withEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
        return this;
    }

    /**
     * 是否开启kibana访问控制。 - true: 开启访问控制。 - false: 关闭访问控制
     * @return enableWhiteList
     */
    public Boolean getEnableWhiteList() {
        return enableWhiteList;
    }

    public void setEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
    }

    public KibanaElbWhiteListResp withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /**
     * kibana公网访问白名单。
     * @return whiteList
     */
    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KibanaElbWhiteListResp kibanaElbWhiteListResp = (KibanaElbWhiteListResp) o;
        return Objects.equals(this.enableWhiteList, kibanaElbWhiteListResp.enableWhiteList)
            && Objects.equals(this.whiteList, kibanaElbWhiteListResp.whiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWhiteList, whiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KibanaElbWhiteListResp {\n");
        sb.append("    enableWhiteList: ").append(toIndentedString(enableWhiteList)).append("\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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
