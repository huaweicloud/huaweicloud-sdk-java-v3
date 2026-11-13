package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBlocksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocks_info")

    private Object blocksInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public ShowBlocksResponse withBlocksInfo(Object blocksInfo) {
        this.blocksInfo = blocksInfo;
        return this;
    }

    /**
     * **参数解释**： 文档块信息。支持more和basic两个列表，分别标识基础文档块和扩展文档块。 - basic：基础文档块列表，元素为文档块对象。 - more：扩展文档块列表，元素为文档块对象或分组标题对象。 文档块对象支持字段如下： - code：文档块编码。 - pinyin：文档块简称。 - quanpin：文档块全程。 - name：文档块名称。 - icon：文档块图标。 - show：是否展示： true为展示，false为不展示。 - source：文档块来源，0标识系统文档块，分组标题对象中1标识自定义分组。 - darkIcon：暗黑模式文档块图标。 - key：文档块key值。 - data：文档块附加数据，可为字符串或对象（可选）。 分组标题对象字段如下： - source：分组来源。 - title：分组标题。 **取值范围**： [1-65535]字符。
     * @return blocksInfo
     */
    public Object getBlocksInfo() {
        return blocksInfo;
    }

    public void setBlocksInfo(Object blocksInfo) {
        this.blocksInfo = blocksInfo;
    }

    public ShowBlocksResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBlocksResponse that = (ShowBlocksResponse) obj;
        return Objects.equals(this.blocksInfo, that.blocksInfo) && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blocksInfo, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlocksResponse {\n");
        sb.append("    blocksInfo: ").append(toIndentedString(blocksInfo)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
