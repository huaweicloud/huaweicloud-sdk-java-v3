package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExportCollectorParserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_ids")

    private List<ExportParserResponseDto> parserIds = null;

    public ExportCollectorParserResponse withParserIds(List<ExportParserResponseDto> parserIds) {
        this.parserIds = parserIds;
        return this;
    }

    public ExportCollectorParserResponse addParserIdsItem(ExportParserResponseDto parserIdsItem) {
        if (this.parserIds == null) {
            this.parserIds = new ArrayList<>();
        }
        this.parserIds.add(parserIdsItem);
        return this;
    }

    public ExportCollectorParserResponse withParserIds(Consumer<List<ExportParserResponseDto>> parserIdsSetter) {
        if (this.parserIds == null) {
            this.parserIds = new ArrayList<>();
        }
        parserIdsSetter.accept(this.parserIds);
        return this;
    }

    /**
     * 相关描述信息
     * @return parserIds
     */
    public List<ExportParserResponseDto> getParserIds() {
        return parserIds;
    }

    public void setParserIds(List<ExportParserResponseDto> parserIds) {
        this.parserIds = parserIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportCollectorParserResponse that = (ExportCollectorParserResponse) obj;
        return Objects.equals(this.parserIds, that.parserIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parserIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCollectorParserResponse {\n");
        sb.append("    parserIds: ").append(toIndentedString(parserIds)).append("\n");
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
