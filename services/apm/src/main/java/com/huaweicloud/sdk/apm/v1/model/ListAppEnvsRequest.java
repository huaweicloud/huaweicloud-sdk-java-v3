package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppEnvsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    @JacksonXmlProperty(localName = "x-business-id")

    private Long xBusinessId;

    public ListAppEnvsRequest withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件id
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public ListAppEnvsRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppEnvsRequest listAppEnvsRequest = (ListAppEnvsRequest) o;
        return Objects.equals(this.appId, listAppEnvsRequest.appId)
            && Objects.equals(this.xBusinessId, listAppEnvsRequest.xBusinessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, xBusinessId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppEnvsRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
