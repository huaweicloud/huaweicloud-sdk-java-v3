package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublicZoneLines
 */
public class PublicZoneLines {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_name")

    private String lineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public PublicZoneLines withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 线路ID。 **取值范围：** 不涉及。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public PublicZoneLines withLineName(String lineName) {
        this.lineName = lineName;
        return this;
    }

    /**
     * **参数解释：** 线路名称。 **取值范围：** 不涉及。
     * @return lineName
     */
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public PublicZoneLines withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicZoneLines that = (PublicZoneLines) obj;
        return Objects.equals(this.line, that.line) && Objects.equals(this.lineName, that.lineName)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, lineName, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicZoneLines {\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    lineName: ").append(toIndentedString(lineName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
