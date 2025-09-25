package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class OctopusV3LogResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    private String startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    private String endOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    public OctopusV3LogResponseBodyResult withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * **参数解释**： 是否还有剩余日志标识。 **约束限制**： 不涉及。 **取值范围**： true或false。 **默认取值**： 不涉及。
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public OctopusV3LogResponseBodyResult withStartOffset(String startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * **参数解释**： 日志查询起始偏移量。 **约束限制**： 不涉及。 **取值范围**： 数字组成。 **默认取值**： 不涉及。
     * @return startOffset
     */
    public String getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(String startOffset) {
        this.startOffset = startOffset;
    }

    public OctopusV3LogResponseBodyResult withEndOffset(String endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * **参数解释**： 日志查询结束偏移量。 **约束限制**： 不涉及。 **取值范围**： 数字组成。 **默认取值**： 不涉及。
     * @return endOffset
     */
    public String getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(String endOffset) {
        this.endOffset = endOffset;
    }

    public OctopusV3LogResponseBodyResult withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * **参数解释**： 返回日志内容，可能会空，请再次请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public OctopusV3LogResponseBodyResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数解释**： 日志来源。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OctopusV3LogResponseBodyResult that = (OctopusV3LogResponseBodyResult) obj;
        return Objects.equals(this.hasMore, that.hasMore) && Objects.equals(this.startOffset, that.startOffset)
            && Objects.equals(this.endOffset, that.endOffset) && Objects.equals(this.log, that.log)
            && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMore, startOffset, endOffset, log, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OctopusV3LogResponseBodyResult {\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
