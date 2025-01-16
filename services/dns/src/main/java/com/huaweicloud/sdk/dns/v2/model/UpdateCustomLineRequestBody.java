package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCustomLineRequestBody
 */
public class UpdateCustomLineRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_segments")

    private List<String> ipSegments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateCustomLineRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 解析线路名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCustomLineRequestBody withIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }

    public UpdateCustomLineRequestBody addIpSegmentsItem(String ipSegmentsItem) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        this.ipSegments.add(ipSegmentsItem);
        return this;
    }

    public UpdateCustomLineRequestBody withIpSegments(Consumer<List<String>> ipSegmentsSetter) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        ipSegmentsSetter.accept(this.ipSegments);
        return this;
    }

    /**
     * P地址段。  以“-”分隔，小IP地址在前，大IP地址在后。IP段之间不能有交叉。当只有一个IP时，填写IP1-IP1。 目前只支持IPV4。
     * @return ipSegments
     */
    public List<String> getIpSegments() {
        return ipSegments;
    }

    public void setIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
    }

    public UpdateCustomLineRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义线路的描述信息。长度不超过255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCustomLineRequestBody that = (UpdateCustomLineRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ipSegments, that.ipSegments)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipSegments, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomLineRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipSegments: ").append(toIndentedString(ipSegments)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
