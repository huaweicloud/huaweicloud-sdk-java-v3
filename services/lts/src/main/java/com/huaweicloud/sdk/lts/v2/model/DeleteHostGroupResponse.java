package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteHostGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private List<GetHostGroupInfo> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    public DeleteHostGroupResponse withResult(List<GetHostGroupInfo> result) {
        this.result = result;
        return this;
    }

    public DeleteHostGroupResponse addResultItem(GetHostGroupInfo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public DeleteHostGroupResponse withResult(Consumer<List<GetHostGroupInfo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 主机组详细信息
     * @return result
     */
    public List<GetHostGroupInfo> getResult() {
        return result;
    }

    public void setResult(List<GetHostGroupInfo> result) {
        this.result = result;
    }

    public DeleteHostGroupResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 删除主机组数量
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteHostGroupResponse deleteHostGroupResponse = (DeleteHostGroupResponse) o;
        return Objects.equals(this.result, deleteHostGroupResponse.result)
            && Objects.equals(this.total, deleteHostGroupResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHostGroupResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
