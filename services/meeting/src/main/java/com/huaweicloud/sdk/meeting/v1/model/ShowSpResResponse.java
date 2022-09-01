package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSpResResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedAccountsCount")

    @JacksonXmlProperty(localName = "usedAccountsCount")

    private Integer usedAccountsCount;

    public ShowSpResResponse withUsedAccountsCount(Integer usedAccountsCount) {
        this.usedAccountsCount = usedAccountsCount;
        return this;
    }

    /**
     * 已用的企业并发数
     * @return usedAccountsCount
     */
    public Integer getUsedAccountsCount() {
        return usedAccountsCount;
    }

    public void setUsedAccountsCount(Integer usedAccountsCount) {
        this.usedAccountsCount = usedAccountsCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSpResResponse showSpResResponse = (ShowSpResResponse) o;
        return Objects.equals(this.usedAccountsCount, showSpResResponse.usedAccountsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedAccountsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpResResponse {\n");
        sb.append("    usedAccountsCount: ").append(toIndentedString(usedAccountsCount)).append("\n");
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
